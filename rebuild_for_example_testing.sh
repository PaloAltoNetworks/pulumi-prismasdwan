#!/bin/bash
# quick scriot to rebuild for example testing
cd provider && go mod tidy && cd - || exit
make clean
make tfgen
make provider
make build_sdks
cp bin/pulumi-resource-prismasdwan "${GOPATH}/bin"
make install_nodejs_sdk
echo "** Next steps:"
echo "cd examples/myscript/ts"
echo "yarn link @pulumi/prismasdwan"



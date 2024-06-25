#!/bin/bash
# quick scriot to rebuild for example testing
export NVM_DIR="$HOME/.nvm"
[ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh"  # This loads nvm
[ -s "$NVM_DIR/bash_completion" ] && \. "$NVM_DIR/bash_completion"  # This loads nvm bash_completion
nvm use --lts
make clean
make tfgen
cd provider && go mod tidy && cd - || exit
make provider
make build_sdks
cp bin/pulumi-resource-prismasdwan "${GOPATH}/bin"
make install_nodejs_sdk
echo "** Next steps:"
echo "cd examples/myscript/ts"
echo "yarn install"
echo "yarn link @pulumi/prismasdwan"



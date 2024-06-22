#!/bin/bash
git rm upstream -f
rm -rf .git/modules/upstream
git config --remove-section submodule.upstream
# add back
git submodule add "https://github.com/PaloAltoNetworks/terraform-provider-prismasdwan.git" upstream

let pulumi = require("@pulumi/pulumi");
let prismasdwan = require("@pulumi/prismasdwan");
let fs = require('fs');
import {GetSiteResult} from "@pulumi/prismasdwan";

let prismaSdwanConfig = new pulumi.Config("prismasdwan")

let myClientID = prismaSdwanConfig.require("clientId")
let myClientSecret = prismaSdwanConfig.requireSecret("clientSecret")
let myScope = prismaSdwanConfig.require("scope")

console.log('Client ID Loaded: ', myClientID);
console.log('Client Secret Loaded: ', myClientSecret);
console.log('Scope Loaded: ', myScope);

const site1 = prismasdwan.getSite({
    siteName: "ACN-MCD",
});

site1
  .then((value: GetSiteResult) => {
      // console.log('site1 resolved with value: ' + value.config);
      console.log('site1 other values: ', value.siteName);
      const testObj = JSON.parse(value.config);
      console.log('Obj test: ', testObj);
      const testBackToString = JSON.stringify(testObj, undefined, 4);
      console.log('Writing file: ', value.siteName + ".json");
      fs.writeFile(value.siteName + ".json", testBackToString,function (err: Error) {
          if (err) {
              console.log(err);
          }
      });
  });

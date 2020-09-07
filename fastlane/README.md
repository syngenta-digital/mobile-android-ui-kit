fastlane documentation
================
# Installation

Make sure you have the latest version of the Xcode command line tools installed:

```
xcode-select --install
```

Install _fastlane_ using
```
[sudo] gem install fastlane -NV
```
or alternatively using `brew cask install fastlane`

# Available Actions
### get_artifact_name
```
fastlane get_artifact_name
```

### syngenta_build_android_app
```
fastlane syngenta_build_android_app
```
Build, test, or deliver project
### p_upload_beta_store
```
fastlane p_upload_beta_store
```
Uploads the app to play store alpha track
### p_upload_android_appcenter
```
fastlane p_upload_android_appcenter
```
Uploads the app to appcenter, p_build_ios_app must be called first
### integration
```
fastlane integration
```
Builds and tests dev version when code changes are made in bitbucket repo
### uat_delivery
```
fastlane uat_delivery
```
builds, creates uat facing apk, pushes to hockey
### prod_delivery
```
fastlane prod_delivery
```
builds, creates uat facing ipa, pushes to hockey

----

This README.md is auto-generated and will be re-generated every time [fastlane](https://fastlane.tools) is run.
More information about fastlane can be found on [fastlane.tools](https://fastlane.tools).
The documentation of fastlane can be found on [docs.fastlane.tools](https://docs.fastlane.tools).

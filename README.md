# UIKit-Android
UIKit for Syngenta

How to setup:

Add this in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.syngenta-dpe-usco:UIKit-Android:Tag'
	}
  
Step 3. Replace 'Tag' with 0.9.1 or latest version.

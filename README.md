# Appium Java

This repository contains a sample Appium project written in Java, using the Appium library for automating mobile application testing.

## Pre-requisite
* Appium
* JDK
* Android Studio
* Android SDK
* TestNG 
* Appium Desktop inspector 
* Install Appium driver for android and iOS

### Important Notes
* Set ANDROID_HOME Path using below command on Mac:
```sh
vim ~/.zshenv
export  ANDROID_HOME="/Users/yourUsername/Library/Android/sdk"
export PATH=$ANDROID_HOME/platform-tools:$PATH
export PATH=$ANDROID_HOME/tools:$PATH
```
* Set JAVA_HOME Path 

## Getting Started

1. Clone the repository to your machine:

```git
git clone https://github.com/ISanjeevKumar/appium-java.git
```
2. Run the test cases by running the command:
```sh
mvn test
```
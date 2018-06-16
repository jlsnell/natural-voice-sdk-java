AimMatic SDKs are easiest and best supported way for most developers to use AimMatic APIs.

### Natural Voice SDK ###

Natural Voice SDK is a client library to help developers quickly deploy applications with programmatic connections to Natural Voice APIs.

### Paired Key Connections ###

This SDK requires an API Key and Secret Key to establish a secure connection to placeNext.

### Getting Started ###

Create AimMatic Key Pair in the AimMatic Dev Console. Login at https://account.aimmatic.com and navigate to My Apps.

##### Minimum requirements #####

To run the SDK you will need Java 1.8+.

##### Install the SDK #####

The recommended way to use the AimMatic SDK for Java in your project is to consume it from Maven. 

**Using the SDK Maven modules**

```maven
<dependency>
  <groupId>com.aimmatic</groupId>
  <artifactId>aimmatic</artifactId>
  <version>1.0</version>
  <type>pom</type>
</dependency>
```

**Using the SDK Gradle modules**

```gradle
compile 'com.aimmatic:aimmatic:1.0'
```

### Key Pair Lookup ###

In this update, API Key and Key Pair can be provided in 3 ways.

1. provide at runtime using class `RuntimeCredentialsProvider`
```java
RuntimeCredentialsProvider.setAimMaticCredentials(...);
```
2. provide via environment variable using variable `AIMMATIC_API_KEY` and `AIMMATIC_SECRET_KEY`
3. provide via System properties using properties `aimmatic.apiKey` and `aimmatic.secretKey`

The Authentication will lookup from option 1 to option 3. If it finds the credentials then the provider will
 use for subsequent request unless invoke `Signature.resetLastUsedCredentialsProvider()` which will lookup 
 again from option 1 to option 3.
 
### Code generation from Swagger ###
 
 We generate our model objects from the swagger file located in:
 src/main/resources/aimmatic.yml using the Maven swagger-codegen tool as defined in pom.xml.
 
 Pre-requirement:
 
 1. Maven command line installed
 2. A platform that supports Linux Shell Script, on Windows using power shell or Windows 10 linux integration 
 
 To generate the model source code execute this command `./gen.sh`
 
 Due to limitations in OpenAPI and Swagger Generated code, we do override a few generated files, please see below:
 
 1. Point.java or Polygon.java (see https://github.com/OAI/OpenAPI-Specification/issues/1313)
 2. Confugration.java as we need to enable custom verification as well as an issue going (see https://github.com/swagger-api/swagger-codegen/issues/5187)



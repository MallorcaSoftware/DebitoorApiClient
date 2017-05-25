# debitoorapiclient

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.mallorcasoftware</groupId>
    <artifactId>debitoorapiclient</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.mallorcasoftware:debitoorapiclient:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/debitoorapiclient-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.mallorcasoftware.debitoorapiclient.*;
import com.mallorcasoftware.debitoorapiclient.auth.*;
import com.mallorcasoftware.debitoorapiclient.model.*;
import com.mallorcasoftware.debitoorapiclient.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        String languagecode = "languagecode_example"; // String | Given language code
        try {
            List<CountryDto> result = apiInstance.getCountriesTranslatedByLanguageCode(languagecode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getCountriesTranslatedByLanguageCode");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://api.debitoor.com/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**getCountriesTranslatedByLanguageCode**](docs/DefaultApi.md#getCountriesTranslatedByLanguageCode) | **GET** /countries/{languagecode}/v1 | 


## Documentation for Models

 - [CountryDto](docs/CountryDto.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author




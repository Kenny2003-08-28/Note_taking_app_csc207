# Note-Taking App - CSC207 Project
This repository is dedicated to our course project for CSC207 at the University of Toronto (UofT). We're delighted to work on a project that is not only educational but also has the potential to impact users in a beneficial manner.

## Introduction
In our dynamic and fast-paced world, note-taking has evolved, shifting towards digital platforms. Considering this, our team has chosen to develop a robust and user-friendly note-taking application aimed at meeting the versatile needs of individuals in various contexts, such as educational and professional environments.

## Problem Statement
Modern individuals prefer using electronic devices over traditional note-taking tools due to convenience and efficiency. A digital note-taking app allows them to easily capture thoughts, ideas, and essential information, offering access and organization capabilities anytime, anywhere.

## Project Overview
Our goal is to develop an intuitive note-taking application that provides functionalities such as creating, editing, organizing, and searching notes. The application will allow users to categorize notes, add tags, and synchronize data across different devices, ensuring their notes are always accessible and up to date.

## API Integration
To amplify our app's functionalities, we plan to integrate with a [SPECIFIC API NAME] to enhance [SPECIFIC FEATURE OR FUNCTIONALITY]. This API facilitates features like [DETAILED FUNCTIONALITIES], enabling users to derive more value and organize their notes effectively. A detailed description and documentation can be found at [LINK TO API DOCUMENTATION].

### API Usage Example
We utilized Postman for testing the [API NAME]. Below is a screenshot that demonstrates how we used the API to improve user experiences:  
[INSERT SCREENSHOT HERE]

## Sample Code
Below is a sample code snippet from our application:
```java
import okhttp3.*;

import java.io.IOException;

public class GrammarCheckExample {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "text=I have noks idea%20hleoo&language=en-US");

        Request request = new Request.Builder()
                .url("https://grammarbot.p.rapidapi.com/check")
                .post(body)
                .addHeader("content-type", "application/x-www-form-urlencoded")
                .addHeader("X-RapidAPI-Key", "07f328da92msh9302970abd98e4bp14a982jsn83e0e774c75c")
                .addHeader("X-RapidAPI-Host", "grammarbot.p.rapidapi.com")
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                System.out.println("Response successful: " + response.body().string());
            } else {
                System.err.println("Server responded with: " + response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```


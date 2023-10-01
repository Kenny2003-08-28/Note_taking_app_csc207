# Note-Taking App - CSC207 Project
This repository is dedicated to our course project for CSC207 at the University of Toronto (UofT). We're delighted to work on a project that is not only educational but also has the potential to impact users in a beneficial manner.

## Introduction
In our dynamic and fast-paced world, note-taking has evolved, shifting towards digital platforms. Considering this, our team has chosen to develop a robust and user-friendly note-taking application aimed at meeting the versatile needs of individuals in various contexts, such as educational and professional environments.

## Problem Statement
Modern individuals prefer using electronic devices over traditional note-taking tools due to convenience and efficiency. A digital note-taking app allows them to easily capture thoughts, ideas, and essential information, offering access and organization capabilities anytime, anywhere.

## Project Overview
Our goal is to develop an intuitive note-taking application that provides functionalities such as creating, editing, organizing, and searching notes. The application will allow users to categorize notes, add tags, and synchronize data across different devices, ensuring their notes are always accessible and up to date.

## API Integration
To amplify our app's functionalities, We decided to use some APIs to enhance our app. We currently have the following ideas:
- Google Cloud/Drive API (for uploading notes online)
- Spelling checker like GrammarBot

### API Usage Example
We utilized Postman for testing the GrammarBot. Below is a screenshot that demonstrates how we used the API to improve user experiences:  

![3171696199162_ pic](https://github.com/Alessange/Note_taking_app_csc207/assets/56106326/ba60c32b-e0ac-46c0-a1cc-a163b9c3cb08)

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
The results from the above code are going to be
```java
Response successful: {"software":{"name":"GrammarBot","version":"4.3.1","apiVersion":1,"premium":true,"premiumHint":"Thanks for supporting GrammarBot!","status":""},"warnings":{"incompleteResults":false},"language":{"name":"English (US)","code":"en-US","detectedLanguage":{"name":"English (US)","code":"en-US"}},"matches":[{"message":"Possible spelling mistake found","shortMessage":"Spelling mistake","replacements":[{"value":"nous"},{"value":"nods"},{"value":"noes"},{"value":"nooks"},{"value":"woks"},{"value":"OKs"},{"value":"nobs"},{"value":"Nos"},{"value":"nos"},{"value":"no ks"},{"value":"NOK"},{"value":"NOS"}],"offset":7,"length":4,"context":{"text":"I have noks idea hleoo","offset":7,"length":4},"sentence":"I have noks idea hleoo","type":{"typeName":"Other"},"rule":{"id":"MORFOLOGIK_RULE_EN_US","description":"Possible spelling mistake","issueType":"misspelling","category":{"id":"TYPOS","name":"Possible Typo"}}},{"message":"Possible spelling mistake found","shortMessage":"Spelling mistake","replacements":[{"value":"again"},{"value":"head"},{"value":"lead"},{"value":"hear"},{"value":"train"},{"value":"brain"},{"value":"chain"},{"value":"claim"},{"value":"email"},{"value":"heat"},{"value":"hello"},{"value":"hero"},{"value":"Spain"},{"value":"chair"},{"value":"grain"},{"value":"plain"},{"value":"trail"},{"value":"Head"},{"value":"drain"},{"value":"leaf"},{"value":"Leon"},{"value":"Blair"},{"value":"Craig"},{"value":"Thai"},{"value":"heal"},{"value":"leak"},{"value":"lean"},{"value":"leap"},{"value":"lieu"},{"value":"slain"},{"value":"snail"},{"value":"trait"},{"value":"Brain"},{"value":"Clair"},{"value":"avail"},{"value":"await"},{"value":"flair"},{"value":"heap"},{"value":"stain"},{"value":"Leno"},{"value":"Beau"},{"value":"Grail"},{"value":"Leah"},{"value":"Lear"},{"value":"Twain"},{"value":"braid"},{"value":"frail"},{"value":"quail"},{"value":"stair"},{"value":"Cleo"},{"value":"Lego"},{"value":"Lean"},{"value":"beau"},{"value":"flail"},{"value":"plaid"},{"value":"staid"},{"value":"Thais"},{"value":"grail"},{"value":"plait"},{"value":"helot"},{"value":"oleo"},{"value":"luau"},{"value":"twain"},{"value":"Leos"},{"value":"swain"},{"value":"Leo"},{"value":"leas"},{"value":"halloo"},{"value":"loo"},{"value":"Itaipu"},{"value":"Praia"},{"value":"SEOO"}],"offset":17,"length":5,"context":{"text":"I have noks idea hleoo","offset":17,"length":5},"sentence":"I have noks idea hleoo","type":{"typeName":"Other"},"rule":{"id":"MORFOLOGIK_RULE_EN_US","description":"Possible spelling mistake","issueType":"misspelling","category":{"id":"TYPOS","name":"Possible Typo"}}}]}
```

We may be focusing on some parts of it as it is able for users to check the spelling.

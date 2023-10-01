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

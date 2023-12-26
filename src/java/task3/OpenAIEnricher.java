package ua.edu.ucu.apss.task3;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Scanner;

public class OpenAIEnricher {
    @SneakyThrows
    public static Map<String, String> extract(String domain) {
        URL url = new URL(domain);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        System.out.println(text);
        return pass;
    }
}

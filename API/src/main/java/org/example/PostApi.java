package org.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostApi {
    public static void main(String[] args) {
        String apiUrl = "https://jsonplaceholder.typicode.com/posts";

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method
            connection.setRequestMethod("POST");

            // Enable input/output streams
            connection.setDoOutput(true);

            // Set request headers
            connection.setRequestProperty("Content-Type", "application/json");

            // Create request body
            String requestBody = "{\"userId\": 1, \"title\": \"New Post Title\", \"body\": \"This is the body of the new post.\"}";

            // Write request body data
            try (DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream())) {
                outputStream.writeBytes(requestBody);
                outputStream.flush();
            }

            // Get response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Read response data
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            // Print response data
            System.out.println("Response Data:\n" + response.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.financeApi.services;

import com.financeApi.utils.auth.Auth;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumeApiService {
//    final private String KEY = "&apikey="+ Auth.getKey();
//    final private String URL = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE";
    public static String get(String address) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(address)).build();
		HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert response != null;
        return response.body();
    }
}

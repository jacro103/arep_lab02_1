package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class HttpApi {
      private static final String USER_AGENT = "Mozilla/5.0";
    private static final String MOVIE_URL = "http://www.omdbapi.com/?apikey=c2a6f13b&t=";
    private Cache cache = null;

    public HttpApi(){
        this.cache = Cache.getCache();
    }


    public JsonObject search(String name) throws IOException {
        if(cache.ListCache(name)){
            return cache.getMovieInfo(name);
        }
        @SuppressWarnings("deprecation")
        URL obj = new URL(MOVIE_URL+name);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            cache.addCache(name, JsonParser.parseString(response.toString()).getAsJsonObject());

            System.out.println(response.toString());
        } else {
            System.out.println("no se pudo realizar la petición");
        }
        return Cache.getCache().getMovieInfo(name);
    }
}

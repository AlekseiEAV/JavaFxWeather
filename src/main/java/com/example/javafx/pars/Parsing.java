package com.example.javafx.pars;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import com.example.javafx.pars.pojo.Root;

import com.google.gson.*;



public class Parsing {

    public HashMap<String, String> getGson(String lat, String lon){
        Gson gson = new Gson();
        String locate = "https://api.weather.yandex.ru/v2/informers?lat=" + lat + "&lon=" + lon;
        Root root = gson.fromJson(getStringFromServer(locate), Root.class);

        HashMap<String, String> dataCity = new HashMap<>();

        dataCity.put("temp", String.valueOf(Math.round(root.fact.temp)));
        dataCity.put("cond", root.fact.condition);
        dataCity.put("pressure", String.valueOf(Math.round(root.fact.pressure_mm)));

        dataCity.put("wind", String.valueOf(root.fact.wind_speed));
        dataCity.put("sunrise", root.forecast.sunrise);
        dataCity.put("sunset", root.forecast.sunset);
        dataCity.put("date", String.valueOf(root.forecast.date_ts));

        dataCity.put("prec_prob", String.valueOf(root.forecast.parts.get(0).prec_prob));
        dataCity.put("wind_dir", root.fact.wind_dir);
        dataCity.put("feels_like", String.valueOf(Math.round(root.fact.feels_like)));


        return dataCity;

    }

    //подключение к серверу для получения данных в виде строки
    static StringBuffer content;
    static HttpURLConnection connection;


    static String getStringFromServer(String urlAdress){
        BufferedReader reader;
        String line;
        content = new StringBuffer();

        try {
            URL url = new URL(urlAdress);
            connection = (HttpURLConnection) url.openConnection();//f2e1fc32-bf0d-4706-8195-a6125e5084cb
            connection.setRequestMethod("GET");//cd44f01d-4fde-4c56-b33f-299fda24d615
            connection.setRequestProperty("X-Yandex-API-Key","f2e1fc32-bf0d-4706-8195-a6125e5084cb");
            if (connection.getResponseCode() == 200){//2aa8d530-9bbf-4073-a3c9-8a0f860145f0
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null){
                    content.append(line);
                }
                reader.close();
            }
            else {
                System.out.println("Error" + connection.getResponseCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            connection.disconnect();
        }
        return content.toString();
    }
}

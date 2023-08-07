package com.example.javafx.pars.city;

import java.util.*;

public class GetCity {
    public HashMap<Integer, String> getCity(String getCity) {
        HashMap<String, HashMap<Integer, String>> city = new HashMap<>();
        try (Scanner sc = new Scanner(Objects.requireNonNull(GetCity.class.getResourceAsStream("city.txt")))) {
            while (sc.hasNextLine()) {
                String[] a = sc.nextLine().split(" ");//разбил строку на три слова
                HashMap<Integer, String> hashMap = new HashMap<>();//создал временный масив
                hashMap.put(1, a[1]);//добавил в него 2 слово
                hashMap.put(2, a[2]);// 3 слово
                city.put(a[0], hashMap);//добавил в главный массив ключ(город) и значение массив
            }
        }
        return city.get(getCity);
    }
    
}


package com.chris.learning.map_demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> worldMap = new HashMap<>();
        worldMap.put(1, "Dubai");
        worldMap.put(2, "Maldives");
        System.out.println(worldMap.get(1));
        worldMap.keySet();
        worldMap.values();


        Map<String, String> capitalMap = new HashMap<>();
        capitalMap.put("China", "Beijing");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Korea", "Seoul");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("France", "Paris");
        System.out.println(capitalMap);

        Set<String> country = new HashSet<>();
        country.add("China");
        country.add("India");
        country.add("Korea");
        country.add("Japan");
        country.add("France");

        for(Integer key : worldMap.keySet()){
          System.out.println(key + "    " + worldMap.get(key));
        }

        //

        Set<Map.Entry<Integer,String>> en = worldMap.entrySet();
        for(Map.Entry<Integer,String> element : en){
            System.out.println(element.getKey() + "     "+ element.getValue());
        }

       // for(String)

        //System.out.println(country);
    }
}

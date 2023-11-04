//Q1. .Write a java program to Create a HashMap called populationMap,
//stores population data for several cities, retrieves and prints the population
//of a specific city, iterates through the map to print all city populations,
//removes a city from the map, and checks if a city exists in the map.

package LabTask_19;

import java.util.*;

public class Q1 
{
    public static void main(String[] args) 
    {
        Map<String,Integer> populationMap=new HashMap<>();
        
        populationMap.put("Nagpur",100000);
        populationMap.put("Bhopal",700000);
        populationMap.put("Agra",300000);
        populationMap.put("Bhandara",200000);
        
        System.out.println("Population of Nagpur city : "+populationMap.get("Nagpur"));
        
        System.out.println("\nData of all cities ->");
        
        for(String i:populationMap.keySet())
        {
            Integer val=populationMap.get(i);
            System.out.println("City : "+i+" Population : "+val);
        }
        
        System.out.println(populationMap.containsKey("Agra"));
        
        System.out.println(populationMap.remove("Agra"));
        
        System.out.println("Data after removing the city\n");
        
        for(String i:populationMap.keySet())
        {
            Integer val=populationMap.get(i);
            System.out.println("City : "+i+" Population : "+val);
        }
    }
}

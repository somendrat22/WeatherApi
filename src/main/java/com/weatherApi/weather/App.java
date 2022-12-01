package com.weatherApi.weather;

import java.util.Scanner;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	Scanner scn = new Scanner(System.in);
    	String city = scn.next();
    	HttpResponse<String> response = Unirest.get("http://api.weatherstack.com/current")
    			.queryString("access_key", "44c9f1ec4077616cc6b10c27de94769d")
    			.queryString("query", city)
    			.asString();
    	
    	System.out.println(response.getBody());
    }
}

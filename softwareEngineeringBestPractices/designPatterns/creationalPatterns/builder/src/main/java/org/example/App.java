package org.example;

import java.util.HashMap;

public class App
{
    public static void main( String[] args )
    {
        UrlBuilder urlBuilder = new UrlBuilder.Builder().host("www.google.com").port(8080).path("codility/01que").build();
        System.out.println(urlBuilder.toString());

        LinkBuilder linkBuilder = new LinkBuilder.Builder().host("www.epam.com").port(8080).path("codility/01queue").addParams("name", "Lakshay").addParams("id","1291").build();
        System.out.println(linkBuilder.toString());

        StudentProfileBuilder studentProfileBuilder = new StudentProfileBuilder.ProfileBuilder("Lakshay", (byte) 21).email("lakshaypahuja56@gmail.com").phone("981217827").address("Hisar, Haryana").build();
        System.out.println(studentProfileBuilder.toString());

        PizzaBuilder pizzaBuilder = new PizzaBuilder.Builder(PizzaBuilder.Size.SMALL, PizzaBuilder.CrustType.THICK).extracheeze(true).mushroom(true).olives(true).build();
        System.out.println(pizzaBuilder.toString());

        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder.Builder(HttpRequestBuilder.Method.GET, "www.google.com").body("bosy").timeout(2347).build();
        System.out.println(httpRequestBuilder.toString());
    }
}

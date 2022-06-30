package com.example.producto2.entity;

public class Message {
    private Double query;
    private String request_id;
    private Double lat;
    private Double lon;
    private String water;

    //metodo que deje acceder a los valores

    public Double getQuery() {
        return query;
    }

    public String getRequest_id() {
        return request_id;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLon() {
        return lon;
    }

    public String getWater() {
        return water;
    }

    @Override
    public String toString() {
        return "Message{" +
                "query=" + query +
                ", request_id='" + request_id + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", water='" + water + '\'' +
                '}';
    }
}

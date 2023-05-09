package com.cwc.java8.streams;

public class Client {

    private String name;
    private String country;

    public Client() {

    }

    public Client(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

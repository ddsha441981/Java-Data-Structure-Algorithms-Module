package com.cwc.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClientBlanceManager {

    public static void main(String[] args) {

        Client raj = new Client("Raj","India");
        Client mukesh = new Client("Mukesh","USA");
        Client jack = new Client("Jack","Aus");//
        Client james = new Client("James","China");
        Client juli = new Client("Juli","Russia");
        Client bob = new Client("Bob","Shri Lanka");

        List<Balance> balances = new ArrayList<>();
        new Balance(2021,1000,raj);
        new Balance(2022,5000,mukesh);
        new Balance(2020,9000,jack);
        new Balance(2019,3000,james);
        new Balance(2018,500,juli);
        new Balance(2018,400,bob);

        //Find All Balance of 2018 and sort in asc order
        List<Balance> balanceList = balances.stream().filter(x -> x.getYear() == 2018).sorted(Comparator.comparing(Balance::getAmount)).collect(Collectors.toList());
        System.out.println(balanceList);
    }
}

package com.cwc.java8.streams;

public class Balance {

    private int year;
    private int amount;
    private Client client;

    public Balance() {
    }

    public Balance(int year, int amount, Client client) {
        this.year = year;
        this.amount = amount;
        this.client = client;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String   toString() {
        return "Balance{" +
                "year=" + year +
                ", amount=" + amount +
                ", client=" + client +
                '}';
    }
}

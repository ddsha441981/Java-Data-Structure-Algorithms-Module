package com.cwc.collectionss;

public class ComparableDemo {
    int id;
    String name;
    int age;

    public ComparableDemo(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public ComparableDemo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public int Comparable(ComparableDemo d1){
//        if (d1.getAge() <25){
//            System.out.println(d1.getName());
//            return 1;
//        }
//        return 0;
//    }


    public static void main(String[] args) {
        ComparableDemo c1 = new ComparableDemo(101,"d1",25);
        ComparableDemo c2 = new ComparableDemo(102,"d2",24);
        ComparableDemo c3 = new ComparableDemo(103,"d3",20);

    }



}

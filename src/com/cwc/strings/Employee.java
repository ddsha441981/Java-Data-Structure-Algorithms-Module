package com.cwc.strings;

public class Employee {

    public Employee(String sofil) {
    }

//    @Override
//    public boolean equals(Object obj) {
//
//        if (this == obj) return true;
//        return true;
//    }


    @Override
    public int hashCode() {

        return super.hashCode();
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Sofil");
        Employee e2 = new Employee("Sofil");


        String[] s3 = {"java", "j2ee", "struts", "hibernate"};

        String[] s4 = {"java", "j2ee", "struts", "hibernate"};
        System.out.println( "''''''''''''''''" + s3.equals(s4));



        System.out.println(e1==e2);//false
        System.out.println(e1.equals(e2));//false
        System.out.println("---------------------------------------");


        String s1 = new String("Sofil");
        String s2 = new String("Sofil");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true
    }




}

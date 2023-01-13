package Com.Syntax.Syntax.Review1;

public class WhatIf4 {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        String c="Hello";
        String d="Java";

        System.out.println(a+b+c+d); //30HelloJava
        System.out.println(a+c+d+b); //10HelloJava20

        // code execution: top to the bottom - left to the right
        System.out.println(c+d+a+b); //HelloJava1020
        System.out.println(c+d+(a+b)); //HelloJava30
    }
}

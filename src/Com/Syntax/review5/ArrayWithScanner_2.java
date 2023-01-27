package Com.Syntax.review5;

import java.util.Scanner;

public class ArrayWithScanner_2 {
    public static void main(String[] args) {
        // Let's create an array of names using scanner

        Scanner scan=new Scanner(System.in);
        System.out.println("How many names you want to store?");
        int size=scan.nextInt();
        String [] name=new String[size];
        //this loop stores elements inside the array

        //regular for loop work with indexes
        for (int i = 0; i < name.length; i++) { // we also can use size.length
            System.out.println("Please enter name");
            name[i] = scan.next();
        }
        // using loop below we can retrieve elements

        // enhanced for loop work with variable
        for (String n:name) {
            System.out.println(n);
        }
    }
}

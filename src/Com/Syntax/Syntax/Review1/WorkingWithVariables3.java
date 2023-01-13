package Com.Syntax.Syntax.Review1;

public class WorkingWithVariables3 {
    public static void main(String[] args) {

        // create a variable and store value into it
        // declare a variable and initialized it
        int number=10;

        // declared a variable
        int num; // declaration of a variable happens only once
        num=100; //initialize the variable
        num=200; // reassign the value
        num=2000;
        num=5000;
        //num=30.01; error (because of the different datatype)
        System.out.println(num); //5000

        boolean hungry=false;
        hungry=true;
        // hungry="yes"; error

        String myString="Hello";
        String name="Artem";
        String address="123 Test Drive";
        System.out.println(myString+" "+name);
        System.out.println(address);
        int age=21;

        // Artem is 21 years old
        System.out.println(name+" is "+age+" years old.");
        /*
        if we want to attach String to anything:
        - String to another String;
        - String to int;
        -String to boolean;
        -String to char....;
        we always use + --> acts as concatenation
         */
        System.out.println(number+num); //when we have 2 numeric values + acts as addition
        String n1="10";
        System.out.println(n1+num);

        String month="December";
        int day=14;
        // 14 December
        System.out.println(day+" "+month);

        char date='1';
        System.out.println(date+month);

        System.out.println(date+day); //63  (go to ascii table to figure out about numbers behind of each number)


    }
}

package Com.Syntax.Syntax.review2;

public class IfStatement_2 {

    public static void main(String[] args) {

        /* if statement is conditional statement
        if (boolean condition) {
        }
         */
        // >, >=, <, <=, !=, ==
        int day=1;
        if (day==1) {
            System.out.println("It is the first day of the month");
        }

        String month="December";
        if (month.equals("December")) {
            System.out.println("It is Christmas time");
        }

        boolean evening=true;
        if (evening){ // since it's already a boolean we don't need to enter == or .equals
            System.out.println("I might have a class at Syntax");
        }

    }
}

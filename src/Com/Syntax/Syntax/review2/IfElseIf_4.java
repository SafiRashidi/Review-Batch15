package Com.Syntax.Syntax.review2;

public class IfElseIf_4 {
    public static void main(String[] args) {

        /* when we have more conditions to test

        if (boolean condition) {
                code a;
         } else if (boolean condition) {
                code B;
         } else if (boolean condition)  {
                code C;
         }
         */

        /* Check homework

            if you completed more than 25 -> great job
            if you completed more than 20 -> good job
            if you completed more than 10 -> ok job
            if you completed more than 5 -> not good job
         */

       int num=8;
       if (num>=25) {
           System.out.println("Great Job");
       } else if (num>20) {
           System.out.println("Good Job");
       } else if (num>10) {
           System.out.println("Ok Job");
       } else if (num>5) {
           System.out.println("Not good job - Need More Practice");
       }

        System.out.println(" --------------------------------------------------- ");

       String browser = "opera";

       if (browser.equals("chrome")) {
           System.out.println("Test case executed on chrome browser");
       } else if (browser.equals("safari")){
           System.out.println("Test case executed on safari browser");
       } else if (browser.equals("firefox")) {
           System.out.println("Test case executed on firefox browser");
       } else {
           System.out.println("Browser is not supported");
       }
    }
}

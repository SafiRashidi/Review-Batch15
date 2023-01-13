package Com.Syntax.Syntax.review2;

public class NestedIf_5 {
    public static void main(String[] args) {

        /*
        Nested If is 1 is statement inside another if statement
        when we have one condition that depends on another
         */

        boolean vaccine=true;
        int dose=0;

        if (vaccine) { // outer if
            System.out.println("how many doses you have?");

            if (dose==1){ //inner if always depend on outer if
                System.out.println("You need a second shot");
            }else {
                System.out.println("You are fully vaccinated");
            }
        } else {
            System.out.println("I do not have a vaccine");
        }
    }
}

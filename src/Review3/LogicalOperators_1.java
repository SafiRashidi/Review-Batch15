package Review3;

public class LogicalOperators_1 {
    public static void main(String[] args) {

        /* When we need to test for 2 or more conditions we use logical
        and or not
        &&  ||  !
        ***************
        AND &&
        true && true -> TRUE
        true && false -> FALSE
        false && true -> FALSE
        false && false -> FALSE
        *************
        OR ||
        true || true -> TRUE
        true || false -> TRUE
        false || true -> TRUE
        false || false -> FALSE
         */
        boolean loginButtonDisplayed=true;
        boolean loginButtonClickable=false;

        if (loginButtonDisplayed && loginButtonClickable) {
            System.out.println("Test case is passed");
        } else {
            System.out.println("Test case failed");
        }
        System.out.println("*****************************");
        // OR ||
        boolean dashboard=false;
        String message="Welcome Admin"; // true || false -> TRUE

        if (dashboard || message.equals("Welcome Admin")) {
            System.out.println("User is successfully logged in");
        } else {
            System.out.println("User is not logged in");
        }
        System.out.println("****************************");

      // NOT ! -> reverse condition

        boolean b=true;
        System.out.println(!true); // false

        boolean agreeCheckbox=false;
        if (!agreeCheckbox) {
            System.out.println("I am clicking on checkbox");
        }
        System.out.println("I am clicking on submit button");
    }
}

package Review3;

import java.util.Scanner;

public class SwitchDemo_3 {
    public static void main(String[] args) {

        /*
        using scanner ask user to enter browser
            based on the browser -> execute code
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your favorite browser");
        String browser= scan.nextLine();

        switch (browser) {

            case "Chrome":
                System.out.println("Test case executed in "+browser);
                break;
            case "Safari":
                System.out.println("Test case executed in "+browser);
                break;
            case "Microsoft edge":
                System.out.println("Test case executed in "+browser);
                break;
            default:
                System.out.println("Browser is unknown - no execution");
        }
    }
}

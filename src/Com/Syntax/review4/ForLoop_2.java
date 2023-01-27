package Com.Syntax.review4;

public class ForLoop_2 {
    public static void main(String[] args) {
        //best loop - used when we know how many times we want to repeat block of codes

        for (int i = 2; i <=20 ; i+=5) {
            System.out.println(i);
        }
        System.out.println("************************");
        // break and continue
        for (int i = 2; i <=20 ; i+=5) {
            System.out.println(i);

            if (i==12){
                System.out.println("i is equal to 12 - I am breaking my loop");
                break;
            }

        }
        System.out.println("********************");
        // continue --> skips current iteration

        for (int i = 1; i <=10 ; i++) {
            if (i%3==0) {
                System.out.println(i);
                continue;
            }
            System.out.println("hello");
        }
    }
}

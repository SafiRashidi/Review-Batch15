package Review3;

public class ForLoop_4 {
    public static void main(String[] args) {
        /*
        Loop - repeat block of code based on the condition
        4 loops in Java:
       1) while - while we don't know how many times will repeat the code
        2) do while
        3) for loop - when you know in advance how many times you will repeat the code
        4) for each/advanced for loop/ enhanced for loop
         */

        // 1. initialization
        // 2. condition
        // 3. if true -> code goes inside the loop body
        // goes back, increment
        // repeat
        for (int i=1; i<=5; i++) {
            System.out.println("Hello "+i);
        }
        System.out.println("*********************");

        for (int a=0; a<8; a+=4){
            System.out.println("Bye");
        }
        System.out.println("*********************");

        for (int i=2; i>10; i++){
            System.out.println(i);
        }
        System.out.println("*********************");

        for (int j=3; j<10; j--) {
            System.out.println(j);
        }
    }
}

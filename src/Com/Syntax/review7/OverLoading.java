package Com.Syntax.review7;

public class OverLoading {
    private void hello(){
        System.out.println("hello");
    }
    private void bye() {
        System.out.println("Bye");
    }
    static void bye (String name) {
        System.out.println("Bye " + name);
    }
}

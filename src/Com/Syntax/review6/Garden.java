package Com.Syntax.review6;

public class Garden {
    void hello (){
        String name = "Adam"; // local variable
        System.out.println("Hello "+ name);
    }
    public static void main(String[] args) {

        // static String str; error cannot use static for local variables

        Flower flower1 = new Flower();
        //accessing variables of Flower class
        System.out.println(Flower.pretty);// correct way accessing static variable
        flower1.name = "Hibiscus";
        flower1.color = "Red";
        flower1.price=5;
        flower1.pretty = false; // not the right way to access static variable but it is possible
        System.out.println("Hibiscus pretty? " + flower1.pretty);
        System.out.println(flower1.price);
        //accessing methods of Flowers class
        flower1.bloom();
        flower1.grow();
        flower1.smell();

        System.out.println("--------------------------------------");
        Flower flower2 = new Flower();
        flower2.name = "Rose";
        flower2.color = "Blue";
        flower2.price=15;

        flower2.bloom();
        flower2.grow();
        flower2.smell();

        Flower flower3 = new Flower();

    }
}

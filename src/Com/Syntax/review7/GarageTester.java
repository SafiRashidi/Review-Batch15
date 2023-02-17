package Com.Syntax.review7;

public class GarageTester {
    public static void main(String[] args) {
        Tesla tesla = new Tesla("Tesla", "S", 2022, 340, "Electric", true);

        //from super class
        tesla.start();
        tesla.drive(100);

        // from Tesla class - subclass
        tesla.haveAutoPilot();

    }
}

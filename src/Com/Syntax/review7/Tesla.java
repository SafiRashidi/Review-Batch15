package Com.Syntax.review7;

public class Tesla extends Car {

    String type;
    boolean autoPilot;
    public Tesla(String make, String model, int year, int horsePower, String type, boolean autoPilot) {
        super(make, model, year, horsePower);
        this.type = type;
        this.autoPilot = autoPilot;
    }

    public void haveAutoPilot() {
        System.out.println(make + " have auto pilot " + autoPilot);
    }

    public void start() {

    }
    //Overriding  - is when we have same method name in 2 DIFFERENT Class (Parent - Child)
    // in Overriding - INHERITANCE IS A MUST
    // In overriding method signature should be SAME

}

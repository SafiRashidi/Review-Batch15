package Com.Syntax.review8;

import Com.Syntax.review7.Car;

public class Bmw extends Car {
    Bmw(String make, String model) {
        super(make, model);
    }

    public void start() {
        System.out.println(make + " starts with push start button");
    }

    public String drive(String typeOfDriving) {
        System.out.println(make + " drives " + typeOfDriving);
        return typeOfDriving;
    }

    void brake() {
        System.out.println(make + " brakes");
    }
}

package Com.Syntax.review8;

public class InsuranceTester {
    public static void main(String[] args) {

        // can I create an object of Insurance Class - N, because it's abstract

        Insurance carPolicy = new CarPolicy("1949566", "John Smith", 200, 25);
        carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());

        Insurance petPolicy = new PetPolicy("P897852", "Olena L", 20, 3);
        petPolicy.getInsurance();
        System.out.println(petPolicy.calculateCoverage());

    }
}

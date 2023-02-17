package Com.Syntax.review8;

public class Store {
    public static void main(String[] args) {
        Furniture chair=new Chair();
        chair.assemble();
        chair.comfort(); // runtime polymorphism

        Furniture table=new Table();
        table.assemble(); // runtime polymorphism
        table.comfort();

        Table t=new Table();
        t.assemble();
        t.comfort();
        t.buildTable("Wood");

        Chair.breaks(); // since they are static we don't need to create object, we can run it by calling class name
        Furniture.breaks(); // since they are static we can run it by calling class name

        Furniture chair1 = new Chair();
        chair1.assemble();
        chair1.comfort(); // runtime polymorphism
        // proof that method breaks is not overridden
        chair1.breaks(); // since we are not overriding methods breaks will be executed from Parent
                        // this is also not the right way to call static method

    }
}

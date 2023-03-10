package Com.Syntax.review11;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo1 {
    public static void main(String[] args) {

        Map<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 12.5);
        fruitMap.put("Banana", 4.9);
        fruitMap.put("Dragon Fruit", 5.6);
        fruitMap.put("Pear", 12.5);
        fruitMap.put("Orange", 12.5);
        fruitMap.put("Mango", 10.6);
        // Remove those elements which contain the letter a or e in their name and their price is more than 8 dollars

        // we are using remove if method to remove the elements -> it's actually part of the syntax of lambda expression
        fruitMap.entrySet().removeIf(entry -> (entry.getKey().contains("a") || entry.getKey().contains("e")) && entry.getValue() > 8);
        System.out.println(fruitMap);
    }
}

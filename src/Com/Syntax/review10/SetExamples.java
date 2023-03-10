package Com.Syntax.review10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {

        Set <String> qaJobs = new HashSet<>(); // does not maintain the order
        // adding object/elements to the collection
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("Api Tester");
        qaJobs.add("Database Tester");
        System.out.println(qaJobs);

        qaJobs.remove("Manual Tester");
        System.out.println("Removed an element " + qaJobs);
        qaJobs.add("Api Tester");
        qaJobs.add("Api Tester");
        System.out.println("Added duplicates " + qaJobs);

        // creating an Object and passing as a parameter to invoke parametrized constructor
        Set <String> lset = new LinkedHashSet<>(qaJobs); // maintain the insertion order
        /* Set lSet=new LinkedHashSet(); // another way of doing it
        lSet.addAll(qaJobs);
         */
        System.out.println("LinkedHashSet " + lset);

        Set <String> tSet = new TreeSet<>();
        tSet.addAll(qaJobs);
        System.out.println("TreeSet " + tSet);


    }
}

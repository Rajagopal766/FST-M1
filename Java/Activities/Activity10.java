package Activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> fl = new HashSet<String>();

        fl.add("Rose");
        fl.add("Jasmine");
        fl.add("Lavander");
        fl.add("Hibiscus");
        fl.add("Daisy");
        fl.add("Tulip");

        System.out.println("Original HashSet: " + fl);
        System.out.println("Size of HashSet: " + fl.size());

        System.out.println("Removing Hibiscus from HashSet: " + fl.remove("Hibiscus"));
        System.out.println(fl.remove("sunflower"));
        if(fl.remove("lotus")) {
            System.out.println("lotus removed from the Set");
        } else {
            System.out.println("lotus is not present in the Set");
        }

        System.out.println("Checking if Jasmine is present: " + fl.contains("Jasmine"));

        System.out.println("Updated HashSet: " + fl);
    }
}

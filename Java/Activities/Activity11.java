package Activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(1, "Blue");
        colors.put(2, "Black");
        colors.put(3, "Red");
        colors.put(4, "Yellow");
        colors.put(5, "Green");

        System.out.println("The Original map: " +colors);

        colors.remove(5);
        System.out.println("Map after removing green: " +colors);

        if(colors.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        }
        else {
            System.out.println("Green does not exist in the Map");
        }

        System.out.println("Number of pairs in the Map is: " + colors.size());
    }
}

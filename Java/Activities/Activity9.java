package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> cl = new ArrayList<String>();
        cl.add("King schultz");
        cl.add("Jules");
        cl.add("marquis warren");
        cl.add("Django");
        cl.add(0, "Shoshana");
        System.out.println("Print All the character names:");
        for(String s:cl){
            System.out.println(s);
        }
        System.out.println("3rd name in the list is: " + cl.get(2));
        System.out.println("Is Jackie brown is in list: " + cl.contains("Jackie Brown"));
        System.out.println("Size of ArrayList: " + cl.size());
        cl.remove("King schultz");
        System.out.println("New Size of ArrayList: " + cl.size());
    }
}

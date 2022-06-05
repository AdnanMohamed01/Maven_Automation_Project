package ActionItems;

import java.util.ArrayList;

public class Loop_with_conditional {
    public static void main(String[] args) {
        //create an array list with cities in New York city and print only when cities are Brooklyn or Manhattan
        ArrayList<String>cities= new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Staten Island");
        cities.add("Manhattan");

        for (int i = 0; i < cities.size(); i++) {
            // with if condition and else if condition
            if (cities.get(i) == "Brooklyn") {
                System.out.println("My city is " + cities.get(i));
            } else if (cities.get(i) == "Manhattan") {
                System.out.println("My City is " + cities.get(i));
            }

            //with or operator both conditions has to be true for me to print Brooklyn or Manhattan

            if (cities.get(i) == "Brooklyn" || cities.get(i) == "Manhattan") {
                System.out.println("My city is " + cities.get(i));
            }
        }//end of for loop



    }//end of main
}//end of class

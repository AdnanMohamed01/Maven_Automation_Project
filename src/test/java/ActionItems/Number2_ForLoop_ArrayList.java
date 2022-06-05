package ActionItems;

import java.util.ArrayList;

public class Number2_ForLoop_ArrayList {

        public static void main(String[] args) {
            //create an arraylist country with country code
            ArrayList<String> countries = new ArrayList<>();
            countries.add("USA");
            countries.add("Bangladesh");
            countries.add("India");
            countries.add("Canada");
            countries.add("Pakistan");

            ArrayList<String> areaCode = new ArrayList<>();
            areaCode.add("1");
            areaCode.add("880");
            areaCode.add("91");
            areaCode.add("1");
            areaCode.add("92");
            for (int i = 0; i < countries.size(); i++) {

                System.out.println(" My country is " + countries.get(i));
                System.out.println(" and my area code is " + areaCode.get(i));
            }//end of for loop


        }//end of main

    }//end of java class



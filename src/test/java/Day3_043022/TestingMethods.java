package Day3_043022;

import ReusableLibraries.ReusableMethods;

public class TestingMethods {
    public static void main(String[] args) {
        //call the add two number method and execute it
        ReusableMethods.addTwoNumbers(20, 30);


        //call the return method and store it in a variable to perform something else
        int finalResults = ReusableMethods.subtractTwoNumbers(50, 10);
        int newResults = finalResults + 10;
        System.out.println("new results is " + newResults);
    }//end of main
    }// end of java class





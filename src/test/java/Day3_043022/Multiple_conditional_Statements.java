package Day3_043022;

public class Multiple_conditional_Statements {

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 3;

        //if a+b is less than c then print the results
        //if a+b is greater than c then print the results
        //finally print a+b is equal to c
        if (a+b < c){
            System.out.println("a & b  is less than c");
        } else if (a+b > c) {
            System.out.println("a & b is greater than c");
        }else {
            System.out.println("a & b is equal to c");
        }//end of conditions

        //declare additional variables
        int d = 4;
        int e = 5;
        int f = 6;
        // or operator with if statement
        // || is used for or operator - - one of the condition needs to be true
        // && is used for and operator - - both conditions need to be true
        if (d < e && f < e){
            System.out.println("d is less than e or f is less than e");
        }


    }//end of main
}//end of java class

package ActionItems;

public class Grade_conditional_statement {
    public static void main(String[] args) {

        //when value is 90-100 print result A
        //when value is 80-90 print result B
        //when value is 70-80 print result C
        //when value is 60-70 print result D
        //when value is less than 60 print result F
        int grade = 90;
        if (grade >= 90 && grade <= 100) {
            System.out.println(" When grade range is from 90 to 100 print grade as A");
        } else if (grade >= 80 && grade <= 90) {
            System.out.println(" When grade range is from 80 to 90 print grade as B");
        } else if (grade >= 70 && grade <= 80) {
            System.out.println(" When grade range is from 70 to 80 print grade as C");
        } else if (grade >= 60 && grade <= 70) {
            System.out.println(" When grade range is from 60 to 70 print grade as D");
        } else {
            System.out.println(" When grade range is less than 60 print grade as F");
        }//end of conditions
    }//end of main
}//end of class







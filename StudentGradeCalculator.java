import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        

        System.out.println("enter the marks of 5 subjects (out of 100)");
        int n1 =  x.nextInt();
        int n2 =  x.nextInt();
        int n3 =  x.nextInt();
        int n4 =  x.nextInt();
        int n5 =  x.nextInt();

        int total = n1+n2+n3+n4+n5;
        float percentage = total / 5;

        System.out.println("the total of 5 subject is " + total);
        System.out.println("the percentage of the 5 subject is" 
        + percentage);
        
        if(percentage >= 90){ 
                 System.out.println("grade A");
        } else if(percentage>=88) {
                System.out.println("grade B");
        } else if(percentage>=70) {
                System.out.println(" grade C");
        } else if(percentage>=60) {
                System.out.println("grade D");
        } else if(percentage>=40 ) {
                System.out.println("grade E");
        } else {
                System.out.println("failed");
        }
    }    
}

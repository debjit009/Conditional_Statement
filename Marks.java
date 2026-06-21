import java.util.*;
public class Marks{
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks =sc.nextInt();


        if(marks>=95){
            System.out.println("Grade A+");

        } else if (marks>=85 && marks<95){
            System.out.println("Grade A");

            } else if(marks>=75 && marks<85){
            System.out.println("Grade B+");

        }else if (marks>=65 && marks<75){
            System.out.println("Grade B");

        }else if(marks>=45 && marks<65) {
           System.out.println("Grade B+");

        }else if (marks>=25 && marks<45){
            System.out.println("Grade C ");


        }else{
            System.out.println("F");
       }                
       
}   }
        
    


    


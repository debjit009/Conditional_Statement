import java.util.*;
public class IfElse2 {

    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the day");
    int day = sc.nextInt();
        
        
        if(day==1){
            System.out.println("Go TO HOME");

        } else if(day==4){
            System.out.println("GO TO MARKET");

        } else if(day==9){
            System.out.println("GO TO UNIVERSITY");
        }

        else{
            System.out.println("GO TO OFFICE");
        }
    }  
    
}

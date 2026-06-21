import java.util.Scanner;
public class Switch {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE DAY");
        int day = sc.nextInt();


        switch(day){

            case 1:
            System.out.println("TODAY IS SUNDAY");
            // YOU CAN WRITE MULTIPLE LINES //
            break;

            case 2:
                System.out.println("TODAY IS MONDAY");
                break;

                case 3:
                System.out.println("TODAY IS TUESDAY");
                break;

                case 4:
                    System.out.println("TODAY IS WENRSDAY");
                    break;

                    case 5:
                    System.out.println("TODAY IS THRUSDAY");
                    break;

                    case 6:
                        System.out.println("TODAY IS FRIDAY");
                        break;
                        
                        case 7:
                            System.out.println("TODAY IS STURDAY");
                            break;

                            default:
                            System.out.println("Inavalid day");

        
        }
    }
    
}

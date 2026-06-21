public class NestedIfelse {
    public static void main(String[] args) {
        
        //find the maximum number

        int a = 10;
        int b = 12;
        int c = 11;

        if(a>b){
            System.out.println("a is bigger than b");
            
            if(a>c){
               System.out.println("a is bigger than c");
               System.out.println("a is largest"+a); 

            }else{
                System.out.println("c is bigger than a");
                System.out.println("c is largeast"+c);
            }
        }else {
           System.out.println("b is bigger than a");
           if(b>c){
            System.out.println("b is bigger than c");
            System.out.println("b is largest:" +b );

           }else{
            System.out.println("c is bigger than b");
            System.out.println("c is the largest"+c);

           } 
        }
    }
    
}

import java.util.*;
public class Test1 {

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your city name :");
        String name = sc.nextLine().toLowerCase().trim();
        if(name.equals("hyderabad")){
            System.out.println("hello hyderabadi");
        }
        else if(name.equals("bangalore")){
            System.out.println("hello karnataka");

        }
        else if(name.equals("chennai")){
            System.out.println("hello tamil");
        }
        else {
               System.out.println("please enter a valid city name");
        }

    }


}

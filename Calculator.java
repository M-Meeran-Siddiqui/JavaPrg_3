import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
           int a,b;
           System.out.println("Enter the value of a   and b : ");
           Scanner sc = new Scanner(System.in);
               a =sc.nextInt();
               b =sc.nextInt();
           System.out.println("Enter What Operation You want to Perform : ");    
           String operation = sc.next();    
           switch (operation) {
            case "Add": System.out.println(a + " + "+ b +"  = "+(a+b));
                break;
           case  "Sub": System.out.println(a + " - "+ b + " = "+(a-b));
                break;
           case  "Mul": System.out.println(a + " * "+ b +" = "+(a*b));
                break;
           case  "Div": System.out.println(a + " / "+ b +" = "+(a/b));      
           default:System.out.println("Not a Valid operation .");
                break;
           }
    }
}

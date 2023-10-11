import java.util.Scanner;

public class Voting {
      public static void main(String[] args) {
            int age;
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter Your Age : ");
                 age = sc.nextInt();

                 if(age<18){
                     System.out.println("You are Not allow to vote .");
                 }
                 else{
                     System.out.println("You allow to vote .");
                 }
      }
}

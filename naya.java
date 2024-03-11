import java.util.Scanner;

public class naya {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int userNumer1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int userNumer2 = sc.nextInt();
        int sum = userNumer1 + userNumer2;
        System.out.println("The sum of number is: "+ sum);
    }
}

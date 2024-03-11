import java.util.Scanner;

public class calculatortest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:");
        int num1=sc.nextInt();
        System.out.print("enter second number:");
        int num2=sc.nextInt();
        Calculator c = new Calculator( num1, num2);
        c.add();
    }
}
        

       
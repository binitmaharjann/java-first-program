import java.util.*;
class nexttestemployee{
    public static void main(String[] args){
        int choice;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("who are you?");
        name=sc.next();
        System.out.println("enter 1 for full time and 2 for parttime:");
        choice=sc.nextInt();
        if(choice==1){
            fulltime ft=new fulltime();
            int sal=ft.calculateSalary();
            System.out.println(sal);
        }
        else{
            parttime abc=new parttime();
            int sal=abc.calculateSalary();
            System.out.println(sal);
        }
    }
}


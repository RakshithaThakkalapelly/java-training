import java.util.Scanner;
public class Assignment1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1= sc.nextInt();
        System.out.println("Enter second number:");
        int num2= sc.nextInt();
        int sum = num1+num2;
        int sub = num1-num2;
        int mult = num1*num2;
        int mod = num1%num2;
        System.out.println("sum:"  +sum); 
        System.out.println("sub:"  +sub);
        System.out.println("sub:"  +mult);
        System.out.println("sub:"  +mod);
    }
}


import java.util.Scanner ;
public class Assignment2
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        if((a>b)&&(a>c))
        {
            System.out.println("a is bigger number");
        }
        else if((b>a)&&(b>c))
        {
            System.out.println("b is a bigger number");
        }
        else if((c>a)&&(c>b))
        {
            System.out.println("c is bigger number");
        }
        else
        {
          System.out.println("the numbers are same");
        }

    }
}

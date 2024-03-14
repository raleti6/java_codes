import java.util.Scanner;

class sum
{
    public static void main(String args[])
    {
        Scanner num1= new Scanner(System.in);
        System.out.println("enter number1");
        int x = num1.nextInt();
        Scanner num2= new Scanner(System.in);
        System.out.println("enter number2");
        int y = num2.nextInt();
        int result = x + y;
        System.out.println("sum of two numbers is:" + result);

    }
}
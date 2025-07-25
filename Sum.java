import java.until.Scanner;

public class sum {
    public static void main (string args[]) {
        // int num1 = 4;
        // int num2 = 6;

        Scanner Scanner=new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = Scanner.nextint();

        System.out.print ("Enter num2: ");
        int num2 = Scanner.nextint();

        int sum = num1+num2;
        System.out.println("sum of " +num1 + " and " +num2 +" = " +sum);
    }
}

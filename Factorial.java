import java.util.Scanner;   

public class Factorial {

    static int factorial(int num) {

        if(num == 1) {
            
            return 1;
        }
        return num * factorial(--num);
    }
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial : ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " : " + factorial(num));
    }
}

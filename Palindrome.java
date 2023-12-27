import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(int num) {

        int reversed = 0;
        int copy = num;

        while (copy != 0) {

            reversed = reversed * 10 + copy % 10;
            copy /= 10;
        }

        return num == reversed;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        if(isPalindrome(num)) {

            System.out.println("Number is palindrome");

        }else {

            System.out.println("Not a palindrome");
        }
        sc.close();
    }
}

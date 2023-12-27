import java.util.Scanner;

public class BinnaryToDecimal {
    

    static int BinaryToDecimal(String binary) {

        int decimal = 0;
        int length = binary.length();

        for(int i = 0; i < length; i++) {

            int power = length - 1 - i;
            char ch = binary.charAt(i);

            if(ch == '1') {

                decimal += Math.pow(2, power);
            }else if(ch != '0') {

                System.out.println("Please enter the valid Binary");
                return -1;
            }
        }
        return decimal;   
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number : ");
        
        String binary = sc.nextLine();
        System.out.println("Decimal is : " + BinaryToDecimal(binary));

    }
}

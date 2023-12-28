import java.util.Scanner;
import java.util.Arrays;
class AnagramString {
    
    boolean isAnagram(String original, String anagramCheck) { 

        if(original.length() != anagramCheck.length()) {

            return false;
        }
        original = original.toLowerCase().replace("\\s", "");
        anagramCheck = anagramCheck.toLowerCase().replace("\\s", "");

        char[] orginArr = original.toCharArray();
        char[] anagramArr = anagramCheck.toCharArray();

        Arrays.sort(orginArr);
        Arrays.sort(anagramArr);
        
        return Arrays.equals(orginArr, anagramArr);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String original = sc.nextLine();

        System.out.print("Enter string to check isAnagram : ");
        String anagramCheck = sc.nextLine();

        AnagramString as = new AnagramString();
        
        if(as.isAnagram(original, anagramCheck)) {

            System.out.println(anagramCheck + " is anagram String ");
        }else {

            System.out.println(anagramCheck + " is not an anagram String ");
        }
        sc.close();
    }
}

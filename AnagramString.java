import java.util.Scanner;

class AnagramString {
    
    boolean isAnagram(String original, String anagramCheck) { 

        // char[] origin = original.toLowerCase().replace("//s", "").toCharArray();

        original = original.toLowerCase().replace("\\s", "");
        anagramCheck = anagramCheck.toLowerCase().replace("\\s", "");
        
        if(original.length() != anagramCheck.length()) {

            return false;

        }else {

            for(int i = 0; i < original.length(); i++) {

                char ch = original.charAt(i);
                int oriCount = 0;

                for(int j = 0; j < original.length(); j++) {

                    if(ch == original.charAt(j)) {

                        oriCount++;
                    }
                }

                int anaCount = 0;
                for(int j = 0; j < anagramCheck.length(); j++) {

                    if(ch == anagramCheck.charAt(j)) {

                        anaCount++;
                    }
                }

                if(anaCount != oriCount) {

                    return false;
                }
            }
        }
        return true;
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

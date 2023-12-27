public class SumOfPrimeNumbersInRange {
    
    static int sumOfPrimeNumbersInRange(int lower, int higher) {

        int sumofPrime = 0;

        for(int i = lower + 1; i < higher; i++) {

            int factors = 0;

            for(int j = 1; j <= i; j++) {

                if(i % j == 0) {

                    factors++;
                }
                if(factors > 2) {

                    continue;
                }
            }
            
            if(factors == 2) {

                System.out.println(i);
                sumofPrime += i;
            }
        }
        return sumofPrime;
    }
    public static void main(String[] args) {

        int lower = Integer.parseInt(args[0]);
        int higher = Integer.parseInt(args[1]);

        int sumofPrimeNubmers = sumOfPrimeNumbersInRange(lower, higher);

        System.out.println("Sum is : " + sumofPrimeNubmers);
    }
}

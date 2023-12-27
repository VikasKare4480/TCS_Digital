import java.util.Scanner;

public class BikesCrossingNorthToSouth {

    static int bikesCrossingNorthToSouth(int[] arr) {

        if(arr.length == 0) {

            return -1;
        }
        int crossingBikes = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == 0) {

                for(int j = i + 1; j < arr.length; j++) {

                    if(arr[j] == 1) {

                        ++crossingBikes;
                    }
                }       
            }  
        }

        return crossingBikes;
    } 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter the Direction of "+ (i + 1) + "st bike (0/1) (North/South) : ");
            arr[i] = sc.nextInt();
        }

        int crossingBikes = bikesCrossingNorthToSouth(arr);

        if(crossingBikes != -1) {

            System.out.println("Bikes Crossing each other : " + crossingBikes);
        }else {

            System.out.println("No bike is crossing each other");
        }
    }
    
}

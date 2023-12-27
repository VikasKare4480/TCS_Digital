
import java.io.*;
import java.util.*;

public class MaximumNoOfGuests {
    
    static int maxGuests(int[] E, int[] L) {

        if(E.length != L.length) {

            System.out.println("Wrong Input");
            return -1;  
        }
        int maxGuests = 0;
        int currentGuest = 0;

        for(int i = 0; i < E.length; i++) {

            currentGuest += E[i] - L[i];
            // currentGuest -= L[i];

            if(currentGuest > maxGuests) {

                maxGuests = currentGuest;
            }
        }
        return maxGuests;
    }
    public static void main(String[] args) {

        int[] E = {7,0,5,1,3};
        int[] L = {1,2,1,3,4};

        int maxGuest = maxGuests(E, L);

        if(maxGuest!=-1) {

            System.out.println("Max Guest Single instance : " + maxGuest);
        }else {

            System.out.println("Enter valid arrays");
        }
    }
}

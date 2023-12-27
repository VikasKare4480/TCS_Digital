
import java.io.*;


class Hypotenous {

    public static void main(String[] args) throws IOException{

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        if(args.length < 2) {

            System.out.println("Please enter the 3 arguments ");
        }

        double side1 = 0;
        double side2 = 0;
        try {

            side1 = Integer.parseInt(args[0]);
            side2 = Integer.parseInt(args[1]);

        }catch(NumberFormatException e) {

            System.out.println("Please enter the write numbers ");

        }
        side1 = Math.pow(side1, 2);
        side2 = Math.pow(side2, 2);

        double side3 = Math.sqrt(side1+ side2);

        System.out.println("Hypoteneous is  : " + side3);
        
    }
}
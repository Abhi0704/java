package Library;

import java.util.Scanner;

public class mountain {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your array length");
            int lengthArray = sc.nextInt();
            int array[] = new int[lengthArray];
            //Getting input for the array
            System.out.println("Please enter values in your array");
            for(int values=0; values< array.length; values++){
                array[values] = sc.nextInt();
            }
            int highest, lowest, i;
            highest = lowest = array[0];
            for(i=1; i<array.length; i++){
                if (array[i] > highest){
                    highest = array[i];
                }
                if(array[i]<lowest){
                    lowest = array[i];
                }
            }
            int difference = highest - lowest;
            System.out.println("The highest peak is: " + highest);
            System.out.println("The lowest peak is: " + lowest);
            System.out.println("The difference between highest and lowest peak is " + difference);
            //counting tables if any exist
            int table = 0;
            for( int k=0; k<array.length-1; k++) {
                if (array[k]==array[k+1])
                {
                    table++;
                    System.out.println("The table points are: "+ array[k] +" and 205" + array[k+1]);
                }
            }
            System.out.println("Number of tables in graph are:  "+table);
        }
    }



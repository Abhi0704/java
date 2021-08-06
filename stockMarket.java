import java.util.Scanner;
public class stockMarket {
    public static void main(String[] args) {

        int rise = 0;
        int fall = 0;

        Scanner pointsScanner = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your list");
        int listSize = pointsScanner.nextInt();

        int stock [] = new int [listSize];

        //Loop to enter the value into the array
        System.out.println("Enter the points in a graph");
        for (int points=0 ; points<stock.length; points++){
            stock[points] = pointsScanner.nextInt();
        }

        for(int i=0 ; i<listSize-1 ;i++)
        {
            if (stock [i] < stock [i+1]){
                rise++;
            } else if (stock [i] > stock [i+1] ) {
                fall++;
            }
        }

        System.out.println("The Total number of fall :" +fall);
        System.out.println("The Total number of rise :" +rise);
    }
}

package exception;

public class ArrayOutofBound {
    public static void main(String[] args) {
        try{
            int a[]=new int[10];
            //Array has only 10 elements
            a[11] = 9;
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println ("ArrayIndexOutOxfBounds");
        }
    }
}

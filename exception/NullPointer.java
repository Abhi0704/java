package exception;

public class NullPointer {
    public static void main(String[] args) {
        try{
            String str=null;
            System.out.println (str.length());
        }
        catch(NullPointerException ex){
            System.out.println("NullPointerException..");
        }
    }
}

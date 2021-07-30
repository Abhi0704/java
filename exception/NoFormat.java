package exception;
//this exception occurs when a string is parsed in numeric value
public class NoFormat {
    public static void main(String[] args) {
        try{
            int num=Integer.parseInt ("XYZ") ;
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("Number format exception occurred");
        }
    }
}

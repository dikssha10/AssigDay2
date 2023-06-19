package whileloop;

public class Reversenumber {
    public static void main(String[] args) {
        int i=231;
        int rev=0;
        while(i != 0){
            int remainder = i % 10;
            rev = rev * 10 + remainder;
            i = i/10;
        }
        System.out.println("The reverse is: " + rev);
    }
    }


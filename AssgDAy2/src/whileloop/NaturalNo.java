package whileloop;

public class NaturalNo {
    public static void main(String[] args) {
        int i=1;
        int num=20;
        int sum=0;
        while(i <= num){
            sum += i;
            i++;
        }
        System.out.println("Sum of the number= " + sum);
    }
}

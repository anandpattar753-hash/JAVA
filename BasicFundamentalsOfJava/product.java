import java.util.*;

public class product {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        sc.close();
        int product = a*b;
        System.out.print("Product of a and b is = "+product);
    }
}

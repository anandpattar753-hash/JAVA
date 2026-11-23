import java.util.*;
public class Average {
    public static  void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        double average = (a+b+c)/3;
        System.out.print("Average of 3 numbers is : "+average);
        sc.close();
    }
}

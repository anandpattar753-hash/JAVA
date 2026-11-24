import java.util.*;


public class Binary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter number: ");
         int a = sc.nextInt();
         System.out.print("Enter number: ");
         int b = sc.nextInt();

         System.out.println("Addition: "+(a+b));
         System.out.println("substratcion: "+(a-b));
         System.out.println("Multiplication: "+(a*b));
         System.out.println("divison: "+(a/b));
         System.out.println("Modulas: "+(a%b));
          sc.close();
    }
}
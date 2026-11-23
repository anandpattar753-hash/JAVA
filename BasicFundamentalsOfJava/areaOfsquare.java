import java.util.*;
public class areaOfsquare {
    public static  void main(String []args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a side: ");
       int side = sc.nextInt();
       float area= (side * side);
    
       System.out.println("Area of a square is : "+area);
       sc.close();
    }
}

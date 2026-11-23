import java.util.*;

public class areaOfcircle {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
         float PI = 3.14f;
        System.out.print("Enter a radius: ");
        int r = sc.nextInt();
        float radius = PI*(r*r);
        System.out.print("Area of circle: "+radius);
        sc.close();
    }
}

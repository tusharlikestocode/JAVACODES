import java.util.*;

    class Function{
         void Shape(float r){
            System.out.println("the area of circle is"+(r*3.14*r));
        }
         void Shape(int l,int b){
            System.out.println("the area of rectangle is"+(l*b));  
        }
         void Shape(int s){
            System.out.println("the area of square is"+(s*s));

        }
    }

 class Overload {
    public static void main(String h[]) {
        Scanner sc=new Scanner(System.in);
        Function f=new Function();
        int l=0,b=0,s=0;
        float r=0;
        System.out.println("enter the radius of circle : ");
        r=sc.nextFloat();
        System.out.println("enter the length and breadth of rectangle : ");
        l=sc.nextInt();
        b=sc.nextInt();
        System.out.println("enter the length of square :");
        s=sc.nextInt();
        f.Shape(r);
        f.Shape(l, b);
        f.Shape(s);

    }
}

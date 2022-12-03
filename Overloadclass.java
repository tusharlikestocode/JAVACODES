import java.util.*;

    class Shape{
        Shape(float r){
            System.out.println("the area of circle is"+(r*3.14*r));
        }
        Shape(int l,int b){
            System.out.println("the area of rectangle is"+(l*b));  
        }
        Shape(int s){
            System.out.println("the area of square is"+(s*s));

        }
    }

 class Overloadclass {
    public static void main(String h[]) {
        Scanner sc=new Scanner(System.in);
        int l=0,b=0,s=0;
        float r=0;
        System.out.println("enter the radius of circle : ");
        r=sc.nextFloat();
        System.out.println("enter the length and breadth of rectangle : ");
        l=sc.nextInt();
        b=sc.nextInt();
        System.out.println("enter the length of square :");
        s=sc.nextInt();
        Shape sh1=new Shape(r);
        Shape sh2=new Shape(l, b);
        Shape sh3=new Shape(s);


        
    }
}


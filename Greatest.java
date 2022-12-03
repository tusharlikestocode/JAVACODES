public class Greatest{
    public static void main(String h[])
{
    int num1=Integer.parseInt(h[0]);
   int num2=Integer.parseInt(h[1]);
    int num3=Integer.parseInt(h[2]);
    int d=num1>num2?(num1>num3?(num1):num3):(num2>num3?(num2):(num3));
    System.out.println("the Greatest number is"+d);
}
}

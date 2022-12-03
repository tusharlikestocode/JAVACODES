import java.util.Scanner;


public class Distinct {
    public static void main(String h[])
    {
        Scanner sc = new Scanner(System.in);
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int n3=sc.nextInt();
        if(n1!=n2 && n2!=n3 && n3!=n1){
            System.out.println("all the number all distinct");
        
        }
        else
        System.out.println("all the not same");




    }

    
}

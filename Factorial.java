import java.util.Scanner;

public class Factorial {
    public static void main(String h[]){
        int num,i;
        int fact=1;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(i=1;i<=num;i++){
            fact=fact*i;
        }

        System.out.println("the factorial of number is"+ fact);

    }
}

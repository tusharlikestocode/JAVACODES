import java.util.Scanner;
public class Perfect {
    public static void main(String h[]){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0,j;
     
            for(j=1;j<num;j++){
                if(num%j==0 && j!=num){
                    sum=sum+j;
                }
            }
       
       
        if(sum==num){
        System.out.println("the number  is a perfect number");

    }
    else
    System.out.println("the number is not perfect number");
}
}

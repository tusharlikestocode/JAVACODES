import java.util.Scanner;
public class Maxmarks {
    public static void main(String h[]) {

        Scanner sc=new Scanner(System.in);
        int[] arr = new int[100];
        int val,i,sum=0,larg=arr[0],temp;
        System.out.println("enter the numbers of students");
        val=sc.nextInt();
        System.out.println("enter the marks of students");
    
        for(i=0;i<val;i++){
            arr[i]=sc.nextInt();
        }
        for ( i = 0; i < val; i++)   
        {  
            for (int j = i + 1; j < val; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
       larg=arr[val-1]  ;

        for(i=0;i<val;i++){
            sum=sum+arr[i];
        }
        System.out.println("Maximum marks obtained are " +larg);
        System.out.println("Sum of all the marks is"+sum);

    }
}

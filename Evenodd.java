
//a.	WAP to count number of even and odd elements from an array
//b.	WAP to count total marks and highest marks obtained by a student


import java.util.Scanner;

public class Evenodd {
    public static void main(String h[]) {
        
    
    Scanner sc=new Scanner(System.in);
    int[] arr = new int[100];
    int even=0,odd=0,val,i;
    System.out.println("enter the numbers of element to be entered");
    val=sc.nextInt();
    System.out.println("enter the elements");

    for(i=0;i<val;i++){
        arr[i]=sc.nextInt();
    }
    for(i=0;i<val;i++){
        if(arr[i]%2==0){
            even++;
        }
        else{
            odd++;
        }
    }
    System.out.println("number of odd numbers is"+odd);
    System.out.println("Number of even numbers is"+even);

}
}
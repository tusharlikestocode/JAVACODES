// Write a Java program to
// i) test if an array contains a specific value.
// ii) remove a specific element from an array.
// iii) insert an element at specific position into an array.
// iv) find the maximum and minimum value of an array.
import java.util.*;
public class q3 {
    /**
     * 
     */
    public static void main(String h[]) {
        Scanner sc=new Scanner(System.in);
        int[] a= new int[20];
        int n,i,del,sea,ch=0;
        n=sc.nextInt();
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the desired element");
        sea=sc.nextInt();
        for(i=0;i<n;i++){
            if(a[i]==sea){
                System.out.println("present");
            }
        }
        System.out.println("enter the  element to be deleted");
        del=sc.nextInt();
        for(i=0;i<n;i++){
            if(a[i]==del){
              
                ch=i;
            }
        }
        for(i=ch;i<n-1;i++){
            
                a[i]=a[i+1];
            
        }
        for(i=0;i<n-1;i++){
            System.out.println(a[i]+",");
        }
        
        int pos,data;
        data=sc.nextInt();
        pos=sc.nextInt();
        
        for(i=pos+2;i<n-16;i++){
            a[i]=a[i+1];

        }
        a[pos-1]=data;
        for(i=0;i<n-1;i++){
            System.out.println(a[i]+",");
        }
        int large=a[0],small=a[0];
        for(i=0;i<n;i++){
            if(large<a[i]){
                large=a[i];
            }
        }
        for(i=0;i<n;i++){
            if(small>a[i]){
                small=a[i];
            }
        }
        System.out.println(large);
        System.out.println(small);

    }

}

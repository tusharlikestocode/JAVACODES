import java.util.Scanner;
public class Transpose {
    public static void main(String h[]) {
        
    
        Scanner sc=new Scanner(System.in);
        int[][] arr = new int[100][100];
        int[][] t = new int[100][100];

        int m,n,i,j,a,b;
        System.out.println("enter the numbers of rows");
        m=sc.nextInt();
        System.out.println("enter the numbers of column");
        n=sc.nextInt();
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    for(i=0;i<arr.length;i++){
        for(j=0;j<arr[i].length;j++){
        System.out.println(arr[i][j]+" ");

}
    System.out.println();
    }
}
}

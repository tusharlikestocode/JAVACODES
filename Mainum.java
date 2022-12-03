import java.util.Scanner;

// A chemist/pharmacy needs a program to display the total amount to be paid after
// the user has bought some medicines and their rates. On the user (chemist)
// selecting the name of the medicines and the quantity, the amount should be
// calculated and displayed. Finally output should look like:





class CHEMIST {
    int rate;
    int qua;
    String name;
    int total;
    
    void setdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name of the medicine");
        name=sc.next();
        System.out.println("enter rate of the medicine");
        rate=sc.nextInt();
        System.out.println("enter quatity of the medicine");
        qua=sc.nextInt();
    }
    
    void display(){
        total=qua*rate;
        System.out.println(name+"\t"+rate+"\t"+qua+"\t\t"+total);

    }
    
}
public class Mainum{
    public static void main(String h[]) {
        Scanner sc=new Scanner(System.in);
        int i,totala=0; 
        int n=sc.nextInt();
        CHEMIST c[]=new CHEMIST[n];
        for(i=0;i<n;i++){
            c[i]=new CHEMIST();
            System.out.println("enter details of medicine");
            c[i].setdata();
        }
        System.out.println("Name\tRate\tQuantity\tTotal");
        for(i=0;i<n;i++){
            c[i].display();
        }
        for(i=0;i<n;i++){
            totala=totala+c[i].total;
        }
        System.out.println("the total amount to be paid"+totala);

    }
}
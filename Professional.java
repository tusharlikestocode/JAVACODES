import java.io.*;

public class Professional{
    public static void main( String h[])throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int math,phy,chem,total;
        System.out.println("Enter your Maths marks");
        math=Integer.parseInt(br.readLine());
        System.out.println("Enter your Physics marks");
        phy=Integer.parseInt(br.readLine());
        System.out.println("Enter your Chemistry marks");
        chem=Integer.parseInt(br.readLine());
            total=math+phy+chem;
        if(chem>=50 && math>60 && phy>=50 && total>=200){
            System.out.println("You are eligible for admission");

        }
        else{
            System.out.println("You are not eligilble for admission");

        }


        
    }
    
}
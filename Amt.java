import java.util.*;
import java.lang.*;
class Atm extends Exception
{
    Atm(String str){
        super(str);
    }
    public static void main(String h[]) {
        Scanner sc=new Scanner(System.in);
        int amt,bal;
        System.out.println("WELCOME TO THE BANK");
        System.out.println("Enter your balance:\n");
        bal=sc.nextInt();
        System.out.println("Enter the amount to be withdrawn:\n");
        amt=sc.nextInt();
        try{
            if(amt>bal){
                Atm r = new Atm("INSUFFICENT BALANCE");
                throw r;
            }
            else{
                System.out.println("COLLECTED YOUR CASH");
            }
        }catch(Atm r){
            System.out.println("Exception is " + r);
        }
     
    }
}
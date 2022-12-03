import java.util.*;
import java.lang.*;
class Register extends Exception
{
    Register(String str){
        super(str);
    }
    public static void main(String h[]) {
        Scanner sc=new Scanner(System.in);
        int wt,age;
        System.out.println("enter your age:\n");
        age=sc.nextInt();
        System.out.println("enter your weight:\n");
        wt=sc.nextInt();
        try{
            if(age<=10 || wt<=40){
                Register r = new Register("NOT ELIGIBLE");
                throw r;
            }
            else{
                System.out.println("REGISTERED");
            }
        }catch(Register r){
            System.out.println("Exception is " + r);
        }
     
    }
}
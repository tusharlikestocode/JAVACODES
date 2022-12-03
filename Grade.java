import java.util.Scanner;

public class Grade {
    public static void main(String h[]){
        Scanner sc =new Scanner(System.in);
        int per;
        System.out.println("Enter your percentage");
        per= sc.nextInt();
        if(per>=0 && per<=60){
            System.out.println("Your Grade is F");
        }
        else if(per>=61 && per<=70){
            System.out.println("Your Grade is D");
        }
       else  if(per>=71 && per<=80){
            System.out.println("Your Grade is C");
        }
        else if(per>=81 && per<=90){
            System.out.println("Your Grade is B");
        }

        else if(per>=91 && per<=100){
            System.out.println("Your Grade is A");
        }


    }
    
}

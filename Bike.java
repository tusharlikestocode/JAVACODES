import java.util.Scanner;

public class Bike {
    public static void main(String h[]){
        int temp;
        Scanner sc= new Scanner(System.in);
        temp=sc.nextInt();
        if(temp>=24 && temp<=40){
            System.out.println("Good Temp to ride bike");
        } 
        else if(temp>=18 && temp<=23){
            System.out.println("goood temp to ride bike while raining");
        }
    }
}

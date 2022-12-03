import java.util.Scanner;

public class Str {
    public static void main(String h[]) {
        Scanner sc=new Scanner(System.in);
        String sen;
        
        sen=sc.nextLine();
        
        System.out.println(sen.replaceAll("\\s+", " ").trim());

        
    }
}

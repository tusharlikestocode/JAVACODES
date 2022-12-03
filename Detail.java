import java.util.*;

 class Detail{
   
    int emid;
    String name;
    int exp;
    String company;
   
   void get(){
    Scanner sc= new Scanner(System.in);
    emid=sc.nextInt();
    name=sc.nextLine();
    exp=sc.nextInt();
    company=sc.nextLine();
}
    void display(){
        System.out.println("Employee Id:"+ emid);
        System.out.println("Employee Name:"+ name);
        System.out.println("Employee Experience:"+ exp);
        System.out.println("Employee Company:"+ company);

    }



     public static void main(String h[])
     {
        Detail x=new Detail();
        x.display();
        x.get();
        
        
        
    }
}
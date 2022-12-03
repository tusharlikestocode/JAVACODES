public class Sum {
    public static void main(String h[]){
        int i;
        int sum=0;
        System.out.println("The Numbers divisble by 7 are: ");
        for(i=100;i<=200;i++){
            if(i%7==0){
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println("The sum of all these numbers is: "+sum);
    }
    
}

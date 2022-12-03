import java.util.Scanner;

// WAJP to do the following:
// a. To print the Question “Who is the Prime Minister of India ?”
// b. To accept an answer.
// c. To print “Excellent” and then stop if the answer is correct.
// d. To output the message “try again” if the answer is wrong through user
// defined exception [this is second attempt]
// e. To display the correct answer when the answer is wrong even at the third
// attempt and stop.



public class userexception extends Exception{

    public static void main(String h[]) {
        Scanner sc=new Scanner(System.in);
        String ans;
        int i=0;
        System.out.println("who is the prime minister of india?");
        try{
            for(i=0;i<3;i++){
            ans=sc.nextLine();
            if(ans=="tushar"){
                System.out.println("excellent");

            }
            else{
                userexception u=new userexception();
                System.out.println("try again");
                throw u;
            }

        }
    }catch(userexception u){
        System.out.println("Exception is"+u);


    }

}
}

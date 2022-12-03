import java.util.*;
import java.io.*;
class Mainn{
public static void main(String h[]){
Scanner sc=new Scanner(System.in);
char ch;
System.out.println("Enter a sentence: ");
String sen=sc.nextLine();
StringBuffer s=new StringBuffer(sen);
int op=0,low=0,digit=0,blank=0,special=0,i;
for(i=0;i<s.length();i++){
ch=s.charAt(i);
if(ch>='A' && ch<='Z'){
op++;
}
else if(ch>='0' && ch<='9'){
digit++;
}
else if(ch>='a' && ch<='z'){
low++;
}
else if(ch==' '){
blank++;
}
else{
special++;
}
}
System.out.println("The sentence has "+op+" capital letters");
System.out.println("The sentence has "+digit+" digits");
System.out.println("The sentence has "+low+" lower letters");
System.out.println("The sentence has "+blank+" blanks");
System.out.println("The sentence has "+special+" special character");

}
}
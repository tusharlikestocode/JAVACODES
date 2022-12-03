import java.util.*;

class Max{
	int a;
	int b;
	int c;
	void getdata(){
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
}
	int maxim(){
	int res;
	res=a>b?(a>c?(a):c):(b>c?(b):(c));
	return res;
}
}
public class Compare{
	public static void main(String h[]){
	Max m=new Max();
	m.getdata();
	int re=m.maxim();
	System.out.println("the max number is "+ re);



}


}
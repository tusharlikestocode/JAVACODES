import java.util.Scanner;

 class Maximum{
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
	res=a>b?(a>c?(a):c):(b>c?(b):c);
	return res;
}
}
 class One{
	public static void main(String h[]){
	Maximum m=new Maximum();
    m.getdata();
    int d=m.maxim();
	System.out.println("the max numbers is "+ d);

    }

}
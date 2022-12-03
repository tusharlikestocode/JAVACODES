import java.util.*;
class staff{
int code;
String name;
String add;
void setdata(){
Scanner sc= new Scanner(System.in);
System.out.println("enter the code of employee: ");
code=sc.nextInt();
System.out.println("enter the name of employee: ");
name=sc.next();
System.out.println("enter the address of employee: ");
add=sc.next();
}
void getdata(){
System.out.println("Employee Code: "+code);
System.out.println("Employee Name: "+name);
System.out.println("Employee Address: "+add);
}
}
class teacher extends staff{
String cla;
String sub;
void setdata(){
Scanner sc= new Scanner(System.in);
super.setdata();
System.out.println("enter the subject of teacher: ");
sub=sc.next();
System.out.println("enter the class of teacher: ");
cla=sc.next();
}
void getdata(){
super.getdata();
System.out.println("Teacher's Division: "+cla);
System.out.println("Teacher's Subject: "+sub);
}
}
class officer extends staff{
char grade;
void setdata(){
Scanner sc= new Scanner(System.in);
super.setdata();

System.out.println("enter the grade of officer: ");
grade=sc.next().charAt(0);
}
void getdata(){
super.getdata();
System.out.println("Officer's Grade: "+grade);
}
}
class type extends staff{
int sped;
void setdata(){
Scanner sc= new Scanner(System.in);
super.setdata();
System.out.println("enter the speed of typist: ");
sped=sc.nextInt();
}
void getdata(){
Scanner sc= new Scanner(System.in);
super.getdata();
System.out.println("Speed of Typist: "+sped);
}
}
class adhoc extends type{
int sal;
void setdata(){
Scanner sc= new Scanner(System.in);
super.setdata();
System.out.println("enter the salary of ADHOC: ");
sal=sc.nextInt();
}
void getdata(){
Scanner sc= new Scanner(System.in);
super.getdata();
System.out.println("Salary of typist: "+sal);
}
}
class regular extends type{
int sal;
void setdata(){
Scanner sc= new Scanner(System.in);
super.setdata();

System.out.println("enter the salary of REGULAR: ");
sal=sc.nextInt();
}
void getdata(){
Scanner sc= new Scanner(System.in);
super.getdata();
System.out.println("Salary of typist: "+sal);
}
}
class Information{
public static void main(String h[]){
Scanner sc= new Scanner(System.in);
teacher t=new teacher();
regular r=new regular();
adhoc a=new adhoc();
type ty=new type();
officer o=new officer();
int no,ch;
System.out.println("Enter number of employee's: ");
no=sc.nextInt();
do{
System.out.println("Enter TYPE OFEMPLOYEE:\n1.Teacher\n2.Officer\n3.Typist\n4.Regular Typist\n5.ADHOC Typist\n");
ch=sc.nextInt();
switch(ch){
case 1:t.setdata();
t.getdata();
break;
case 2:o.setdata();
o.getdata();
break;
case 3:ty.setdata();
ty.getdata();
break;
case 4:r.setdata();
r.getdata();
break;
case 5:a.setdata();
a.getdata();
break;
case 6:System.exit(0);
break;

}
no--;
}while(no!=0);
}

}

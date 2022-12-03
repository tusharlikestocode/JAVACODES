import java.util.*;
class A extends Thread{
public void run(){
int i;
for(i=1;i<=10;i++){
System.out.println("2 x "+i+" ="+(i*2));
}
try{
Thread.sleep(600);
}catch(Exception e){
}

}

}
class B implements Runnable{
public void run(){
int i;
for(i=1;i<=15;i++){
if(i%2!=0){
System.out.println(i);
}
}
try{
Thread.sleep(1000);
}catch(Exception e){
}
}
}
class Threading{
public static void main(String h[]){
A a=new A();
a.start();
B b=new B();
Thread th=new Thread(b);

th.start();
}
}

package Rylynn;
import java.io.*; //import java.util.Scanner;
public class HaBbang {
public static void main(String[] args) throws IOException{
String a;
int b, sec, fare;
BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)); //Scanner obj = new Scanner(System.in);

System.out.print("통화종류(0:유선, 1:핸드폰)를 선택하세요 : ");
a = obj.readLine();
b = Integer.parseInt(a); // b=obj.nextInt();
System.out.print("통화시간(초)을 입력하세요 : ");
sec = Integer.parseInt(obj.readLine()); // sec =obj.nextInt();
if(b == 0) fare = 3400+(sec/180)*39;
else fare = 9000+(int)(sec/10)*18;
System.out.println("전화요금은 " + fare + "원 입니다");
}
}
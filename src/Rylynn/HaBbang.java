package Rylynn;
import java.io.*; //import java.util.Scanner;
public class HaBbang {
public static void main(String[] args) throws IOException{
String a;
int b, sec, fare;
BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)); //Scanner obj = new Scanner(System.in);

System.out.print("��ȭ����(0:����, 1:�ڵ���)�� �����ϼ��� : ");
a = obj.readLine();
b = Integer.parseInt(a); // b=obj.nextInt();
System.out.print("��ȭ�ð�(��)�� �Է��ϼ��� : ");
sec = Integer.parseInt(obj.readLine()); // sec =obj.nextInt();
if(b == 0) fare = 3400+(sec/180)*39;
else fare = 9000+(int)(sec/10)*18;
System.out.println("��ȭ����� " + fare + "�� �Դϴ�");
}
}
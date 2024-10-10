package buoi3;
import java.util.Scanner;
public class Demo3 {
    public static int myNum = 15;// Biến toàn cục
    public static void myValue()
    {
       // int num = 16;// Biến cục bộ
        System.out.println("Giá trị ban đầu là " + myNum);
    }
    public static void myValue1()
    {
       // int num = 16;
        System.out.println("Giá trị ban đầu là " + (myNum +1 ));
    }
    public static void main(String[] args) {
        Demo3.myValue();
        Demo3.myValue1();
        System.out.println("Giá trị ban đầu là " +(Demo3.myNum + 3));

    }
}

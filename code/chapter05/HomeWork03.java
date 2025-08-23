import java.util.Scanner;

public class HomeWork03{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = scanner.next();
        if (num > 0) {
            System.out.println("您输入的整数是正数");
        } else if (num = 0) {
            System.out.println("您输入的整数是0");
        } else {
            System.out.println("您输入的整数是负数");
        }
    }
}
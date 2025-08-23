import java.util.Scanner;

public class HomeWork01{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int year = scanner.next();
        if (year >= 4 && year <= 10) {
            System.out.println("请输入年龄");
            int age = scanner.nextInt();
            if (age >= 18 && age <= 60) {
                System.out.println("票价为60");
            } else if (age < 18) {
                System.out.println("票价为30")
            } else if (age > 60) {
                System.out.println("票价为20");
            }
        } else if (year < 4 && year > 10 && year >= 1 && year <= 12) {
            System.out.println("请输入年龄");
            int age = scanner.nextInt();
            if (age >= 18 && age <= 60) {
                System.out.println("票价为0");
            } else {
                System.out.println("票价为20");
            }
        }
    }
}
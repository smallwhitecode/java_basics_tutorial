import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        //演示接受用户的输入
        //步骤
        //Scanner类 表示 简单文本扫描器，在java.util包
        //1.引入/导入 Scanner类所在的包
        //2.创建Scanner 对象，new 创建一个

        Scanner scanner = new Scanner(System.in);
        //3.接收用户的输入
        System.out.println("请输入名字");
        String name = scanner.next(); //接收用户输入
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        System.out.println("请输入薪水");
        double sal = scanner.nextDouble();
        System.out.println("人的信息如下：");
        System.out.println("名字=" + name + "年龄=" + age + "薪水=" + sal);
    }
}
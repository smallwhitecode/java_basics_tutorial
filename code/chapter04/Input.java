import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        //��ʾ�����û�������
        //����
        //Scanner�� ��ʾ ���ı�ɨ��������java.util��
        //1.����/���� Scanner�����ڵİ�
        //2.����Scanner ����new ����һ��

        Scanner scanner = new Scanner(System.in);
        //3.�����û�������
        System.out.println("����������");
        String name = scanner.next(); //�����û�����
        System.out.println("����������");
        int age = scanner.nextInt();
        System.out.println("������нˮ");
        double sal = scanner.nextDouble();
        System.out.println("�˵���Ϣ���£�");
        System.out.println("����=" + name + "����=" + age + "нˮ=" + sal);
    }
}


public class HomeWork02{

    public static void main(String[] args) {

        // ĳ����100000Ԫ��ÿ����һ��·�ڣ���Ҫ���ѣ��������£�
        //  1�����ֽ�>50000ʱ��ÿ�ν�5%
        //  2�����ֽ�<=50000ʱ��ÿ�ν�1000
        //  ��̼�����˿��Ծ������ٴ�·�ڣ�Ҫ��ʹ��while breakʹ��


        double money = 100000;
        int count = 0;
        while (true) {
            if (money > 50000) {
                money -= money * 0.05;
                count++;
            } else if (money >= 1000) {
                money -= 1000;
                count++;
            } else {
                break;  // ����ѭ������������
            }
        }
        System.out.println(count);
    }
}
/**
 * 1.���绹��59�췽�ż٣��ʣ���xx��������xx��
 * 2.����һ���������滪���¶ȣ������¶�ת�������¶ȵĹ�ʽΪ��5/9*�������¶�-100��������������¶ȶ�Ӧ��
 * �����¶ȡ�[234.5]
 */
public class ArithmeticOperatorExercise02{
    public static void main(String[] args){

        // 1.����
        //���绹��59��ż٣��ʣ���XX��������X��
        // 2.˼·����
        // (1)ʹ��int ���� days ���� ����
        // (2)һ��������7�� ������weeks ��days / 7 ��XX�� days % 7
        // (3) ���

        int days = 59;
        int weeks = days / 7;
        int leftDays = days % 7;
        System.out.println(days + "�� ��" + weeks + "������" + leftDays + "��");

        // 1.����
        // ����һ���������滪���¶ȣ������¶�ת��Ϊ�����¶ȵĹ�ʽΪ
        // ��5/9*�������¶�-100��������������¶ȶ�Ӧ�������¶�
        //
        // 2.˼·����
        // (1) �ȶ���һ��double huashi �������� �����¶�
        // (2) ���ݸ����Ĺ�ʽ�����м��㼴��

        double huaShi = 234.6;
        double sheShi = 5.0 / 9 * (huaShi - 100);
        System.out.println("�����¶�" + huaShi + "�����¶�" + sheShi);
    }
}
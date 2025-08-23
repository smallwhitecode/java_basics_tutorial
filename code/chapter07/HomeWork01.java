
public class HomeWork01 {

    //编写一个main方法
    public static void main(String[] args) {
        A01 a01 = new A01();

    }

    /*
    编写类A01，定义方法max，实现求某个double数组的最大值，并返回
     */
}

class A01 {
    public double max(double[] arr) {
        if (arr.length > 0) {
            double max = arr[0];//假定第一个元素就是最大值
            for (int i = 0; i < arr.length; i++) {
                if (max > arr[i]) {
                    max = arr[i];
                }
            }
        }
        return max;
    }
}
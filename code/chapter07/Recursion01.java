
public class Recursion01 {

    //编写一个main方法
    public static void main(String[] args) {

        T t1 = new T();
        t1.test(4);
    }
}

class T {
    //分析
    public void test(int n){
        if (n > 2) {
            test(n - 1);
        }
        System.out.println("n=" + n);
    }
}
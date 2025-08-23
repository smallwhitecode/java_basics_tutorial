

public class Stars {

    // 编写一个main方法
    public static void main(String[] args){

        /*
               *
             *    *
           *        *
          ************

        思路分析
        化繁为简
        1、先打印一个矩形
        *****
        *****
        *****
        *****
        2、打印半个金字塔

        *       //第一层 有1个*
        **      //第二层 有2个*
        ***     //第三层 有3个*
        ****    //第四层 有4个*
        *****   //第五层 有5个*

        3、打印整个金字塔
        *       //第一层 有1个*  1 * 2 -1
       ***      //第二层 有3个*  2 * 2 -1
      *****     //第三层 有5个*  3 * 2 -1
     *******    //第四层 有7个*  4 * 2 -1
    *********   //第五层 有9个*  5 * 2 -1



        5、层数做成变量 int totalLevel = 5
        */
        int totalLevel = 5;
        for (int i = 1; i < = totalLevel; i++) {//i 表示层数

            //在输出*之前，还有输出 对应空格
            for (int k = 1; k <= totalLevel - i; k++) {
                System.out.print(" ");
            }
            //控制打印每层的*个数
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == totalLevel) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //每打印完一层的*后，就换行 prtinln本身会换行
            System.out.println("");
        }

    }
}
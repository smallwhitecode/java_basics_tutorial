public class TypeConver{
    public static void main(String[] args) {

        //short s = 12; // ok
        //s=s-9; //´íÎó  int -> short

//        byte b = 10; //ok
//        b = b + 11;  //´íÎó int-> byte
//        b = (byte) (b + 11);

        char c = 'a'; //ok
        int i = 16; //ok
        float d = .314f; //ok
        double result = c + i + d; //ok  float ->double

        byte b = 16; //ok
        short s = 14; //ok
        short t = s + b; //´íÎó int->short
    }
}
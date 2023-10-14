import java.util.Scanner;

/**
 * @version 1.0
 * @author： xu
 * @date： 2023-10-07 18:15
 */

public class work01 {
    public static void main(String[] args) {

//        int b1 = 0x88;//0x88为int类型
//        int b2=167;//同理
//        short s = 0200;
//        int i = 111111;
//        long l = 0x11111111;
//        char c1 ='A';
//        char  c2='B';//char只能定义一个字符
//        float f1 =.33f;
//        float f2=3.14f;//float在数字之后要加f
//        double d =.00001001;
//        boolean bl= true;
//        System.out.println("byte b ="+b1);//b未定义
//        System.out.println("short s ="+s);
//        System.out.println("int i ="+i);
//        System.out.println("long 1 ="+l);
//        System.out.println("char c ="+c1);//c未定义
//        System.out.println("float f ="+f1);//f未定义
//        System.out.println("double d ="+d);
//        System.out.println("boolean bl ="+bl);
//        int a =5, b=3,c;
//        double d=2.5;
//        c=a/b+a%b;
//        System.out.println("c="+c);
//        d=c*b+a/b*d;
//        System.out.println("d="+d);
        int j = 0;

        Scanner scanner = new Scanner(System.in);
        String st = scanner.next().toString();
        String arr[] = st.split(",");
        String sr = scanner.next().toString();
        String arrli[] = sr.split(",");
        int a[] = new int[arr.length];
        int b[] = new int[arrli.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < arrli.length; i++) {
            b[i] = Integer.parseInt(arrli[i]);
        }
        int c[] = new int[arr.length+arrli.length];
        for (int i = 0; i < arr.length; i++) {
            c[i] = a[i];

        }
        for (int i = arrli.length; i < arrli.length+ arr.length; i++) {

            c[i] = b[j];
            j++;

        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);

        }



    }
}

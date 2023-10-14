/**
 * @version 1.0
 * @author： xu
 * @date： 2023-09-19 15:39
 */

public class OneArrayList {
    public static void main(String[] args) {
        //数组的声明初始化 new double[3]静态初始化 创建时就设定好数组的长度  也可不设长度 长度由数组内的元素个数决定
        double[] prices = new double[3];

       int[] arr1 = {1,2,3,};//数组推断，可省略一部分；
        //遍历数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }


        //java数组内存机制
        int[] arr2 = new int[4];
        arr2[0]=10;
        arr2[1]=20;
        //定义了一个数组变量arr3 并把arr2的地址赋值给了arr3 并未在堆区创建一个新的变量 本质上arr3与arr2相同 若改变arr2中的值 arr3也会跟着改变
        int[] arr3  = arr2;
        //二维数组声明的两种方式1
        int[][] list = new int[4][];//此种声明方法外层元素默认存储null值 若还想指向内层元素则会导致空指针异常
        // ，原因是该数组在声明时只声明了外层元素的长度，内存元素并未开辟，此时默认为一维数组模式，故list[0]的值为null
        System.out.println(list[0]);
        //第二种方式
        int[][] list1 = new int[3][2];//此时外层元素默认存贮的为地址值，内层元素为0；
        System.out.println(list1[2]);
        System.out.println(list1[2][0]);







    }
}

/**
 * @version 1.0
 * @author： xu
 * @date： 2023-09-20 14:02
 */


class cat{

}
public class ArryResever {
    public static void main(String[] args) {

        int[] arr = new int[]{34,53,3,2,65,6,34,5,76,34,67};
        for (int i = 0; i < arr.length/2; i++) {
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        Student student = new Student();

    }
}

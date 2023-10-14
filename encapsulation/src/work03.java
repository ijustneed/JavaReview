import javax.swing.*;
import java.util.ArrayList;

public class work03 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 1; i <101 ; i++) {
            int j = 0;
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
            arrayList.add(i);
            }
        }
        for (int i = 5; i < 101; i++) {
            int a =0;
            int b = 0;

            boolean isPrime = true;
            if (i%2==0) {
                OUT:
                for (int j = 0; j <arrayList.size(); j++) {
                    a= (int) arrayList.get(j);
                    for (int k = 0; k < arrayList.size(); k++) {
                        b= (int) arrayList.get(k);
                        if (i==(a+b)) {
                           list.add(i);
                            break OUT;
                        }

                    }
                }

            }

        }
        System.out.println(list);
    }


}

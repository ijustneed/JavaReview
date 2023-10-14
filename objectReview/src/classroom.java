import java.lang.reflect.Field;

/**
 * @version 1.0
 * @author： xu
 * @date： 2023-09-20 19:42
 */

public class classroom {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

//java不允许直接操作内存
        int i = 10;
        Field field = Integer.class.getDeclaredField("value");
        int value = field.getInt(i);
        int address = System.identityHashCode(value);



    }
}

package generics_class;

public class MyArrayList<E> {//定义一个泛型类
    private Object[] arr = new Object[10];//定义一个Object类型的数组arr入参记录内容
    private int size;//记录当前位置，int类型的默认值为0
    
    public boolean add(E e){//输出类型为布尔，即：入参成功输出true；类型为E的e参数输入
        arr[size++] = e;//e的值赋给arr[]当前位置后，size的数字自加1（执行顺序为：先赋值，后自加1）
            return true;
    }
    public E get(int index){//根据索引index值取出arr数组对应位置上的值
        return (E) arr[index];
    }
}

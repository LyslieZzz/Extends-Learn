package generics_class;

public class Test {
    public static void main(String[] args) {
MyArrayList<String> ele = new MyArrayList<>();
        ele.add("zwy");
        ele.add("Electronic Commerce");
        ele.add("Computer Science");
        ele.add("Data Science");
        String a = ele.get(2);//根据索引提取ele中的值
        System.out.println(a);
    }
}

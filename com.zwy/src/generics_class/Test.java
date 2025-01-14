package generics_class;

public class Test {
    public static void main(String[] args) {
MyArrayList<String> ele = new MyArrayList<>();
        ele.add("zwy");
        ele.add("Computer Science");
        ele.add("Electronic Commerce");
        ele.add("Data Science");
        String a = ele.get(1);//根据索引提取ele中的值
        System.out.println(a);
    }
}

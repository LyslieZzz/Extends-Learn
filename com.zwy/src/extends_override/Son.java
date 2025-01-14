package extends_override;

public class Son extends Father {
    String name = "儿的成员变量";
    public void nameDistinction(){
        String name = "儿的nameDistinction方法的局部变量";
        System.out.println(name);//打印局部变量
        System.out.println(this.name);//打印成员变量
        System.out.println(super.name);//打印父级的成员变量
    }

    @Override
    public void printAge(){
    System.out.println("我是你儿");
}
}

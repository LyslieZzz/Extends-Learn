package extends_constructor;

//创建测试类
public class Test { //一个.java文件里只能有一个public的类，并且类名必须跟文件名相同
    public static void main(String[] args) {
        S s = new S();
        S s1 = new S(1);
    }
}
//创建父类
    class F{
        public F() {//构造函数：每生成一个该类的对象，就去执行一次本方法
            System.out.println("===父类的无参构造器执行了===");
        }

        public F(int a) {
            System.out.println("===父类的有参构造器执行了===");
        }
    }
//创建子类
    class S extends F{
        public S(){
            System.out.println("===子类的无参构造器执行了===");
        }
        public S(int a) {
            System.out.println("===子类的有参构造器执行了===");
        }
    }




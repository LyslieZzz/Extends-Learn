package exception;

public class AgeIllegalTest1 {
    public static void main(String[] args) {
        //需求：保存一个合法对象
        //使用try catch方法捕获异常，防止非关键错误影响整个业务链路的执行
        try {
            saveAge(23);
            System.out.println("底层执行成功！");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层出现了bug！");
        }
    }

    public static void saveAge(int age){
        if (age > 0 && age < 150){
            System.out.println("年龄被保存成功：" + age);
        }else{
            //调用一个异常对象封装出现的问题，并把异常结果告诉给执行层（throw）
           throw new AgeIllegalRuntimeException("/age is illegal, your age is：" + age);
        }
    }
}

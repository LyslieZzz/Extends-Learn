package exception;

public class AgeIllegalTest2 {
    public static void main(String[] args) {
        //需求：保存一个合法对象
        //使用try catch方法捕获异常，防止非关键错误影响整个业务链路的执行
        try {
            saveAge2(235);
            System.out.println("底层执行成功！");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层出现了bug！");
        }
    }

    //编译时异常一写出就会报错，所以要在方法入口处加上throws，抛出方法内部问题
    public static void saveAge2(int age) throws AgeIllegalException{
        if (age > 0 && age < 150){
            System.out.println("年龄被保存成功：" + age);
        }else{
            //用一个异常对象封装出现的问题
            //throw 抛出这个异常对象
            //throws 用在方法上，抛出方法内部的异常
           throw new AgeIllegalException("/age is illegal, your age is：" + age);
        }
    }
}



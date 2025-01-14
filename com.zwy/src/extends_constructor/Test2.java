package extends_constructor;

public class Test2 {
    public static void main(String[] args) {
        Teacher t = new Teacher("zwy",25,"Java");
        System.out.println(t.getAge());
        System.out.println(t.getName());
        System.out.println(t.getSkill());
    }
}
class People{
    String name;
    int age;

    public People() {
    }
    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Teacher extends People{
    String skill;
    public Teacher(String name, int age,String skill){
        super(age, name);
        this.skill = skill;
    }
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
}


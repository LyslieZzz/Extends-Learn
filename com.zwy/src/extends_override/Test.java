package extends_override;

public class Test {
    public static void main(String[] args) {
        Father a = new Father();
        Son b = new Son();
        a.printAge();
        b.printAge();
        b.nameDistinction();
    }
}

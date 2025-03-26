public class Anonym {
    public static void main(String[] args) {
        Math add = ((a, b) -> System.out.println(a+b));
        Math minus = (((a, b) -> System.out.println(a-b)));
    }
}

interface Math{
    void operate(int a,int b);
}
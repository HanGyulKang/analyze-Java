package theJavaCodeManipulation.example;

public class NativeMethod {
    public static void main(String[] args) {
        java.lang.Thread.currentThread();
        // public static native Thread currentThread();
        // C로 구현되어있음.
        // method명 앞에 native라는 키워드가 붙어있음.
    }
}

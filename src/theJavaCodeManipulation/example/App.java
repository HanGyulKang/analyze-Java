package theJavaCodeManipulation.example;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.getClass(); // 클래스 로딩 이후 해당 클래스에 접근이 가능해짐
        Class<App> appClass = App.class; // 클래스 객체


        // ClassLoader 확인
        ClassLoader classLoader = App.class.getClassLoader();
        System.out.println(classLoader); // application class loader
        System.out.println(classLoader.getParent()); // platform class loader
        System.out.println(classLoader.getParent().getParent()); // null : 부모가 있긴 하나 native code로 구현이 되어있어서 java
    }
}

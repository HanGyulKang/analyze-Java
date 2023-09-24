package javaBasics.ch06.ex;

public class Main {

    public static class Tv {
        public Tv() {

        }
    }

    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];
        tvArr[0] = new Tv();
        tvArr[1] = new Tv();
        tvArr[2] = new Tv();

        System.out.println(tvArr.hashCode());
        System.out.println(tvArr[0].hashCode());
        System.out.println(tvArr[1].hashCode());
        System.out.println(tvArr[2].hashCode());
    }
}

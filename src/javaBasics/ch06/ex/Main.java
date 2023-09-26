package javaBasics.ch06.ex;

import java.util.Arrays;

public class Main {

    private static void printArrayContents(int[] numArr) {
        Arrays.stream(numArr)
                .forEach(num -> System.out.printf("%d", num));
    }

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

        int[] numArr = new int[10];

        for (int i = 0; i < 10; i++) {
            numArr[i] = (int) (Math.random() * 10);
        }

        // 동일한 코드를 메서드로 묶어서 코드를 간결하게 만듦 : 캡슐화의 시작...
        printArrayContents(numArr);
        printArrayContents(numArr);
    }
}

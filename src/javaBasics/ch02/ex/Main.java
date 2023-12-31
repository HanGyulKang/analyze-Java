package javaBasics.ch02.ex;

class Data {
    int x;
}

class Main {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        // 참조변수 d의 x값을 바꾼 것이 아니라 change method 안의 지역변수 x의 값만 바꿨기 때문에
        // 아래 결과값은 당연히 10이다.
        System.out.println("main() : x = " + d.x);

        changeObject(d);
        System.out.println("main() : x = " + d.x);

        Data copiedData = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("copiedData.x = " + copiedData.x);
    }

    static void change(int x) { // 기본형 매개변수
        x = 1000;
        System.out.println("change() : x = " + x);
    }

    static void changeObject(Data d) {
        d.x = 1000;
    }

    static Data copy(Data d) {
        Data copiedData = new Data();
        copiedData.x = d.x;

        return copiedData;
    }
}

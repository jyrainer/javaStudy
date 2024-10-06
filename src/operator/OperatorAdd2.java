package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        //전위 증감 연산자 예시
        b = ++a; // 일단 a 를 1증가시킨뒤 b에 넣음
        System.out.println("a = " + a + ", b = " + b);  // a = 2, b = 2

        //후위 증감 연산자
        a = 1;
        b = 0;

        b = a++; // ++는 제일 마지막에 일어남. b에 바로 1 넣음
        System.out.println("a = " + a + ", b = " + b);  // a = 2, b = 1
    }
}

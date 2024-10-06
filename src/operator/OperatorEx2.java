package operator;

/*
double 변수로 합과 평균 구현
 */
public class OperatorEx2 {
    public static void main(String[] args) {
        double num1 = 1.5;
        double num2 = 2.5;
        double num3 = 3.5;
        double sum = 0.0, average = 0.0;

        sum = num1 + num2 + num3;
        average = sum / 3;

        System.out.println("sum : " + sum + " average : " + average);
    }
}

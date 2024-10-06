package operator;

/*
1. num1, num2, num3 라는 이름의 세 개의 int 변수를 선언하고, 각각 10, 20, 30으로 초기화 하세요
2. 세 변수의 합을 계산하고, 그 결과를 sum이라는 이름의 int에 저장하세요.
3. 세 변수의 평균을 계산하고, 그 결과를 average라는 이름의 int 변수에 저장하세요. 평균 계산시 소수점 이하는 버림
4. sum, average 출력
 */
public class OperatorEx1 {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int sum = 0, average = 0;

        sum = num1 + num2 + num3;
        average = sum / 3;

        System.out.println("sum : " + sum + " average : " + average);
    }
}

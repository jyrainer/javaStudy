package operator;
/*
int형 score 선언
score가 80이상 100이하 ture 아니면 false
 */
public class OperatorEx3 {
    public static void main(String[] args) {
        int score = 100;
        boolean result = score >= 80 && score <= 100;

        System.out.println(result);
    }
}

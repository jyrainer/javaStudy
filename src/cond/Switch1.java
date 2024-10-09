package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 3;

        int coupon = 5;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            default:
                coupon = 500;
                break;
        }
        System.out.println(coupon);
    }
}

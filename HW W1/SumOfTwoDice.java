public class SumOfTwoDice {
    public static void main(String[] args) {
        int n = 6;
        int a = 1 + (int) (Math.random() * n);
        int b = 1 + (int) (Math.random() * n);
        int sum = a + b;
        System.out.println("sum = " + sum);
    }
}

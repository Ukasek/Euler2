public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.euler2(4000000);
        System.out.println(result);
    }

    public int euler2(int limit) {
        int sum = 0;
        int a = 1;
        int b = 1;
        int c = a + b;
        while (c < limit) {
            if (c % 2 == 0) {
                sum = sum + c;
            }
            a = b;
            b = c;
            c = a + b;
        }
        return sum;
    }
}

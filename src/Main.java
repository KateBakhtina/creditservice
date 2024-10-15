public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int result1 = service.calculate(1_000_000, 1, 9.99);
        System.out.println("Ежемесячный платеж составит: " + result1 + " руб");
        int result2 = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Ежемесячный платеж составит: " + result2 + " руб");
        int result3 = service.calculate(1_000_000, 3, 9.99);
        System.out.println("Ежемесячный платеж составит: " + result3 + " руб");


    }
}

import static java.lang.System.out;

public class CreditPaymentService {
    public int calculate(int sumCredit, int quantityYears, double rate) {
        double sumCreditD = (double) sumCredit;
        double M = rate / 1200;
        double S = quantityYears * 12;

        double K = (M * Math.pow((1 + M), S)) / (Math.pow((1 + M), S) - 1);

        double resultD = sumCreditD * K;

        int result = (int) resultD;
        return result;
    }
}

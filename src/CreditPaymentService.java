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

/*
Формула расчета аннуитетного платежа.
Х = С * К
где X — аннуитетный платеж,
С — сумма кредита,
К — коэффициент аннуитета.
Коэффициент аннуитета считается так:
К = (М * (1 + М) ^ S) / ( (1 + М) ^ S — 1)
где М — месячная процентная ставка по кредиту,
S — срок кредита в месяцах.


M = 9.99 / 1200
print(M)
S = 36
K = (M * (1 + M)**S) / ((1 + M)**S - 1)

C = 1000000
X = C * K
print(X)
 */
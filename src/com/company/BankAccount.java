package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount += sum;
        System.out.println("ваш текущий баланс = " + amount);
    }
    public void withDraw(int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("недостачно средств", amount);
        } else {
            amount -= sum;
            System.out.println("Ваш текущий баланс = " + amount + " Вы сняли " + sum);

        }
    }
}

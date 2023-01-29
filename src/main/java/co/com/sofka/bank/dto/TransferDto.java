package co.com.sofka.bank.dto;

import java.time.LocalDateTime;

public class TransferDto {
    private String date;
    private int amount;
    private String type;
    private int balance;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "TransferDto{" +
                "date=" + date +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }

    public TransferDto(String date, int amount, String type) {
        this.date = date;
        this.amount = amount;
        this.type = type;
    }
}

package co.com.sofka.bank.model;

import java.time.LocalDateTime;

public class Transfer {
    private String date;
    private int amount;
    private String type;

    public Transfer(String date, int amount, String type) {
        this.date = date;
        this.amount = amount;
        this.type = type;
    }

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
}

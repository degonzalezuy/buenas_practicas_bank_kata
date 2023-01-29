package co.com.sofka.bank.model;

import co.com.sofka.bank.values.AmountVO;
import co.com.sofka.bank.values.DateVO;



public class Transfer {
    private DateVO date;
    private AmountVO amount;
    private String type;

    public Transfer(DateVO date, AmountVO amount, String type) {
        this.date = date;
        this.amount = amount;
        this.type = type;
    }

    public DateVO getDate() {
        return date;
    }

    public void setDate(DateVO date) {
        this.date = date;
    }

    public AmountVO getAmount() {
        return amount;
    }

    public void setAmount(AmountVO amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

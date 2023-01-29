package co.com.sofka.bank.model;

import co.com.sofka.bank.dto.TransferDto;

import java.util.ArrayList;
import java.util.Collections;

public class Account {
    private Integer amount;
    private ArrayList<Transfer> transfers = new ArrayList<>();

    public Account() {
    }

    public Account(ArrayList<Transfer> transfers) {
        this.transfers = transfers;
    }

    public void add(Transfer transfer){
        transfers.add(transfer);
    }

    public void printState(){
        String cadena = "";
        amount=0;

        System.out.println("DATE    |   CREDIT  |   DEBIT   |   BALANCE");
        for (Transfer transfer: transfers) {
            cadena = "";

            cadena = transfer.getDate() + "  ";
            if(transfer.getType()=="C") {
                amount = amount + transfer.getAmount().value();
                cadena = cadena + transfer.getAmount() + "                   " + amount;
            }
            if(transfer.getType()=="D") {
                amount = amount - transfer.getAmount().value();
                cadena = cadena + "             " + transfer.getAmount() + "       " + amount;
            }
            System.out.println(cadena);
        }

    }


}

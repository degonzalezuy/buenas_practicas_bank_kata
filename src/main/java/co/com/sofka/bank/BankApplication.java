package co.com.sofka.bank;

import co.com.sofka.bank.model.Account;
import co.com.sofka.bank.model.Transfer;
import co.com.sofka.bank.values.AmountVO;
import co.com.sofka.bank.values.DateVO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
		Account account = new Account();

		account.add(new Transfer(new DateVO(10,01,2021), new AmountVO(1000), "C"));
		account.add(new Transfer(new DateVO(13,01,2021), new AmountVO(2000), "C"));
		account.add(new Transfer(new DateVO(14,01,2021),new AmountVO(500), "D"));

		account.printState();
	}

}

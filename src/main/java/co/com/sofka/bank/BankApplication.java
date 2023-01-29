package co.com.sofka.bank;

import co.com.sofka.bank.model.Account;
import co.com.sofka.bank.model.Transfer;
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

		account.add(new Transfer("10/01/2021", 1000, "C"));
		account.add(new Transfer("13/01/2021", 2000, "C"));
		account.add(new Transfer("14/01/2021",500, "D"));

		account.printState();
	}

	public static LocalDateTime simpleDateFormat(String date){

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDateTime dateTime = LocalDateTime.parse(date, formatter);

		return dateTime;
 	}
}

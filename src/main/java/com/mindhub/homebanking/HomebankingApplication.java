package com.mindhub.homebanking;

import com.mindhub.homebanking.models.Account;
import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.repositories.AccountRepository;
import com.mindhub.homebanking.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

import static java.time.LocalTime.now;

@SpringBootApplication
public class HomebankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(ClientRepository clientRepository, AccountRepository accountRepository){
		return args -> {
			Client client = new Client("Melba", "Morel","melba@mindhub.com");
			System.out.println(client);

			clientRepository.save(client);


			Account account1 = new Account();

			client.addAccount(account1);

			accountRepository.save(account1);

			Account account2 = new Account();

			client.addAccount(account2);

			accountRepository.save(account2);

			System.out.println(client);
		};
	}
}

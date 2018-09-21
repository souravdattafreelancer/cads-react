package com.cads.usermanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
	private final UserRepository respository;
	
	@Autowired
	public DatabaseLoader(UserRepository repo) {
		this.respository = repo;
	}
	
	@Override
	public void run(String ...strings) {
		this.respository.save(new User("Champak", "Das", "9977822312", "champak.das@cads.com"));
		this.respository.save(new User("Debasmita", "Sarkar", "9977822312", "debasmita.das@cads.com"));
		this.respository.save(new User("Antara", "Kundu", "9977822312", "antara.kundu@cads.com"));
		this.respository.save(new User("Sourav", "Datta", "9977822312", "sourav.datta@cads.com"));
		this.respository.save(new User("Root", "Toor", "9977822312", "root.toor@cads.com"));
	}
}

package com.sid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sid.dao.ContactsRepository;
import com.sid.entities.Contacts;

@SpringBootApplication
public class GestionContactApplication  implements CommandLineRunner{
	@Autowired
 private ContactsRepository contactsRepository;
	public static void main(String[] args) {
		SpringApplication.run(GestionContactApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
contactsRepository.save(new Contacts("younes", "chabraoui", "0665275473", "younes.shabrawy@gmail.com"));
contactsRepository.save(new Contacts("ikhlass", "ikhlass", "0665456543", "ikhlas@gmail.com"));
contactsRepository.findAll().forEach(c ->{
	System.out.println(c.getNom());
});
	}

}

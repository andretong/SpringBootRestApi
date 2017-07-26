package dao;

import model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<Client, Long> {
	
	public Client findById(int id);
	
	public Client findById(long id);
	
	public Client findByUsername(String username);
	
	public Client findByFirstnameAndLastname(String firstname, String lastname);
	
	
}

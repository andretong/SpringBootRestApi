package dao;

import model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
	
	public Product findById(int id);
	
	
	
}

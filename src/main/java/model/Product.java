package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product implements java.io.Serializable{

	private static final long serialVersionUID = -1011370902670695522L;
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;	
	
	
	@Column(name="name")
	private String name;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	public Product(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}




	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}

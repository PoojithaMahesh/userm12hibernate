package userm12;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
	private int id;
	private String name;
	private String address;
//	how to generate getters and setter
//	please dont type it
//	instead do like this 
//	Alt+S generate getter ans setter  generate 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
}

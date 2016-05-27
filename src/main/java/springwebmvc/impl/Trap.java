package springwebmvc.impl;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Trap {

	
	@Id
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Trap() {}

	public Trap(Long id) {
		super();
		this.id = id;
	} 
	
	
	
}

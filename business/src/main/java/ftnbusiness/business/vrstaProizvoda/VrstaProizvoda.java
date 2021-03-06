package ftnbusiness.business.vrstaProizvoda;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VrstaProizvoda {
	@Id
	@GeneratedValue
	private Long id;
	
	private String naziv;

	public VrstaProizvoda(Long id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
	}

	public VrstaProizvoda() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	
}

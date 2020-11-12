package ir.delifery.vendorservice.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class City {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy = "city", fetch = FetchType.LAZY)
	private List<Area> areas;
	
	@OneToMany(mappedBy = "city", fetch = FetchType.LAZY)
	private List<Vendor> vendors;
}

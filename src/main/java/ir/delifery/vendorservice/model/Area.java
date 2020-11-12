package ir.delifery.vendorservice.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Area {
	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank
	@Size(min = 2, max = 255)
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private City city;
}

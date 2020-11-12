package ir.delifery.vendorservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class ContactPerson {
	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank
	private String firstName;
	
	@NotBlank
	private String lastName;
	
	@NotBlank
	private String email;
	
	@NotBlank
	private String cellPhone;
	
	@NotBlank
	private String phone;
}

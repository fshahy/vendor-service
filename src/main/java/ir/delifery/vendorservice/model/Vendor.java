package ir.delifery.vendorservice.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vendor {
	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank
	@Size(min = 2, max = 255)
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private City city;
	
	private Address address;
	private String email;
	
	@NotBlank
	private String phone;
	
	@OneToMany(mappedBy = "vendor", fetch = FetchType.LAZY)
	private Set<Rating> ratings;
	
	@OneToMany(mappedBy = "vendor", fetch = FetchType.LAZY)
	private Set<Comment> comments;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private ContactPerson contact;
}

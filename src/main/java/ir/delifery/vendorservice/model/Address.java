package ir.delifery.vendorservice.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Embeddable
@AllArgsConstructor
public class Address {
	@NotNull
	@Column(nullable = false)
	private String street;
	
	@NotNull
	@Column(nullable = false, length = 10)
	private String postalCode;
}

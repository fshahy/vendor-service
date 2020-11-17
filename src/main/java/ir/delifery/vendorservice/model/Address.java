package ir.delifery.vendorservice.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.sun.istack.NotNull;

import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
	@NotNull
	@Column(nullable = false)
	private String street;
	
	@NotNull
	@Column(nullable = false)
	private String number;
	
	private String unit;
	
	@NotNull
	@Column(nullable = false, length = 10)
	private String postalCode;
}

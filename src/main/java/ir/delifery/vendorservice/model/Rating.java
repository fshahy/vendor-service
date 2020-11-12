package ir.delifery.vendorservice.model;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.istack.NotNull;

import ir.delifery.vendorservice.enums.Rank;

public class Rating {
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Vendor vendor;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Rank rank;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date votedOn;
}

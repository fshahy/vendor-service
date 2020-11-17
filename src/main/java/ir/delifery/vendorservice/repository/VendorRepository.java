package ir.delifery.vendorservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ir.delifery.vendorservice.model.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {

}

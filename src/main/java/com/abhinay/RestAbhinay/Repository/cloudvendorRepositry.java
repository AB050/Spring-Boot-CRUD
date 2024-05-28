package com.abhinay.RestAbhinay.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhinay.RestAbhinay.Model.CloudVendor;

public interface cloudvendorRepositry extends JpaRepository<CloudVendor, String> {
	List<CloudVendor> findByVendorName(String vendorName);
}

package com.abhinay.RestAbhinay.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhinay.RestAbhinay.Model.CloudVendor;
import com.abhinay.RestAbhinay.Service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

	private final CloudVendorService cloudVendorService;

	public CloudVendorController(CloudVendorService cloudVendorService) {
		this.cloudVendorService = cloudVendorService;
	}

	// Read specific cloud Vendor
	@GetMapping("/{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
		return cloudVendorService.getCloudVendor(vendorId);
	}

	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		return cloudVendorService.createCloudVendor(cloudVendor);
	}

	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		return cloudVendorService.updateCloudVendor(cloudVendor);
	}

	@DeleteMapping("/{vendorId}")
	public String deleteVendorDetails(@PathVariable("vendorId") String vendorId) {
		return cloudVendorService.deleteCloudVendor(vendorId);
	}

	// Read All the cloud Vendor Details from DB
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails() {
		return cloudVendorService.getAllCloudVendors();
	}
}

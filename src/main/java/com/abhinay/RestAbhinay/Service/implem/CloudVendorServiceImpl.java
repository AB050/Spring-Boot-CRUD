package com.abhinay.RestAbhinay.Service.implem;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abhinay.RestAbhinay.Exception.CloudVendorNotFoundException;
import com.abhinay.RestAbhinay.Model.CloudVendor;
import com.abhinay.RestAbhinay.Repository.cloudvendorRepositry;
import com.abhinay.RestAbhinay.Service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

	cloudvendorRepositry cloudvendorRepositry;

	public CloudVendorServiceImpl(cloudvendorRepositry cloudvendorRepositry) {
		this.cloudvendorRepositry = cloudvendorRepositry;
	}

	@Override
	public String createCloudVendor(CloudVendor Cloudvendor) {
		// More Business logic
		cloudvendorRepositry.save(Cloudvendor);
		return "Cloud Vendor Created Successfully";
	}

	@Override
	public String updateCloudVendor(CloudVendor Cloudvendor) {
		// More Business logic
		cloudvendorRepositry.save(Cloudvendor);
		return "success";
	}

	@Override
	public String deleteCloudVendor(String cloudvendorId) {
		// More Business logic
		cloudvendorRepositry.deleteById(cloudvendorId);
		return "Success";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudvendorId) {
		// More Business logic
		if(cloudvendorRepositry.findById(cloudvendorId).isEmpty())
			throw new CloudVendorNotFoundException("Requested Cloud Vendor doesn't exists");
		return cloudvendorRepositry.findById(cloudvendorId).get();

	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		return cloudvendorRepositry.findAll();
	}

	@Override
	public List<CloudVendor> getByVendorName(String vendorName) {
		return cloudvendorRepositry.findByVendorName(vendorName);
	}

}

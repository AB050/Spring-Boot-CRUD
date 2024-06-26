package com.abhinay.RestAbhinay.Service;

import java.util.List;

import com.abhinay.RestAbhinay.Model.CloudVendor;

public interface CloudVendorService {

    public String createCloudVendor(CloudVendor cloudVendor);

    public String updateCloudVendor(CloudVendor cloudVendor);

    public String deleteCloudVendor(String cloudVendorId);

    public CloudVendor getCloudVendor(String cloudVendorId);

    public List<CloudVendor> getAllCloudVendors();

    public List<CloudVendor> getByVendorName(String vendorName);
}

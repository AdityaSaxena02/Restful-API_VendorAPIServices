package com.Restful.API.RestfulAPI.controller;

import com.Restful.API.RestfulAPI.model.cloudVendor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPIServices {

    private List<cloudVendor> vendors = new ArrayList<>();

    @GetMapping("{vendor_ID}")
    public cloudVendor getCloudVendorDetails(@PathVariable String vendor_ID) {
        return vendors.stream()
                .filter(vendor -> vendor.getVendor_ID().equals(vendor_ID))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public String postCloudVendorDetails(@RequestBody cloudVendor cloudVendor) {
        vendors.add(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody cloudVendor cloudVendor) {
        Optional<cloudVendor> existingVendor = vendors.stream()
                .filter(v -> v.getVendor_ID().equals(cloudVendor.getVendor_ID()))
                .findFirst();
        if (existingVendor.isPresent()) {
            vendors.remove(existingVendor.get());
            vendors.add(cloudVendor);
            return "Cloud Vendor updated Successfully";
        }
        return "Cloud Vendor not found";
    }

    @DeleteMapping("{vendor_ID}")
    public String deleteCloudVendorDetails(@PathVariable String vendor_ID) {
        vendors.removeIf(vendor -> vendor.getVendor_ID().equals(vendor_ID));
        return "Cloud Vendor deleted Successfully";
    }
}

package com.Restful.API.RestfulAPI.controller;

import com.Restful.API.RestfulAPI.model.cloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPIServices {
    cloudVendor cloudVendor;
    @GetMapping("{vendor_ID}")
    public cloudVendor getCloudVendorDetails(String vendor_ID){
      //  return new cloudVendor("C1","vendor_1","Address1","8285");
        return cloudVendor;

    }
    @PostMapping
    public String postCloudVendorDetails(@RequestBody cloudVendor cloudvendor)
    {
        this.cloudVendor = cloudvendor;
        return "Cloud Vendor Created Successfully";

    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody cloudVendor cloudvendor)
    {
        this.cloudVendor = cloudvendor;
        return "Cloud Vendor updated Successfully";

    }
    @DeleteMapping("{vendor_ID}")
    public String deleteCloudVendorDetails(String Vendor_ID)
    {
        this.cloudVendor = null;
        return "Cloud Vendor deleted Successfully";

    }



}

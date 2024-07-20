package com.Restful.API.RestfulAPI.model;

public class cloudVendor {
    public cloudVendor() {
    }

    public String getVendor_ID() {
        return vendor_ID;
    }

    public void setVendor_ID(String vendor_ID) {
        this.vendor_ID = vendor_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public cloudVendor(String vendor_ID, String name, String address, String phone_no) {
        this.vendor_ID = vendor_ID;
        this.name = name;
        this.address = address;
        this.phone_no = phone_no;
    }

    private String vendor_ID;
    private String name;
    private String address;
    private String phone_no;
}

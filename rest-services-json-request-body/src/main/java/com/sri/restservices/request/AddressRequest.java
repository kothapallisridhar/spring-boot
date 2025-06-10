package com.sri.restservices.request;

import lombok.Data;

@Data
public class AddressRequest {
    private String area;
    private String flatDetails;
    private String city;
    private String pincode;
    private String landmark;
    private String district;
    private String state;
    private String country;
}

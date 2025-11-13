package com.edsonrego.address.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Address {
    String zip;
    String street;
    String district;
    String city;
    String state;
}

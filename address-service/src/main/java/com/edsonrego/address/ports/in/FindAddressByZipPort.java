package com.edsonrego.address.ports.in;

import com.edsonrego.address.domain.Address;

public interface FindAddressByZipPort {
    Address execute(String zip);
}
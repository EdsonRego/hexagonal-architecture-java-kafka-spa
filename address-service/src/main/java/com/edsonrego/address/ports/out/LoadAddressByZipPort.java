package com.edsonrego.address.ports.out;

import com.edsonrego.address.domain.Address;

public interface LoadAddressByZipPort {
    Address loadByZip(String zip);
}

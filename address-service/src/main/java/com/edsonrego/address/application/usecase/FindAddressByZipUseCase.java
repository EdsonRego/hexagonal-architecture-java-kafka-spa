package com.edsonrego.address.application.usecase;

import com.edsonrego.address.domain.Address;
import com.edsonrego.address.ports.in.FindAddressByZipPort;
import com.edsonrego.address.ports.out.LoadAddressByZipPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindAddressByZipUseCase implements FindAddressByZipPort {

    private final LoadAddressByZipPort loadAddressByZipPort;

    @Override
    public Address execute(String zip) {
        return loadAddressByZipPort.loadByZip(zip);
    }
}

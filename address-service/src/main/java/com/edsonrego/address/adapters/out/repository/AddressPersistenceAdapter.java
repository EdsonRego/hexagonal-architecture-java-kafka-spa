package com.edsonrego.address.adapters.out.repository;

import com.edsonrego.address.domain.Address;
import com.edsonrego.address.ports.out.LoadAddressByZipPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AddressPersistenceAdapter implements LoadAddressByZipPort {

    private final AddressRepository repository;

    @Override
    public Address loadByZip(String zip) {
        return repository.findById(zip)
                .map(e -> Address.builder()
                        .zip(e.getZip())
                        .street(e.getStreet())
                        .district(e.getDistrict())
                        .city(e.getCity())
                        .state(e.getState())
                        .build())
                .orElse(null); // pode lançar exceção caso não encontrado, se preferir
    }
}

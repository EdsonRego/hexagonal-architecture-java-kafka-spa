package com.edsonrego.address.adapters.in.controller;

import com.edsonrego.address.domain.Address;
import com.edsonrego.address.ports.in.FindAddressByZipPort;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/addresses")
@RequiredArgsConstructor
@Validated
public class AddressController {

    private final FindAddressByZipPort findAddressByZipPort;

    @GetMapping("/{zip}")
    public ResponseEntity<Address> getByZip(@PathVariable @NotBlank String zip) {
        Address address = findAddressByZipPort.execute(zip);
        return (address == null) ? ResponseEntity.notFound().build() : ResponseEntity.ok(address);
    }
}

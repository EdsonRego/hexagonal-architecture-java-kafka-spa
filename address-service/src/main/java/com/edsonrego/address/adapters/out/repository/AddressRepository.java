package com.edsonrego.address.adapters.out.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity, String> {
}

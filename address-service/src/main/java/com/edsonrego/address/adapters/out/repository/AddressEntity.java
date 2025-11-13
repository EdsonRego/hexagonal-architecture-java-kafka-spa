package com.edsonrego.address.adapters.out.repository;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "addresses")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressEntity {

    @Id
    @Column(length = 10)
    private String zip;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false, length = 2)
    private String state;
}

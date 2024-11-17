package com.cutm.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cutm.main.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}

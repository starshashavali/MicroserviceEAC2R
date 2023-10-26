package com.tcs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.domain.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}

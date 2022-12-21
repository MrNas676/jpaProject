package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.receipt;

public interface ReceiptRepo extends CrudRepository<receipt, Integer> {

}

package com.example.demo.repository.dao;

import com.example.demo.repository.entity.ForeignExchEntity;
import org.springframework.data.repository.CrudRepository;

public interface ITransaction extends CrudRepository<ForeignExchEntity, Long> {
}

package com.example.demo.repository.dao;

import com.example.demo.repository.entity.ForeignExchEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface IForeExchDao extends CrudRepository<ForeignExchEntity, Long> {

}

package com.springboot.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.crud.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

}

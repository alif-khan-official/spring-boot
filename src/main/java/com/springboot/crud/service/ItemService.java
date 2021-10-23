package com.springboot.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.model.Item;
import com.springboot.crud.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
     
    
    public List<Item> getAllItems() {
        return (List<Item>) itemRepository.findAll();
    }
    
    public void saveItem(Item item) {
    	itemRepository.save(item);
    }
     
}

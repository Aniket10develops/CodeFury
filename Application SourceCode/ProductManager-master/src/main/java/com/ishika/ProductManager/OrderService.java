package com.ishika.ProductManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repo2;
	
	public List<Order> listAll(){
		return repo2.findAll();
	}
	
	public void save(Order order) {
		repo2.save(order);
	}
	
	public Iterable<Order> saveorders(List<Order> orders) {
        return repo2.saveAll(orders);
    }
	
	public Order get(Long oid) {
		return repo2.findById(oid).get();
	}
	public void delete(Long oid) {
			repo2.deleteById(oid);
	}

}

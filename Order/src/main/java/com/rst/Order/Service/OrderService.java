package com.rst.Order.Service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rst.Order.entity.Orders;
import com.rst.Order.repositoy.OrderRepo;

@Service
public class OrderService {
	@Autowired
	private OrderRepo orderRepo;
	public List<Orders> getAllOrders(){
		List<Orders> list=new ArrayList<Orders>();
		this.orderRepo.findAll().forEach(list::add);
		return list;
	}
	public void addOrders(Orders order) {
		this.orderRepo.save(order);
	}
	public void updateOrder(int i,Orders order) {
		this.orderRepo.save(order);
		
	}
	public void deleteorder(Integer id) {
		this.orderRepo.deleteById(id);
	}

}

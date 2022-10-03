package com.rst.Order.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rst.Order.Service.OrderService;
import com.rst.Order.entity.Orders;

@RestController
@RequestMapping("/rest")
public class MyController1 {
	@Autowired
	private OrderService service;
	@GetMapping("/order")
	public List<Orders>getAllOders(){
		return service.getAllOrders();
	}
	@PostMapping("/addorder")
	public void addOrder(@RequestBody Orders s) {
		 this.service.addOrders(s);
	
}
	@PutMapping("/updateorder/{orderId}")
	public void updatOrder(@PathVariable String orderId,@RequestBody Orders s) {
		this.service.updateOrder(Integer.parseInt(orderId), s);
	}
	@PutMapping("/delorder/{orderId}")
	public void deleteorder(@PathVariable String orderId) {
		this.service.deleteorder(Integer.parseInt(orderId));
	}
	
}

package com.rst.Order.repositoy;


import javax.management.loading.ClassLoaderRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rst.Order.entity.Orders;

@Repository
public interface OrderRepo extends CrudRepository<Orders, Integer> {

}

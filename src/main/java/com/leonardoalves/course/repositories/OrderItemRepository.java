package com.leonardoalves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardoalves.course.entities.OrderItem;
import com.leonardoalves.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}

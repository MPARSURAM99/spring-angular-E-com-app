package com.cutm.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cutm.main.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

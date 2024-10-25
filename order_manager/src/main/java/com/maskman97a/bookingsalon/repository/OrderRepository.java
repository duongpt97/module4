package com.maskman97a.bookingsalon.repository;

import com.maskman97a.bookingsalon.entity.OrdersEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrdersEntity, Long> {
    @Query("SELECT o FROM OrdersEntity o WHERE (:startDate IS NULL OR o.orderDate >= :startDate) AND (:endDate IS NULL OR o.orderDate <= :endDate ) ORDER BY o.orderDate DESC")
    List<OrdersEntity>  findByOrderDateBetween(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);
}

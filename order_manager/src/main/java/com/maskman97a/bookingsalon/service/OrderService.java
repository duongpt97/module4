package com.maskman97a.bookingsalon.service;

import com.maskman97a.bookingsalon.dto.OrdersDto;
import com.maskman97a.bookingsalon.entity.OrdersEntity;
import com.maskman97a.bookingsalon.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService extends BaseService {
    @Autowired
    private OrderRepository orderRepository;
    private final ModelMapper modelMapper;


    public List<OrdersDto> findAll() {
        return orderRepository.findAll().stream().map(item -> modelMapper.map(item, OrdersDto.class)).toList();
    }

    public List<OrdersDto> getTopOrders(int limit) {
        return orderRepository.findTopOrders(limit).stream().map(item -> modelMapper.map(item, OrdersDto.class)).toList();
    }

    public List<OrdersDto> findByDate(LocalDateTime startDate, LocalDateTime endDate) {
        return orderRepository.findAllByOrderDateBetween(startDate, endDate).stream().map(item -> modelMapper.map(item, OrdersDto.class)).toList();
    }
}

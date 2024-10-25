package com.maskman97a.bookingsalon.controller;

import com.maskman97a.bookingsalon.common.DataUtil;
import com.maskman97a.bookingsalon.common.DateUtil;
import com.maskman97a.bookingsalon.dto.OrdersDto;
import com.maskman97a.bookingsalon.entity.OrdersEntity;
import com.maskman97a.bookingsalon.repository.OrderRepository;
import com.maskman97a.bookingsalon.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController extends BaseController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public String getOrders(Model model,
                            @RequestParam(required = false) String startDate,
                            @RequestParam(required = false) String endDate,
                            @RequestParam(defaultValue = "10") int limit) {
        List<OrdersDto> orders = orderService.findByDate(!DataUtil.isNullObject(startDate) ? DateUtil.parseStringToLocalDateTime(startDate) : LocalDateTime.now(), !DataUtil.isNullObject(startDate) ? DateUtil.parseStringToLocalDateTime(endDate) : LocalDateTime.now());
        model.addAttribute("orders", orders);
        model.addAttribute("startDate", !DataUtil.isNullObject(startDate) ? startDate : LocalDateTime.now());
        model.addAttribute("endDate", !DataUtil.isNullObject(startDate) ? endDate : LocalDateTime.now());
        model.addAttribute("limit", limit);
        return "orders/list";
    }
}

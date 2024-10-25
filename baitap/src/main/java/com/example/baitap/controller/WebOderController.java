package com.example.baitap.controller;

import com.example.baitap.entity.Order;
import com.example.baitap.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class WebOderController {
    private final OrderService orderService;

    public WebOderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/list")
    public String showOrders(Model model) {
        List<Order> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        return "orders"; // Chỉ định tên của file HTML để render
    }
}

package com.cashsystem.service;

import com.cashsystem.dao.OrderDao;
import com.cashsystem.entity.Order;

import java.util.List;

/**
 * @Author Avin
 * @Create 2019/8/10 15:41 by IntelliJ IDEA
 * @Description
 */
public class OrderService {
    public OrderDao orderDao;
    public OrderService(){
        this.orderDao = new OrderDao();
    }
    public boolean commitOrder(Order order){
        return this.orderDao.commitOrder(order);
    }
    public List<Order> queryOrderByAccount(Integer accountId){

        return this.orderDao.queryOrderByAccount(accountId);
    }
}
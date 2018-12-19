package com.qf.admin.service;

import com.alibaba.fastjson.JSONObject;
import com.qf.admin.pojo.po.Order;

public interface Orderservice {
    //订单service
    //订单service
    JSONObject listtoroder(JSONObject jsonObject);


    Object singleroder(int orderId);

    void updateorder(Order order);

    int deleteroder(int orderId);
}

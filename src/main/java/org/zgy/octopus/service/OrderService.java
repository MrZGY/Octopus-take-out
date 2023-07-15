package org.zgy.octopus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.zgy.octopus.entity.Orders;

public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    void submit(Orders orders);
}

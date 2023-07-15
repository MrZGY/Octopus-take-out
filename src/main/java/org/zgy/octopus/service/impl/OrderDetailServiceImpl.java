package org.zgy.octopus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.zgy.octopus.entity.OrderDetail;
import org.zgy.octopus.mapper.OrderDetailMapper;
import org.zgy.octopus.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}
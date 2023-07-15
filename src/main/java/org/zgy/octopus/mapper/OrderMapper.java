package org.zgy.octopus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.zgy.octopus.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}
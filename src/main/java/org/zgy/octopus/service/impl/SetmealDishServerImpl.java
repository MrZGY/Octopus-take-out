package org.zgy.octopus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.zgy.octopus.entity.SetmealDish;
import org.zgy.octopus.mapper.SetmealDishMapper;
import org.zgy.octopus.service.SetmealDishService;

@Service
@Slf4j
public class SetmealDishServerImpl extends ServiceImpl<SetmealDishMapper, SetmealDish> implements SetmealDishService {
}

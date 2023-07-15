package org.zgy.octopus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.zgy.octopus.dto.DishDto;

import org.zgy.octopus.entity.Dish;

import java.util.List;

public interface DishService extends IService<Dish> {
    void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品信息和对应的口味信息
    DishDto getByIdWithFlavor(Long id);

    //更新菜品信息，同时更新对应的口味信息
    void updateWithFlavor(DishDto dishDto);

    //根据传过来的id批量或者是单个的删除菜品，并判断是否是启售的
    void deleteByIds(List<Long> ids);

    //菜品批量删除和单个删除，删除时用到deleteByIds方法删除菜品
    boolean deleteInSetmeal(List<Long> ids);

}

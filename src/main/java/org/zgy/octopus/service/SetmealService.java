package org.zgy.octopus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.zgy.octopus.dto.SetmealDto;
import org.zgy.octopus.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    void saveWithDish(SetmealDto setmealDto);

    void removeWithDish(List<Long> ids);

    void updateWithDish(SetmealDto setmealDto);

    SetmealDto getByIdWithFlavor(Long id);
}

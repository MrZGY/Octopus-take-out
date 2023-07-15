package org.zgy.octopus.dto;

import org.zgy.octopus.entity.Setmeal;
import org.zgy.octopus.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}

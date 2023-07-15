package org.zgy.octopus.dto;

import org.zgy.octopus.entity.Dish;
import org.zgy.octopus.entity.DishFlavor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}

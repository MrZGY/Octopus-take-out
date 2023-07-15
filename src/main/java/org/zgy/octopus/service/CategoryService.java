package org.zgy.octopus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.zgy.octopus.entity.Category;

import java.util.List;

public interface CategoryService extends IService<Category> {
    void remove(Long id);

}

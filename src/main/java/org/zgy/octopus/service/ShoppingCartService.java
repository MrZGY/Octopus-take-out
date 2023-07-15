package org.zgy.octopus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.zgy.octopus.entity.ShoppingCart;

public interface ShoppingCartService extends IService<ShoppingCart> {

    ShoppingCart add(ShoppingCart shoppingCart);


    public ShoppingCart sub(ShoppingCart shoppingCart);

    void clean();
}

package org.zgy.octopus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import org.zgy.octopus.entity.User;


public interface UserService extends IService<User> {
    void sendMsg(String to,String subject,String text);
}

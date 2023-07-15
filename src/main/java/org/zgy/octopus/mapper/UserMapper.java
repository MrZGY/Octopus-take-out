package org.zgy.octopus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.zgy.octopus.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}

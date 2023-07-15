package org.zgy.octopus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.zgy.octopus.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {

}

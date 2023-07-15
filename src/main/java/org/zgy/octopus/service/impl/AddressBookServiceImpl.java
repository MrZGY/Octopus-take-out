package org.zgy.octopus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.zgy.octopus.entity.AddressBook;
import org.zgy.octopus.mapper.AddressBookMapper;
import org.zgy.octopus.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}

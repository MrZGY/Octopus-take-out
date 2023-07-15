package org.zgy.octopus.dto;

import org.zgy.octopus.entity.OrderDetail;
import org.zgy.octopus.entity.Orders;
import lombok.Data;
import java.util.List;

@Data
public class OrderDto extends Orders {

    private String userName;

    private String phone;

    private String address;

    private String consignee;

    private List<OrderDetail> orderDetails;
	
}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pos订单查询接口
 *
 * @author auto create
 * @since 1.0, 2018-11-13 11:01:25
 */
public class KoubeiCateringOrderInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5253626981144756944L;

	/**
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}

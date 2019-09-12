package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.freedeposit.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-09 15:26:16
 */
public class ZhimaCreditEpFreedepositInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4541423291854427736L;

	/** 
	 * 免押额度业务流水号，每次业务唯一。
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}

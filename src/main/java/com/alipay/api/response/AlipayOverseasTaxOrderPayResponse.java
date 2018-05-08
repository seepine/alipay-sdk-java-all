package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.order.pay response.
 * 
 * @author auto create
 * @since 1.0, 2018-03-05 10:31:46
 */
public class AlipayOverseasTaxOrderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4665737465287568875L;

	/** 
	 * 支付宝的退税流水号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	public String getTaxNo( ) {
		return this.taxNo;
	}

}

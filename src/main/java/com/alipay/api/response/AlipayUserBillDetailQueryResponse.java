package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ConsumeRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.bill.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-22 00:17:13
 */
public class AlipayUserBillDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3731688391121859547L;

	/** 
	 * 消费记录模型
	 */
	@ApiField("consume_record")
	private ConsumeRecord consumeRecord;

	public void setConsumeRecord(ConsumeRecord consumeRecord) {
		this.consumeRecord = consumeRecord;
	}
	public ConsumeRecord getConsumeRecord( ) {
		return this.consumeRecord;
	}

}

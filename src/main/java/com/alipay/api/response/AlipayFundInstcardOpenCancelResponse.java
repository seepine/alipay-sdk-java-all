package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.instcard.open.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-17 21:07:43
 */
public class AlipayFundInstcardOpenCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8418623248222442714L;

	/** 
	 * 是否销户成功
	 */
	@ApiField("canceled")
	private Boolean canceled;

	public void setCanceled(Boolean canceled) {
		this.canceled = canceled;
	}
	public Boolean getCanceled( ) {
		return this.canceled;
	}

}
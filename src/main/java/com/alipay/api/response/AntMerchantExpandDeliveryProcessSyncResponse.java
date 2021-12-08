package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.delivery.process.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-19 16:01:54
 */
public class AntMerchantExpandDeliveryProcessSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3252277554542491184L;

	/** 
	 * 响应参数
	 */
	@ApiField("result")
	private AssetResult result;

	public void setResult(AssetResult result) {
		this.result = result;
	}
	public AssetResult getResult( ) {
		return this.result;
	}

}

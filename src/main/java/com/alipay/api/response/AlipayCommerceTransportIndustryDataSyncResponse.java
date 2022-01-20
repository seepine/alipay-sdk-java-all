package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.industry.data.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-28 16:35:36
 */
public class AlipayCommerceTransportIndustryDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3342128713392374446L;

	/** 
	 * 数据同步接口响应，根据请求场景、事件类型的变化而不同
	 */
	@ApiField("sync_response")
	private String syncResponse;

	public void setSyncResponse(String syncResponse) {
		this.syncResponse = syncResponse;
	}
	public String getSyncResponse( ) {
		return this.syncResponse;
	}

}

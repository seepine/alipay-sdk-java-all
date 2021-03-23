package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.content.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-18 17:55:13
 */
public class AlipayOpenMiniContentSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5258747418762395289L;

	/** 
	 * 结果数据，json格式，可参考具体内容接入文档中的详细说明。详见https://opendocs.alipay.com/mini/00ntj5。
	 */
	@ApiField("result_data")
	private String resultData;

	public void setResultData(String resultData) {
		this.resultData = resultData;
	}
	public String getResultData( ) {
		return this.resultData;
	}

}

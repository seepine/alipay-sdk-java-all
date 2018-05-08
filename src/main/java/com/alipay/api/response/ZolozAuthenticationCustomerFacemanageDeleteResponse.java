package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.facemanage.delete response.
 * 
 * @author auto create
 * @since 1.0, 2018-01-17 15:36:26
 */
public class ZolozAuthenticationCustomerFacemanageDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3478371919477369265L;

	/** 
	 * 返回值
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 返回码
	 */
	@ApiField("retcode")
	private String retcode;

	/** 
	 * 返回信息
	 */
	@ApiField("retmessage")
	private String retmessage;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setRetcode(String retcode) {
		this.retcode = retcode;
	}
	public String getRetcode( ) {
		return this.retcode;
	}

	public void setRetmessage(String retmessage) {
		this.retmessage = retmessage;
	}
	public String getRetmessage( ) {
		return this.retmessage;
	}

}

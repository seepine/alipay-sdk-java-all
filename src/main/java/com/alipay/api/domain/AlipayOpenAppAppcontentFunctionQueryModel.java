package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用内容服务查询
 *
 * @author auto create
 * @since 1.0, 2020-12-15 19:55:24
 */
public class AlipayOpenAppAppcontentFunctionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5868823171133746772L;

	/**
	 * 服务编码，通过 <a href="https://opendocs.alipay.com/apis/011agl">alipay.open.app.appcontent.function.create</a>(小程序服务创建)接口创建服务后获取。
	 */
	@ApiField("service_code")
	private String serviceCode;

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}

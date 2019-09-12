package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询小程序客户端默认版本号信息
 *
 * @author auto create
 * @since 1.0, 2019-04-10 19:56:08
 */
public class AlipayOpenMiniInnerclientinfoDefaultversionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7317761556965197243L;

	/**
	 * 小程序Id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索直达活动详情
 *
 * @author auto create
 * @since 1.0, 2022-04-20 14:03:39
 */
public class AlipayOpenSearchBoxactivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3674584338428223942L;

	/**
	 * 搜索直达活动id
	 */
	@ApiField("box_activity_id")
	private String boxActivityId;

	/**
	 * 商户id，代运营模式下传入
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public String getBoxActivityId() {
		return this.boxActivityId;
	}
	public void setBoxActivityId(String boxActivityId) {
		this.boxActivityId = boxActivityId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
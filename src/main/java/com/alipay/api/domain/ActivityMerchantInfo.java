package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户信息
 *
 * @author auto create
 * @since 1.0, 2021-11-15 17:46:44
 */
public class ActivityMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 1199291925972245134L;

	/**
	 * 商户支付宝id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户支付宝id类型。
枚举值
PID 直连pid
SMID 间连SMID
	 */
	@ApiField("merchant_id_type")
	private String merchantIdType;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantIdType() {
		return this.merchantIdType;
	}
	public void setMerchantIdType(String merchantIdType) {
		this.merchantIdType = merchantIdType;
	}

}
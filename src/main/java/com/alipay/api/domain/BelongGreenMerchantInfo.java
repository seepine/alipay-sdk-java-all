package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 归属商户信息
 *
 * @author auto create
 * @since 1.0, 2022-04-16 15:00:07
 */
public class BelongGreenMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 5849199282593184615L;

	/**
	 * 合作业务类型. 枚举值如下： 
ISV_FOR_MERCHANT 服务商代运营模式  （SOP请参考 https://opendocs.alipay.com/mini/01hm6i#%E4%BB%A3%E8%BF%90%E8%90%A5%E6%8E%88%E6%9D%83）
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 商户PID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

}

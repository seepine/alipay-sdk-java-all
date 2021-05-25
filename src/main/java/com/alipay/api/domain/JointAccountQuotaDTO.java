package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额度模型
 *
 * @author auto create
 * @since 1.0, 2021-01-25 21:13:39
 */
public class JointAccountQuotaDTO extends AlipayObject {

	private static final long serialVersionUID = 6251295318881598585L;

	/**
	 * 额度维度
	 */
	@ApiField("quota_dimension")
	private String quotaDimension;

	/**
	 * 协议额度
	 */
	@ApiField("quota_total")
	private String quotaTotal;

	public String getQuotaDimension() {
		return this.quotaDimension;
	}
	public void setQuotaDimension(String quotaDimension) {
		this.quotaDimension = quotaDimension;
	}

	public String getQuotaTotal() {
		return this.quotaTotal;
	}
	public void setQuotaTotal(String quotaTotal) {
		this.quotaTotal = quotaTotal;
	}

}

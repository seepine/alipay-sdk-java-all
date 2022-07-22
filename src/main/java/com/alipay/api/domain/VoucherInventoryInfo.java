package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券库存信息
 *
 * @author auto create
 * @since 1.0, 2022-07-20 18:09:22
 */
public class VoucherInventoryInfo extends AlipayObject {

	private static final long serialVersionUID = 7291275244492829241L;

	/**
	 * 已发放数量
	 */
	@ApiField("send_count")
	private Long sendCount;

	/**
	 * 已核销数量
	 */
	@ApiField("use_count")
	private Long useCount;

	public Long getSendCount() {
		return this.sendCount;
	}
	public void setSendCount(Long sendCount) {
		this.sendCount = sendCount;
	}

	public Long getUseCount() {
		return this.useCount;
	}
	public void setUseCount(Long useCount) {
		this.useCount = useCount;
	}

}
package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DeviceTradeInfoList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.devicetradestatlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 11:24:35
 */
public class AlipayCommerceIotDapplyDevicetradestatlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5431375165229123317L;

	/** 
	 * 设备交易统计信息
	 */
	@ApiField("devicetradestatlist")
	private DeviceTradeInfoList devicetradestatlist;

	/** 
	 * 表示返回的列表总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setDevicetradestatlist(DeviceTradeInfoList devicetradestatlist) {
		this.devicetradestatlist = devicetradestatlist;
	}
	public DeviceTradeInfoList getDevicetradestatlist( ) {
		return this.devicetradestatlist;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}

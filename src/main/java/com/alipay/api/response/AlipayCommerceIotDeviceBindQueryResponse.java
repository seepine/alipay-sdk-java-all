package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IotDeviceBindInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.bind.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-17 10:25:12
 */
public class AlipayCommerceIotDeviceBindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5674917691792489542L;

	/** 
	 * 设备绑定关系
	 */
	@ApiListField("bind_info_list")
	@ApiField("iot_device_bind_info")
	private List<IotDeviceBindInfo> bindInfoList;

	public void setBindInfoList(List<IotDeviceBindInfo> bindInfoList) {
		this.bindInfoList = bindInfoList;
	}
	public List<IotDeviceBindInfo> getBindInfoList( ) {
		return this.bindInfoList;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.qrcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-18 11:55:05
 */
public class KoubeiMarketingCampaignQrcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3782725577745538262L;

	/** 
	 * 二维码地址，可以根据这个地址生成二维码
	 */
	@ApiField("qrcode_url")
	private String qrcodeUrl;

	public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl;
	}
	public String getQrcodeUrl( ) {
		return this.qrcodeUrl;
	}

}

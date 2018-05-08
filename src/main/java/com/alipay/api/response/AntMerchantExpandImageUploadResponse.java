package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2018-04-13 15:01:56
 */
public class AntMerchantExpandImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6343127332589954516L;

	/** 
	 * 图片在sfs中的标识
	 */
	@ApiField("image_id")
	private String imageId;

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getImageId( ) {
		return this.imageId;
	}

}

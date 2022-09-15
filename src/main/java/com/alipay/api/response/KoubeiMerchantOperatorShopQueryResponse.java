package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CityShopModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-17 16:42:28
 */
public class KoubeiMerchantOperatorShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5285492699979289398L;

	/** 
	 * 操作员关联的门店模型列表
	 */
	@ApiListField("city_shop_models")
	@ApiField("city_shop_model")
	private List<CityShopModel> cityShopModels;

	public void setCityShopModels(List<CityShopModel> cityShopModels) {
		this.cityShopModels = cityShopModels;
	}
	public List<CityShopModel> getCityShopModels( ) {
		return this.cityShopModels;
	}

}

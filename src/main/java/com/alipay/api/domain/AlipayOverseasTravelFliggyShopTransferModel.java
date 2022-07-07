package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 全球游飞猪店铺数据发送接口
 *
 * @author auto create
 * @since 1.0, 2022-01-17 17:48:55
 */
public class AlipayOverseasTravelFliggyShopTransferModel extends AlipayObject {

	private static final long serialVersionUID = 3396417832232998453L;

	/**
	 * 同步数据类型与实际数据
	 */
	@ApiField("data")
	private String data;

	/**
	 * 请求唯一id，只能是大小写字母及数字。不带业务含义，可以由uuid等随机生成，用于唯一标识一笔业务，方便与外部排查问题
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/**
	 * 用户id，与user_id_type配合使用，暂时仅支持集团havanaId和支付宝2088开头的16位数字ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户id类型枚举，与user_id配合使用。取值说明：HAVANA为集团havanaId，ALIPAY为支付宝2088开头用户id
	 */
	@ApiField("user_id_type")
	private String userIdType;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIdType() {
		return this.userIdType;
	}
	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}

}

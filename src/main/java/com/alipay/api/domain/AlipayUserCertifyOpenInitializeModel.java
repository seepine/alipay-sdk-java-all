package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝开放认证初始化服务
 *
 * @author auto create
 * @since 1.0, 2021-04-20 19:46:55
 */
public class AlipayUserCertifyOpenInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 3355798167637899516L;

	/**
	 * 认证场景码。入参支持的认证场景码和商户签约的认证场景相关，取值如下:
FACE：多因子人脸认证
CERT_PHOTO：多因子证照认证
CERT_PHOTO_FACE ：多因子证照和人脸认证
SMART_FACE：多因子快捷认证
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 自定义人脸比对图片的base64编码格式的string字符串
	 */
	@ApiField("face_contrast_picture")
	private String faceContrastPicture;

	/**
	 * 需要验证的身份信息(json)字段说明如下：
identity_type：身份信息参数类型，固定为 CERT_INFO
cert_name：真实姓名，必填
cert_no：证件号码，必填
cert_type：证件类型，必填，枚举支持：
IDENTITY_CARD：身份证
HOME_VISIT_PERMIT_HK_MC：港澳通行证
HOME_VISIT_PERMIT_TAIWAN：台湾通行证
RESIDENCE_PERMIT_HK_MC：港澳居住证
RESIDENCE_PERMIT_TAIWAN：台湾居住证
	 */
	@ApiField("identity_param")
	private String identityParam;

	/**
	 * 商户个性化配置，格式为json，详细支持的字段说明为：
return_url：需要回跳的目标地址，必填，一般指定为商户业务页面
face_reserve_strategy：人脸保存策略，非必填；reserve(保存活体人脸)/never(不保存活体人脸)，不传默认为reserve
	 */
	@ApiField("merchant_config")
	private String merchantConfig;

	/**
	 * 商户请求的唯一标识，商户要保证其唯一性，值为32位长度的字母数字组合。建议：前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	 */
	@ApiField("outer_order_no")
	private String outerOrderNo;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getFaceContrastPicture() {
		return this.faceContrastPicture;
	}
	public void setFaceContrastPicture(String faceContrastPicture) {
		this.faceContrastPicture = faceContrastPicture;
	}

	public String getIdentityParam() {
		return this.identityParam;
	}
	public void setIdentityParam(String identityParam) {
		this.identityParam = identityParam;
	}

	public String getMerchantConfig() {
		return this.merchantConfig;
	}
	public void setMerchantConfig(String merchantConfig) {
		this.merchantConfig = merchantConfig;
	}

	public String getOuterOrderNo() {
		return this.outerOrderNo;
	}
	public void setOuterOrderNo(String outerOrderNo) {
		this.outerOrderNo = outerOrderNo;
	}

}

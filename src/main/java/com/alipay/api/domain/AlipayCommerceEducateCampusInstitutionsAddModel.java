package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商学校信息入驻
 *
 * @author auto create
 * @since 1.0, 2022-02-14 14:12:10
 */
public class AlipayCommerceEducateCampusInstitutionsAddModel extends AlipayObject {

	private static final long serialVersionUID = 1561749738325549396L;

	/**
	 * 事业单位法人证书或办学许可证的图片
	 */
	@ApiField("card_pict_url")
	private String cardPictUrl;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 入驻的学校名称，必须是完整的学校全称
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 学校外标：统一社会信用编码或教育部提供的学校标识码。
	 */
	@ApiField("inst_std_code")
	private String instStdCode;

	/**
	 * 办学阶段。
枚举值如下：
KINDERGARTEN（幼儿园）
PRIMARY_SCHOOL（小学） 
MIDDLE_SCHOOL（初中） 
HIGH_SCHOOL（高中）
UNIVERSITY（大学） 
SECONDARY_VOCATIONAL_SCHOOL（中职中专） 
TRAINING_SCHOOL（培训机构） 
HIGHER_VOCATIONAL_SCHOOL（高职高专） 
ADULT_EDUCATION（成人教育、函授）等
注意：如果学校兼有多种属性，可以连写用英文逗号拆分，如：MIDDLE_SCHOOL,HIGH_SCHOOL 代表兼有初中部和高中部；
	 */
	@ApiField("learning_stage")
	private String learningStage;

	/**
	 * 省份
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 学校性质.枚举值如下：
 1：公立 
2：民办
	 */
	@ApiField("school_property")
	private String schoolProperty;

	public String getCardPictUrl() {
		return this.cardPictUrl;
	}
	public void setCardPictUrl(String cardPictUrl) {
		this.cardPictUrl = cardPictUrl;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getInstStdCode() {
		return this.instStdCode;
	}
	public void setInstStdCode(String instStdCode) {
		this.instStdCode = instStdCode;
	}

	public String getLearningStage() {
		return this.learningStage;
	}
	public void setLearningStage(String learningStage) {
		this.learningStage = learningStage;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getSchoolProperty() {
		return this.schoolProperty;
	}
	public void setSchoolProperty(String schoolProperty) {
		this.schoolProperty = schoolProperty;
	}

}
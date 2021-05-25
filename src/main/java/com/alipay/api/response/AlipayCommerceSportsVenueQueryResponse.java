package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubVenueQueryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.venue.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-30 14:17:36
 */
public class AlipayCommerceSportsVenueQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2115748731284116682L;

	/** 
	 * 具体地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 区域code
	 */
	@ApiField("area_code")
	private String areaCode;

	/** 
	 * 是否可预定 Y/N （不传默认可预定）
	 */
	@ApiField("bookable")
	private String bookable;

	/** 
	 * 城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 场馆介绍
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/** 
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/** 
	 * 场馆名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 营业时间
开始时间 - 结束时间
	 */
	@ApiField("opening_hours")
	private String openingHours;

	/** 
	 * 服务商场馆ID
	 */
	@ApiField("out_venue_id")
	private String outVenueId;

	/** 
	 * 联系电话
	 */
	@ApiListField("phone")
	@ApiField("string")
	private List<String> phone;

	/** 
	 * 场馆图片链接列表 最多5张
	 */
	@ApiListField("picture_list")
	@ApiField("string")
	private List<String> pictureList;

	/** 
	 * POI
	 */
	@ApiField("poi")
	private String poi;

	/** 
	 * 场馆主图海报链接
	 */
	@ApiField("poster")
	private String poster;

	/** 
	 * 场馆售卖产品类型集合，逗号隔开
calendar：价格日历
ticket：票券
course: 课程
	 */
	@ApiListField("product_type_list")
	@ApiField("string")
	private List<String> productTypeList;

	/** 
	 * 省份code
	 */
	@ApiField("province_code")
	private String provinceCode;

	/** 
	 * 子场馆列表
	 */
	@ApiListField("sub_venue_list")
	@ApiField("sub_venue_query_info")
	private List<SubVenueQueryInfo> subVenueList;

	/** 
	 * 标签列表
	 */
	@ApiListField("tag_list")
	@ApiField("string")
	private List<String> tagList;

	/** 
	 * 交通信息
	 */
	@ApiField("traffic")
	private String traffic;

	/** 
	 * 支付宝场馆ID
	 */
	@ApiField("venue_id")
	private String venueId;

	/** 
	 * 场馆商户pid
	 */
	@ApiField("venue_pid")
	private String venuePid;

	/** 
	 * 场馆当前状态
安全审核中：infosec-audit
安全审核不通过：infosec-unpass
云验收中： cloud-audit
云验收不通过： cloud-unpass
上架： online
下架： offline
人工下架： manual-offline
	 */
	@ApiField("venue_status")
	private String venueStatus;

	/** 
	 * 场馆类型，
01足球；02篮球；03乒乓球；04羽毛球；05台球；06射箭；07哒哒球；08游泳；09网球；10攀岩；11空手道；12跆拳道；14瑜伽；15搏击；16舞蹈；17艺术体操；18太极；19击剑；20水上运动；21滑雪；22健身；23轮滑；24排球；25门球；00其他运动
	 */
	@ApiListField("venue_type")
	@ApiField("string")
	private List<String> venueType;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getAreaCode( ) {
		return this.areaCode;
	}

	public void setBookable(String bookable) {
		this.bookable = bookable;
	}
	public String getBookable( ) {
		return this.bookable;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode( ) {
		return this.cityCode;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLatitude( ) {
		return this.latitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}
	public String getOpeningHours( ) {
		return this.openingHours;
	}

	public void setOutVenueId(String outVenueId) {
		this.outVenueId = outVenueId;
	}
	public String getOutVenueId( ) {
		return this.outVenueId;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public List<String> getPhone( ) {
		return this.phone;
	}

	public void setPictureList(List<String> pictureList) {
		this.pictureList = pictureList;
	}
	public List<String> getPictureList( ) {
		return this.pictureList;
	}

	public void setPoi(String poi) {
		this.poi = poi;
	}
	public String getPoi( ) {
		return this.poi;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getPoster( ) {
		return this.poster;
	}

	public void setProductTypeList(List<String> productTypeList) {
		this.productTypeList = productTypeList;
	}
	public List<String> getProductTypeList( ) {
		return this.productTypeList;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode( ) {
		return this.provinceCode;
	}

	public void setSubVenueList(List<SubVenueQueryInfo> subVenueList) {
		this.subVenueList = subVenueList;
	}
	public List<SubVenueQueryInfo> getSubVenueList( ) {
		return this.subVenueList;
	}

	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}
	public List<String> getTagList( ) {
		return this.tagList;
	}

	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}
	public String getTraffic( ) {
		return this.traffic;
	}

	public void setVenueId(String venueId) {
		this.venueId = venueId;
	}
	public String getVenueId( ) {
		return this.venueId;
	}

	public void setVenuePid(String venuePid) {
		this.venuePid = venuePid;
	}
	public String getVenuePid( ) {
		return this.venuePid;
	}

	public void setVenueStatus(String venueStatus) {
		this.venueStatus = venueStatus;
	}
	public String getVenueStatus( ) {
		return this.venueStatus;
	}

	public void setVenueType(List<String> venueType) {
		this.venueType = venueType;
	}
	public List<String> getVenueType( ) {
		return this.venueType;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸设备绑定酒店和房间
 *
 * @author auto create
 * @since 1.0, 2021-10-29 10:06:45
 */
public class AlipayOpenIotmbsRoomBindModel extends AlipayObject {

	private static final long serialVersionUID = 1152261954696477875L;

	/**
	 * 设备激活编号
	 */
	@ApiField("dev_id")
	private String devId;

	/**
	 * 设备类型，1:房间设备，2:前台设备
	 */
	@ApiField("device_type")
	private Long deviceType;

	/**
	 * 酒店编号
	 */
	@ApiField("hotel_id")
	private String hotelId;

	/**
	 * 酒店名称
	 */
	@ApiField("hotel_name")
	private String hotelName;

	/**
	 * 项目ID，目前涂鸦这边是用酒店ID做项目ID来隔离
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 酒店的房间编号
	 */
	@ApiField("room_no")
	private String roomNo;

	public String getDevId() {
		return this.devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
	}

	public Long getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(Long deviceType) {
		this.deviceType = deviceType;
	}

	public String getHotelId() {
		return this.hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return this.hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getRoomNo() {
		return this.roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

}
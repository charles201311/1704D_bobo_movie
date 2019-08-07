package com.bobo.movie.domain;

import java.io.Serializable;

/**
 * 
 * @ClassName: Movie 
 * @Description: 电影的实体类
 * @author: charles
 * @date: 2019年8月3日 上午9:26:25
 */
public class Movie implements Serializable {
	private Integer id;
	private String name;
	private String actor;//导演
	private String uptime;//上映时间
	private Integer price;//价格
	private String duration;//时长
	private String type;//类型
	private Integer year;//年代
	private String area;//区域
	private Integer status;//状态
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getUptime() {
		return uptime;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", actor=" + actor + ", uptime=" + uptime + ", price=" + price
				+ ", duration=" + duration + ", type=" + type + ", year=" + year + ", area=" + area + ", status="
				+ status + "]";
	}
	
	

}

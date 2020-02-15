package com.cts.training.product.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "newsfeed")
public class NewsFeed {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private Integer userId;
	@Column
	private String feed;
	@Column
	private LocalDateTime createdOn;
	@Column
	private Integer mediaId;
	
	
	public NewsFeed() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public NewsFeed(Integer id, Integer userId, String feed, LocalDateTime createdOn, Integer mediaId) {
		this.id = id;
		this.userId = userId;
		this.feed = feed;
		this.createdOn = createdOn;
		this.mediaId = mediaId;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFeed() {
		return feed;
	}
	public void setFeed(String feed) {
		this.feed = feed;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	public Integer getMediaId() {
		return mediaId;
	}
	public void setMediaId(Integer mediaId) {
		this.mediaId = mediaId;
	}
	
	
	
	
	
}

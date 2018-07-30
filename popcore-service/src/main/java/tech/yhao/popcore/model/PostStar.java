package tech.yhao.popcore.model;

import java.util.Date;

public class PostStar {
	private Integer postId;
	private Integer starByUserId;
	private Date starDateTime;

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Integer getStarByUserId() {
		return starByUserId;
	}

	public void setStarByUserId(Integer starByUserId) {
		this.starByUserId = starByUserId;
	}

	public Date getStarDateTime() {
		return starDateTime;
	}

	public void setStarDateTime(Date starDateTime) {
		this.starDateTime = starDateTime;
	}

}

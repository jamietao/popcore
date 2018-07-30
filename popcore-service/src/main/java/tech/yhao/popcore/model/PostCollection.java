package tech.yhao.popcore.model;

import java.util.Date;

public class PostCollection {
	private Integer postId;
	private Integer collectedByUserId;
	private Date collectionDateTime;

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Integer getCollectedByUserId() {
		return collectedByUserId;
	}

	public void setCollectedByUserId(Integer collectedByUserId) {
		this.collectedByUserId = collectedByUserId;
	}

	public Date getCollectionDateTime() {
		return collectionDateTime;
	}

	public void setCollectionDateTime(Date collectionDateTime) {
		this.collectionDateTime = collectionDateTime;
	}

}

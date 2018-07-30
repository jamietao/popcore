package tech.yhao.popcore.model;

import java.util.Date;

public class Post {

	private Integer postId;
	private String title;
	private String postImageUrl;
	private String overview;
	private Date createDateTime;
	private PostStatisticsInfo statisticsInfo;
	private User author;

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPostImageUrl() {
		return postImageUrl;
	}

	public void setPostImageUrl(String postImageUrl) {
		this.postImageUrl = postImageUrl;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public PostStatisticsInfo getStatisticsInfo() {
		return statisticsInfo;
	}

	public void setStatisticsInfo(PostStatisticsInfo statisticsInfo) {
		this.statisticsInfo = statisticsInfo;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

}

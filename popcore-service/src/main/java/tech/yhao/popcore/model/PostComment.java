package tech.yhao.popcore.model;

import java.util.List;

public class PostComment {
	private Integer postId;
	private Integer commentId;
	private String commentText;
	private List<PostCommentImage> images;
	private PostCommentAudio audio;
	private User author;

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public List<PostCommentImage> getImages() {
		return images;
	}

	public void setImages(List<PostCommentImage> images) {
		this.images = images;
	}

	public PostCommentAudio getAudio() {
		return audio;
	}

	public void setAudio(PostCommentAudio audio) {
		this.audio = audio;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

}

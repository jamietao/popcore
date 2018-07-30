package tech.yhao.popcore.service;

import java.util.List;

import tech.yhao.popcore.model.Post;
import tech.yhao.popcore.model.PostComment;
import tech.yhao.popcore.model.PostDetail;

/**
 * The post service
 * 
 * @author TaoJn
 *
 */
public interface PostService {

	/**
	 * Gets all posts.
	 * 
	 * @return Post List.
	 */
	List<Post> getPostList();

	/**
	 * Gets the post detail description.
	 * 
	 * @param postId
	 *            The post id.
	 * @return The post detail information.
	 */
	PostDetail getPostDetail(Integer postId);

	/**
	 * Adds comment on post.
	 * 
	 * @param postComment
	 *            The post comment with text message, images, or audio.
	 */
	void addComment(PostComment postComment);

	/**
	 * Gets all the post comments for post.
	 * 
	 * @param postId
	 *            The post id.
	 * @return The post comment list.
	 */
	List<PostComment> getPostComments(Integer postId);

	/**
	 * User collects the post.
	 * 
	 * @param userId
	 *            The current user id.
	 * @param postId
	 *            The post id.
	 */
	void CollectPost(Integer userId, Integer postId);

	/**
	 * Star the post.
	 * 
	 * @param userId
	 *            The user id.
	 * @param postId
	 *            The post id.
	 */
	void StarPost(Integer userId, Integer postId);
}

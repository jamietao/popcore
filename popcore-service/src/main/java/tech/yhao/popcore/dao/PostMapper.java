package tech.yhao.popcore.dao;

import java.util.List;

import tech.yhao.popcore.model.Post;
import tech.yhao.popcore.model.PostDetail;

public interface PostMapper {

	List<Post> listAll();

	PostDetail findById(Integer postId);

	int insert(PostDetail post);
}

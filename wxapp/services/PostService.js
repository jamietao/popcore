const PostListCacheKey = "popcore_post_basic_list";
const PostDetailsCacheKey = "popcore_post_details";

class PostService {

  constructor(postList, postDetails) {
    wx.removeStorageSync(PostListCacheKey);
    wx.removeStorageSync(PostDetailsCacheKey);

    wx.setStorageSync(PostListCacheKey, postList);
    wx.setStorageSync(PostDetailsCacheKey, postDetails);
  }

  getAll() {
    return wx.getStorageSync(PostListCacheKey)
  }

  getPostDetailsById(postId) {
    return wx.getStorageSync(PostDetailsCacheKey).find(post => post.postId == postId);
  }
}

export {
  PostService
}
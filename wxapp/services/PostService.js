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

  toggleLike(postId) {
    var posts = wx.getStorageSync(PostDetailsCacheKey);
    var post = posts.find(post => post.postId == postId);
    if (post.upStatus) {
      post.upNum = post.upNum - 1;
    } else {
      post.upNum = post.upNum + 1;
    }

    post.upStatus = !post.upStatus;
    wx.setStorageSync(PostDetailsCacheKey, posts);
  }

  toggleCollection(postId) {
    var posts = wx.getStorageSync(PostDetailsCacheKey);
    var post = posts.find(post => post.postId == postId);
    if (post.collectionStatus) {
      post.collectionNum = post.collectionNum - 1;
    } else {
      post.collectionNum = post.collectionNum + 1;
    }

    post.collectionStatus = !post.collectionStatus;
    wx.setStorageSync(PostDetailsCacheKey, posts);
  }
}

export {
  PostService
}
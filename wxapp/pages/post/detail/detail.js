Page({

  /**
   * 页面的初始数据
   */
  data: {
    isPlayingMusic: false
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function(options) {
    this._postService = getApp().getService();
    var postDetails = this._postService.getPostDetailsById(options.postId);
    this.setData({
      post: postDetails
    });
  },

  onMusicPlayTap: function(event) {
    if (this.data.isPlayingMusic) {
      wx.pauseBackgroundAudio();
      this.setData({
        isPlayingMusic: false
      });
    } else {
      wx.playBackgroundAudio({
        dataUrl: this.data.post.backgroundMusic.url,
        title: this.data.post.backgroundMusic.title,
        coverImgUrl: this.data.post.backgroundMusic.coverImg
      });
      this.setData({
        isPlayingMusic: true
      });
    }
  },

  onUpTap: function(event) {
    var postId = event.currentTarget.dataset.postId;
    this._postService.toggleLike(postId);
    var newPostData = this._postService.getPostDetailsById(postId);

    this.setData({
      post: newPostData
    });
  },

  onCollectionTap: function(event) {
    var postId = event.currentTarget.dataset.postId;
    this._postService.toggleCollection(postId);
    var newPostData = this._postService.getPostDetailsById(postId);

    this.setData({
      post: newPostData
    });

    wx.showToast({
      title: newPostData.collectionStatus ? "收藏成功" : "取消成功",
      duration: 1000,
      icon: "success",
      mask: true
    });
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function() {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function() {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function() {
    if (this.data.isPlayingMusic) {
      wx.stopBackgroundAudio();
    }
  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function() {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function() {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function() {

  }
})
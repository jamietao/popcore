package tech.yhao.popcore.model;

public class PostDetail extends Post {

	private String detail;
	private String backgroundMusicUrl;
	private String backgroundMusicTitle;
	private String backgroundMusicCoverImage;

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getBackgroundMusicUrl() {
		return backgroundMusicUrl;
	}

	public void setBackgroundMusicUrl(String backgroundMusicUrl) {
		this.backgroundMusicUrl = backgroundMusicUrl;
	}

	public String getBackgroundMusicTitle() {
		return backgroundMusicTitle;
	}

	public void setBackgroundMusicTitle(String backgroundMusicTitle) {
		this.backgroundMusicTitle = backgroundMusicTitle;
	}

	public String getBackgroundMusicCoverImage() {
		return backgroundMusicCoverImage;
	}

	public void setBackgroundMusicCoverImage(String backgroundMusicCoverImage) {
		this.backgroundMusicCoverImage = backgroundMusicCoverImage;
	}
}

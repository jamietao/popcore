package tech.yhao.popcore.dao.entity;

public class PostDetail extends Post {
	private String detail;
	private String backgroundMusicUrl;
	private String backgroundMusicTitle;
	private String backgroundMusicCoverUrl;

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

	public String getBackgroundMusicCoverUrl() {
		return backgroundMusicCoverUrl;
	}

	public void setBackgroundMusicCoverUrl(String backgroundMusicCoverUrl) {
		this.backgroundMusicCoverUrl = backgroundMusicCoverUrl;
	}
}

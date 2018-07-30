package tech.yhao.popcore.model;

public class PostCommentAudio {
	private Integer id;
	private String audioUrl;
	private Integer durationSeconds;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAudioUrl() {
		return audioUrl;
	}

	public void setAudioUrl(String audioUrl) {
		this.audioUrl = audioUrl;
	}

	public Integer getDurationSeconds() {
		return durationSeconds;
	}

	public void setDurationSeconds(Integer durationSeconds) {
		this.durationSeconds = durationSeconds;
	}
}

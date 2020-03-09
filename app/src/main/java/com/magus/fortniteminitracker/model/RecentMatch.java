
package com.magus.fortniteminitracker.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecentMatch {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("accountId")
    @Expose
    private String accountId;
    @SerializedName("playlist")
    @Expose
    private String playlist;
    @SerializedName("kills")
    @Expose
    private Integer kills;
    @SerializedName("minutesPlayed")
    @Expose
    private Integer minutesPlayed;
    @SerializedName("top1")
    @Expose
    private Integer top1;
    @SerializedName("top5")
    @Expose
    private Integer top5;
    @SerializedName("top6")
    @Expose
    private Integer top6;
    @SerializedName("top10")
    @Expose
    private Integer top10;
    @SerializedName("top12")
    @Expose
    private Integer top12;
    @SerializedName("top25")
    @Expose
    private Integer top25;
    @SerializedName("matches")
    @Expose
    private Integer matches;
    @SerializedName("top3")
    @Expose
    private Integer top3;
    @SerializedName("dateCollected")
    @Expose
    private String dateCollected;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("platform")
    @Expose
    private Integer platform;
    @SerializedName("trnRating")
    @Expose
    private Double trnRating;
    @SerializedName("trnRatingChange")
    @Expose
    private Double trnRatingChange;
    @SerializedName("playlistId")
    @Expose
    private Integer playlistId;
    @SerializedName("playersOutlived")
    @Expose
    private Integer playersOutlived;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public Integer getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(Integer minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public Integer getTop1() {
        return top1;
    }

    public void setTop1(Integer top1) {
        this.top1 = top1;
    }

    public Integer getTop5() {
        return top5;
    }

    public void setTop5(Integer top5) {
        this.top5 = top5;
    }

    public Integer getTop6() {
        return top6;
    }

    public void setTop6(Integer top6) {
        this.top6 = top6;
    }

    public Integer getTop10() {
        return top10;
    }

    public void setTop10(Integer top10) {
        this.top10 = top10;
    }

    public Integer getTop12() {
        return top12;
    }

    public void setTop12(Integer top12) {
        this.top12 = top12;
    }

    public Integer getTop25() {
        return top25;
    }

    public void setTop25(Integer top25) {
        this.top25 = top25;
    }

    public Integer getMatches() {
        return matches;
    }

    public void setMatches(Integer matches) {
        this.matches = matches;
    }

    public Integer getTop3() {
        return top3;
    }

    public void setTop3(Integer top3) {
        this.top3 = top3;
    }

    public String getDateCollected() {
        return dateCollected;
    }

    public void setDateCollected(String dateCollected) {
        this.dateCollected = dateCollected;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Double getTrnRating() {
        return trnRating;
    }

    public void setTrnRating(Double trnRating) {
        this.trnRating = trnRating;
    }

    public Double getTrnRatingChange() {
        return trnRatingChange;
    }

    public void setTrnRatingChange(Double trnRatingChange) {
        this.trnRatingChange = trnRatingChange;
    }

    public Integer getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Integer playlistId) {
        this.playlistId = playlistId;
    }

    public Integer getPlayersOutlived() {
        return playersOutlived;
    }

    public void setPlayersOutlived(Integer playersOutlived) {
        this.playersOutlived = playersOutlived;
    }

}


package com.magus.fortniteminitracker.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseFindUser {

    @SerializedName("accountId")
    @Expose
    private String accountId;
    @SerializedName("platformId")
    @Expose
    private Integer platformId;
    @SerializedName("platformName")
    @Expose
    private String platformName;
    @SerializedName("platformNameLong")
    @Expose
    private String platformNameLong;
    @SerializedName("epicUserHandle")
    @Expose
    private String epicUserHandle;
    @SerializedName("stats")
    @Expose
    private Stats stats;
    @SerializedName("lifeTimeStats")
    @Expose
    private List<LifeTimeStat> lifeTimeStats = null;
    @SerializedName("recentMatches")
    @Expose
    private List<RecentMatch> recentMatches = null;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Integer getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformNameLong() {
        return platformNameLong;
    }

    public void setPlatformNameLong(String platformNameLong) {
        this.platformNameLong = platformNameLong;
    }

    public String getEpicUserHandle() {
        return epicUserHandle;
    }

    public void setEpicUserHandle(String epicUserHandle) {
        this.epicUserHandle = epicUserHandle;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public List<LifeTimeStat> getLifeTimeStats() {
        return lifeTimeStats;
    }

    public void setLifeTimeStats(List<LifeTimeStat> lifeTimeStats) {
        this.lifeTimeStats = lifeTimeStats;
    }

    public List<RecentMatch> getRecentMatches() {
        return recentMatches;
    }

    public void setRecentMatches(List<RecentMatch> recentMatches) {
        this.recentMatches = recentMatches;
    }

}

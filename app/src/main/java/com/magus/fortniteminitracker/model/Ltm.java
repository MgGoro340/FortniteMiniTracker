
package com.magus.fortniteminitracker.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ltm {

    @SerializedName("score")
    @Expose
    private Score___ score;
    @SerializedName("top1")
    @Expose
    private Top1___ top1;
    @SerializedName("top3")
    @Expose
    private Top3___ top3;
    @SerializedName("top5")
    @Expose
    private Top5___ top5;
    @SerializedName("top6")
    @Expose
    private Top6___ top6;
    @SerializedName("top10")
    @Expose
    private Top10___ top10;
    @SerializedName("top12")
    @Expose
    private Top12___ top12;
    @SerializedName("top25")
    @Expose
    private Top25___ top25;
    @SerializedName("kd")
    @Expose
    private Kd___ kd;
    @SerializedName("winRatio")
    @Expose
    private WinRatio___ winRatio;
    @SerializedName("matches")
    @Expose
    private Matches___ matches;
    @SerializedName("kills")
    @Expose
    private Kills___ kills;
    @SerializedName("minutesPlayed")
    @Expose
    private MinutesPlayed___ minutesPlayed;
    @SerializedName("kpm")
    @Expose
    private Kpm___ kpm;
    @SerializedName("kpg")
    @Expose
    private Kpg___ kpg;
    @SerializedName("avgTimePlayed")
    @Expose
    private AvgTimePlayed___ avgTimePlayed;
    @SerializedName("scorePerMatch")
    @Expose
    private ScorePerMatch___ scorePerMatch;
    @SerializedName("scorePerMin")
    @Expose
    private ScorePerMin___ scorePerMin;

    public Score___ getScore() {
        return score;
    }

    public void setScore(Score___ score) {
        this.score = score;
    }

    public Top1___ getTop1() {
        return top1;
    }

    public void setTop1(Top1___ top1) {
        this.top1 = top1;
    }

    public Top3___ getTop3() {
        return top3;
    }

    public void setTop3(Top3___ top3) {
        this.top3 = top3;
    }

    public Top5___ getTop5() {
        return top5;
    }

    public void setTop5(Top5___ top5) {
        this.top5 = top5;
    }

    public Top6___ getTop6() {
        return top6;
    }

    public void setTop6(Top6___ top6) {
        this.top6 = top6;
    }

    public Top10___ getTop10() {
        return top10;
    }

    public void setTop10(Top10___ top10) {
        this.top10 = top10;
    }

    public Top12___ getTop12() {
        return top12;
    }

    public void setTop12(Top12___ top12) {
        this.top12 = top12;
    }

    public Top25___ getTop25() {
        return top25;
    }

    public void setTop25(Top25___ top25) {
        this.top25 = top25;
    }

    public Kd___ getKd() {
        return kd;
    }

    public void setKd(Kd___ kd) {
        this.kd = kd;
    }

    public WinRatio___ getWinRatio() {
        return winRatio;
    }

    public void setWinRatio(WinRatio___ winRatio) {
        this.winRatio = winRatio;
    }

    public Matches___ getMatches() {
        return matches;
    }

    public void setMatches(Matches___ matches) {
        this.matches = matches;
    }

    public Kills___ getKills() {
        return kills;
    }

    public void setKills(Kills___ kills) {
        this.kills = kills;
    }

    public MinutesPlayed___ getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(MinutesPlayed___ minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public Kpm___ getKpm() {
        return kpm;
    }

    public void setKpm(Kpm___ kpm) {
        this.kpm = kpm;
    }

    public Kpg___ getKpg() {
        return kpg;
    }

    public void setKpg(Kpg___ kpg) {
        this.kpg = kpg;
    }

    public AvgTimePlayed___ getAvgTimePlayed() {
        return avgTimePlayed;
    }

    public void setAvgTimePlayed(AvgTimePlayed___ avgTimePlayed) {
        this.avgTimePlayed = avgTimePlayed;
    }

    public ScorePerMatch___ getScorePerMatch() {
        return scorePerMatch;
    }

    public void setScorePerMatch(ScorePerMatch___ scorePerMatch) {
        this.scorePerMatch = scorePerMatch;
    }

    public ScorePerMin___ getScorePerMin() {
        return scorePerMin;
    }

    public void setScorePerMin(ScorePerMin___ scorePerMin) {
        this.scorePerMin = scorePerMin;
    }

}

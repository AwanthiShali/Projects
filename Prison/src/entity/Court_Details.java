package entity;

public class Court_Details {
    private String CoID;
    private String cid;
    private String pid;
    private String punishment;
    private String punished_day;
    private String nextCo_day;
    private String Co_time;

    public Court_Details() {
    }

    public Court_Details(String coID, String cid, String pid, String punishment, String punished_day, String nextCo_day, String co_time) {
        CoID = coID;
        this.cid = cid;
        this.pid = pid;
        this.punishment = punishment;
        this.punished_day = punished_day;
        this.nextCo_day = nextCo_day;
        Co_time = co_time;
    }

    public String getCoID() {
        return CoID;
    }

    public void setCoID(String coID) {
        CoID = coID;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPunishment() {
        return punishment;
    }

    public void setPunishment(String punishment) {
        this.punishment = punishment;
    }

    public String getPunished_day() {
        return punished_day;
    }

    public void setPunished_day(String punished_day) {
        this.punished_day = punished_day;
    }

    public String getNextCo_day() {
        return nextCo_day;
    }

    public void setNextCo_day(String nextCo_day) {
        this.nextCo_day = nextCo_day;
    }

    public String getCo_time() {
        return Co_time;
    }

    public void setCo_time(String co_time) {
        Co_time = co_time;
    }
}

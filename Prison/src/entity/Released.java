package entity;

import java.util.Date;

public class Released {
    private String rid;
    private String pid;
    private String released_date;

    public Released() {
    }

    public Released(String rid, String pid, String released_date) {
        this.rid = rid;
        this.pid = pid;
        this.released_date = released_date;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getReleased_date() {
        return released_date;
    }

    public void setReleased_date(String released_date) {
        this.released_date = released_date;
    }
}

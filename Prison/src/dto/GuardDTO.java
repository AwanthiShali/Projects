package dto;

import java.util.Date;

public class GuardDTO {
    private String gid;
    private String date;
    private String sid;
    private String guard_name;
    private String shift;

    public GuardDTO() {
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getGuard_name() {
        return guard_name;
    }

    public void setGuard_name(String guard_name) {
        this.guard_name = guard_name;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public GuardDTO(String gid, String date, String sid, String guard_name, String shift) {
        this.gid = gid;
        this.date = date;
        this.sid = sid;
        this.guard_name = guard_name;
        this.shift = shift;
    }
}

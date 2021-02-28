package dto;

import java.util.Date;

public class Treatment_DetailDTO {
    private int tdID;
    private String tid;
    private String pid;
    private String date;
    private String progress;

    public Treatment_DetailDTO() {
    }

    public Treatment_DetailDTO(int tdID, String tid, String pid, String date, String progress) {
        this.tdID = tdID;
        this.tid = tid;
        this.pid = pid;
        this.date = date;
        this.progress = progress;
    }

    public int getTdID() {
        return tdID;
    }

    public void setTdID(int tdID) {
        this.tdID = tdID;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
}

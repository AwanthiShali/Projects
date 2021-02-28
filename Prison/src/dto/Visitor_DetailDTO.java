package dto;

import java.util.Date;

public class Visitor_DetailDTO {
    private int vdID;
    private String vid;
    private String pid;
    private String date;
    private String arrival;
    private String depature;

    public Visitor_DetailDTO() {
    }

    public Visitor_DetailDTO(int vdID, String vid, String pid, String date, String arrival, String depature) {
        this.vdID = vdID;
        this.vid = vid;
        this.pid = pid;
        this.date = date;
        this.arrival = arrival;
        this.depature = depature;
    }

    public int getVdID() {
        return vdID;
    }

    public void setVdID(int vdID) {
        this.vdID = vdID;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
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

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDepature() {
        return depature;
    }

    public void setDepature(String depature) {
        this.depature = depature;
    }
}

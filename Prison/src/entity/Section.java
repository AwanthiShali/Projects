package entity;

import java.sql.Date;

public class Section {
    private String sid;
    private String section_name;

    public Section() {
    }

    public Section(String sid, String section_name) {
        this.setSid(sid);
        this.setSection_name(section_name);
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSection_name() {
        return section_name;
    }

    public void setSection_name(String section_name) {
        this.section_name = section_name;
    }
}

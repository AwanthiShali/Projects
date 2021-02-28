package entity;

import java.util.Date;

public class Prisoner {
    private String pid;
    private String sid;
    private String surname;
    private String name;
    private String dob;
    private int age;
    private String relative_name;
    private String relationship;

    public Prisoner() {
    }

    public Prisoner(String pid, String sid, String surname, String name, String dob, int age, String relative_name, String relationship) {
        this.pid = pid;
        this.sid = sid;
        this.surname = surname;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.relative_name = relative_name;
        this.relationship = relationship;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRelative_name() {
        return relative_name;
    }

    public void setRelative_name(String relative_name) {
        this.relative_name = relative_name;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}

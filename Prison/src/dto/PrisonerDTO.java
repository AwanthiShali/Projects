package dto;

import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Date;

public class PrisonerDTO {
    private String pid;
    private String sid;
    private String surname;
    private String name;
    private String dob;
    private int age;
    private String relative_name;
    private String relationship;
    private ArrayList<CourtDetailsDTO> allCourtDetails;
    private ObservableList<CourtDetailsDTO>allCourt_Details;

    public PrisonerDTO() {
    }

    public PrisonerDTO(String pid, String sid, String surname, String name, String dob, int age, String relative_name, String relationship, ObservableList<CourtDetailsDTO> allCourt_Details) {
        this.pid = pid;
        this.sid = sid;
        this.surname = surname;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.relative_name = relative_name;
        this.relationship = relationship;
        this.allCourt_Details = allCourt_Details;
    }

    public PrisonerDTO(String pid, String sid, String surname, String name, String dob, int age, String relative_name, String relationship, ArrayList<CourtDetailsDTO> allCourtDetails) {
        this.pid = pid;
        this.sid = sid;
        this.surname = surname;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.relative_name = relative_name;
        this.relationship = relationship;
        this.allCourtDetails = allCourtDetails;
    }

    public ObservableList<CourtDetailsDTO> getAllCourt_Details() {
        return allCourt_Details;
    }

    public void setAllCourt_Details(ObservableList<CourtDetailsDTO> allCourt_Details) {
        this.allCourt_Details = allCourt_Details;
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

    public ArrayList<CourtDetailsDTO> getAllCourtDetails() {
        return allCourtDetails;
    }

    public void setAllCourtDetails(ArrayList<CourtDetailsDTO> allCourtDetails) {
        this.allCourtDetails = allCourtDetails;
    }
}

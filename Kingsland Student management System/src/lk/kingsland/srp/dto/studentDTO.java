package lk.kingsland.srp.dto;

public class studentDTO {
    private String studentID;
    private String studentName;
    private String address;
    private String contact;
    private String dob;
    private String gender;

    public studentDTO() {
    }

    public studentDTO(String studentID, String studentName, String address, String contact, String dob, String gender) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.address = address;
        this.contact = contact;
        this.dob = dob;
        this.gender = gender;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

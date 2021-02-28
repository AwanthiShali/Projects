package lk.kingsland.srp.entity;

public class CustomEntity {
    private String codeID;
    private String courseName;
    private String duration;
    private int registrationFee;
    private String intake;

    private String studentID;
    private String studentName;
    private String address ;
    private String contact ;
    private String dob ;
    private String gender;

    private int regNo;
    private String regDate;
    private double regFee;

    public CustomEntity(String codeID, String courseName, String duration, int registrationFee, String intake) {
        this.codeID = codeID;
        this.courseName = courseName;
        this.duration = duration;
        this.registrationFee = registrationFee;
        this.intake = intake;
    }

    public CustomEntity(String studentID, String studentName, String address, String contact, String dob, String gender) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.address = address;
        this.contact = contact;
        this.dob = dob;
        this.gender = gender;
    }

    public String getCodeID() {
        return codeID;
    }

    public void setCodeID(String codeID) {
        this.codeID = codeID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(int registrationFee) {
        this.registrationFee = registrationFee;
    }

    public String getIntake() {
        return intake;
    }

    public void setIntake(String intake) {
        this.intake = intake;
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

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public double getRegFee() {
        return regFee;
    }

    public void setRegFee(double regFee) {
        this.regFee = regFee;
    }
}

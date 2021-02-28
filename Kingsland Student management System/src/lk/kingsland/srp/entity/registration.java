package lk.kingsland.srp.entity;

public class registration {
    private int regNo;
    private String regDate;
    private double regFee;
    private String studentID;
    private String codeID;


    public registration() {
    }

    public registration(int regNo, String regDate, double regFee, String studentID, String codeID) {
        this.regNo = regNo;
        this.regDate = regDate;
        this.regFee = regFee;
        this.studentID = studentID;
        this.codeID = codeID;
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

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCodeID() {
        return codeID;
    }

    public void setCodeID(String codeID) {
        this.codeID = codeID;
    }
}

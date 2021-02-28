package lk.kingsland.srp.dto;

public class courseDTO {
    private String codeID;
    private String courseName;
    private String duration;
    private double registrationFee;
    private String intake;

    public courseDTO() {
    }

    public courseDTO(String codeID, String courseName, String duration, double registrationFee, String intake) {
        this.codeID = codeID;
        this.courseName = courseName;
        this.duration = duration;
        this.registrationFee = registrationFee;
        this.intake = intake;
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

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    public String getIntake() {
        return intake;
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }
}

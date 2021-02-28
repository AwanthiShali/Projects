package entity;

public class Treatment {
    private String tid;
    private String did;
    private String treatment;
    private String doctor_name;

    public Treatment() {
    }

    public Treatment(String tid, String did, String treatment, String doctor_name) {
        this.tid = tid;
        this.did = did;
        this.treatment = treatment;
        this.doctor_name = doctor_name;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }
}

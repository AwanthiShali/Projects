package entity;

public class Doctor {
    private String did;
    private String doctor_name;
    private String hospital;
    private String contact;

    public Doctor() {
    }

    public Doctor(String did, String doctor_name, String hospital, String contact) {
        this.setDid(did);
        this.setDoctor_name(doctor_name);
        this.setHospital(hospital);
        this.setContact(contact);
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}

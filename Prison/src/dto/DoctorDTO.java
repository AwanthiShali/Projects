package dto;

public class DoctorDTO {
    private String did;
    private String doctor_name;
    private String hospital;
    private String contact;

    public DoctorDTO() {
    }

    public DoctorDTO(String did, String doctor_name, String hospital, String contact) {
        this.did = did;
        this.doctor_name = doctor_name;
        this.hospital = hospital;
        this.contact = contact;
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

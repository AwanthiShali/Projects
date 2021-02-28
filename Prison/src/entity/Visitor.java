package entity;

public class Visitor {
    private String vid;
    private String name;
    private String contact;
    private String address;
    private String city;

    public Visitor() {
    }

    public Visitor(String vid, String name, String contact, String address, String city) {
        this.vid = vid;
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.city = city;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

package dto;

public class CrimeDTO {
    private String cid;
    private String category;

    public CrimeDTO(String cid, String category) {
        this.setCid(cid);
        this.setCategory(category);
    }

    public CrimeDTO() {
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

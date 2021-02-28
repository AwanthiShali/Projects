package entity;

public class Crime {
    private String cid;
    private String category;

    public Crime() {
    }

    public Crime(String cid, String category) {
        this.setCid(cid);
        this.setCategory(category);
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
        this.category =category;
    }
}

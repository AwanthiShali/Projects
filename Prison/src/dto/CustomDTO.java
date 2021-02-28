package dto;

public class CustomDTO {
    private String pid;
    private String name;
    private String coDetailId;
    private String nextCourtDate;
    private String nextCourtTime;

    public CustomDTO() {
    }

    public CustomDTO(String pid, String name, String coDetailId, String nextCourtDate, String nextCourtTime) {
        this.pid = pid;
        this.name = name;
        this.coDetailId = coDetailId;
        this.nextCourtDate = nextCourtDate;
        this.nextCourtTime = nextCourtTime;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoDetailId() {
        return coDetailId;
    }

    public void setCoDetailId(String coDetailId) {
        this.coDetailId = coDetailId;
    }

    public String getNextCourtDate() {
        return nextCourtDate;
    }

    public void setNextCourtDate(String nextCourtDate) {
        this.nextCourtDate = nextCourtDate;
    }

    public String getNextCourtTime() {
        return nextCourtTime;
    }

    public void setNextCourtTime(String nextCourtTime) {
        this.nextCourtTime = nextCourtTime;
    }
}

package dto;

import javafx.collections.ObservableList;

public class SectionDTO {
    private String sid;
    private String section_name;
    private ObservableList<SectionDTO> sectionName;

    public SectionDTO(String sid, String section_name, ObservableList<SectionDTO> sectionName) {
        this.sid = sid;
        this.section_name = section_name;
        this.sectionName = sectionName;
    }

    public SectionDTO() {
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSection_name() {
        return section_name;
    }

    public void setSection_name(String section_name) {
        this.section_name = section_name;
    }

    public ObservableList<SectionDTO> getSectionName() {
        return sectionName;
    }

    public void setSectionName(ObservableList<SectionDTO> sectionName) {
        this.sectionName = sectionName;
    }
}

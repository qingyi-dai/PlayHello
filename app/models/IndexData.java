package models;

import org.springframework.ui.Model;

/**
 * Created by daiqingyi on 2017/2/13.
 */
//@Entity
public class IndexData{
//    @Id
    private int infoId;
    private String infoContent;
    private String infoType;

    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }

    public void setInfoContent(String infoContent) {
        this.infoContent = infoContent;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    public int getInfoId() {
        return infoId;
    }

    public String getInfoContent() {
        return infoContent;
    }

    public String getInfoType() {
        return infoType;
    }


}

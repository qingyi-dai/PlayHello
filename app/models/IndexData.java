package models;

import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.*;

/**
 * Created by daiqingyi on 2017/2/13.
 */
@Entity
public class IndexData extends Model{
    @Id
    private int infoId;
    @Column(nullable = false)
    private int userId;
    private String infoContent;
    private String infoType;
    private Date createDate;

    public IndexData() {
    }

    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setInfoContent(String infoContent) {
        this.infoContent = infoContent;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



    public int getInfoId() {
        return infoId;
    }

    public int getUserId() {
        return userId;
    }

    public String getInfoContent() {
        return infoContent;
    }

    public String getInfoType() {
        return infoType;
    }

    public Date getCreateDate() {
        return createDate;
    }

}

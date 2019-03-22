package movie.app.taskone.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Categories {

    // Categories class for store categories properties by retrofit callback to class states
    // Serialized for store data json response callback to fields
    @SerializedName("Id")
    private String Id;

    @SerializedName("TitleEN")
    private String TitleEN;

    @SerializedName("TitleAR")
    private String TitleAR;

    @SerializedName("Photo")
    private String Photo;

    @SerializedName("ProductCount")
    private String ProductCount;

    @SerializedName("HaveModel")
    private String HaveModel;

    @SerializedName("SubCategories")
    private ArrayList<Categories> SubCategories;

    public Categories(String ID, String TITLE_EN, String TITLE_AR, String PHOTO, String PRODUCT_COUNT, String HAVEMODEL, ArrayList<Categories> SUB_CAT) {

        this.Id = ID;
        this.TitleEN = TITLE_EN;
        this.TitleAR = TITLE_AR;
        this.Photo = PHOTO;
        this.ProductCount = PRODUCT_COUNT;
        this.HaveModel = HAVEMODEL;
        this.SubCategories = SUB_CAT;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getTitleEN() {
        return TitleEN;
    }

    public void setTitleEN(String titleEN) {
        this.TitleEN = titleEN;
    }

    public String getTitleAR() {
        return TitleAR;
    }

    public void setTitleAR(String titleAR) {
        this.TitleAR = titleAR;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        this.Photo = photo;
    }

    public String getProductCount() {
        return ProductCount;
    }

    public void setProductCount(String productCount) {
        this.ProductCount = productCount;
    }

    public void setHaveModel(String haveModel) {
        this.HaveModel = haveModel;
    }

    public String getHaveModel() {
        return HaveModel;
    }

    public void setSubCategories(ArrayList<Categories> subCategories) {
        this.SubCategories = subCategories;
    }

    public List<Categories> getSubCategories() {
        return SubCategories;
    }

}

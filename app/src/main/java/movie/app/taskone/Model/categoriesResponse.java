package movie.app.taskone.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class categoriesResponse {

// Categoriesresponse class for sync callback json respone for every list in json response
    ArrayList<Categories> category;

    public ArrayList<Categories> getCategory() {
        return category;
    }

   /*
   private Categories[] cupon;

    public Categories[] getCupon() {
        return cupon;
    }
    */
}

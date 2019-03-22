package movie.app.taskone.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class categoriesResponse {


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

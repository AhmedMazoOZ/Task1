package movie.app.taskone.ViewModel;

import movie.app.taskone.Model.Categories;
import movie.app.taskone.Model.categoriesResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface  CategoryApiService {
// Sending Http_request to callback the json response by GET annotation
    @GET("app.asmx/GetCategories")
    Call<categoriesResponse> GetCategories(@Query("categoryId") String categoryId, @Query("countryId") String countryId);

}


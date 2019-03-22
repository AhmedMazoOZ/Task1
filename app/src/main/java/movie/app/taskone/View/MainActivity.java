package movie.app.taskone.View;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import movie.app.taskone.Model.Categories;
import movie.app.taskone.Model.categoriesResponse;
import movie.app.taskone.R;
import movie.app.taskone.ViewModel.CategoriesAdapter;
import movie.app.taskone.ViewModel.CategoryApiService;
import movie.app.taskone.ViewModel.RetrofitInstance;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private CategoriesAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Categories> dataArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view_notice_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CategoryApiService service = RetrofitInstance.getRetrofitInstance().create(CategoryApiService.class);
        Log.d("URLCalled1", "Ahmed");
        Call<categoriesResponse> call = service.GetCategories("0", "1");
        Log.d("URLCalled", call.request().url() + "");

        call.enqueue(new Callback<categoriesResponse>() {
            @Override
            public void onResponse(Call<categoriesResponse> GetCategories, Response<categoriesResponse> response) {

                dataArrayList = response.body().getCategory();

                int sz=dataArrayList.size();
                Log.d("Res",String.valueOf(sz));

                GenerateCateggoryList(dataArrayList);

            }

            @Override
            public void onFailure(Call<categoriesResponse> call, Throwable t) {
                Log.d("Errorrrrrrrrrrrrrrr", t.toString());
            }

        });
    }
    private void GenerateCateggoryList(ArrayList<Categories> categoriesArrayList) {
        recyclerView = findViewById(R.id.recycler_view_notice_list);
        adapter = new CategoriesAdapter(categoriesArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}

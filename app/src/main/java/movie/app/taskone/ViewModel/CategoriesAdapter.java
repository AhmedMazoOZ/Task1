package movie.app.taskone.ViewModel;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import movie.app.taskone.Model.Categories;
import movie.app.taskone.R;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder> {
    private ArrayList<Categories> dataList;

    public CategoriesAdapter(ArrayList<Categories> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public CategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.single_cell, viewGroup, false);
        return new CategoriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesAdapter.CategoriesViewHolder categoriesViewHolder, int i) {
        categoriesViewHolder.txtCategoryTitle.setText(dataList.get(i).getTitleAR());
        categoriesViewHolder.txtCategoryamount.setText(dataList.get(i).getProductCount());
        //categoriesViewHolder.linearLayout.setBackground();

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class CategoriesViewHolder extends RecyclerView.ViewHolder {
        TextView txtCategoryTitle, txtCategoryamount;
        LinearLayout linearLayout;

        CategoriesViewHolder(View itemView) {
            super(itemView);
            txtCategoryTitle = itemView.findViewById(R.id.txt_category_title);
            txtCategoryamount = itemView.findViewById(R.id.txt_category_amount);
            linearLayout=itemView.findViewById(R.id.licontainer);
        }
    }
}

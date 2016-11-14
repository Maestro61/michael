package com.example.user.sebbia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.user.sebbia.model.CategoriesList;
import com.example.user.sebbia.model.Category;
import com.example.user.sebbia.model.News;
import com.example.user.sebbia.model.NewsList;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"fsdf");


        CategoriesList.INSTANCE.addOnUpdateListener(new CategoriesList.OnUpdateListener() {
            @Override
            public void onUpdateComplete() {
                Log.d(MainActivity.class.getSimpleName(), "Update compelte");
                List<Category> list = CategoriesList.INSTANCE.getCategories();
                for (Category category : list) {
                    Log.d(MainActivity.class.getSimpleName(), "Category: " + category.getId() + " " + category.getName());
                }
            }

            @Override
            public void onUpdateFailed() {
                Log.d(MainActivity.class.getSimpleName(), "Update failed");
            }
        });
        CategoriesList.INSTANCE.updateCategories();

        NewsList.INSTANCE.addOnUpdateListener(new NewsList.OnUpdateListener() {
            @Override
            public void onUpdateComplete() {
                Log.d(MainActivity.class.getSimpleName(), "Update complete");
                List<News> list1 = NewsList.INSTANCE.getNewses();
                for (News news : list1) {
                    Log.d(MainActivity.class.getSimpleName(), "News :" + news.getId() + " " + news.getTitle() + news.getDate() + news.getShortDesc());

                }


            }

            @Override
            public void onUpdateFailed() {
                Log.d(MainActivity.class.getSimpleName(), "Update failed");
            }

        });

        NewsList.INSTANCE.updateNews();


    }
}
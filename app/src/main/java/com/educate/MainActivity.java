package com.educate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mainRecyclerView;

    SearchView searchView;
    MainAdapter mainAdapter;
    ArrayList<BasicModel> basicModels;
    Toolbar toolbar;
    SampleData sampleData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialiseObjects();
        initialiseIds();
        initialiseData();
        initialiseRecyclerView(basicModels);

    }
    private void initialiseObjects()
    {
        sampleData = new SampleData(this);
    }

    private void initialiseData()
    {
        basicModels = sampleData.getHomePageData();
    }

    private void initialiseRecyclerView(ArrayList<BasicModel> basicModels)
    {
        mainAdapter = new MainAdapter(basicModels,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mainRecyclerView.setLayoutManager(linearLayoutManager);
        mainRecyclerView.setAdapter(null);
        mainRecyclerView.setAdapter(mainAdapter);
    }
    private void initialiseIds()
    {
        mainRecyclerView = (RecyclerView) findViewById(R.id.main_recyclerview);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate( R.menu.search_menu, menu);

        MenuItem home = menu.findItem(R.id.home);
        home.setVisible(false);

        MenuItem settings = menu.findItem(R.id.settings);
        settings.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                SampleData.showInfoDialog(MainActivity.this);
                return false;
            }
        });

        final MenuItem myActionMenuItem = menu.findItem( R.id.action_search);
        searchView = (SearchView) myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Toast like print
                if( ! searchView.isIconified()) {
                    searchView.setIconified(true);
                }
                myActionMenuItem.collapseActionView();
                return false;
            }
            @Override
            public boolean onQueryTextChange(String s) {
                // UserFeedback.show( "SearchOnQueryTextChanged: " + s);

                searchRecyclerview(s);
                return false;
            }
        });
        return true;

    }

    private void searchRecyclerview(String s)
    {
        if(s!=null&& s.length()>0) {
         ArrayList<BasicModel> newList = new ArrayList<>();
            ArrayList<BasicModel> basicModels = sampleData.getHomePageData();
            if (basicModels != null && basicModels.size() > 0) {
                for (int i = 0; i < basicModels.size(); i++) {
                    BasicModel basicModel = basicModels.get(i);
                    if (basicModel.text.toLowerCase().trim().contains(s.toLowerCase())) {
                        newList.add(basicModel);
                    }
                }
                initialiseRecyclerView(newList);
            }
        }
        else
        {
            initialiseRecyclerView(basicModels);
        }
    }

}

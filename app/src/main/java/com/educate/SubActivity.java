package com.educate;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class SubActivity extends AppCompatActivity {


    RecyclerView mainRecyclerView;

    SearchView searchView;
    SubAdapter subAdapter;
    ArrayList<BasicModel> basicModels = new ArrayList<>();
    Toolbar toolbar;
    SampleData sampleData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        initialiseObjects();
        initialiseIds();
        initialiseData();
        initialiseRecyclerView(basicModels);
        initialiseBackButton();
    }


    private void initialiseBackButton()
    {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final Drawable upArrow = getResources().getDrawable(R.drawable.back);
        upArrow.setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);


    }
    private void initialiseObjects()
    {
        sampleData = new SampleData(this);
    }

    private void initialiseData()
    {
        try {

            if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.after_graduation))) {
                basicModels = sampleData.afterGraduationData();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.after_post_graduation))) {
                basicModels = sampleData.afterPostGraduation();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.top_colleges))) {
                basicModels = sampleData.getTopColleges();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.after_x))) {
                basicModels = sampleData.afterSSC();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.after_intermediate))) {
                basicModels = sampleData.afterIntermediate();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.top_universities))) {
                basicModels = sampleData.topUniversities();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.competitive_exams))) {
                basicModels = sampleData.entranceExams();
            }
        }catch (Exception e)
        {
            e.printStackTrace();

        }
    }

    private void initialiseRecyclerView(ArrayList<BasicModel> basicModels)
    {
        subAdapter = new SubAdapter(basicModels,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mainRecyclerView.setLayoutManager(linearLayoutManager);
        mainRecyclerView.setAdapter(null);
        mainRecyclerView.setAdapter(subAdapter);
    }
    private void initialiseIds()
    {
        mainRecyclerView = (RecyclerView) findViewById(R.id.sub_recyclerview);
        toolbar = (Toolbar) findViewById(R.id.sub_toolbar);
        setSupportActionBar(toolbar);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home)
        {
      /*      Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
      */
        finish();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate( R.menu.search_menu, menu);

        MenuItem settings = menu.findItem(R.id.settings);
        settings.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                BottomSheetDialogFragment bottomSheetDialogFragment = new BottomSheetFragment();
                bottomSheetDialogFragment.show(getSupportFragmentManager(), bottomSheetDialogFragment.getTag());
                return false;
            }
        });


        MenuItem home = menu.findItem(R.id.home);
        home.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent intent = new Intent(SubActivity.this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                                Intent.FLAG_ACTIVITY_CLEAR_TASK|
                Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
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
            ArrayList<BasicModel> basicModelsList = basicModels;
            if (basicModelsList != null && basicModelsList.size() > 0) {
                for (int i = 0; i < basicModelsList.size(); i++) {
                    BasicModel basicModel = basicModelsList.get(i);
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

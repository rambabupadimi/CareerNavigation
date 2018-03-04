package com.educate;

import android.content.Intent;
import android.graphics.Color;
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

public class SubTwoActivity extends AppCompatActivity {


    RecyclerView mainRecyclerView;

    SearchView searchView;
    SubTwoAdapter subTwoAdapter;
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
            if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.two_science))) {
                basicModels = sampleData.subTwoAfterScience();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.two_arts))) {
                basicModels = sampleData.subTwoAfterArts();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.two_commerce))) {
                basicModels = sampleData.subTwoAfterCommerce();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.two_technical))) {
                basicModels = sampleData.subTwoAfterTechnical();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.two_non_technical))) {
                basicModels = sampleData.subTwoAfterNonTechnical();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.two_animation_and_mulitmedia))) {
                basicModels = sampleData.subTwoAfterAnimationAndMultimedia();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.two_creative_and_working))) {
                basicModels = sampleData.subTwoAfterCreativeWorking();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.two_digital_marketing))) {
                basicModels = sampleData.subTwoAfterDigitalMarketing();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.two_seo))) {
                basicModels = sampleData.subTwoAfterSEO();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.two_graphic_designer_course))) {
                basicModels = sampleData.subTwoAfterGraphiDesignerCourses();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.two_webdesign_and_development_course))) {
                basicModels = sampleData.subTwoAfterWebDesignAndDevelopmentCourses();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.two_appdevelopment_and_design_course))) {
                basicModels = sampleData.subTwoAfterAppDevelopmentAndDesignCourses();
            } else if (getIntent().getStringExtra("from").equalsIgnoreCase(getString(R.string.two_programming_languages))) {
                basicModels = sampleData.subTwoAfterProgrammingLanguages();
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void initialiseRecyclerView(ArrayList<BasicModel> basicModels)
    {
        subTwoAdapter = new SubTwoAdapter(basicModels,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mainRecyclerView.setLayoutManager(linearLayoutManager);
        mainRecyclerView.setAdapter(null);
        mainRecyclerView.setAdapter(subTwoAdapter);
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
/*
            Intent intent = new Intent(this,MainActivity.class);
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
                Intent intent = new Intent(SubTwoActivity.this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                        Intent.FLAG_ACTIVITY_CLEAR_TASK|
                        Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                return false;
            }
        });


        final MenuItem myActionMenuItem = menu.findItem( R.id.action_search);
        searchView = (SearchView) myActionMenuItem.getActionView();
        SearchView.SearchAutoComplete searchAutoComplete =
                (SearchView.SearchAutoComplete)searchView.findViewById(android.support.v7.appcompat.R.id.search_src_text);
        searchAutoComplete.setHintTextColor(Color.parseColor("#ffffff"));
        searchAutoComplete.setTextColor(Color.parseColor("#ffffff"));


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Toast like print
                if( !searchView.isIconified()) {
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

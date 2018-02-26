package com.educate;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ramu on 04-02-2018.
 */

public class SampleData {

    Context context;
    public SampleData(Context context){
        this.context = context;
    }



    public static void showInfoDialog(final Context context) {
        try {
            final AlertDialog.Builder builder = new AlertDialog.Builder(context);
            final AlertDialog alertDialog = builder.create();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.dialog_layout, null);
            TextView exit = (TextView) view.findViewById(R.id.exit);
            TextView share = (TextView) view.findViewById(R.id.share);

            share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    shareTextUrl(context);
                }
            });
            exit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    alertDialog.dismiss();
                }
            });
            alertDialog.setView(view);
            alertDialog.show();
            alertDialog.setCancelable(false);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    private static void shareTextUrl(Context context) {
        Intent share = new Intent(android.content.Intent.ACTION_SEND);
        share.setType("text/plain");
        share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);

        // Add data to the intent, the receiving app will decide
        // what to do with it.
        share.putExtra(Intent.EXTRA_SUBJECT, "Title Of The Post");
        share.putExtra(Intent.EXTRA_TEXT, "http://www.codeofaninja.com");

        context.startActivity(Intent.createChooser(share, "Share link!"));
    }
    

    public   ArrayList<BasicModel> getHomePageData()
    {
        ArrayList<BasicModel> arrayList = new ArrayList<>();
        BasicModel basicModel1 = new BasicModel();
        basicModel1.text= context.getString(R.string.after_x);
        basicModel1.color ="#D1C4E9";
        basicModel1.drawable = context.getResources().getDrawable(R.drawable.after_ssc);
        BasicModel basicModel2 = new BasicModel();
        basicModel2.text= context.getString(R.string.after_intermediate);
        basicModel2.color="#B2DFDB";
        basicModel2.drawable = context.getResources().getDrawable(R.drawable.after_intermediate);

        BasicModel basicModel3 = new BasicModel();
        basicModel3.color="#C8E6C9";
        basicModel3.text= context.getString(R.string.after_graduation);
        basicModel3.drawable = context.getResources().getDrawable(R.drawable.graduation);

        BasicModel basicModel4 = new BasicModel();
        basicModel4.text= context.getString(R.string.after_post_graduation);
        basicModel4.color="#FFE0B2";
        basicModel4.drawable = context.getResources().getDrawable(R.drawable.post_graduation);

        BasicModel basicModel5 = new BasicModel();
        basicModel5.text= context.getString(R.string.top_colleges);
        basicModel5.color="#D7CCC8";
        basicModel5.drawable = context.getResources().getDrawable(R.drawable.top_colleges);

        BasicModel basicModel6 = new BasicModel();
        basicModel6.text= context.getString(R.string.top_universities);
        basicModel6.color="#CFD8DC";
        basicModel6.drawable = context.getResources().getDrawable(R.drawable.universities);

        BasicModel basicModel7 = new BasicModel();
        basicModel7.text= context.getString(R.string.competitive_exams);
        basicModel7.color="#CFD8DC";
        basicModel7.drawable = context.getResources().getDrawable(R.drawable.entrance_exams);


        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);
        arrayList.add(basicModel7);


        return arrayList;
    }

    public ArrayList<BasicModel> getTopColleges()
    {
        ArrayList<BasicModel> arrayList = new ArrayList<>();
        BasicModel basicModel1= new BasicModel();
        basicModel1.text = "Animation Institutes";
        basicModel1.drawable = context.getResources().getDrawable(R.drawable.animation_institutes);

        BasicModel basicModel2= new BasicModel();
        basicModel2.text="Architecture Colleges";
        basicModel2.drawable = context.getResources().getDrawable(R.drawable.architecture_colleges);

        BasicModel basicModel3= new BasicModel();
        basicModel3.text="Computer Institutes";
        basicModel3.drawable = context.getResources().getDrawable(R.drawable.computer_institutes);

        BasicModel basicModel4= new BasicModel();
        basicModel4.text="List Of Top Colleges For AGRICULTURAL";
        basicModel4.drawable = context.getResources().getDrawable(R.drawable.ltc_agriculture);

        BasicModel basicModel5= new BasicModel();
        basicModel5.text="List Of Top Colleges For ARTS";
        basicModel5.drawable = context.getResources().getDrawable(R.drawable.ltc_arts);

        BasicModel basicModel6= new BasicModel();
        basicModel6.text="List Of Top Colleges For BBA";
        basicModel6.drawable = context.getResources().getDrawable(R.drawable.ltc_bba);

        BasicModel basicModel7= new BasicModel();
        basicModel7.text="List Of Top Colleges For BCA";
        basicModel7.drawable = context.getResources().getDrawable(R.drawable.ltc_bca);

        BasicModel basicModel8= new BasicModel();
        basicModel8.text="List Of Top Colleges For BE  B-TECH";
        basicModel8.drawable = context.getResources().getDrawable(R.drawable.lrc_be_btech);

        BasicModel basicModel9= new BasicModel();
        basicModel9.text="List Of Top Colleges For BIO-TECHNOLOGY";
        basicModel9.drawable = context.getResources().getDrawable(R.drawable.ltc_biotechnology);

        BasicModel basicModel10= new BasicModel();
        basicModel10.text="List Of Top Colleges For COMMERCE";
        basicModel10.drawable = context.getResources().getDrawable(R.drawable.ltc_ecommerce);

        BasicModel basicModel11= new BasicModel();
        basicModel11.text="List Of Top Colleges For DENTAL";
        basicModel11.drawable = context.getResources().getDrawable(R.drawable.ltc_dental);

        BasicModel basicModel12= new BasicModel();
        basicModel12.text="List Of Top Colleges For FASHION TECHNOLOGY";
        basicModel12.drawable = context.getResources().getDrawable(R.drawable.ltc_fashion_technology);

        BasicModel basicModel13= new BasicModel();
        basicModel13.text="List Of Top Colleges For HOTEL MANAGEMENT";
        basicModel13.drawable = context.getResources().getDrawable(R.drawable.ltc_hotel_management);

        BasicModel basicModel14= new BasicModel();
        basicModel14.text="List Of Top Colleges For LAW";
        basicModel14.drawable = context.getResources().getDrawable(R.drawable.ltc_law);

        BasicModel basicModel15= new BasicModel();
        basicModel15.text="List Of Top Colleges For MASS COMMUNICATION";
        basicModel15.drawable = context.getResources().getDrawable(R.drawable.ltc_mass_communication);

        BasicModel basicModel16= new BasicModel();
        basicModel16.text="List Of Top Colleges For MBA";
        basicModel16.drawable = context.getResources().getDrawable(R.drawable.ltc_mba);

        BasicModel basicModel17= new BasicModel();
        basicModel17.text="List Of Top Colleges For MCA";
        basicModel17.drawable = context.getResources().getDrawable(R.drawable.ltc_mca);

        BasicModel basicModel18= new BasicModel();
        basicModel18.text="List Of Top Colleges For ME  M-TECH";
        basicModel18.drawable = context.getResources().getDrawable(R.drawable.ltc_mtech);

        BasicModel basicModel19= new BasicModel();
        basicModel19.text="List Of Top Colleges For MEDICAL";
        basicModel19.drawable = context.getResources().getDrawable(R.drawable.ltc_medical);

        BasicModel basicModel20= new BasicModel();
        basicModel20.text="List Of Top Colleges For PHARMACY";
        basicModel20.drawable = context.getResources().getDrawable(R.drawable.ltc_pharmacy);

        BasicModel basicModel21= new BasicModel();
        basicModel21.text="List Of Top Colleges For SCIENCE";
        basicModel21.drawable = context.getResources().getDrawable(R.drawable.ltc_science);

        BasicModel basicModel22= new BasicModel();
        basicModel22.text="Marchant Navy Institutes";
        basicModel22.drawable = context.getResources().getDrawable(R.drawable.marchant_navvy_institutes);

        BasicModel basicModel23= new BasicModel();
        basicModel23.text="Top_Colleges";
        basicModel23.drawable = context.getResources().getDrawable(R.drawable.top_colleges);

        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);
        arrayList.add(basicModel7);
        arrayList.add(basicModel8);
        arrayList.add(basicModel9);
        arrayList.add(basicModel10);
        arrayList.add(basicModel11);
        arrayList.add(basicModel12);
        arrayList.add(basicModel13);
        arrayList.add(basicModel14);
        arrayList.add(basicModel15);
        arrayList.add(basicModel16);
        arrayList.add(basicModel17);
        arrayList.add(basicModel18);
        arrayList.add(basicModel19);
        arrayList.add(basicModel20);
        arrayList.add(basicModel21);
        arrayList.add(basicModel22);
        arrayList.add(basicModel23);

        return arrayList;
    }


    public ArrayList<BasicModel> afterPostGraduation()
    {
        ArrayList<BasicModel> arrayList = new ArrayList<>();
        BasicModel basicModel1= new BasicModel();
        basicModel1.text="Ph.D. Specializations";
        basicModel1.drawable = context.getResources().getDrawable(R.drawable.ph_d_specializations);
        BasicModel basicModel2= new BasicModel();
        basicModel2.text="Ph.D. Universities & Courses";
        basicModel2.drawable = context.getResources().getDrawable(R.drawable.ph_universities_courses);
        BasicModel basicModel3= new BasicModel();
        basicModel3.text="Post Graduation";
        basicModel3.drawable = context.getResources().getDrawable(R.drawable.post_graduation);

        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);

        return arrayList;

    }


    public   ArrayList<BasicModel> afterGraduationData()
    {
        ArrayList<BasicModel> arrayList = new ArrayList<>();
        BasicModel basicModel1 = new BasicModel();
        basicModel1.text= "Post Graduation";
        basicModel1.color ="#D1C4E9";
        basicModel1.drawable = context.getResources().getDrawable(R.drawable.after_ssc);
        BasicModel basicModel2 = new BasicModel();
        basicModel2.text= "Banking Sector Jobs";
        basicModel2.color="#B2DFDB";
        basicModel2.drawable = context.getResources().getDrawable(R.drawable.after_intermediate);

        BasicModel basicModel3 = new BasicModel();
        basicModel3.color="#C8E6C9";
        basicModel3.text= "Defence";
        basicModel3.drawable = context.getResources().getDrawable(R.drawable.graduation);

        BasicModel basicModel4 = new BasicModel();
        basicModel4.text= "Geologists Exam (Conducted By UPSC)";
        basicModel4.color="#FFE0B2";
        basicModel4.drawable = context.getResources().getDrawable(R.drawable.post_graduation);

        BasicModel basicModel5 = new BasicModel();
        basicModel5.text= "Govt Jobs";
        basicModel5.color="#D7CCC8";
        basicModel5.drawable = context.getResources().getDrawable(R.drawable.top_colleges);

        BasicModel basicModel6 = new BasicModel();
        basicModel6.text= "Indian Engineering Service";
        basicModel6.color="#CFD8DC";
        basicModel6.drawable = context.getResources().getDrawable(R.drawable.universities);

        BasicModel basicModel7 = new BasicModel();
        basicModel7.text= "Other Govt Jobs";
        basicModel7.color="#CFD8DC";
        basicModel7.drawable = context.getResources().getDrawable(R.drawable.entrance_exams);

        BasicModel basicModel8 = new BasicModel();
        basicModel8.text= "UPSC (Union Public Service Commission) Civil Service";
        basicModel8.color="#CFD8DC";
        basicModel8.drawable = context.getResources().getDrawable(R.drawable.entrance_exams);

        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);
        arrayList.add(basicModel7);
        arrayList.add(basicModel8);


        return arrayList;
    }


    public ArrayList<BasicModel> afterSSC()
    {

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text = context.getString(R.string.one_xii);
        basicModel1.drawable    =   context.getResources().getDrawable(R.drawable.after_intermediate);

        BasicModel basicModel2 = new BasicModel();
        basicModel2.text = context.getString(R.string.one_diploma);
        basicModel2.drawable    =   context.getResources().getDrawable(R.drawable.after_x_diploma);

        BasicModel basicModel3 = new BasicModel();
        basicModel3.text = context.getString(R.string.one_iti);
        basicModel3.drawable    =   context.getResources().getDrawable(R.drawable.after_x_iti);

        BasicModel basicModel4 = new BasicModel();
        basicModel4.text = context.getString(R.string.one_paramedical_courses);
        basicModel4.drawable    =   context.getResources().getDrawable(R.drawable.after_paramedical_courses);


        ArrayList<BasicModel> arrayList = new ArrayList<>();
        BasicModel basicModel5 = new BasicModel();
        basicModel5.text = context.getString(R.string.one_computer_courses);
        basicModel5.drawable = context.getResources().getDrawable(R.drawable.computer_institutes);

        BasicModel basicModel6 = new BasicModel();
        basicModel6.text = context.getString(R.string.one_seo);
        basicModel6.drawable    =   context.getResources().getDrawable(R.drawable.after_seo);


        BasicModel basicModel7 = new BasicModel();
        basicModel7.text = context.getString(R.string.one_others);
        basicModel7.drawable    =   context.getResources().getDrawable(R.drawable.after_x_others);



        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);
        arrayList.add(basicModel7);

        return arrayList;

    }


    public ArrayList<BasicModel> afterIntermediate()
    {
        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel2 = new BasicModel();
        basicModel2.text = "Graduation";
        basicModel2.drawable    =   context.getResources().getDrawable(R.drawable.graduation);

        BasicModel basicModel3 = new BasicModel();
        basicModel3.text = "Mathematics";
        basicModel3.drawable    =   context.getResources().getDrawable(R.drawable.after_x_diploma);

        BasicModel basicModel4 = new BasicModel();
        basicModel4.text = "Arts";
        basicModel4.drawable    =   context.getResources().getDrawable(R.drawable.ltc_arts);

        BasicModel basicModel6 = new BasicModel();
        basicModel6.text = "Commerce";
        basicModel6.drawable    =   context.getResources().getDrawable(R.drawable.ltc_ecommerce);


        BasicModel basicModel1 = new BasicModel();
        basicModel1.text = "Biology";
        basicModel1.drawable = context.getResources().getDrawable(R.drawable.ltc_biotechnology);

        BasicModel basicModel7 = new BasicModel();
        basicModel7.text = "Govt Jobs";
        basicModel7.drawable    =   context.getResources().getDrawable(R.drawable.after_x_others);

        BasicModel basicModel5 = new BasicModel();
        basicModel5.text = "Para Medical Courses";
        basicModel5.drawable    =   context.getResources().getDrawable(R.drawable.after_paramedical_courses);

        BasicModel basicModel8 = new BasicModel();
        basicModel8.text = "Diploma";
        basicModel8.drawable    =   context.getResources().getDrawable(R.drawable.after_x_diploma);

        BasicModel basicModel9 = new BasicModel();
        basicModel9.text = "Others";
        basicModel9.drawable    =   context.getResources().getDrawable(R.drawable.after_x_others);


        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);
        arrayList.add(basicModel7);
        arrayList.add(basicModel8);
        arrayList.add(basicModel9);

        return arrayList;


    }

    public ArrayList<BasicModel> entranceExams()
    {
        ArrayList<BasicModel> arrayList = new ArrayList<>();
        BasicModel basicModel1 = new BasicModel();
        basicModel1.text    =   context.getString(R.string.after_x);
        basicModel1.drawable    =   context.getResources().getDrawable(R.drawable.after_ssc);

        BasicModel basicModel2 = new BasicModel();
        basicModel2.text    =   context.getString(R.string.after_graduation);
        basicModel2.drawable    =   context.getResources().getDrawable(R.drawable.after_ssc);

        BasicModel basicModel3 = new BasicModel();
        basicModel3.text    =   "To Study Overseas";
        basicModel3.drawable    =   context.getResources().getDrawable(R.drawable.study_overseas);

        BasicModel basicModel4 = new BasicModel();
        basicModel4.text    =   "Fashion and Technology Entrance Examinations in India";
        basicModel4.drawable    =   context.getResources().getDrawable(R.drawable.fashion_ee_india);

        BasicModel basicModel5 = new BasicModel();
        basicModel5.text    =   "Film and Television Entrance Examinations in India";
        basicModel5.drawable    =   context.getResources().getDrawable(R.drawable.film_ee_india);

        BasicModel basicModel6 = new BasicModel();
        basicModel6.text    =   "Management Entrance Examinations in India";
        basicModel6.drawable    =   context.getResources().getDrawable(R.drawable.managment_ee_india);

        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);

        return arrayList;
    }

    public ArrayList<BasicModel> topUniversities()
    {
        ArrayList<BasicModel> arrayList = new ArrayList<>();
        BasicModel basicModel1 = new BasicModel();
        basicModel1.text    =   "Top Universities";
        basicModel1.drawable    =   context.getResources().getDrawable(R.drawable.universities);

        BasicModel basicModel2 = new BasicModel();
        basicModel2.text    =   "Open Distance Education Universities";
        basicModel2.drawable    =   context.getResources().getDrawable(R.drawable.distance_education_universities);

        arrayList.add(basicModel1);
        arrayList.add(basicModel2);

        return arrayList;

    }



    public ArrayList<BasicModel> subOneAfterIntermediate()
    {
        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text =   context.getString(R.string.two_commerce);

        BasicModel basicModel2 = new BasicModel();
        basicModel2.text =   context.getString(R.string.two_science);

        BasicModel basicModel3 = new BasicModel();
        basicModel3.text =   context.getString(R.string.two_arts);

        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);

        return arrayList;
    }

    public ArrayList<BasicModel> subOneAfterDiploma()
    {
        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text =  context.getString(R.string.two_technical);

        BasicModel basicModel2 = new BasicModel();
        basicModel2.text =   context.getString(R.string.two_non_technical);

        arrayList.add(basicModel1);
        arrayList.add(basicModel2);

        return arrayList;

    }
    public ArrayList<BasicModel> subOneAfterITI()
    {

        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text = "Draughtsman (Civil)";

        BasicModel basicModel2 = new BasicModel();
        basicModel2.text = "Draughtsman (Mechanical)";

        BasicModel basicModel3 = new BasicModel();
        basicModel3.text = "Mechanic (Diesel)";

        BasicModel basicModel4 = new BasicModel();
        basicModel4.text = "Foundryman";

        BasicModel basicModel5 = new BasicModel();
        basicModel5.text = "Mason *";

        BasicModel basicModel6 = new BasicModel();
        basicModel6.text = "Mechanic Tractor";

        BasicModel basicModel7 = new BasicModel();
        basicModel7.text = "Plastic Processing Operator";

        BasicModel basicModel8 = new BasicModel();
        basicModel8.text = "Plumber";

        BasicModel basicModel9 = new BasicModel();
        basicModel9.text = "Metal sheet worker";

        BasicModel basicModel10 = new BasicModel();
        basicModel10.text = "Welder";

        BasicModel basicModel11 = new BasicModel();
        basicModel11.text = "Wireman";

        BasicModel basicModel12 = new BasicModel();
        basicModel12.text = "Attendant Operator (Chemical Plant)";

        BasicModel basicModel13 = new BasicModel();
        basicModel13.text = "Electrician";

        BasicModel basicModel14 = new BasicModel();
        basicModel14.text = "Electronic Mechanic";

        BasicModel basicModel15 = new BasicModel();
        basicModel15.text = "Electroplater *";

        BasicModel basicModel16 = new BasicModel();
        basicModel16.text = "Carpenter";

        BasicModel basicModel17 = new BasicModel();
        basicModel17.text = "Fitter";

        BasicModel basicModel18 = new BasicModel();
        basicModel18.text = "Instrument Mechanic";
        BasicModel basicModel19 = new BasicModel();
        basicModel19.text = "Surveyor *";
        BasicModel basicModel20 = new BasicModel();
        basicModel20.text = "Lab Assistant (Chemical Plant)";
        BasicModel basicModel21 = new BasicModel();
        basicModel21.text = "Machinist";
        BasicModel basicModel22 = new BasicModel();
        basicModel22.text = "Machinist (Grinder)";
        BasicModel basicModel23 = new BasicModel();
        basicModel23.text = "Maintenance Mechanic (Chemical Plant)";
        BasicModel basicModel24 = new BasicModel();
        basicModel24.text = "Mechanic (Motor Vehicle)";
        BasicModel basicModel25 = new BasicModel();
        basicModel25.text = "Mechanic (Refrigeration and Aid Conditioning)";
        BasicModel basicModel26 = new BasicModel();
        basicModel26.text = "Mechanic (Radio & TV)";
        BasicModel basicModel27 = new BasicModel();
        basicModel27.text = "Mechanic (Machine Tool Maintenance)";
        BasicModel basicModel28 = new BasicModel();
        basicModel28.text = "Turner *";
        BasicModel basicModel29 = new BasicModel();
        basicModel29.text = "Information Technology and Electronics Systems Maintenance ( IT & ESM)";
        BasicModel basicModel30 = new BasicModel();
        basicModel30.text = "Tool and Die Making";
        BasicModel basicModel31 = new BasicModel();
        basicModel31.text = "(Press Tools, jigs & Fixtures)";
        BasicModel basicModel32 = new BasicModel();
        basicModel32.text = "Production and Manufacturing";
        BasicModel basicModel33 = new BasicModel();
        basicModel33.text = "Automobile";
        BasicModel basicModel34 = new BasicModel();
        basicModel34.text = "Electrical";
        BasicModel basicModel35 = new BasicModel();
        basicModel35.text = "Electronics";


        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);
        arrayList.add(basicModel7);
        arrayList.add(basicModel8);
        arrayList.add(basicModel9);
        arrayList.add(basicModel10);
        arrayList.add(basicModel11);
        arrayList.add(basicModel12);
        arrayList.add(basicModel13);
        arrayList.add(basicModel14);
        arrayList.add(basicModel15);
        arrayList.add(basicModel16);
        arrayList.add(basicModel17);
        arrayList.add(basicModel18);
        arrayList.add(basicModel19);
        arrayList.add(basicModel20);
        arrayList.add(basicModel21);
        arrayList.add(basicModel22);
        arrayList.add(basicModel23);
        arrayList.add(basicModel24);
        arrayList.add(basicModel25);
        arrayList.add(basicModel26);

        arrayList.add(basicModel27);
        arrayList.add(basicModel28);
        arrayList.add(basicModel29);
        arrayList.add(basicModel30);
        arrayList.add(basicModel31);
        arrayList.add(basicModel32);
        arrayList.add(basicModel33);
        arrayList.add(basicModel34);
        arrayList.add(basicModel35);
        return arrayList;

    }
    public ArrayList<BasicModel> subOneAfterParamedicalCourses()
    {

        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text = "Diploma in Operation Theatre Technology (DOTT)";

        BasicModel basicModel2 = new BasicModel();
        basicModel2.text = "Diploma in X Ray Technology";

        BasicModel basicModel3 = new BasicModel();
        basicModel3.text = "Diploma in Radiography and Medical Imaging *";

        BasicModel basicModel4 = new BasicModel();
        basicModel4.text = "Diploma in ECG Technology";
        BasicModel basicModel5 = new BasicModel();
        basicModel5.text = "Diploma in Dialysis Technology";
        BasicModel basicModel6 = new BasicModel();
        basicModel6.text = "Diploma in Medical Record Technology";
        BasicModel basicModel7 = new BasicModel();
        basicModel7.text = "Diploma in Medical Laboratory Technology (DMLT)";
        BasicModel basicModel8 = new BasicModel();
        basicModel8.text = "Diploma in Ophthalmic Technology";

        BasicModel basicModel9 = new BasicModel();
        basicModel9.text = "Diploma in Physiotherapy";
        BasicModel basicModel10 = new BasicModel();
        basicModel10.text = "Diploma in Anaesthesia Technology";
        BasicModel basicModel11 = new BasicModel();
        basicModel11.text = "Diploma in Nursing Care Assistant";
        BasicModel basicModel12 = new BasicModel();
        basicModel12.text = "Diploma in Sanitary Inspector";
        BasicModel basicModel13 = new BasicModel();
        basicModel13.text = "Diploma in Hearing Language and Speech (DHLS)";

        BasicModel basicModel14 = new BasicModel();
        basicModel14.text = "Diploma in Dental Hygienist";
        BasicModel basicModel15 = new BasicModel();
        basicModel15.text = "Diploma in Audiometry Technician";
        BasicModel basicModel16 = new BasicModel();
        basicModel16.text = "Diploma in Audiology and Speech Therapy";
        BasicModel basicModel17 = new BasicModel();
        basicModel17.text = " Diploma in Optometry Technician (DOT)";
        BasicModel basicModel18 = new BasicModel();
        basicModel18.text = " Diploma in Opthalmic Assistance (DOA)";
        BasicModel basicModel19 = new BasicModel();
        basicModel19.text = "Diploma in Hospital food service Management";

        BasicModel basicModel20 = new BasicModel();
        basicModel20.text = "Diploma in Multipurpose Health Worker";
        BasicModel basicModel21 = new BasicModel();
        basicModel21.text = "Diploma in Naturopathy & Yoga Science";
        BasicModel basicModel22 = new BasicModel();
        basicModel22.text = "Diploma in Veterinary Science";
        BasicModel basicModel23 = new BasicModel();
        basicModel23.text = "Diploma in Ayurvedic Compounder";
        BasicModel basicModel24 = new BasicModel();
        basicModel24.text = "Certificate in Medical Laboratory Technology";

        BasicModel basicModel25 = new BasicModel();
        basicModel25.text = "Certificate in Physiotherapy";
        BasicModel basicModel26 = new BasicModel();
        basicModel26.text = "Certificate in Dialysis *";
        BasicModel basicModel27 = new BasicModel();
        basicModel27.text = "Course in Community Medical Services & ED";
        BasicModel basicModel28 = new BasicModel();
        basicModel28.text = "Course in Acupuncture, Acupressure *";
        BasicModel basicModel29 = new BasicModel();
        basicModel29.text = "Health Inspector";
        BasicModel basicModel30 = new BasicModel();
        basicModel30.text = "Dental Mechanic";
        BasicModel basicModel31 = new BasicModel();
        basicModel31.text = "Dental Hygiene";

        BasicModel basicModel32 = new BasicModel();
        basicModel32.text = "Dental Ceramic Technology *";
        BasicModel basicModel33 = new BasicModel();
        basicModel33.text = "ECG Assistant";
        BasicModel basicModel34 = new BasicModel();
        basicModel34.text = "CT Scan Technician";
        BasicModel basicModel35 = new BasicModel();
        basicModel35.text = " MRI Technician";
        BasicModel basicModel36 = new BasicModel();
        basicModel36.text = "Health Sanitary Inspector";
        BasicModel basicModel37 = new BasicModel();
        basicModel37.text = "Cardiac Care/Perfusion Technician";

        BasicModel basicModel38 = new BasicModel();
        basicModel38.text = "Audiology/Speech Therapist";
        BasicModel basicModel39 = new BasicModel();
        basicModel39.text = "Respiratorycare Technician";


        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);
        arrayList.add(basicModel7);
        arrayList.add(basicModel8);
        arrayList.add(basicModel9);
        arrayList.add(basicModel10);
        arrayList.add(basicModel11);
        arrayList.add(basicModel12);
        arrayList.add(basicModel13);
        arrayList.add(basicModel14);
        arrayList.add(basicModel15);
        arrayList.add(basicModel16);
        arrayList.add(basicModel17);
        arrayList.add(basicModel18);
        arrayList.add(basicModel19);
        arrayList.add(basicModel20);
        arrayList.add(basicModel21);
        arrayList.add(basicModel22);
        arrayList.add(basicModel23);
        arrayList.add(basicModel24);
        arrayList.add(basicModel25);
        arrayList.add(basicModel26);

        arrayList.add(basicModel27);
        arrayList.add(basicModel28);
        arrayList.add(basicModel29);
        arrayList.add(basicModel30);
        arrayList.add(basicModel31);
        arrayList.add(basicModel32);
        arrayList.add(basicModel33);
        arrayList.add(basicModel34);
        arrayList.add(basicModel35);
        arrayList.add(basicModel36);
        arrayList.add(basicModel37);
        arrayList.add(basicModel38);
        arrayList.add(basicModel39);

        return arrayList;


    }

    public ArrayList<BasicModel> subOneAfterComputerCourses()
    {

        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text = context.getString(R.string.two_animation_and_mulitmedia);

        BasicModel basicModel2 = new BasicModel();
        basicModel2.text = context.getString(R.string.two_creative_and_working);

        BasicModel basicModel3 = new BasicModel();
        basicModel3.text = context.getString(R.string.two_digital_marketing);

        BasicModel basicModel4 = new BasicModel();
        basicModel4.text = context.getString(R.string.two_seo);

        BasicModel basicModel5 = new BasicModel();
        basicModel5.text = context.getString(R.string.two_graphic_designer_course);

        BasicModel basicModel6 = new BasicModel();
        basicModel6.text = context.getString(R.string.two_webdesign_and_development_course);

        BasicModel basicModel7 = new BasicModel();
        basicModel7.text = context.getString(R.string.two_appdevelopment_and_design_course);

        BasicModel basicModel8 = new BasicModel();
        basicModel8.text = context.getString(R.string.two_programming_languages);

        BasicModel basicModel9 = new BasicModel();
        basicModel9.text = "Post graduation diploma in computer application(PGDCA)";

        BasicModel basicModel10 = new BasicModel();
        basicModel10.text = "Tally";

        BasicModel basicModel11 = new BasicModel();
        basicModel11.text = "Computer Aided Design & Drawing";

        BasicModel basicModel12 = new BasicModel();
        basicModel12.text = "MSOffice Certificate Program";

        BasicModel basicModel13 = new BasicModel();
        basicModel13.text = "Hardware Engineering / Technician Course";

        BasicModel basicModel14 = new BasicModel();
        basicModel14.text = "Computerized Accounting";

        BasicModel basicModel15 = new BasicModel();
        basicModel15.text = "Data Mining & Analysis";

        BasicModel basicModel16 = new BasicModel();
        basicModel16.text = "Cyber Security & Ethical hacking";

        BasicModel basicModel17 = new BasicModel();
        basicModel17.text = "Relational DataBase Management System (RDBMS)";


        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);
        arrayList.add(basicModel7);
        arrayList.add(basicModel8);
        arrayList.add(basicModel9);
        arrayList.add(basicModel10);
        arrayList.add(basicModel11);
        arrayList.add(basicModel12);
        arrayList.add(basicModel13);
        arrayList.add(basicModel14);
        arrayList.add(basicModel15);
        arrayList.add(basicModel16);
        arrayList.add(basicModel17);

        return arrayList;

    }
    public ArrayList<BasicModel> subOneAfterSEO()
    {

        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text =  "SEO professional (independent/working for agencies)";
        BasicModel basicModel2 = new BasicModel();
        basicModel2.text =   "Project manager";
        BasicModel basicModel3 = new BasicModel();
        basicModel3.text =   "SEO Consultant";
        BasicModel basicModel4 = new BasicModel();
        basicModel4.text =   "Website auditor";
        BasicModel basicModel5 = new BasicModel();
        basicModel5.text =   "Entrepreneur";


        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);

        return arrayList;


    }

    public ArrayList<BasicModel> subOneAfterOthers()
    {

        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text =  "LIC Agent";
        BasicModel basicModel2 = new BasicModel();
        basicModel2.text =   "Railway Sweeper";
        BasicModel basicModel3 = new BasicModel();
        basicModel3.text =   "Bank Attender";
        BasicModel basicModel4 = new BasicModel();
        basicModel4.text =   "Bank Sweeper";


        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);

        return arrayList;

    }




    public ArrayList<BasicModel> subTwoAfterTechnical()
    {

        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text = "Diploma in Multimedia and Animation";

        BasicModel basicModel2 = new BasicModel();
        basicModel2.text = "Diploma in Network Engineering";

        BasicModel basicModel3 = new BasicModel();
        basicModel3.text = "Diploma in Computer Hardware Engineering";

        BasicModel basicModel4 = new BasicModel();
        basicModel4.text = "Diploma in Rubber Technology";

        BasicModel basicModel5 = new BasicModel();
        basicModel5.text = "Diploma in Leather Technology";

        BasicModel basicModel6 = new BasicModel();
        basicModel6.text = "Diploma in Dairy Technology";

        BasicModel basicModel7 = new BasicModel();
        basicModel7.text = "Diploma in Food Production & Technology";

        BasicModel basicModel8 = new BasicModel();
        basicModel8.text = "Diploma in Production & Manufacturing";

        BasicModel basicModel9 = new BasicModel();
        basicModel9.text = "Diploma Architecture Assistant";

        BasicModel basicModel10 = new BasicModel();
        basicModel10.text = "Diploma in Fire & Safety Technology";

        BasicModel basicModel11 = new BasicModel();
        basicModel11.text = " Diploma in Metallurgy";

        BasicModel basicModel12 = new BasicModel();
        basicModel12.text = "Diploma in Plastic Engineering";

        BasicModel basicModel13 = new BasicModel();
        basicModel13.text = "Diploma in Automobile Engeneering";

        BasicModel basicModel14 = new BasicModel();
        basicModel14.text = "Diploma in Aeronautical Engineering";

        BasicModel basicModel15 = new BasicModel();
        basicModel15.text = " Diploma in Mining Technology";

        BasicModel basicModel16 = new BasicModel();
        basicModel16.text = "Diploma in Mechatronics Engineering";

        BasicModel basicModel17 = new BasicModel();
        basicModel17.text = "Diploma in Instumentation & Control";


        BasicModel basicModel18 = new BasicModel();
        basicModel18.text = "Diploma in Environmental Engineering";
        BasicModel basicModel19 = new BasicModel();
        basicModel19.text = "Diploma in Textile Engineering";
        BasicModel basicModel20 = new BasicModel();
        basicModel20.text = " Diploma in Agricultural Engineering";
        BasicModel basicModel21 = new BasicModel();
        basicModel21.text = "Diploma in Information Technology";
        BasicModel basicModel22 = new BasicModel();
        basicModel22.text = "Diploma in Computer Science & Engineering";
        BasicModel basicModel23 = new BasicModel();
        basicModel23.text = "Diploma in Electronics & Communications Engineering";
        BasicModel basicModel24 = new BasicModel();
        basicModel24.text = "Diploma in Chemical Engineering";
        BasicModel basicModel25 = new BasicModel();
        basicModel25.text = "Diploma in Civil Engineering";
        BasicModel basicModel26 = new BasicModel();
        basicModel26.text = "Diploma in Electrical Engineering";
        BasicModel basicModel27 = new BasicModel();
        basicModel27.text = "Diploma in Mechanical Engineering";
        BasicModel basicModel28 = new BasicModel();
        basicModel28.text = "Diploma Merine Engineering";
        BasicModel basicModel29 = new BasicModel();
        basicModel29.text = "Diploma in Electronics & Video Engineering";
        BasicModel basicModel30 = new BasicModel();
        basicModel30.text = "Diploma in Machine Tools & Maintenance";
        BasicModel basicModel31 = new BasicModel();
        basicModel31.text = "Diploma in Printing Technology";
        BasicModel basicModel32 = new BasicModel();
        basicModel32.text = "Diploma in Indian Navy";


        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);
        arrayList.add(basicModel7);
        arrayList.add(basicModel8);
        arrayList.add(basicModel9);
        arrayList.add(basicModel10);
        arrayList.add(basicModel11);
        arrayList.add(basicModel12);
        arrayList.add(basicModel13);
        arrayList.add(basicModel14);
        arrayList.add(basicModel15);
        arrayList.add(basicModel16);
        arrayList.add(basicModel17);
        arrayList.add(basicModel18);
        arrayList.add(basicModel19);
        arrayList.add(basicModel20);
        arrayList.add(basicModel21);
        arrayList.add(basicModel22);
        arrayList.add(basicModel23);
        arrayList.add(basicModel24);
        arrayList.add(basicModel25);
        arrayList.add(basicModel26);

        arrayList.add(basicModel27);
        arrayList.add(basicModel28);
        arrayList.add(basicModel29);
        arrayList.add(basicModel30);
        arrayList.add(basicModel31);
        arrayList.add(basicModel32);
        return arrayList;


    }

    public ArrayList<BasicModel> subTwoAfterNonTechnical()
    {

        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text =  "Diploma in Interior Design";
        BasicModel basicModel2 = new BasicModel();
        basicModel2.text =   "Diploma in Private Secretery";
        BasicModel basicModel3 = new BasicModel();
        basicModel3.text =   "Diploma in Bakery";
        BasicModel basicModel4 = new BasicModel();
        basicModel4.text =   "Diploma in Beauty Culture & Hair Dressing";
        BasicModel basicModel5 = new BasicModel();
        basicModel5.text =   " Diploma in packaging";

        BasicModel basicModel6 = new BasicModel();
        basicModel6.text =   " Diploma in Dance & Music";
        BasicModel basicModel7 = new BasicModel();
        basicModel7.text =   "Dimplona in Fine Arts";
        BasicModel basicModel8 = new BasicModel();
        basicModel8.text =   " Diploma in Arts Teacher";
        BasicModel basicModel9 = new BasicModel();
        basicModel9.text =   " Diploma in Hotel Management Technology";
        BasicModel basicModel10 = new BasicModel();
        basicModel10.text =   " Diploma in Catering Technology";
        BasicModel basicModel11 = new BasicModel();
        basicModel11.text =   " Diploma in Travel & Tourism";
        BasicModel basicModel12 = new BasicModel();
        basicModel12.text =   "Diploma in dress designing and Garment Manufacturing";

        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);
        arrayList.add(basicModel7);
        arrayList.add(basicModel8);
        arrayList.add(basicModel9);
        arrayList.add(basicModel10);
        arrayList.add(basicModel11);
        arrayList.add(basicModel12);

        return arrayList;



    }

    public ArrayList<BasicModel> subTwoAfterAnimationAndMultimedia()
    {
        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text =  "VFX Professional (independent)";
        BasicModel basicModel2 = new BasicModel();
        basicModel2.text =   "VFX Professional (at Studios)";
        BasicModel basicModel3 = new BasicModel();
        basicModel3.text =   "Film Animation professional (at Studios)";
        BasicModel basicModel4 = new BasicModel();
        basicModel4.text =   "Visual Effects Artist";
        BasicModel basicModel5 = new BasicModel();
        basicModel5.text =   "Instructor";

        BasicModel basicModel6 = new BasicModel();
        basicModel6.text =   "Entrepreneur";
        BasicModel basicModel7 = new BasicModel();
        basicModel7.text =   "Advertising agencies";
        BasicModel basicModel8 = new BasicModel();
        basicModel8.text =   "Art and Creative Director";
        BasicModel basicModel9 = new BasicModel();
        basicModel9.text =   "Digital publishing firms";
        BasicModel basicModel10 = new BasicModel();
        basicModel10.text =   " E Commerce sector";

        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);
        arrayList.add(basicModel7);
        arrayList.add(basicModel8);
        arrayList.add(basicModel9);
        arrayList.add(basicModel10);

        return arrayList;



    }
    public ArrayList<BasicModel> subTwoAfterCreativeWorking()
    {

        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text =  "Content writer (independent/for agencies)";
        BasicModel basicModel2 = new BasicModel();
        basicModel2.text =   "Content editor";
        BasicModel basicModel3 = new BasicModel();
        basicModel3.text =   "Content marketing professional";
        BasicModel basicModel4 = new BasicModel();
        basicModel4.text =   "Digital publishing platforms (as Content writing professional)";
        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);

        return arrayList;


    }
    public ArrayList<BasicModel> subTwoAfterDigitalMarketing()
    {


        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text =  "Digital Marketer (independent)";
        BasicModel basicModel2 = new BasicModel();
        basicModel2.text =   "Digital Marketing professional (working for agencies)";
        BasicModel basicModel3 = new BasicModel();
        basicModel3.text =   "Online Brand management professional";
        BasicModel basicModel4 = new BasicModel();
        basicModel4.text =   "Social Media manager";

        BasicModel basicModel5 = new BasicModel();
        basicModel5.text =   "SEO professional (independent/working for agencies)";
        BasicModel basicModel6 = new BasicModel();
        basicModel6.text =   "SEO consultant";
        BasicModel basicModel7 = new BasicModel();
        basicModel7.text =   "Digital Marketing instructor";
        BasicModel basicModel8 = new BasicModel();
        basicModel8.text =   "Entrepreneur";

        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);
        arrayList.add(basicModel7);
        arrayList.add(basicModel8);

        return arrayList;



    }

    public ArrayList<BasicModel> subTwoAfterSEO()
    {


        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text =  "SEO professional (independent/working for agencies)";
        BasicModel basicModel2 = new BasicModel();
        basicModel2.text =   "Project manager";
        BasicModel basicModel3 = new BasicModel();
        basicModel3.text =   "SEO Consultant";
        BasicModel basicModel4 = new BasicModel();
        basicModel4.text =   "Website auditor";

        BasicModel basicModel5 = new BasicModel();
        basicModel5.text =   " Entrepreneur";
        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);

        return arrayList;



    }
    public ArrayList<BasicModel> subTwoAfterGraphiDesignerCourses()
    {

        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text =  "Graphics designer (independent)";
        BasicModel basicModel2 = new BasicModel();
        basicModel2.text =   " Graphics designer (Corporate team)";
        BasicModel basicModel3 = new BasicModel();
        basicModel3.text =   "Brand identity manager";
        BasicModel basicModel4 = new BasicModel();
        basicModel4.text =   "Printing specialist";

        BasicModel basicModel5 = new BasicModel();
        basicModel5.text =   "Creative director (at MNCs)";

        BasicModel basicModel6 = new BasicModel();
        basicModel6.text =   "Entrepreneur";
        BasicModel basicModel7 = new BasicModel();
        basicModel7.text =   "Graphic designer (at Digital magazines and other publishing firms)";

        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);
        arrayList.add(basicModel7);

        return arrayList;


    }
    public ArrayList<BasicModel> subTwoAfterWebDesignAndDevelopmentCourses()
    {

        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text =  "Web designer (independent)";
        BasicModel basicModel2 = new BasicModel();
        basicModel2.text =   " Web designer (Agencies/MNCs)";
        BasicModel basicModel3 = new BasicModel();
        basicModel3.text =   "Designer at Tech startups";
        BasicModel basicModel4 = new BasicModel();
        basicModel4.text =   "E Commerce sites";
        BasicModel basicModel5 = new BasicModel();
        basicModel5.text =   "Online publishing platforms";
        BasicModel basicModel6 = new BasicModel();
        basicModel6.text =   " Design consultant";
        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);

        return arrayList;



    }
    public ArrayList<BasicModel> subTwoAfterAppDevelopmentAndDesignCourses()
    {


        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text =  "App designer";
        BasicModel basicModel2 = new BasicModel();
        basicModel2.text =   "UI designer";
        BasicModel basicModel3 = new BasicModel();
        basicModel3.text =   "App developer (independent/agencies)";
        BasicModel basicModel4 = new BasicModel();
        basicModel4.text =   "E Commerce sector";
        BasicModel basicModel5 = new BasicModel();
        basicModel5.text =   "Entrepreneur";
        BasicModel basicModel6 = new BasicModel();
        basicModel6.text =   "Game designer";

        BasicModel basicModel7 = new BasicModel();
        basicModel6.text =   "App tester";
        BasicModel basicModel8 = new BasicModel();
        basicModel6.text =   "Game tester";

        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);
        arrayList.add(basicModel7);
        arrayList.add(basicModel8);

        return arrayList;



    }
    public ArrayList<BasicModel> subTwoAfterProgrammingLanguages()
    {

        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text =  "Software developer";
        BasicModel basicModel2 = new BasicModel();
        basicModel2.text =   "Software tester";
        BasicModel basicModel3 = new BasicModel();
        basicModel3.text =   " Companies in technology sector";

        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);

        return arrayList;

    }


    public ArrayList<BasicModel> subTwoAfterCommerce()
    {

        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text =   "Tax";

        BasicModel basicModel2 = new BasicModel();
        basicModel2.text =   "Business Economics";

        BasicModel basicModel3 = new BasicModel();
        basicModel3.text =   "Finance";

        BasicModel basicModel4 = new BasicModel();
        basicModel4.text =   "Economics";

        BasicModel basicModel5 = new BasicModel();
        basicModel5.text =   "English";
        BasicModel basicModel6 = new BasicModel();
        basicModel6.text =   "Accountancy";
        BasicModel basicModel7 = new BasicModel();
        basicModel7.text =   "Business Studies/Organisation of Commerce";
        BasicModel basicModel8 = new BasicModel();
        basicModel8.text =   "Mathematics";
        BasicModel basicModel9 = new BasicModel();
        basicModel9.text =   "Information Practices";
        BasicModel basicModel10 = new BasicModel();
        basicModel10.text =   "Statistics";

        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);
        arrayList.add(basicModel7);
        arrayList.add(basicModel8);
        arrayList.add(basicModel9);
        arrayList.add(basicModel10);

        return arrayList;

    }

    public ArrayList<BasicModel> subTwoAfterScience()
    {
        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text =   "Available Groups: Biology Group (Physics, Chemistry and Biology as main subjects) Mathematics Group (Physics, Chemistry and Mathematics subjects) PCMB group";

        BasicModel basicModel2 = new BasicModel();
        basicModel2.text =   "Available Subjects : Physics Chemistry Mathematics Biology English Computer Science";

        arrayList.add(basicModel1);
        arrayList.add(basicModel2);

        return arrayList;
    }

    public ArrayList<BasicModel> subTwoAfterArts(){

        ArrayList<BasicModel> arrayList = new ArrayList<>();

        BasicModel basicModel1 = new BasicModel();
        basicModel1.text =   "English";

        BasicModel basicModel2 = new BasicModel();
        basicModel2.text =   "History";

        BasicModel basicModel3 = new BasicModel();
        basicModel3.text =   "Geography";

        BasicModel basicModel4 = new BasicModel();
        basicModel4.text =   "Political Science";

        BasicModel basicModel5 = new BasicModel();
        basicModel5.text =   "Economics";
        BasicModel basicModel6 = new BasicModel();
        basicModel6.text =   "Other literature subjects- Hindi, regional languages etc";
        BasicModel basicModel7 = new BasicModel();
        basicModel7.text =   "Psychology";
        BasicModel basicModel8 = new BasicModel();
        basicModel8.text =   "Music";
        BasicModel basicModel9 = new BasicModel();
        basicModel9.text =   "Home Science";
        BasicModel basicModel10 = new BasicModel();
        basicModel10.text =   "Physical Education";

        BasicModel basicModel11 = new BasicModel();
        basicModel11.text =   "Mathematics";
        BasicModel basicModel12 = new BasicModel();
        basicModel12.text =   "Computer Science";
        BasicModel basicModel13 = new BasicModel();
        basicModel13.text =   "Fine Arts";
        BasicModel basicModel14 = new BasicModel();
        basicModel14.text =   "Sociology";
        arrayList.add(basicModel1);
        arrayList.add(basicModel2);
        arrayList.add(basicModel3);
        arrayList.add(basicModel4);
        arrayList.add(basicModel5);
        arrayList.add(basicModel6);
        arrayList.add(basicModel7);
        arrayList.add(basicModel8);
        arrayList.add(basicModel9);
        arrayList.add(basicModel10);
        arrayList.add(basicModel11);
        arrayList.add(basicModel12);
        arrayList.add(basicModel13);
        arrayList.add(basicModel14);

        return arrayList;

    }
}

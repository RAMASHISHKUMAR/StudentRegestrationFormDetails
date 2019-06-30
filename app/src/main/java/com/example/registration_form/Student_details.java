package com.example.registration_form;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

import java.time.chrono.Chronology;

public class Student_details extends AppCompatActivity {


    TextView edtName, edtMob_no,edtEmail_1,edtEmail_2,edtParmanentAdd1,edtCorresspondanceAdd2,edtCollege;
    TextView showResult;


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.student_details);

        edtName = findViewById(R.id.edtName);
        edtMob_no = findViewById(R.id.edtMob_no);
        edtEmail_1 = findViewById(R.id.edtEmail_1);
        edtEmail_2 = findViewById(R.id.edtEmail_2);

        TextView gender = (TextView) findViewById(R.id.genderValue);

        showResult = (TextView) findViewById(R.id.edtcourse);

        edtParmanentAdd1 = findViewById(R.id.edtParmanentAdd1);
        edtCorresspondanceAdd2 = findViewById(R.id.edtCorresspondanceAdd2);
        edtCollege = findViewById(R.id.edtCollege);

        Bundle bundle = getIntent().getExtras();

        String  name = bundle.getString("stdName");
        String  mob_no = bundle.getString("stdMob_No");
        String  email_1 = bundle.getString("stdEmail_1");
        String  email_2 = bundle.getString("stdEmail_2");
        String  P_add1 = bundle.getString("stdParmanentAddress1");
        String  Cors_add2 = bundle.getString("stdcorresspondanceAdd2");
        String  clg = bundle.getString("stdclgname");


        edtName.setText(name);
        edtMob_no.setText(mob_no);
        edtEmail_1.setText(email_1);
        edtEmail_2.setText(email_2);
        edtParmanentAdd1.setText(P_add1);
        edtCorresspondanceAdd2.setText(Cors_add2);
        edtCollege.setText(clg);

        gender.setText(bundle.getCharSequence("gender"));

        String android = bundle.getString("android");
        String ios = bundle.getString("ios");
        String java = bundle.getString("java");
        String angjs = bundle.getString("angularjs");
        String c = bundle.getString("C++");
        String net = bundle.getString(".net");

        showResult.setText(android+" "+ios+" "+java+" "+angjs+" "+c+" "+net);

    }
}

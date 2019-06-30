package com.example.registration_form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity_Registration_Form extends AppCompatActivity {

    private EditText edtEntername, edtEnterMob_No, edtEnterEmail_1, edtEnterEmail_2, edtParmanenetAddress1, edtCorresspondanceAddress2, edtCollegeName;
    private TextView txtEnterGender, txtEnterCourse;
    private RadioGroup genderRadioGroup;
    private CheckBox checkAndroidBox1, checkIosBox2, checkJavaBox3, checkAngularBox4, checkCBox5, checkNetBox6;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.registration_form);

        edtEntername = findViewById(R.id.edtEntername);
        edtEnterMob_No = findViewById(R.id.edtEnterMob_No);
        edtEnterEmail_1 = findViewById(R.id.edtEnterEmail_1);
        edtEnterEmail_2 = findViewById(R.id.edtEnterEmail_2);
        edtParmanenetAddress1 = findViewById(R.id.edtParmanenetAddress1);
        edtCorresspondanceAddress2 = findViewById(R.id.edtCorresspondanceAddress2);
        edtCollegeName = findViewById(R.id.edtCollegeName);

        // txtEnterGender = findViewById(R.id.txtEnterGender);
        genderRadioGroup = (RadioGroup) findViewById(R.id.gender);

        txtEnterCourse = findViewById(R.id.txtEnterCourse);

        checkAndroidBox1 = findViewById(R.id.checkAndroidBox1);
        checkIosBox2 = findViewById(R.id.checkIosBox2);
        checkJavaBox3 = findViewById(R.id.checkJavaBox3);
        checkAngularBox4 = findViewById(R.id.checkAngularBox4);
        checkCBox5 = findViewById(R.id.checkCBox5);
        checkNetBox6 = findViewById(R.id.checkNetBox6);

        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validate();
            }
        });
    }

    public void validate() {

        boolean valid = true;

        String studentname = edtEntername.getText().toString();
        String studentMob_No = edtEnterMob_No.getText().toString();
        String studentEmail_1 = edtEnterEmail_1.getText().toString();
        String studentEmail_2 = edtEnterEmail_2.getText().toString();
        String studentParmanenetAddress1 = edtParmanenetAddress1.getText().toString();
        String studentCorresspondanceAddress2 = edtCorresspondanceAddress2.getText().toString();
        String studentCollegeName = edtCollegeName.getText().toString();

        Intent intent = new Intent(this, Student_details.class);

        //intent 1 hi banana hota hai , got it?? ok sir ok proceed

        intent.putExtra("stdName", studentname);
        intent.putExtra("stdMob_No", studentMob_No);
        intent.putExtra("stdEmail_1", studentEmail_1);
        intent.putExtra("stdEmail_2", studentEmail_2);
        intent.putExtra("stdParmanentAddress1", studentParmanenetAddress1);
        intent.putExtra("stdcorresspondanceAdd2", studentCorresspondanceAddress2);
        intent.putExtra("stdclgname", studentCollegeName);

        int id = genderRadioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(id);

        intent.putExtra("gender", radioButton.getText().toString());

        intent.putExtra("android", checkAndroidBox1.isChecked() ? checkAndroidBox1.getText().toString() : "");
        intent.putExtra("ios", checkIosBox2.isChecked() ? checkIosBox2.getText().toString() : "");
        intent.putExtra("java", checkJavaBox3.isChecked() ? checkJavaBox3.getText().toString() : "");
        intent.putExtra("angularjs", checkAngularBox4.isChecked() ? checkAngularBox4.getText().toString() : "");
        intent.putExtra("C++", checkCBox5.isChecked() ? checkCBox5.getText().toString() : "");
        intent.putExtra(".net", checkNetBox6.isChecked() ? checkNetBox6.getText().toString() : "");

        startActivity(intent);

    }
}


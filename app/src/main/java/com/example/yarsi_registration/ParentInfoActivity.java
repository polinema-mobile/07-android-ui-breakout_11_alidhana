package com.example.yarsi_registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ParentInfoActivity extends AppCompatActivity {

    EditText txtFatherName, txtFatherJob, txtFatherAddress, txtMotherAddress, txtMotherName, txtMotherJob;
    String fathername, fatherjob, fatheraddress, mothername, motherjob, motheraddress;
    Button btnConfirm;
    Information pi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_info);
        txtFatherName = findViewById(R.id.txtFatherName);
        txtFatherJob = findViewById(R.id.txtFatherJob);
        txtFatherAddress = findViewById(R.id.txtFatherAddress);
        txtMotherName = findViewById(R.id.txtMotherName);
        txtMotherJob = findViewById(R.id.txtMotherJob);
        txtMotherAddress = findViewById(R.id.txtMotherAddress);
        btnConfirm = findViewById(R.id.btnConfirm);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fathername = txtFatherName.getText().toString();
                fatherjob = txtFatherJob.getText().toString();
                fatheraddress = txtFatherAddress.getText().toString();
                mothername = txtMotherName.getText().toString();
                motherjob = txtMotherJob.getText().toString();
                motheraddress = txtMotherAddress.getText().toString();

                pi = new Information(fathername, fatherjob, fatheraddress, mothername, motherjob, motheraddress);
                Intent i = new Intent(ParentInfoActivity.this, ConfirmActivity.class);
                i.putExtra("parentdata", pi);
                startActivity(i);
            }
        });
    }
}
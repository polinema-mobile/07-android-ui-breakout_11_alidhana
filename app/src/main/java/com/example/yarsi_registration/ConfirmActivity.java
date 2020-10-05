package com.example.yarsi_registration;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmActivity extends AppCompatActivity {

    TextView txtName, txtJurusan, txtProdi, txtBirthday, txtAddress;
    String name, birthday, address, jurusan, prodi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        txtName = findViewById(R.id.txtNameConfirm);
        txtJurusan = findViewById(R.id.txtJurusanConfirm);
        txtProdi = findViewById(R.id.txtProdiConfirm);
        txtBirthday = findViewById(R.id.txtBirthdayConfirm);
        txtAddress = findViewById(R.id.txtAddressConfirm);
        Information personal = getIntent().getParcelableExtra("personaldata");
        Information parent = getIntent().getParcelableExtra("parentdata");

        name = personal.getName();
        jurusan = personal.getJurusan();
        prodi = personal.getProdi();
        birthday = personal.getBirthday();
        address = personal.getBirthday();

        txtName.setText(name);
        txtJurusan.setText(jurusan);
        txtProdi.setText(prodi);
        txtBirthday.setText(birthday);
        txtAddress.setText(address);
    }

}
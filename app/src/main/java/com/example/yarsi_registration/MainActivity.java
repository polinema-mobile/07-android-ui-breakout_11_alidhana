package com.example.yarsi_registration;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText txtName, txtBirthday, txtAddress;
    Spinner spinnerJurusan, spinnerProdi;
    String name, birthday, address, jurusan, prodi;
    Information pi;
    final Calendar myCalendar = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.txtName);
        txtBirthday = findViewById(R.id.txtBirthday);
        txtAddress = findViewById(R.id.txtAddress);
        spinnerJurusan = findViewById(R.id.jurursanSpinner);
        spinnerProdi = findViewById(R.id.prodiSpinner);
        Button btnProceed = findViewById(R.id.btnProceed);
        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

        };
        txtBirthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(MainActivity.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
        spinnerJurusan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String spinnerValue = spinnerJurusan.getSelectedItem().toString();
                if (spinnerValue.equals("Teknologi Informasi")) {
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter
                            .createFromResource(MainActivity.this, R.array.prodi_ti,
                                    android.R.layout.simple_spinner_dropdown_item);
                    spinnerProdi.setAdapter(adapter);
                } else if (spinnerValue.equals("Akuntansi")) {
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter
                            .createFromResource(MainActivity.this, R.array.prodi_akuntansi,
                                    android.R.layout.simple_spinner_dropdown_item);
                    spinnerProdi.setAdapter(adapter);
                } else if (spinnerValue.equals("Teknik Kimia")) {
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter
                            .createFromResource(MainActivity.this, R.array.prodi_tk,
                                    android.R.layout.simple_spinner_dropdown_item);
                    spinnerProdi.setAdapter(adapter);
                } else if (spinnerValue.equals("Teknik Mesin")) {
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter
                            .createFromResource(MainActivity.this, R.array.prodi_tm,
                                    android.R.layout.simple_spinner_dropdown_item);
                    spinnerProdi.setAdapter(adapter);
                } else if (spinnerValue.equals("Teknik Sipil")) {
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter
                            .createFromResource(MainActivity.this, R.array.prodi_ts,
                                    android.R.layout.simple_spinner_dropdown_item);
                    spinnerProdi.setAdapter(adapter);
                } else if (spinnerValue.equals("Teknik Elektro")) {
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter
                            .createFromResource(MainActivity.this, R.array.prodi_te,
                                    android.R.layout.simple_spinner_dropdown_item);
                    spinnerProdi.setAdapter(adapter);
                } else if (spinnerValue.equals("Administrasi Niaga")){
                    ArrayAdapter<CharSequence> adapter =  ArrayAdapter
                            .createFromResource(MainActivity.this, R.array.prodi_admin,
                                    android.R.layout.simple_spinner_dropdown_item);
                    spinnerProdi.setAdapter(adapter);
                } else if (spinnerValue.equals("Bahasa")){
                    ArrayAdapter<CharSequence> adapter =  ArrayAdapter
                            .createFromResource(MainActivity.this, R.array.prodi_bahasa,
                                    android.R.layout.simple_spinner_dropdown_item);
                    spinnerProdi.setAdapter(adapter);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = txtName.getText().toString();
                birthday = txtBirthday.getText().toString();
                address = txtAddress.getText().toString();
                jurusan = spinnerJurusan.getSelectedItem().toString();
                prodi = spinnerProdi.getSelectedItem().toString();

                pi = new Information(name, birthday, address, jurusan, prodi);
                Intent i = new Intent(MainActivity.this, ParentInfoActivity.class);
                Intent p = new Intent(MainActivity.this, ConfirmActivity.class);
                p.putExtra("personaldata", pi);
                startActivity(i);
            }
        });
    }

    private void updateLabel() {
        String myFormat = "dd/MM/yyyy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        txtBirthday.setText(sdf.format(myCalendar.getTime()));
    }

}
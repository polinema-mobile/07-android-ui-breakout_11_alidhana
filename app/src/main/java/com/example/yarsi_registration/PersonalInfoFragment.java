package com.example.yarsi_registration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PersonalInfoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PersonalInfoFragment extends Fragment {

    private int page;
    private String title;
    Spinner jurusanSpinner;
    Spinner prodiSpinner;


    public PersonalInfoFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static PersonalInfoFragment newInstance(int page, String title) {
        PersonalInfoFragment fragment = new PersonalInfoFragment();
        Bundle args = new Bundle();
        args.putInt(String.valueOf(1), page);
        args.putString("Data Pribadi", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            page = getArguments().getInt(String.valueOf(1));
            title = getArguments().getString("Data Pribadi");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personal_info, container, false);
        jurusanSpinner = view.findViewById(R.id.jurursanSpinner);
        prodiSpinner = view.findViewById(R.id.prodiSpinner);
        jurusanSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String spinnerValue = jurusanSpinner.getSelectedItem().toString();
                if (spinnerValue.equals("Akuntansi")) {
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter
                            .createFromResource(getActivity(), R.array.prodi_akuntansi,
                                    android.R.layout.simple_spinner_item);
                    prodiSpinner.setAdapter(adapter);
                } else if (spinnerValue.equals("Teknologi Informasi")) {
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter
                            .createFromResource(getActivity(), R.array.prodi_ti,
                                    android.R.layout.simple_spinner_item);
                    prodiSpinner.setAdapter(adapter);
                } else if (spinnerValue.equals("Teknik Elektro")) {
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter
                            .createFromResource(getActivity(), R.array.prodi_te,
                                    android.R.layout.simple_spinner_item);
                    prodiSpinner.setAdapter(adapter);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        return view;
    }

}
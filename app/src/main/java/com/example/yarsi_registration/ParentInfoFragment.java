package com.example.yarsi_registration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ParentInfoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ParentInfoFragment extends Fragment {

    private int page;
    private String title;


    public ParentInfoFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ParentInfoFragment newInstance(int page, String title) {
        ParentInfoFragment fragment = new ParentInfoFragment();
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
        View view = inflater.inflate(R.layout.fragment_parent_info, container, false);
//        TextView tvLabel = (TextView) view.findViewById(R.id.tvLabel);
//        tvLabel.setText(page + " -- " + title);
        return view;
    }
}
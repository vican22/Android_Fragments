package com.vedran.tabbedmenu;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class ElvisFragment extends Fragment {

    private TextView tvElvis;

    public ElvisFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_elvis, container, false);

        initWidgets(view);

        setupListeners();

        return view;
    }

    private void initWidgets(View view) {
        tvElvis = view.findViewById(R.id.tvElvis);
    }

    private void setupListeners() {
        tvElvis.setOnClickListener(view -> {
            Toast.makeText(getActivity(), tvElvis.getText(), Toast.LENGTH_SHORT).show();
        });
    }



}

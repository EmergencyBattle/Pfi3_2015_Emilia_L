package com.example.emilia.assignment_4;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {


    public InfoFragment() {
        // Required empty public constructor
    }

    public void OnCreate (Bundle savedInstanceStart){
        super.onCreate(savedInstanceStart);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Planet planet = (Planet)getArguments().getSerializable("planet");

        View v = inflater.inflate(R.layout.fragment_info, container, false);

        ImageView i = (ImageView) v.findViewById(R.id.planetFactImage);
        i.setImageDrawable(planet.getImage());

        TextView t1 = (TextView) v.findViewById(R.id.factTitle);
        t1.setText(planet.getName());

        TextView t2 = (TextView) v.findViewById(R.id.factDescription);
        t2.setText(planet.getInfo());

        return v;
    }


}

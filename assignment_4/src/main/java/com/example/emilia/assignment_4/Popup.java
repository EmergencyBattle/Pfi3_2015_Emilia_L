package com.example.emilia.assignment_4;


import android.app.DialogFragment;
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
public class Popup extends DialogFragment implements View.OnClickListener {


    public Popup() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       View v = inflater.inflate(R.layout.fragment_popup, container, false);

        TextView t1 = (TextView) v.findViewById((R.id.popup_title));
        TextView t2 = (TextView) v.findViewById(R.id.text_creator);
        ImageView iv = (ImageView) v.findViewById(R.id.popup_image);

        v.setOnClickListener(this);
        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        iv.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v){
    Popup.this.dismiss();

    }


}

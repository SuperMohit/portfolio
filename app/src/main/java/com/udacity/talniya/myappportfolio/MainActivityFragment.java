package com.udacity.talniya.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {

    private static int BTN_COUNT = 6;

    public MainActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_main, container, false);
        addButtonClickHandlers(v);
        return v;


    }

    public void addButtonClickHandlers(View v) {

        int id;
        Button button;

        for (int btnNum = 0; btnNum < BTN_COUNT; btnNum++) {

            id = getResources().getIdentifier("button" + btnNum, "id", getActivity().getPackageName());

            button = (Button) v.findViewById(id);

            button.setOnClickListener(this);

        }
    }


    @Override
    public void onClick(View v) {

        Button button = (Button) v;

        Context context = getActivity().getApplicationContext();

        CharSequence text = "This button will launch my " + button.getText();

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        toast.show();


    }
}


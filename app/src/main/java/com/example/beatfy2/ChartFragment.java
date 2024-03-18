package com.example.beatfy2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

import com.example.beatfy2.GridAdapter;
import com.example.beatfy2.R;

public class ChartFragment extends Fragment {

    View view;
    GridView gridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_chart, container, false);

        gridView = view.findViewById(R.id.gridView);

        String[] albumName = {"Hollywood Bleeding" , "Beerbongs & Bentley" , "Stoney" , "Twelve Carat Toothache" , "Austin" , "Dial Drunk"};
        int[] albumImages = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f};

        GridAdapter gridAdapter = new GridAdapter(requireContext(), albumName, albumImages);
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(requireContext(), "You Clicked on " + albumName[position], Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}

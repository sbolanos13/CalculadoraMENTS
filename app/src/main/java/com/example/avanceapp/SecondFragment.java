package com.example.avanceapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.buttonprevious).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragmentDirections.ActionSecondFragmentToFirstFragment actionSecondToFirst = SecondFragmentDirections.actionSecondFragmentToFirstFragment();
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(actionSecondToFirst);
            }
        });

        view.findViewById(R.id.botonsig).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragmentDirections.ActionSecondFragmentToThirdFragment actionSecondToThird = SecondFragmentDirections.actionSecondFragmentToThirdFragment();
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(actionSecondToThird);
            }
        });
    }
}
package com.example.avanceapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {
    int[] sumaVacia = new int[21];
    @Override
    public View onCreateView(

            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.botonresultado).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
<<<<<<< HEAD
                FirstFragmentDirections.ActionFirstFragmentToSecondFragment actionFirst =FirstFragmentDirections.actionFirstFragmentToSecondFragment();
=======
                FirstFragmentDirections.ActionFirstFragmentToSecondFragment actionFirst =FirstFragmentDirections.actionFirstFragmentToSecondFragment(sumaVacia);
                actionFirst.setSumaProcedimiento(sumaVacia);
>>>>>>> d2e8a47d617bc32e4b79d7903755b6e9102c10f5
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(actionFirst);
            }
        });
    }
}
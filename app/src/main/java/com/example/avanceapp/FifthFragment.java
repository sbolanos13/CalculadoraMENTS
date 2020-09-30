package com.example.avanceapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
// * Use the {@link FifthFragment#} factory method to
 * create an instance of this fragment.
 */
public class FifthFragment extends Fragment {


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final int[] sumaFinal = FourthFragmentArgs.fromBundle(getArguments()).getSumaPaciente();

        //



        view.findViewById(R.id.botonhome4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FifthFragmentDirections.ActionFifthFragmentToFirstFragment actionFifthToFirst = FifthFragmentDirections.actionFifthFragmentToFirstFragment(sumaFinal);
                NavHostFragment.findNavController(FifthFragment.this)
                        .navigate(actionFifthToFirst);
            }
        });

    }
}
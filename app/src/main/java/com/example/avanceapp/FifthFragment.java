package com.example.avanceapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
    public void onViewCreated(@NonNull final View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final int sumaFinal = FifthFragmentArgs.fromBundle(getArguments()).getArg5();

        view.findViewById(R.id.botonResultadoFinal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView resultado = view.findViewById(R.id.textresultadofinal);
                resultado.setText("El resultado final es " + sumaFinal);
            }
        });

        //
        //Suma del resultado final
        //
//        int i; /* contador */
//        int total = 0;
//
//        /* suma el contenido del arreglo sumaFinal */
//        for ( i = 0; i < 21; i++ )
//        {
//            total += sumaFinal[ i ];
//        }
//        // Total ya es el resultado de la suma


        view.findViewById(R.id.botonhome4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FifthFragmentDirections.ActionFifthFragmentToFirstFragment actionFifthToFirst = FifthFragmentDirections.actionFifthFragmentToFirstFragment();
                NavHostFragment.findNavController(FifthFragment.this)
                        .navigate(actionFifthToFirst);
            }
        });

    }
}
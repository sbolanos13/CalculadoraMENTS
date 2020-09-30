package com.example.avanceapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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

    //int ResultadoFinal = 0;
    //int valorX = 0;
    //for (i<21) {
    //    valorX = sumaFinal(i);
    //    ResultadoFinal = ResultadoFinal + valorX;
    //}

    //if (ResultadoFinal)


    @Override
    public void onViewCreated(@NonNull final View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final int sumaFinal = FifthFragmentArgs.fromBundle(getArguments()).getArg5();
        final String[] info = {"Este caso puede estar asociado a un bajo riesgo de transmisión de COVID-19 \n" +
                " al equipo médico, un mejor resultado postoperatorio y/o un \n " +
                "menor uso de los recursos del centro de salud.","Este caso puede estar asociado a un bajo riesgo de transmisión de COVID-19 \n " +
                "al equipo médico, un mejor resultado postoperatorio y/o un \n " +
                "menor uso de los recursos del centro de salud.","Este caso puede estar asociado a un bajo riesgo de transmisión de COVID-19 \n " +
                "al equipo médico, un mejor resultado postoperatorio y/o un \n " +
                "menor uso de los recursos del centro de salud."};
        final String[] decisiones = {"Recomendación: Este paciente no corre un riesgo significativo al retrasar su atención \n " +
                "se le puede considerar de prioridad BAJA para su tratamiento y cuidados.","Recomendación: Este paciente presenta un riesgo moderado y debe tener una prioridad mayor en su \n " +
                "respectivo tratamiento y sus cuidados","Recomendación: Este paciente peresenta un alto riesgo al retrasar su atención y debe tener una prioridad \n" +
                "MUY ALTA en cuanto a cuidados y tiempo de atención"};
        view.findViewById(R.id.botonResultadoFinal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView resultado = view.findViewById(R.id.textresultadofinal);
                TextView decision = view.findViewById(R.id.decisionfinal);
                TextView informacion = view.findViewById(R.id.informacionfinal);
                resultado.setText("El resultado final es " + sumaFinal);
                if(sumaFinal <= 49){
                    informacion.setText(info[0]);
                    decision.setText(decisiones[0]);
                    }
                else if(sumaFinal >=50 || sumaFinal <= 77) {
                    informacion.setText(info[1]);
                    decision.setText(decisiones[1]);
                }
                else{
                    informacion.setText(info[2]);
                    decision.setText(decisiones[2]);
                }

                    }
            });
        view.findViewById(R.id.botonhome4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FifthFragmentDirections.ActionFifthFragmentToFirstFragment actionFifthToFirst = FifthFragmentDirections.actionFifthFragmentToFirstFragment();
                NavHostFragment.findNavController(FifthFragment.this)
                        .navigate(actionFifthToFirst);
            }
        });

        }



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

    }
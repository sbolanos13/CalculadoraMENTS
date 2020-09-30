package com.example.avanceapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragment extends Fragment {
    int counter1 = 0;
//    int[] suma = new int[7];
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
        final int[] sumaProcedimiento = FirstFragmentArgs.fromBundle(getArguments()).getSumaVacia();

        view.findViewById(R.id.buttonprevious).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragmentDirections.ActionSecondFragmentToFirstFragment actionSecondToFirst = SecondFragmentDirections.actionSecondFragmentToFirstFragment(sumaProcedimiento);
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(actionSecondToFirst);
            }

        });


        // Arrays con valores y strings
        final int[] valores1 = {1,2,3,4,5};
        String[] tiemposoperacion = {"< 30 mins","31-60 mins","61-120 mins","121-180 mins","> 181 mins"};
        String[] tiemposestadia = {"Salida ese mismo día","< 23 h","24-48 h","2-3 días","> 4 días"};
        String[] probICUpost = {"Poco probable","< 5%","5-10%","11-25%",">25%"};
        String[] perdidasangre = {"< 100 cc","100-250 cc","250-500 cc","500-750 cc","> 751 cc"};
        String[] miembrosequipo = {"1","2","3","4",">4"};
        String[] probintubacion = {"<= 1 %","1-5%","6-10%","11-25%","> 25%"};
        String[] zonaoperacion = {"Ninguna de estas opciones","MIS Pélvico abdominal (PA)","Cirugía abierta infraumbilical PA","Cirugía abierta supraumbilical PA","OHNS/Gastrointestinal Superior/Torácica"};
       // Spinners
        Spinner spinnertoperacion = view.findViewById(R.id.spinnertoperacion);
        Spinner spinnertestadia = view.findViewById(R.id.spinnertestadia);
        Spinner spinnerprobICUpost = view.findViewById(R.id.spinneruci);
        Spinner spinnerperdidasangre = view.findViewById(R.id.spinnersangre);
        Spinner spinnermiembros = view.findViewById(R.id.spinnermiembros);
        Spinner spinnerprobintubacion = view.findViewById(R.id.spinnerintubacion);
        Spinner spinnerzona = view.findViewById(R.id.spinnerzona);

        // (this,android.R.layout.simple_spinner_item,tiemposoperacion);
        // Relación spinner con array de strings
        ArrayAdapter<String> toperacionAdapter = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,tiemposoperacion);
        spinnertoperacion.setAdapter(toperacionAdapter);
        ArrayAdapter<String> testadiaAdapter = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,tiemposestadia);
        spinnertestadia.setAdapter(testadiaAdapter);
        ArrayAdapter<String> probICUAdapter = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,probICUpost);
        spinnerprobICUpost.setAdapter(probICUAdapter);
        ArrayAdapter<String> psangreAdapter = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,perdidasangre);
        spinnerperdidasangre.setAdapter(psangreAdapter);
        ArrayAdapter<String> miembrosAdapter = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,miembrosequipo);
        spinnermiembros.setAdapter(miembrosAdapter);
        ArrayAdapter<String> probintubAdapter = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,probintubacion);
        spinnerprobintubacion.setAdapter(probintubAdapter);
        ArrayAdapter<String> zonaoperacionAdapter = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,zonaoperacion);
        spinnerzona.setAdapter(zonaoperacionAdapter);


        final TextView resparcial1 = view.findViewById(R.id.textresparcial);
        spinnertoperacion.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sumaProcedimiento[0]=valores1[position];
                //resparcial1.setText("suma"+sumaProcedimiento[0]);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinnertestadia.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sumaProcedimiento[1]=valores1[position];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinnerprobICUpost.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sumaProcedimiento[2]=valores1[position];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinnerperdidasangre.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sumaProcedimiento[3]=valores1[position];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinnermiembros.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sumaProcedimiento[4]=valores1[position];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinnerprobintubacion.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sumaProcedimiento[5]=valores1[position];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinnerzona.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sumaProcedimiento[6]=valores1[position];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        view.findViewById(R.id.botonsig).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragmentDirections.ActionSecondFragmentToThirdFragment actionSecondToThird = SecondFragmentDirections.actionSecondFragmentToThirdFragment(sumaProcedimiento);
                actionSecondToThird.setSumaEnfermedad(sumaProcedimiento);
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(actionSecondToThird);
            }
        });


        };

    }
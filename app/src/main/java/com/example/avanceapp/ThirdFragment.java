package com.example.avanceapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


import android.widget.TextView;

import java.lang.reflect.Array;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class ThirdFragment extends Fragment {
    int[] suma = {};
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.botonprevious2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ThirdFragmentDirections.ActionThirdFragmentToSecondFragment actionThirdToSecond = ThirdFragmentDirections.actionThirdFragmentToSecondFragment();
                //actionThirdToSecond.setSuma(Suma2)
                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(actionThirdToSecond);
            }
        });

        view.findViewById(R.id.botonsig2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ThirdFragmentDirections.ActionThirdFragmentToFourthFragment actionThirdToFourth = ThirdFragmentDirections.actionThirdFragmentToFourthFragment();
                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(actionThirdToFourth);
            }
        });



        // Arrays con valores y strings
        final int[] valores2 = {1,2,3,4,5};
        String[] efectividad = {"No disponibilidad","<40% de efectividad","40-60% de efectividad","60-95% de efectividad","100% de efectividad"};
        String[] riesgo = {"Significativamente negativo/No aplicable","Inferior al manejo quirúrgico","Equivalente al manejo quirúrgico","Posiblemente mejor que manejo quirúrgico","Superior al manejo quirúrgico"};
        String[] impacto2 = {"Significativamente negativo","Negativo","Moderadamente negativo","Mínimamente negativo","No hay impacto negativo"};
        String[] dificultad2 = {"Significativamente negativo","Negativo","Moderadamente negativo","Mínimamente negativo","No hay impacto negativo"};
        String[] impacto6 = {"Significativamente negativo","Negativo","Moderadamente negativo","Mínimamente negativo","No hay impacto negativo"};
        String[] dificultad6 = {"Significativamente negativo","Negativo","Moderadamente negativo","Mínimamente negativo","No hay impacto negativo"};

        // Spinners
        Spinner spinnerEfectividad = view.findViewById(R.id.spinnerefectividad);
        Spinner  spinnerRiesgo= view.findViewById(R.id.spinnerriesgo);
        Spinner spinnerImpacto2 = view.findViewById(R.id.spinnerimpacto2);
        Spinner spinnerDificultad2 = view.findViewById(R.id.spinnerdificultad2);
        Spinner spinnerImpacto6 = view.findViewById(R.id.spinnerimpacto6);
        Spinner spinnerDificultad6 = view.findViewById(R.id.spinnerdificultad6);

        // Relación spinner con array de strings
        ArrayAdapter<String> adapterEfectividad = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,efectividad);
        spinnerEfectividad.setAdapter(adapterEfectividad);
        ArrayAdapter<String> adapterRiesgo = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,riesgo);
        spinnerRiesgo.setAdapter(adapterRiesgo);
        ArrayAdapter<String> adapterImpacto2 = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,impacto2);
        spinnerImpacto2.setAdapter(adapterImpacto2);
        ArrayAdapter<String> adapterDificultad2 = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,dificultad2);
        spinnerDificultad2.setAdapter(adapterDificultad2);
        ArrayAdapter<String> adapterImpacto6 = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,impacto6);
        spinnerImpacto6.setAdapter(adapterImpacto6);
        ArrayAdapter<String> adapterDificultad6 = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,dificultad6);
        spinnerDificultad6.setAdapter(adapterDificultad6);

        // Funcion del boton seleccionado suma
        final TextView sumaFragmento= getActivity().findViewById(R.id.textresparcial2);


        spinnerEfectividad.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int valor=valores2[position];
                //suma[0]=valor;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        //sumaFragmento.setText("Suma "+ suma);







    }
}
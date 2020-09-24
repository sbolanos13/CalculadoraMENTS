package com.example.avanceapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


import android.widget.TextView;

import java.lang.reflect.Array;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ThirdFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ThirdFragment extends Fragment {

//
//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public ThirdFragment() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment ThirdFragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static ThirdFragment newInstance(String param1, String param2) {
//        ThirdFragment fragment = new ThirdFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_third, container, false);
//
//        view.findViewById(R.id.buttonprevious).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SecondFragmentDirections.ActionSecondFragmentToFirstFragment actionSecondToFirst = SecondFragmentDirections.actionSecondFragmentToFirstFragment();
//                NavHostFragment.findNavController(SecondFragment.this)
//                        .navigate(actionSecondToFirst);
//            }
//        });
//
//        view.findViewById(R.id.botonsig).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SecondFragmentDirections.ActionSecondFragmentToThirdFragment actionSecondToThird = SecondFragmentDirections.actionSecondFragmentToThirdFragment();
//                NavHostFragment.findNavController(SecondFragment.this)
//                        .navigate(actionSecondToThird);
//            }
//        });
//
//
//    }

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
        int[] valores2 = {1,2,3,4,5};
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





    }
}
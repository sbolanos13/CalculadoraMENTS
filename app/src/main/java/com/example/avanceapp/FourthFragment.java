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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FourthFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FourthFragment extends Fragment {
//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public FourthFragment() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment FourthFragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static FourthFragment newInstance(String param1, String param2) {
//        FourthFragment fragment = new FourthFragment();
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
//        return inflater.inflate(R.layout.fragment_fourth, container, false);
//    }


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.botonprevious3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FourthFragmentDirections.ActionFourthFragmentToThirdFragment actionFourthToThird = FourthFragmentDirections.actionFourthFragmentToThirdFragment();
                NavHostFragment.findNavController(FourthFragment.this)
                        .navigate(actionFourthToThird);
            }
        });

        view.findViewById(R.id.buttonresultado2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FourthFragmentDirections.ActionFourthFragmentToFifthFragment actionFourthToFifth = FourthFragmentDirections.actionFourthFragmentToFifthFragment();
                NavHostFragment.findNavController(FourthFragment.this)
                        .navigate(actionFourthToFifth);
            }
        });



        // Arrays con valores y strings
        int[] valores2 = {1,2,3,4,5};
        String[] edad = {"< 20 años","21-40 años","41-50 años","51-65 años","> 65 años"};
        String[]  pulmonar = {"No presenta","No aplica","No aplica","Uso mínimo de inhaladores","Uso frecuente de inhaladores"};
        String[] apnea = {"No presenta","No aplica","No aplica", "Leve a moderada, sin uso de CPAP","Uso de CPAP"};
        String[] cardio = {"No presenta","Mínima, sin medicamentos","Leve, 1 medicamento","Moderada, 2 medicamentos","Severa, 3 o más medicamentos"};
        String[] diabetes = {"No presenta","No aplica","Leve, sin medicamentos","Moderada, solo medicamentos orales","Severa, uso de insulina"};
        String[] inmuno = {"No presenta","No aplica","Leve","Moderado","Severo"};
        String[] influenza = {"Asintomático","No aplica","No aplica","No aplica","Sintomático"};
        String[]  covid= {"No", "Probablemente no","Posiblemente","Probablemente si","Si"};
        // Spinners
        Spinner spinnerEdad = view.findViewById(R.id.spinneredad);
        Spinner spinnerPulmonar = view.findViewById(R.id.spinnerenfpulmonar);
        Spinner spinnerApneaSueno = view.findViewById(R.id.spinnerapneasueno);
        Spinner spinnerEnfCardio = view.findViewById(R.id.spinnerenfcardiov);
        Spinner spinnerDiabetes = view.findViewById(R.id.spinnerdiabetes);
        Spinner spinnerInmuno = view.findViewById(R.id.spinnerinmuno);
        Spinner spinnerInfluenza = view.findViewById(R.id.spinnersintinfluenza);
        Spinner spinnerCovid = view.findViewById(R.id.spinnercovid);
        // Relación spinner con array de strings
        ArrayAdapter<String> adapterEdad = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,edad);
        spinnerEdad.setAdapter(adapterEdad);
        ArrayAdapter<String> adapterPulmonar = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,pulmonar);
        spinnerPulmonar.setAdapter(adapterPulmonar);
        ArrayAdapter<String> adapterApnea = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,apnea);
        spinnerApneaSueno.setAdapter(adapterApnea);
        ArrayAdapter<String> adapterCardio = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,cardio);
        spinnerEnfCardio.setAdapter(adapterCardio);
        ArrayAdapter<String> adapterDiabetes = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,diabetes);
        spinnerDiabetes.setAdapter(adapterDiabetes);
        ArrayAdapter<String> adapterInmuno = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,inmuno);
        spinnerInmuno.setAdapter(adapterInmuno);
        ArrayAdapter<String> adapterInfluenza = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,influenza);
        spinnerInfluenza.setAdapter(adapterInfluenza);
        ArrayAdapter<String> adapterCovid = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,covid);
        spinnerCovid.setAdapter(adapterCovid);

    }
}
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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FourthFragment#} factory method to
 * create an instance of this fragment.
 */
public class FourthFragment extends Fragment {

    int[] sumaPaciente = new int[8];

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
        final TextView resparcial3 = view.findViewById(R.id.textresparcial3);
        final int sumaAcumulada = FourthFragmentArgs.fromBundle(getArguments()).getSumaPaciente();

        view.findViewById(R.id.botonprevious3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FourthFragmentDirections.ActionFourthFragmentToThirdFragment actionFourthToThird = FourthFragmentDirections.actionFourthFragmentToThirdFragment();
                NavHostFragment.findNavController(FourthFragment.this)
                        .navigate(actionFourthToThird);
            }
        });


        // Arrays con valores y strings
        final int[] valores = {1,2,3,4,5};
        final int[] valores2 = {1,5};
        final int[] valores3 = {1,4,5};
        final int[] valores4 = {1,3,4,5};
        String[] edad = {"< 20 años","21-40 años","41-50 años","51-65 años","> 65 años"};
        String[]  pulmonar = {"No presenta","Uso mínimo de inhaladores","Uso frecuente de inhaladores"};
        String[] apnea = {"No presenta", "Leve a moderada, sin uso de CPAP","Uso de CPAP"};
        String[] cardio = {"No presenta","Mínima, sin medicamentos","Leve, 1 medicamento","Moderada, 2 medicamentos","Severa, 3 o más medicamentos"};
        String[] diabetes = {"No presenta","Leve, sin medicamentos","Moderada, solo medicamentos orales","Severa, uso de insulina"};
        String[] inmuno = {"No presenta","Leve","Moderado","Severo"};
        String[] influenza = {"Asintomático","Sintomático"};
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

        spinnerEdad.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sumaPaciente[0] = valores[position];
                //Suma de Paciente
                int i; /* contador */
                int totalPaciente = 0;
                /* suma el contenido del arreglo sumaEnfermedad */
                for ( i = 0; i < 8; i++ )
                { totalPaciente += sumaPaciente[ i ]; }
                // Total es el resultado de la suma de la enfermedad
                resparcial3.setText("Resultado Paciente "+ totalPaciente);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinnerPulmonar.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sumaPaciente[1] = valores3[position];
                //Suma de Paciente
                int i; /* contador */
                int totalPaciente = 0;
                /* suma el contenido del arreglo sumaEnfermedad */
                for ( i = 0; i < 8; i++ )
                { totalPaciente += sumaPaciente[ i ]; }
                // Total es el resultado de la suma de la enfermedad
                resparcial3.setText("Resultado Paciente "+ totalPaciente);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinnerApneaSueno.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sumaPaciente[2] = valores3[position];
                //Suma de Paciente
                int i; /* contador */
                int totalPaciente = 0;
                /* suma el contenido del arreglo sumaEnfermedad */
                for ( i = 0; i < 8; i++ )
                { totalPaciente += sumaPaciente[ i ]; }
                // Total es el resultado de la suma de la enfermedad
                resparcial3.setText("Resultado Paciente "+ totalPaciente);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinnerEnfCardio.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sumaPaciente[3] = valores[position];
                //Suma de Paciente
                int i; /* contador */
                int totalPaciente = 0;
                /* suma el contenido del arreglo sumaEnfermedad */
                for ( i = 0; i < 8; i++ )
                { totalPaciente += sumaPaciente[ i ]; }
                // Total es el resultado de la suma de la enfermedad
                resparcial3.setText("Resultado Paciente "+ totalPaciente);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinnerDiabetes.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sumaPaciente[4] = valores4[position];
                //Suma de Paciente
                int i; /* contador */
                int totalPaciente = 0;
                /* suma el contenido del arreglo sumaEnfermedad */
                for ( i = 0; i < 8; i++ )
                { totalPaciente += sumaPaciente[ i ]; }
                // Total es el resultado de la suma de la enfermedad
                resparcial3.setText("Resultado Paciente "+ totalPaciente);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinnerInmuno.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sumaPaciente[5] = valores4[position];
                //Suma de Paciente
                int i; /* contador */
                int totalPaciente = 0;
                /* suma el contenido del arreglo sumaEnfermedad */
                for ( i = 0; i < 8; i++ )
                { totalPaciente += sumaPaciente[ i ]; }
                // Total es el resultado de la suma de la enfermedad
                resparcial3.setText("Resultado Paciente "+ totalPaciente);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinnerInfluenza.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sumaPaciente[6] = valores2[position];
                //Suma de Paciente
                int i; /* contador */
                int totalPaciente = 0;
                /* suma el contenido del arreglo sumaEnfermedad */
                for ( i = 0; i < 8; i++ )
                { totalPaciente += sumaPaciente[ i ]; }
                // Total es el resultado de la suma de la enfermedad
                resparcial3.setText("Resultado Paciente "+ totalPaciente);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinnerCovid.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sumaPaciente[7] = valores[position];
                //Suma de Paciente
                int i; /* contador */
                int totalPaciente = 0;
                /* suma el contenido del arreglo sumaEnfermedad */
                for ( i = 0; i < 8; i++ )
                { totalPaciente += sumaPaciente[ i ]; }
                // Total es el resultado de la suma de la enfermedad
                resparcial3.setText("Resultado Paciente "+ totalPaciente);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });



        view.findViewById(R.id.buttonresultado2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Suma de Paciente
                int i; /* contador */
                int totalPaciente = 0;
                /* suma el contenido del arreglo sumaEnfermedad */
                for ( i = 0; i < 8; i++ )
                { totalPaciente += sumaPaciente[ i ]; }
                // Total es el resultado de la suma de la enfermedad
                int sumaProcEnfPac = sumaAcumulada+totalPaciente;

                FourthFragmentDirections.ActionFourthFragmentToFifthFragment actionFourthToFifth = FourthFragmentDirections.actionFourthFragmentToFifthFragment();
                actionFourthToFifth.setArg5(sumaProcEnfPac);
                NavHostFragment.findNavController(FourthFragment.this)
                        .navigate(actionFourthToFifth);
            }
        });

    }
}
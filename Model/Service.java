package com.kpi.javaLabs.Model;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Service {

    private static DataSource data = new DataSource();
    private static Patient[] patients = new Patient[1000];
    private static int patientsAmmount = 0;

    public Patient[] getPatients(){
        return Arrays.copyOf(patients, patientsAmmount);
    }

    public static int getPatientsAmmount(){
        return patientsAmmount;
    }

    public String[] getDiagnosisList(){
        return data.getDiagnosis();
    }

    public void createPatients(int ammount){
        for(int i = 0; i < ammount ; i++){
            patients[patientsAmmount] = new Patient(patientsAmmount);
            patientsAmmount++;
        }
    }

    public Patient[] getPatientsWithDiagnosis(String diagnosis ){
        Patient[] patientsDiagnosis = new Patient[patientsAmmount+1];
        if(patientsAmmount>0 && patientsAmmount<1000){
        int currentPatientCounter = 0;
            for (int i = 0; i < patientsAmmount; i++) {
                if (patients[i].getDiagnosis().equals(diagnosis)) {
                    patientsDiagnosis[currentPatientCounter] = patients[i];
                    currentPatientCounter++;
                }
            }
        }
        return patientsDiagnosis;
    }

    public Patient[] getPatientsWithMedCard(int[] ranges){
        Patient[] patientsMedCard = new Patient[1000];
        if(ranges[0]!=0 && ranges[1] != 0){
            int currentCardCounter = 0;
            for (int i = 0; i < (ranges[1]); i++) {
                if (ranges[0] <= patients[i].getMedCardNum() && patients[i].getMedCardNum() <= ranges[1]) {
                    if(patients[i] != null){
                        patientsMedCard[currentCardCounter] = patients[i];
                        currentCardCounter++;
                    }
                }
            }
        }
        return patientsMedCard;
    }
}

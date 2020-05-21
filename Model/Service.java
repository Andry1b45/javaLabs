package com.kpi.javaLabs.Model;

import java.util.Arrays;

public class Service {

    private static Patient[] patients = new Patient[1000];
    private static FileHandler fileHandler = new FileHandler();
    private static int patientsAmmount;

    public Service(){
        Patient[] readedArray = fileHandler.importFromFile();
        patientsAmmount = fileHandler.getImportedAmmount();
        System.arraycopy(readedArray, 0, patients, 0, patientsAmmount);
    }


    public void createPatients(int ammount){
        if (ammount != 0){
            for (int i = 0; i < ammount; i++) {
                patients[patientsAmmount] = new Patient(patientsAmmount);
                patientsAmmount++;
            }
        }
    }

    public void exportToFile(){
        fileHandler.exportToFile(patientsAmmount, patients);
    }

    public Patient[] getPatients(){
        return Arrays.copyOf(patients, patientsAmmount);
    }

    public static int getPatientsAmmount(){
        return patientsAmmount;
    }

    public String[] getDiagnosisList(){
        return Patient.getDiagnosisList();
    }

    public Patient[] getPatientsWithDiagnosis(String diagnosis){
        Patient[] patientsDiagnosis = new Patient[patientsAmmount];
        Patient[] finalPatients = new Patient[1];
        if(patientsAmmount>0 && patientsAmmount<1000){
        int currentPatientCounter = 0;
            for (int i = 0; i < patientsAmmount; i++) {
                if (patients[i].getDiagnosis().equals(diagnosis)) {
                    patientsDiagnosis[currentPatientCounter] = patients[i];
                    currentPatientCounter++;
                }
            }
            finalPatients = new Patient[currentPatientCounter];
            System.arraycopy(patientsDiagnosis, 0 , finalPatients, 0, currentPatientCounter);
        }
        return finalPatients;
    }

    public Patient[] getPatientsWithMedCard(int[] ranges){
        Patient[] patientsMedCard = new Patient[patientsAmmount];
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

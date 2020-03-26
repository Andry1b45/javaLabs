package com.kpi.javaLabs.Model;

public class Service {

    private static DataSource data = new DataSource();
    private static Patient[] patients = new Patient[1000];
    private static int counter  = 0;

    public Patient[] getPatients(){
        return patients;
    }

    public static int getCounter(){
        return counter;
    }

    public void createPatients(int n){
        for(int i = 0; i < n ; i++){
            patients[counter] = new Patient(counter);
            counter++;
        }
    }

    public Patient[] showPatientsWithDiagnosis(int n){
        Patient[] patientsDiagnosis = new Patient[1000];
        int z = 0;
        if (counter != 0) {
            for (int i = 0; i < counter; i++) {
                if (patients[i].getDiagnosis().equals(data.getDiagnosis(n - 1))) {
                    patientsDiagnosis[z] = patients[i];
                    z++;
                }
            }
            if(z==0) System.out.println("There aren't patients with this diagnosis");
            return patientsDiagnosis;
        } else{
            System.out.println("Create patients first or input valid diagnosis key!");
            return null;
        }
    }

    public Patient[] showPatientsWithMedCard(int[] arr){
        Patient[] patientsMedCard = new Patient[1000];
        int z = 0;
        for (int i = 0; i < (arr[1]); i++) {
            if (arr[0] <= patients[i].getMedCardNum() && patients[i].getMedCardNum() <= arr[1]) {
                if(patients[i] != null){
                    patientsMedCard[z] = patients[i];
                    z++;
                }
            }
        }
        return patientsMedCard;
    }
}

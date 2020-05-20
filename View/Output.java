package com.kpi.javaLabs.View;

import com.kpi.javaLabs.Model.Patient;

public class Output {

    public void showAllPatients(Patient[] patients){
        System.out.println(" ___________________________________________________" +
                    "_________________________________________________________________" +
                    "_________________________________________________________________\n");
        for (Patient patientCounter: patients) {
            System.out.println(patientCounter);
            System.out.println(" ___________________________________________________" +
                    "_________________________________________________________________" +
                    "_________________________________________________________________\n");
        }
    }

    public static void showError(Exception e){
        System.err.println(e.getMessage());
    }


    public void showDiagnosisList(String[] listOfDiagnosis){
        System.out.println("List of diagnosis:");
        for(int i=0; i<10; i++){
            System.out.println(i+1 + ". " + listOfDiagnosis[i]);
        }
        System.out.println("\nInput diagnosis:");
    }

    public void showMenu(){
        System.out.println("\tMenu\n");
        System.out.println("1. Create patients");
        System.out.println("2. Show all patients");
        System.out.println("3. Show patients list with choosen diagnosis");
        System.out.println("4. Show patients list with choosen med card number range");
        System.out.println("5. Exit");
        System.out.println("Input: ");
    }
    public static void showInputMessage(){
        System.out.println("Input number:");
    }

}


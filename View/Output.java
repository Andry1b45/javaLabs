package com.kpi.javaLabs.View;

import com.kpi.javaLabs.Model.Patient;
import com.kpi.javaLabs.Model.Service;

public class Output {

    public void showAllPatients(Patient[] patients){
        if(patients[0] == null){
            System.out.println("No patients to show!");
        }
        else {
            System.out.println("");
            for (int i = 0; i < Service.getPatientsAmmount(); i++) {
                if (patients[i] != null) {
                    System.out.println(patients[i]);
                    System.out.println("___________________________________________________" +
                            "______________________________________________________________" +
                            "______________________________________________________________\n");
                }
            }
        }
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

    public static void showError(){
        System.out.println("Please, input again!");
    }
}


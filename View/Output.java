package com.kpi.javaLabs.View;

import com.kpi.javaLabs.Model.DataSource;
import com.kpi.javaLabs.Model.Patient;
import com.kpi.javaLabs.Model.Service;

public class Output {

    private DataSource data = new DataSource();

    public void showAllPatients(Patient[] patients){
        int z = 0;
        for(int i = 0; i < Service.getCounter(); i++) {
            if(patients[i] != null) {
                System.out.println(patients[i]);
            }
        }
        if(z==0) System.out.println("No patients to show!\n");
    }

    public void showDiagnosisList(){
        System.out.println("List of diagnosis:");
        for(int i=0; i<10; i++){
            System.out.println(i+1 + ". " + data.getDiagnosis(i));
        }
        System.out.println("\n");
    }

    public  static void showMenu(){
        System.out.println("\tMenu\n");
        System.out.println("1. Create patients");
        System.out.println("2. Show all patients");
        System.out.println("3. Show patients list with choosen diagnosis");
        System.out.println("4. Show patients list with choosen med card number range");
        System.out.println("5. Exit");
        System.out.println("Input: ");
    }

}

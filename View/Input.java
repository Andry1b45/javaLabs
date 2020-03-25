package com.kpi.javaLabs.View;

import java.io.*;

public class Input {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private int key;

    public static String inputData() throws IOException {
        String data = reader.readLine();
        return data;
    }

    public int menu() {
        key = 0;
        do {
            getMenuKey();
        } while (key == -1);
        return key;
    }

    private int getMenuKey() {
        try {
            key = Integer.parseInt(inputData());
        } catch (Exception e) {
            System.out.println("Error! Input another key\n");
            return -1;
        }
        if (Validation.checkMenuKey(key)) return key;
        return -1;
    }

    public int ammountOfPatients() {
        int ammount = 0;
        System.out.println("How much patients do you want to create?");
        try {
            ammount = Integer.parseInt(inputData());
        } catch (Exception e) {
            System.out.println("Error! Input another key\n");
            return -1;
        }
        if(Validation.checkPatientsAmmount(ammount)) return ammount;
        return -1;
    }

    public int getDiagnosisKey() {
        do {
            try {
                key = Integer.parseInt(inputData());
            } catch (Exception e) {
                System.out.println("Error! Input another key\n");
                return -1;
            }
        }while (!(Validation.checkDiagnosisKey(key)));
            return key;
    }

    public int[] getIdRange() {
        int[] arr = {0 , 0};
        do{
            arr[0] = 0; arr[1] = 0;
            try {
                while (arr[0] == 0 || arr[1] == 0){
                    System.out.println("Input first number: ");
                    arr[0] = Integer.parseInt(inputData());
                    System.out.println("Input second number: ");
                    arr[1] = Integer.parseInt(inputData());
                }
            } catch (Exception e) {
                System.out.println("Input keys:");
            }
        }while (!(Validation.checkRangeKeys(arr[0], arr[1])));
        return arr;
    }
}

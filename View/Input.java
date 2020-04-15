package com.kpi.javaLabs.View;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);
    private int key;
    private String diagnosis;

    public String inputData() {
        String data = scanner.nextLine();
        return data;
    }

    public int menu() {
        key = 0;
        do {
            if(key == -1)
                Output.showError();
            key = getMenuKey();
        } while (key == -1);
        return key;
    }

    private int getMenuKey() {
        key = Integer.parseInt(inputData());
        if (Validation.checkMenuKey(key)) return key;
        return -1;
    }

    public int ammountOfPatients() {
        int patientsAmmount = 0;
        patientsAmmount = Integer.parseInt(inputData());
        if(Validation.checkPatientsAmmount(patientsAmmount)) return patientsAmmount;
        return -1;
    }

    public String getDiagnosis() {
        do {
            diagnosis = inputData();
        }while (!(Validation.checkDiagnosis(diagnosis)));
            return diagnosis;
    }

    public int[] getIdRange() {
        int[] rangeArray = {0 , 0};
        int errorCounter = 0;
        do{
            rangeArray[0] = 0; rangeArray[1] = 0;
            if (errorCounter == 3)
                break;
            while (rangeArray[0] == 0 || rangeArray[1] == 0){
                Output.showInputMessage();
                rangeArray[0] = Integer.parseInt(inputData());
                Output.showInputMessage();
                rangeArray[1] = Integer.parseInt(inputData());
            }
            errorCounter++;
        }while (!(Validation.checkRangeKeys(rangeArray[0], rangeArray[1])));
        return rangeArray;
    }
}

package com.kpi.javaLabs.View;
import java.util.Scanner;
import com.kpi.javaLabs.Exceptions.*;

public class Input {

    private static Scanner scanner = new Scanner(System.in);
    private int key;
    private final int ERROR_KEY = -1;
    private String diagnosis;

    public String inputData() {
        String data = scanner.nextLine();
        return data;
    }

    public int menu() {
        key = 0;
        do {
            key = getMenuKey();
        } while (key == -1);
        return key;
    }

    private int getMenuKey() {
        String keyString = inputData();
        try{
            Validation.checkMenuKey(keyString);
        }
        catch (WrongNumberException e){
            System.err.println(e.getMessage());
            return ERROR_KEY;
        }
        key = Integer.parseInt(keyString);
        return key;
    }

    public int ammountOfPatients() {
        String ammountString = inputData();
        try{
            Validation.checkPatientsAmmount(ammountString);
        }
        catch (WrongNumberException e){
            System.err.println(e.getMessage());
            return ERROR_KEY;
        }
        int patientsAmmount = Integer.parseInt(ammountString);
        return patientsAmmount;
    }

    public String getDiagnosis() {
        while (true){
            diagnosis = inputData();
            try{
                Validation.checkDiagnosis(diagnosis);
            }
            catch(WrongTextException e){
                System.err.println(e.getMessage());
            }
            break;
        }
        return diagnosis;
    }

    public int[] getIdRange() {
        int[] rangeArray = {0 , 0};
        while(true){
            rangeArray[0] = 0; rangeArray[1] = 0;
            while (rangeArray[0] == 0 || rangeArray[1] == 0){
                Output.showInputMessage();
                rangeArray[0] = Integer.parseInt(inputData());
                Output.showInputMessage();
                rangeArray[1] = Integer.parseInt(inputData());
            }
            try{
                Validation.checkRangeKeys(rangeArray[0], rangeArray[1]);
            }
            catch (WrongNumberException e){
                rangeArray[0] = 0;
                rangeArray[1] = 0;
                System.err.println(e.getMessage());
            }
            break;
        }
        return rangeArray;
    }
}

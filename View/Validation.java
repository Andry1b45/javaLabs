package com.kpi.javaLabs.View;

import com.kpi.javaLabs.Model.Service;
import com.kpi.javaLabs.View.Exceptions.*;

public class Validation {

    static void checkMenuKey(String keyString){
        if(keyString.matches("\\d+")){
            int key = Integer.parseInt(keyString);
            if( 0 > key || key > 5){
                throw new WrongNumberException("Error, wrong key!");
            }
        }
        else{
            throw new WrongNumberException("Error, dont use letters!");
        }
    }

    static void checkPatientsAmmount(String ammountString){
        if (ammountString.matches("\\d+")) {
            int ammount = Integer.parseInt(ammountString);
            if (ammount <= 0 || ammount >= 1001) {
                throw new WrongNumberException("Error, wrong ammount!");
            }
        }
        else{
            throw new WrongNumberException("Error, dont use letters!");
        }
    }

    static void checkDiagnosis(String diagnosis){
        if(diagnosis.equals("")){
            throw new WrongTextException("Diagnosis is empty!");
        }
        else if(diagnosis.matches("\\d+")){
            throw new WrongTextException("Do not use numbers!");
        }
    }

    static void checkRangeKeys(int a, int b){
        System.out.println(Service.getPatientsAmmount());
        if( a <= 0 || b <=0 || a > Service.getPatientsAmmount() ||
                b > Service.getPatientsAmmount()|| a-b >= 0 ){
            throw new WrongNumberException("Error, input another numbers!");
        }
    }
}

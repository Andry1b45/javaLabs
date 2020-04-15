package com.kpi.javaLabs.View;

import com.kpi.javaLabs.Model.Service;

public class Validation {

    static boolean checkMenuKey(int key){
        if( 0 > key || key > 4){
            return false;
        }
        return true;
    }

    public static boolean checkPatientsAmmount(int ammount){
        if( ammount <= 0 || ammount >= 1001){
            return false;
        }
        return true;
    }

    static boolean checkDiagnosis(String diagnosis){        //todo сделать проверку через передачу словаря диагнозов
        if(diagnosis.equals("")){
            return false;
        }
        return true;
    }

    static boolean checkRangeKeys(int a, int b){
        if( a <= 0 || b <=0 || a > Service.getPatientsAmmount() ||  b > Service.getPatientsAmmount()|| a-b >= 0 ){
            return false;
        }
        else return true;
    }
}

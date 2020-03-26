package com.kpi.javaLabs.View;

import com.kpi.javaLabs.Model.Service;

public class Validation {

    static boolean checkMenuKey(int key){
        if( 0 > key || key > 4){
            return false;
        }
        return true;
    }

    static boolean checkPatientsAmmount(int ammount){
        if( ammount <= 0 || ammount >= 1001){
            return false;
        }
        return true;
    }

    static boolean checkDiagnosisKey(int key){
        if( 0 > key || key > 10){
            return false;
        }
        return true;
    }

    static boolean checkRangeKeys(int a, int b){
        if( a <= 0 || b <=0 || b > Service.getCounter()){
            return false;
        }
        else return true;
    }
}

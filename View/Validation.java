package com.kpi.javaLabs.View;

import com.kpi.javaLabs.Model.Service;

public class Validation {

    static boolean checkMenuKey(int key){
        if( 0 > key || key > 4){
            System.out.println("Wrong key! Try again!\n");
            return false;
        }
        return true;
    }

    static boolean checkDiagnosisKey(int key){
        if( 0 > key || key > 10){
            System.out.println("Wrong key! Try again!\n");
            return false;
        }
        return true;
    }

    static boolean checkRangeKeys(int a, int b){
        if( a <= 0 || b <=0 || b > Service.getCounter()){
            System.out.println("Wrong keys! Try again!\n");
            return false;
        }
        else return true;
    }
}

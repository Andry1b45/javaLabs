package com.kpi.javaLabs.Model;

import javax.xml.crypto.Data;

public class Patient {

    private int Id;
    private String Surname;
    private String Name;
    private String Patronymic;
    private String Address;
    private String Phone;
    private int MedCardNum;
    private String Diagnosis;

    private static DataSource data = new DataSource();
    private static String[] DiagnosisList = data.getDiagnosis();

    public Patient(int counter){
        this.Id = data.getRandId();
        this.Surname = data.getRandSurname();
        this.Name = data.getRandName();
        this.Patronymic = data.getRandPatronymic();
        this.Address = data.getRandAddress();
        this.Phone = data.getRandPhone();
        this.MedCardNum = counter+1;
        this.Diagnosis = data.getRandDiagnosis();
    }

    @Override
    public String toString() {
        return String.format( "|Patient ID: %-3d | Surname: %-8s | Name: %-7s | Patronymic: %-15s |" +
                " Address: %-15s | Phone: %-13s | MedCard Number: %-3d | Diagnosis: %-14s |",
                Id, Surname, Name, Patronymic, Address, Phone, MedCardNum, Diagnosis);
    }

    public static String[] getDiagnosisList(){
        return DiagnosisList;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public int getMedCardNum() {
        return MedCardNum;
    }
}

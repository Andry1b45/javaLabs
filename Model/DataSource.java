package com.kpi.javaLabs.Model;

public class DataSource {

    private String[] Surname = {"Johnson", "Lynn", "Eaton", "Blakeley",
            "Durham", "Hale", "Oakley", "Morton", "Norton", "Cason"};

    private String[] Name = {"Andrew", "Bob", "John", "Bill", "David",
            "Ashley", "Felicia", "Janet", "Lora", "Molly"};

    private String[] Patronymic = {"Antonovich", "Orestovich", "Veniaminovich",
            "Ibragimovich", "Eduardovich", "Borisovich", "Lvovich", "Nikitich", "Ulyanovich", "Viktorovich"};

    private String[] Address = {"Park_st_13", "Oak_st_132", "Eighth_st_121", "Washington_st_1",
            "Main_st_56", "Ninth_st_98", "Main_View_st_77", "Hill_st_13", "Eight_st_8", "Cedar_st_10"};

    private String[] Phone = {"011-111-11-11", "022-222-22-22", "033-333-33-33", "044-444-44-44",
            "055-555-55-55", "066-666-66-66", "077-777-77-77", "088-888-88-88", "099-999-99-99", "000-000-00-00"};

    private String[] Diagnosis = {"Hypertension", "Diabetes", "Obesity", "Osteoarthritis",
            "Anxiety", "Asthma", "Cancer", "Flu", "Allergy", "Pain_in_joint"};

    public int getRandId(){
        int randInt = 1 + (int) (Math.random() * 1000);
        return randInt;
    }

    public String getRandSurname(){
        int randInt = 0 + (int) (Math.random() * 10);
        return Surname[randInt];
    }

    public String getRandName(){
        int randInt = 0 + (int) (Math.random() * 10);
        return Name[randInt];
    }

    public String getRandPatronymic(){
        int randInt = 0 + (int) (Math.random() * 10);
        return Patronymic[randInt];
    }

    public String getRandAddress(){
        int randInt = 0 + (int) (Math.random() * 10);
        return Address[randInt];
    }

    public String getRandPhone(){
        int randInt = 0 + (int) (Math.random() * 10);
        return Phone[randInt];
    }

    public String getRandDiagnosis(){
        int randInt = 0 + (int) (Math.random() * 10);
        return Diagnosis[randInt];
    }

    public String[] getDiagnosis(){
        return  Diagnosis;
    }
}

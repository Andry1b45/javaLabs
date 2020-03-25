package com.kpi.javaLabs.Model;

public class DataSource {

    private String[] Surname = {"Johnson", "Lynn", "Eaton", "Blakeley",
            "Durham", "Hale", "Oakley", "Morton", "Norton", "Cason"};

    private String[] Name = {"Andrew", "Bob", "John", "Bill", "David",
    "Ashley", "Felicia", "Janet", "Lora", "Molly"};

    private String[] Patronymic = {"Antonovich", "Orestovich", "Veniaminovich",
    "Ibragimovich", "Eduardovich", "Borisovich", "Lvovich", "Nikitich", "Ulyanovich",
    "Viktorovich"};

    private String[] Address = {"Park st 13", "Oak st 132", "Eighth st 121", "Washington st 1",
    "Main st 56", "Ninth st 98", "com.kpi.javaLabs.View st 77", "Hill st 13", "Eight st 8", "Cedar st 10"};

    private String[] Phone = {"011-111-11-11", "022-222-22-22", "033-333-33-33", "044-444-44-44",
    "055-555-55-55", "066-666-66-66", "077-777-77-77", "088-888-88-88", "099-999-99-99",
    "000-000-00-00"};

    private String[] Diagnosis = {"Hypertension", "Diabetes", "Obesity", "Osteoarthritis",
    "Anxiety", "Asthma", "Coronary atherosclerosis", "Acute bronchitis", "Allergic rhinitis",
    "Pain in joint"};

    //todo проверка на существующий айди
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

    public String getDiagnosis(int n){
        return  Diagnosis[n];
    }
}

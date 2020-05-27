package com.kpi.javaLabs.Model;
import com.kpi.javaLabs.View.Output;

import java.io.*;


public class FileHandler {

    private String filePath = "./src/com/kpi/javaLabs/Input.txt";
    private int importedAmmount = 0;

    Patient[] importFromFile(){
        Patient[] patients = new Patient[1000];
        try(FileReader fileReader = new FileReader(filePath)) {
            BufferedReader buffReader = new BufferedReader(fileReader);

            for(int i = 0; buffReader.read() != -1; i++){
                String readData = buffReader.readLine();
                String[] formattedReadData = readData.split(" ");

                patients[i] = new Patient(importedAmmount);
                patients[i].setMedCardNum(Integer.parseInt(formattedReadData[0]));
                patients[i].setId(Integer.parseInt(formattedReadData[1]));
                patients[i].setSurname(formattedReadData[2]);
                patients[i].setName(formattedReadData[3]);
                patients[i].setPatronymic(formattedReadData[4]);
                patients[i].setAddress(formattedReadData[5]);
                patients[i].setPhone(formattedReadData[6]);
                patients[i].setDiagnosis(formattedReadData[7]);
                importedAmmount++;
            }
            buffReader.close();
        }
        catch (FileNotFoundException exc){
            Output.showError(exc);      //todo передавать эти ошибки на сервис, а потом на контроллер
        }
        catch (IOException e){
            Output.showError(e);
        }
        Patient[] importedPatients = new Patient[importedAmmount];
        System.arraycopy(patients, 0, importedPatients, 0, importedAmmount);
        return importedPatients;
    }

    void exportToFile(int ammountOfPatients, Patient[] patients){
        if(patients.length == 0){
            return;
        }
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter buffWriter = new BufferedWriter(fileWriter);

            for(int i = 0; i < ammountOfPatients; i++){
                String toWrite = " " + patients[i].getMedCardNum()+ " " + patients[i].getId() + " "
                        + patients[i].getSurname() + " " + patients[i].getName() + " "
                        + patients[i].getPatronymic() + " " + patients[i].getAddress() + " "
                        + patients[i].getPhone() + " " + patients[i].getDiagnosis() + "\n";
                buffWriter.write(toWrite);
            }
            buffWriter.close();
        }
        catch (FileNotFoundException exc){
            Output.showError(exc);
        }
        catch (IOException e){
            Output.showError(e);
        }
    }

    public int getImportedAmmount() {
        return importedAmmount;
    }
}

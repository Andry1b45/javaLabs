package com.kpi.javaLabs.Model;

import org.apache.log4j.Logger;

import java.io.*;


public class FileHandler {
    final static Logger logger = Logger.getLogger(FileHandler.class);
    private String filePath = "./src/main/java/com.kpi.javaLabs/Input.txt";
    private int importedAmmount = 0;

    Patient[] importFromFile() throws IOException {
        Patient[] patients = new Patient[1000];
        try(BufferedReader buffReader = new BufferedReader(new FileReader(filePath))) {
            logger.info("Starting file reading");

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
            logger.info("Ending file reading");
        }
        catch (FileNotFoundException exc){
            throw (exc);
        }
        catch (IOException e){
            throw (e);
        }
        Patient[] importedPatients = new Patient[importedAmmount];
        System.arraycopy(patients, 0, importedPatients, 0, importedAmmount);
        return importedPatients;
    }

    void exportToFile(int ammountOfPatients, Patient[] patients) throws IOException {
        if(patients.length == 0){
            return;
        }
        try( BufferedWriter buffWriter = new BufferedWriter(new FileWriter(filePath, true));) {
            logger.info("Starting file writing");
            for(int i = 0; i < ammountOfPatients; i++){
                String toWrite = " " + patients[i].getMedCardNum()+ " " + patients[i].getId() + " "
                        + patients[i].getSurname() + " " + patients[i].getName() + " "
                        + patients[i].getPatronymic() + " " + patients[i].getAddress() + " "
                        + patients[i].getPhone() + " " + patients[i].getDiagnosis() + "\n";
                buffWriter.write(toWrite);
            }
            logger.info("Ending file writing");
        }
        catch (FileNotFoundException exc){
            throw (exc);
        }
        catch (IOException e){
            throw (e);
        }

    }

    public int getImportedAmmount() {
        return importedAmmount;
    }
}

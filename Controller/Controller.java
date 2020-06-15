package com.kpi.javaLabs.Controller;

import com.kpi.javaLabs.Model.Service;
import com.kpi.javaLabs.View.Input;
import com.kpi.javaLabs.View.Output;
import org.apache.log4j.Logger;

import java.io.IOException;

public class Controller {
    private Input input;
    private Output output;
    private Service service;
    final static Logger logger = Logger.getLogger(Controller.class);

    public Controller(){
        this.input = new Input();
        this.output = new Output();
        try{
            this.service = new Service();
        } catch (IOException e) {
            output.showError(e);
            logger.error("File exception: " + e.getMessage());
            System.exit(-1);
        }
    }

    public void run(){
        while (true){
            output.showMenu();
            execute(input.menu());
        }
    }

    private void execute(int caseVariable){
        switch (caseVariable) {
            case 1:{
                output.showMessage("How much patients do you want to create?");
                service.createPatients(input.getAmmountOfPatients());
                output.showAllPatients(service.getPatients());
                break;
            }
            case 2:{
                output.showAllPatients(service.getPatients());
                break;
            }
            case 3:{
                output.showDiagnosisList(service.getDiagnosisList());
                output.showAllPatients(service.getPatientsWithDiagnosis(input.getDiagnosis()));
                break;
            }
            case 4:{
                output.showAllPatients(service.getPatientsWithMedCard(input.getIdRange()));
                break;
            }
            case 5:{
                output.showMessage("Goodbye");
                try{
                    service.exportToFile();
                }
                catch(IOException e){
                    logger.error("File exception: " + e.getMessage());
                    output.showError(e);
                    System.exit(-1);
                }
                System.exit(1);
            }
        }
    }
}

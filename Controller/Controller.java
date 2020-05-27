package com.kpi.javaLabs.Controller;

import com.kpi.javaLabs.Model.Service;
import com.kpi.javaLabs.View.Input;
import com.kpi.javaLabs.View.Output;

public class Controller {
    private Input input;
    private Output output;
    private Service service;        //todo обработать исключения проблемы чтения файла и вывести пользователю, что проблема

    public Controller(){
        this.input = new Input();
        this.output = new Output();
        this.service = new Service();
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
                service.exportToFile();
                System.exit(1);
                break;
            }
            default:
                break;
        }
    }
}

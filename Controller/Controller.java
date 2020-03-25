package com.kpi.javaLabs.Controller;

import com.kpi.javaLabs.Model.Service;
import com.kpi.javaLabs.View.Input;
import com.kpi.javaLabs.View.Output;


public class Controller {
    private Input input;
    private Output output;
    private Service service;
    private boolean run;

    public Controller(){
        this.input = new Input();
        this.output = new Output();
        this.service = new Service();
    }


    public void run(){
        run = true;
        while (run == true){
            Output.showMenu();
            int caseVariable = input.menu();
            execute(caseVariable);
        }
    }

    private void execute(int caseVariable){
        switch (caseVariable) {
            case 1:{
                service.createPatients(input.ammountOfPatients());
                output.showAllPatients(service.getPatients());
                break;
            }
            case 2:{
                output.showAllPatients(service.getPatients());
                break;
            }
            case 3:{
                output.showDiagnosisList();
                output.showAllPatients(service.showPatientsWithDiagnosis(input.getDiagnosisKey()));
                break;
            }
            case 4:{
                output.showAllPatients(service.showPatientsWithMedCard(input.getIdRange()));
                break;
            }
            case 5:{
                System.out.println("Goodbye");
                run = false;
                break;
            }
            default:
                break;
        }
    }

}

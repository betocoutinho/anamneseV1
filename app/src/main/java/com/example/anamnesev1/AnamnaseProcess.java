package com.example.anamnesev1;

import java.util.ArrayList;

public class AnamnaseProcess {
    private int idade;
    private ArrayList<Boolean> case1 = new ArrayList<Boolean>();
    private ArrayList<Boolean> case2 = new ArrayList<Boolean>();

    public AnamnaseProcess(int idade){
        this.idade = idade;
    }

    public void feedCase1(boolean status){
        this.case1.add(status);
    }

    public void feedCase3(boolean status){
        this.case2.add(status);
    }

    public String processReturn(){

        if (case1.size() >= 7 && case1.stream().allMatch(t -> t == true) ){
            return "Procure um cardiologista com urgencia";
        }else if(case2.size() >= 7 && case2.stream().allMatch(t -> t == true)){
            return "O paciente não apresenta no momento nenhuma queixa\n" +
                    "que possa ser encaminhado a alguma especialidade médica";
        }else{
            return "Não foi encontrado nenhum problema";
        }

    }
}

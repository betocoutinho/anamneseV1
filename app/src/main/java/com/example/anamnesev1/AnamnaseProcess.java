package com.example.anamnesev1;

import java.util.ArrayList;

public class AnamnaseProcess {
    private ArrayList<Boolean> case1 = new ArrayList<Boolean>();
    private ArrayList<Boolean> case2 = new ArrayList<Boolean>();

    public void feedCase1(boolean status){
        this.case1.add(status);
    }

    public void feedCase2(boolean status){
        this.case2.add(status);
    }

    public String processReturn(int idade){

        if (case1.size() >= 7 && case1.stream().allMatch(t -> t == true ) && idade >= 45){
            return "Procure um Cardiologista com Urgencia";
        }else if(case2.size() >= 5 && case2.stream().allMatch(t -> t == true) && idade < 45){
            return "O paciente não apresenta no momento nenhuma queixa\n" +
                    "que possa ser encaminhado a alguma especialidade médica";
        }else{
            return "Não foi encontrado nenhum problema";
        }

    }
}

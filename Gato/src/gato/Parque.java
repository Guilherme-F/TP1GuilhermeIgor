/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

/**
 *
 * Igor @author aluno
 */
public class Parque {
    public static int main(String[]args){
        Gato cat= new Gato("melo");
        cat.nome="nemo";
        cat.miar();
        Gato Gata= new Gato("bulma");
        Gata.idade=3;Gata.femea=true;
        Gata.miar();
        cat.raça=cat;
        return 0; 
    }  
}

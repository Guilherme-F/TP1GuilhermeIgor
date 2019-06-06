/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

/**
 *
 *Guilherme @author aluno
 */
public class Gato {

    /**
     * @param args the command line arguments
     */
        boolean macho; 
        String nome;
        int idade;
        Gato raça;
        public Gato (String n){
                        this.nome=n;
          }
      public void miar(){
          if (idade >3){
              System.out.print("miau");
                }else{
              System.out.print("miu");
          }
        }
        
    }
    




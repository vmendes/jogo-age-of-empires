/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Rovana
 */
public class AtacanteDeAlcance extends Atacante {
    int alcance; //para arqueiro e sacerdote, são as unidades que atacam por alcance;
    public AtacanteDeAlcance (int ataque, int alcance){
        super (ataque);
        this.alcance = alcance;
    }
    @Override
     public void Ataca (Entidade entidadeAtacada){
         entidadeAtacada.pontosvitais = entidadeAtacada.pontosvitais - ataque;
         
     }
     @Override
     public boolean podeAtacar (Entidade entidade){
         
     }
    
}

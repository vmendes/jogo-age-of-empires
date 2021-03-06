/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import jogo.unidade.Unidade;

/**
 *
 * @author Rovana
 */
public class Ataque {

    protected int ataque;
    protected Entidade entidade;

    /**
     * Construtor da classe Ataque
     *
     * @param ataque , valor do ataque do objeto.
     */
    public Ataque(Entidade entidade, int ataque) {
    	this.entidade = entidade;
        this.ataque = ataque;

    }

    /**
     * Metodo ataca:
     *
     * @param entidadeAtacada , entidade a ser atacada.
     */
    public boolean ataca(Entidade entidadeAtacada) {
    	if (!podeAtacar(entidade, entidadeAtacada)) {
    		System.out.println("ERRO: Jogada invalida de " + entidade + ", muito distante");
    		return false;
    	}
    	if (!entidadeAtacada.isVivo()) {
    		return false;
    	}
    	
        if (entidadeAtacada instanceof Unidade) {
            entidadeAtacada.setPontosvitais(entidadeAtacada.getPontosvitais() - 
                    (ataque - ((Unidade) entidadeAtacada).getArmadura()));
        } else {
            entidadeAtacada.setPontosvitais(entidadeAtacada.getPontosvitais() - 
                    ataque);
        }
        
        if (entidadeAtacada.getPontosvitais() <= 0) {
        	entidadeAtacada.getCivilizacao().removeEntidade(entidadeAtacada);
        	System.out.print("! ");
        	System.out.print(entidade);
        	System.out.print(" matou ");
        	System.out.println(entidadeAtacada);
        	entidadeAtacada.getCivilizacao().existeCivilizacao();
        } else { 
        	System.out.print("! ");
        	System.out.print(entidade);
        	System.out.print(" atacou ");
        	System.out.print(entidadeAtacada);
        	System.out.println(", pontos vitais restantes=" + entidadeAtacada.getPontosvitais());
        }
        return true;
    }
    /**
     * Metodo podeAtacar:
     *
     * @param atacante , objeto atacante;
     * @param atacado, objeto atacado;
     * @return , se o objeto pode ser atacado.
     */
    public boolean podeAtacar(Entidade atacante, Entidade atacado) {
        return Mapa.getDistanciaRaio(atacante, atacado) <= getAlcance();
    }

	protected int getAlcance() {
		return 2;
	}

}

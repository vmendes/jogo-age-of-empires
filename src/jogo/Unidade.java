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
abstract public class Unidade extends Entidade implements Movivel {
    
    public double velocidade; // velocidade que a unidade se move   
    public Ataque ataque;
    public int armadura;    
    
    public Unidade (String imagem, Dinheiro custo, boolean isVivo, 
            int pontosvitais,Posicao posicao, Civilizacao civilizacao, 
            int armadura,double velocidade, Ataque ataque){
        super (imagem, custo, isVivo, pontosvitais, posicao, civilizacao);        
        this.velocidade = velocidade;
        this.ataque = ataque;
        this.armadura = armadura;
        
    }
    @Override
    public void mover(Direcao direcao){
    int passos = (int) velocidade;//trunca o valor para converter em passos
        for (int i = 0; i < passos; i++) {
        Mapa.get().moveUnidade(this, direcao);
        //aqui nao ta compilando por causa da direcao.
        
        //falange.mover(Mapa.Direcao.N)
}
}
        
        
        //aguardar a resposta do Valdir para essa implementação.
        //modifica a posicao da unidade, adicionando a velocidade da unidade
        //a sua posicao. Ex: se a posicao atual é (10,20), e a direcao é "Norte"
        //e a velocidade da unidade é 2, sua posicao serÃ¡ alterada para (10,22), 
        //indicando que a unidade anddou duas unidades para cima no mapa.
        //x leste-oeste, y norte-sul.
        
    }
    
    



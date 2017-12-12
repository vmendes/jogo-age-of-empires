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
public class Quartel extends Construcao {

    /**
     * Construtor da classe Quartel:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Quartel(Posicao posicao, Civilizacao civilizacao) {
        super("Quartel.jpg", new Dinheiro(0, 0, 125), true, 350, posicao,
                civilizacao, new Ataque(0));
        

    }

    /**
     * Metodo criaGuerreiro:
     *
     * @return guerreiro.
     */
    public Guerreiro criaGuerreiro() {
        if (this.getCivilizacao().podeConstruir(Guerreiro.class)) {

            this.getCivilizacao().adicionaUnidade(new Guerreiro
        (this.getPosicao(), this.getCivilizacao()));
        }

        return new Guerreiro(this.getPosicao(), this.getCivilizacao());

    }

    /**
     * Metodo criaCavaleiro:
     *
     * @return cavaleiro.
     */
    public Cavaleiro criaCavaleiro() {
        if (this.getCivilizacao().podeConstruir(Cavaleiro.class)) {
            this.getCivilizacao().adicionaUnidade(new Cavaleiro
        (this.getPosicao(), this.getCivilizacao()));
        }
        return new Cavaleiro(this.getPosicao(), this.getCivilizacao());

    }

    /**
     * Metodo criaArqueiro:
     *
     * @return Arqueiro.
     */
    public Arqueiro criaArqueiro() {
        if (this.getCivilizacao().podeConstruir(Arqueiro.class)) {

            this.getCivilizacao().adicionaUnidade(new Arqueiro(this.getPosicao()
                    ,this.getCivilizacao()));
        }
        return new Arqueiro(this.getPosicao(), this.getCivilizacao());
    }

    /**
     * Metodo criaElefante:
     *
     * @return elefante.
     */
    public Elefante criaElefante() {
        if (this.getCivilizacao().podeConstruir(Elefante.class)) {

            this.getCivilizacao().adicionaUnidade(new Elefante(this.getPosicao()
                    ,this.getCivilizacao()));
        }
        return new Elefante(this.getPosicao(), this.getCivilizacao());
    }

    /**
     * Metodo criaFalange:
     *
     * @return Falange.
     */
    public Falange criaFalange() {
        if (this.getCivilizacao().podeConstruir(Falange.class)) {

            this.getCivilizacao().adicionaUnidade(new Falange(this.getPosicao(),
                    this.getCivilizacao()));
        }
        return new Falange(this.getPosicao(), this.getCivilizacao());
    }
}
       


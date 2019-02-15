
import java.lang.reflect.Array;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author darthd3v
 */
class Pilha {
    
    private Object[] elementos = new Object[10];
    private int quantidade = 0;

    Pilha(int maximo) {
        elementos = new Object[maximo];
    }

    Object tamanho() {
        
        return this.quantidade;
    }

    boolean estaVazia() {
        
        return (this.quantidade == 0);
    }

    void empilha(Object elemento) {
       
        if(this.quantidade == this.elementos.length) throw new PilhaCheiaException("Não é possivel empilhar mais elementos");
        this.elementos[this.quantidade] = elemento;
        this.quantidade++;
    }

    Object topo() {
        
        return this.elementos[this.quantidade-1];
    }

    Object desempilha() {
        
        if(estaVazia()) throw new PilhaVaziaException("Não é possísvel desempilhar");
        Object topo  = topo();
        this.quantidade--;
        
        return topo;
    }

   
    
}

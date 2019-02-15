/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author darthd3v
 */
public class testePilha {
    
    private Pilha p;
    @Before
    public void inicializaPilha() {
        this.p = new Pilha(10);
    }
    
    @Test
    public void pilhaVazia() {
        
        assertTrue(this.p.estaVazia());
        assertEquals(0, this.p.tamanho());
    }
    
    @Test
    public void empilhaUmElemento() {
        
        this.p.empilha("primeiro");
        assertFalse(this.p.estaVazia());
        assertEquals(1, this.p.tamanho());
        assertEquals("primeiro", this.p.topo());   
        
    }
    @Test
    public void empilhaDoisElemento() {
        
        this.p.empilha("primeiro");
        this.p.empilha("segundo");
        assertFalse(this.p.estaVazia());
        assertEquals(2, this.p.tamanho());
        assertEquals("segundo", this.p.topo());   
        
    }
    @Test
    public void empilhaEDesenpilha() {
        
        this.p.empilha("primeiro");
        this.p.empilha("segundo");
        assertFalse(this.p.estaVazia());
        assertEquals(2, this.p.tamanho());
        assertEquals("segundo", this.p.topo());   
        Object desempilhado = this.p.desempilha();
        assertEquals(1, this.p.tamanho());
        assertEquals("primeiro", this.p.topo());
        assertEquals("segundo", desempilhado);
    }
    
    @Test(expected = PilhaVaziaException.class)
    public void removePilhaVazia() {
        
        p.desempilha();
    } 
    @Test(expected = PilhaCheiaException.class)
    public void addPilhaCheia() {
        
        for (int i = 0; i < 10; i++) {
            
            p.empilha("elemento"+i);
        }
        p.empilha("bum");
    } 
}

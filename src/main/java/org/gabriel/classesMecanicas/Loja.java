package org.gabriel.classesMecanicas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Loja {
    private final List<Item> loja;
    /**
     * Sempre declaramos a generalização (List), depois inicializamos a especificação (ArrayList, LinkedList, ...)
     **/
    public Loja() {
        this.loja = new ArrayList<>();
    }

    public void adicionaItemEstoque(Item item) {
        this.loja.add(item);
    }

    public Item removeItemEstoque(int index){
        return loja.remove(index);
    }

    public Item retornaItem(int indexEscolhido) {
        return this.loja.get(indexEscolhido);
    }

    public boolean estaVazia(){
        return this.loja.isEmpty();
    }

    public boolean contemItem(Item item){
        return this.loja.contains(item);
    }

    public List<Item> getLoja() {
        return List.copyOf(this.loja);
    }
}
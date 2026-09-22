package org.gabriel.classesMecanicas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Loja {
    /**
    * Sempre declaramos a generalização (List), depois inicializamos a especificação (ArrayList, LinkedList, ...)
    **/
    private final List<Item> loja;

    public Loja() {
        this.loja = new ArrayList<>();
    }

    public void adicionaItemEstoque(Item item) {
        this.loja.add(item);
    }

    public Item removeItemEstoque(int index){
        return loja.remove(index);
    }
    /**
    * Retorna um objeto para que métodos do inventário guardem o item
    **/
    public Item pegaItemDaLoja(int index) {
        if (index < 0 || index >= loja.size()) {
            return null;
        }
        return loja.get(index);
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
package org.gabriel.classesMecanicas;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private int tamanhoAtual;
    private int pesoAtual;
    private List<Item> inventario;

    public Inventario() {
        this.inventario = new ArrayList<>();
    }

    public boolean guardarItem(Item item) {
        if (temEspaco(item)) {
            this.inventario.add(item);
            this.pesoAtual = calculaPesoAtualInventario();
            return true;
        }
        return false;
    }
    /**Esse método é quando o usuário intencionalmente decide descartar um item*/
    public boolean descartarItemSelecionado(int index) {
        if ((index < 0 || index >= this.inventario.size()) || this.inventario.get(index).isDefault()) {
            return false;
        }
        this.inventario.remove(index);
        this.pesoAtual = calculaPesoAtualInventario();
        return true;
    }
    /**Esse método é chamado SEMPRE que um usuário usa um item, independente do que seja e independente do usuário querer
     * descartar ou não*/
    public void descartaAutomaticamente(int index) {
        if (inventario.get(index).isDefault()) {
            return;
        }
        if (!inventario.get(index).temUsos()) {
            this.inventario.remove(index);
            this.pesoAtual = calculaPesoAtualInventario();
        }
    }

    private int calculaPesoAtualInventario() {
        int pesoAtual = 0;
        for (Item item : this.inventario) {
            pesoAtual += item.getPeso();
        }
        return pesoAtual;
    }

    private boolean temEspaco(Item item) {
        int espacosLivres = calculaPesoLivreAlocar();
        int tamanhoMaxInventario = 30;
        return (this.inventario.size() < tamanhoMaxInventario) && (item.getPeso() < espacosLivres);
    }

    private int calculaPesoLivreAlocar() {
        int pesoMaxInventario = 25;
        return pesoMaxInventario - calculaPesoAtualInventario();
    }

    public List<Item> getInventario() {
        return List.copyOf(this.inventario); // cópia imutável do inventário, apenas para leitura
    }

    public boolean estaVazio() {
        return this.inventario.isEmpty();
    }
}


package org.gabriel.classesMecanicas;

import java.util.List;

public class Menus {
    private final int repeat = 30;

    public void exibirInventario(Inventario inventario) {
        if (inventario.estaVazio()) {
            System.out.println("Inventário vazio, nada para exibir!");
        } else {
            System.out.println("-".repeat(100));
            System.out.println("NOME - DESC - TIPO - PESO - PREÇO - NUM.USOS - PADRÃO - DANO - CURA");
            System.out.println("-".repeat(100));
            List<Item> inventarioLeitura = inventario.getInventario();
            for (int i = 0; i < inventarioLeitura.size(); i++) {
                Item item = inventarioLeitura.get(i);
                System.out.println((i+1)+" | "+item.toString());
            }
        }
    }

    public void exibirLoja(Loja loja) {
        if (loja.estaVazia()) {
            System.out.println("Loja vazia, nada para exibir!");
        } else {
            System.out.println("-".repeat(100));
            System.out.println("NOME - DESC - TIPO - PESO - PREÇO - NUM.USOS - PADRÃO - DANO - CURA");
            System.out.println("-".repeat(100));
            List<Item> lojaLeitura = loja.getLoja();
            for (int i = 0; i < lojaLeitura.size(); i++) {
                Item item = lojaLeitura.get(i);
                System.out.println((i+1)+" | "+item.toString());
            }
        }
    }

    public void menuInventario() {
        System.out.println("-".repeat(repeat));
        System.out.println("[1] - DESCARTAR ITEM");
        System.out.println("[2] - USAR ITEM");
        System.out.println("[3] - SAIR");
        System.out.println("-".repeat(repeat));
    }

    public void menuLoja() {
        System.out.println("-".repeat(repeat));
        System.out.println("[1] - VENDER ITEM");
        System.out.println("[2] - COMPRAR ITEM");
        System.out.println("[3] - SAIR");
        System.out.println("-".repeat(repeat));
    }

    public void menuDialogo() {
        System.out.println("-".repeat(repeat));
        System.out.println("[1] - PULAR DIÁLOGO");
        System.out.println("[2] - CONTINUAR LENDO");
        System.out.println("-".repeat(repeat));
    }

    public void menuCombate() {
        System.out.println("-".repeat(repeat));
        System.out.println("[1] - ATACAR");
        System.out.println("[2] - ESQUIVAR");
        System.out.println("[3] - DEFENDER");
        System.out.println("[4] - FUGIR");
        System.out.println("[5] - USAR ITEM");
        System.out.println("-".repeat(repeat));
    }
}

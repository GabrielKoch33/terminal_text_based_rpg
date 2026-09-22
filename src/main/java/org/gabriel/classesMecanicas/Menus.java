package org.gabriel.classesMecanicas;

import java.util.List;

public class Menus {
    private static final int repeat = 30;
    private static final String[] opcoesInventario = {
            "DESCARTAR ITEM",
            "USAR ITEM ",
            "SAIR",
    };
    private static final String[] opcoesLoja = {
            "VENDER ITEM",
            "COMPRAR ITEM ",
            "SAIR",
    };
    private static final String[] opcoesDialogo = {
            "PULAR DIÁLOGO",
            "CONTINUAR LENDO",
    };
    private static final String[] opcoesCombate = {
            "ATACAR",
            "ESQUIVAR",
            "DEFENDER",
            "USAR ITEM",
            "TROCAR ARMA",
            "FUGIR",
    };
    /**
     * Validar se a lista (loja ou inventário) esta vazia é responsabilidade
     * do programa principal por loja.temItens() ou inventario.temItens()
     * **/
    public static void exibirLista(List<Item> listaLeitura) {
        System.out.println("-".repeat(100));
        System.out.println("NOME - DESC - TIPO - PESO - PREÇO - NUM.USOS - PADRÃO - DANO - CURA");
        System.out.println("-".repeat(100));
        for (int i = 0; i < listaLeitura.size(); i++) {
            Item item = listaLeitura.get(i);
            System.out.println((i+1)+" | "+item.toString());
        }
    }

    public static void menuInventario() {
        System.out.println("-".repeat(repeat));
        for (int i = 0; i < opcoesInventario.length; i++) {
            System.out.println("["+i+1+"] - "+opcoesInventario[i]);
        }
        System.out.println("-".repeat(repeat));
    }

    public static void menuLoja() {
        System.out.println("-".repeat(repeat));
        for (int i = 0; i < opcoesLoja.length; i++) {
            System.out.println("["+i+1+"] - "+opcoesLoja[i]);
        }
        System.out.println("-".repeat(repeat));
    }

    public static void menuDialogo() {
        System.out.println("-".repeat(repeat));
        for (int i = 0; i < opcoesDialogo.length; i++) {
            System.out.println("["+i+1+"] - "+opcoesDialogo[i]);
        }
        System.out.println("-".repeat(repeat));
    }

    public static void menuCombate() {
        System.out.println("-".repeat(repeat));
        for (int i = 0; i < opcoesCombate.length; i++) {
            System.out.println("["+i+1+"] - "+opcoesCombate[i]);
        }
        System.out.println("-".repeat(repeat));
    }


}

package me.dio;

import Funcionarios.Endereco;
import Funcionarios.Gerente;
import Funcionarios.Vendedor;

public class Main {
    public static void main(String[] args) {
       //NumeroReverso.numeroReverso();

        Endereco endereco = new Endereco("Rua Comendador", "casa 04", "Jardim Paulista");
        endereco.setRua("Rua");
        System.out.println(endereco.getRua());

        Endereco endereco2 = new Endereco("Rua João de Barros", "Complemento 05","Braz");
        System.out.println(endereco2);
        System.out.println("--------");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Bella Costa");
        vendedor.setDocumento("000.000.000-00");
        vendedor.setValorSalario(2500d);
        vendedor.calcularBonificacao(2.0);
        vendedor.setEndereco(endereco);
        System.out.println(vendedor);
        System.out.println("--------");

        Gerente gerente = new Gerente();
        gerente.setNome("Paulo Fontes");
        gerente.setDocumento("000.001.005-00");
        gerente.setValorHora(100d);
        gerente.setHorasTrabalhadas(20);
        gerente.calcularRemuneracacao();
        vendedor.setEndereco(endereco);
        System.out.println(gerente);
        System.out.println("--------");

    }
}

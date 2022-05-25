package Funcionarios;

public class Vendedor extends FuncionarioCLT implements CalcularBonificacao{
    private double valorDaBonificação;

    @Override
    public void calcularBonificacao(Double porcentagemBonificacao) {
        this.valorDaBonificação = super.valorSalario * (porcentagemBonificacao/100d);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                ", valorDaBonificação=" + valorDaBonificação +
                '}';
    }
}

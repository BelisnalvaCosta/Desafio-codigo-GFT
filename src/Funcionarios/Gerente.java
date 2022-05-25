package Funcionarios;

public class Gerente extends FuncionarioPJ implements CalcularBonificacao {
    private Double valorBonificacao;

    @Override
    public void calcularBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorRenumeracao() * (porcentagemBonificacao/100d)) + 100d;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", endereco=" + super.getEndereco().getRua() +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemumeracao=" + super.getValorRenumeracao() +
                ", valorBonificacao=" + this.valorBonificacao +
                '}';
    }
}
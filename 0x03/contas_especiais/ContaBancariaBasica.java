package contas_especiais;

import contas_especiais.exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.saldo = 0;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
        if (valor > saldo) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        saldo -= valor;
    }

    public double calcularTarifaMensal(){
        double valorFixo = 10.0;
        double valorVariavel = 0.1 * saldo;

         if(valorFixo < valorVariavel){
             return valorFixo;
         } else {
             return valorVariavel;
         }
    }

    public double calcularJurosMensal(){
        double jurosMensal = taxaJurosAnual/12/100;
        if (saldo <= 0) {
            jurosMensal = 0;
        } else {
            jurosMensal *= saldo;
        }
        return jurosMensal;
    }

    public void aplicarAtualizacaoMensal() {
        double tarifaMensal = calcularTarifaMensal();
        double jurosMensal = calcularJurosMensal();
        saldo += jurosMensal - tarifaMensal;
    }
}

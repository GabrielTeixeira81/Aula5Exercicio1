package br.com.digitalhouse;

public class Principal {

    public static void main(String[] args) {
        Cliente tairo = new Cliente();
        tairo.setNome("Gabriel");
        tairo.setSobrenome("Teixeira");
        Conta contaGabriel = new Conta();
        contaGabriel.setSaldo(100);
        contaGabriel.setTitular(tairo);

        Cliente costa = new Cliente();
        costa.setNome("Leandro");
        costa.setSobrenome("Costa");
        Conta contaCosta = new Conta();
        contaCosta.setSaldo(150);
        contaCosta.setTitular(costa);

        contaGabriel.deposito(1200);
        contaCosta.saque(200);
    }
}

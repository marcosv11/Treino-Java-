package array;

import encapsulamento.Conta;

public class GuardadorDeContas {

    private Conta[] referencias;
    private int posicaoLivre;

    public GuardadorDeContas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(heran�a.Conta cc) {
       // this.referencias[this.posicaoLivre] = cc;
        this.posicaoLivre++;
    }
    
    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }
}

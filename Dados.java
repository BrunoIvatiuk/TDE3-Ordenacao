public class Dados {
    public int trocas;
    public int iteracoes;

    public Dados() {
        this.trocas = 0;
        this.iteracoes = 0;
    }

    public String paraString() {
        return ("Trocas: " + this.trocas + " || Iterações: " + this.iteracoes);
    }
}


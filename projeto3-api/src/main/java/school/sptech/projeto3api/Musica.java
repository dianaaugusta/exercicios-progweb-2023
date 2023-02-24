package school.sptech.projeto3api;

public class Musica {
    private String nome;
    private int anoLancamento;
    private boolean nacional;

    public Musica(String nome, int anoLancamento, boolean nacional) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.nacional = nacional;
    }

    public Musica() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }
}

public class Atleta extends Pessoa {
    private String pais;
    private double tempo;
    
    public Atleta(String pais, double tempo, String nome, String sexo) {
        super(nome, sexo);
        this.pais = pais;
        this.tempo = tempo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    
    
    
    @Override
    public String toString() {
        return "Atleta{" + "pais=" + pais + ", tempo=" + tempo + '}';
    }
    
    
}

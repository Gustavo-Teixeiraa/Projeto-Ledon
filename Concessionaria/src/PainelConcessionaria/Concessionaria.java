package PainelConcessionaria;

public class Concessionaria {
    private String Modelo,Marca,Tipo;
    private int Ano;
    private float Preco;

    public Concessionaria(String Modelo, String Marca, String Tipo, int Ano, float Preco) {
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Tipo = Tipo;
        this.Ano = Ano;
        this.Preco = Preco;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

    @Override
    public String toString() {
        return "Modelo=" + Modelo + "\nMarca=" + Marca + "\nTipo=" + Tipo + "\nAno=" + Ano + "\nPreco=" + Preco + "";
    }
    
    
}

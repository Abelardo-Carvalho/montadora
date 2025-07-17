package io.github.cursodsousa.arquiteturaspring.montadora;

public class Motor {

    private String modelo;
    private Integer cavalos;
    private Integer cilindos;
    private Double litragem;
    private TipoMotor tipo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCavalos() {
        return cavalos;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }

    public Integer getCilindos() {
        return cilindos;
    }

    public void setCilindos(Integer cilindos) {
        this.cilindos = cilindos;
    }

    public Double getLitragem() {
        return litragem;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", cavalos=" + cavalos +
                ", cilindos=" + cilindos +
                ", litragem=" + litragem +
                ", tipo=" + tipo +
                '}';
    }
}

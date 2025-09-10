
package DTO;

public class HotelDTO {
    private String nome;
    private int dataEntrada, dataSaida, nQuarto;

    public HotelDTO(String nome, int dataEntrada, int dataSaida, int nQuarto) {
        this.nome = nome;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.nQuarto = nQuarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(int dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public int getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(int dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getnQuarto() {
        return nQuarto;
    }

    public void setnQuarto(int nQuarto) {
        this.nQuarto = nQuarto;
    }

    @Override
    public String toString() {
        return "HotelDTO{" + "nome=" + nome + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", nQuarto=" + nQuarto + '}';
    }
    
    
}

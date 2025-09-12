package DTO;

public class HotelDTO {
    private String cliente;
    private int dataEntrada;
    private int dataSaida;
    private int nQuarto;

    public HotelDTO(String cliente, int dataEntrada, int dataSaida, int nQuarto) {
        this.cliente = cliente;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.nQuarto = nQuarto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
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
        return "HotelDTO{" + "cliente=" + cliente + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", nQuarto=" + nQuarto + '}';
    }


}

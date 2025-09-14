package DTO;

import java.util.Arrays;
import java.util.List;

public class RestauranteDTO {
    private int nPedido;
    private String cliente;
    private List<String> itens;
    private double total;

    public RestauranteDTO(int nPedido, String cliente, List<String> itens, double total) {
        this.nPedido = nPedido;
        this.cliente = cliente;
        this.itens = itens;
        this.total = total;
    }


    public RestauranteDTO(int nPedido, String cliente, String itens, double total) {
        this.nPedido = nPedido;
        this.cliente = cliente;
        this.itens = Arrays.asList(itens.split(",")); 
        this.total = total;
    }

    public int getnPedido() {
        return nPedido;
    }

    public void setnPedido(int nPedido) {
        this.nPedido = nPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<String> getItens() {
        return itens;
    }

    public void setItens(List<String> itens) {
        this.itens = itens;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    

//    public int getnPedido() { return nPedido; }
//    public void setnPedido(int nPedido) { this.nPedido = nPedido; }
//
//    public String getCliente() { return cliente; }
//    public void setCliente(String cliente) { this.cliente = cliente; }
//
//    public List<String> getItens() { return itens; }
//    public void setItens(List<String> itens) { this.itens = itens; }
//
//    public double getTotal() { return total; }
//    public void setTotal(double total) { this.total = total; }

    @Override
    public String toString() {
        return "RestauranteDTO{" + "nPedido=" + nPedido + ", cliente=" + cliente + ", itens=" + itens + ", total=" + total + '}';
    }


    
}

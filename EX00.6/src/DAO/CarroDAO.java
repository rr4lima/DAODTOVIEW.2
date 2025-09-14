package DAO;

import DTO.CarroDTO;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {
    private List<CarroDTO> vendas = new ArrayList<>();

    public void registrarVenda(CarroDTO carro) {
        vendas.add(carro);
        
    }

    public void listarVendas() {
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda registrada.");
        } else {
            double total = 0;
            System.out.println("Lista de Vendas");
            for (CarroDTO carro : vendas) {
                System.out.println(carro);
                total += carro.getPreco();
            }
            System.out.println("Total arrecadado: R$" + total);
        }
    }

    public void removerVenda(int index) {
        if (index >= 0 && index < vendas.size()) {
            vendas.remove(index);
            System.out.println("Venda removida!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}

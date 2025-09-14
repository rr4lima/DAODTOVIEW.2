package DAO;

import DTO.RestauranteDTO;
import java.util.ArrayList;
import java.util.List;

public class RestauranteDAO {
    private final List<RestauranteDTO> pedidos = new ArrayList<>();

    public void adcPedido(RestauranteDTO pedido) {
        pedidos.add(pedido);
    }
    
    public List<RestauranteDTO> getTodos() {
        return pedidos;
    }
    
    public void removerPedido(int nPedido) {
        pedidos.removeIf(p -> p.getnPedido() == nPedido);
    }

    public void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
        } else {
            for (RestauranteDTO pedido : pedidos) {
                System.out.println(pedido);
            }
        }
    }
}

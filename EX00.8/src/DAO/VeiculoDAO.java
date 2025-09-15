package DAO;

import DTO.VeiculoDTO;
import java.util.ArrayList;
import java.util.List;

public class VeiculoDAO {

    private final List<VeiculoDTO> veiculos = new ArrayList<>();

    public void adcVeiculo(VeiculoDTO veiculo) {
        veiculos.add(veiculo);
    }

    public void listarVeiculos() {
    if (veiculos.isEmpty()) {
        System.out.println("Nenhum veículo cadastrado.");
    } else {
        for (VeiculoDTO veiculo : veiculos) {
            System.out.println(veiculo);
        }
    }

    }
}
    


package DAO;

import DTO.ContaDTO;
import java.util.ArrayList;
import java.util.List;

public class ContaDAO {

    private final List<ContaDTO> contas = new ArrayList<>();

    public void adcConta(ContaDTO conta) {
        contas.add(conta);
    }

    public void removConta() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta para remover.");
        } else {
            contas.remove(contas.size() - 1);
            System.out.println("Última conta removida com sucesso.");
        }
    }

    public void listarPend() {
        boolean encontrou = false;
        for (ContaDTO conta : contas) {
            if (!conta.isPago()) {
                System.out.println(conta);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Não há contas pendentes.");
        }
    }
}

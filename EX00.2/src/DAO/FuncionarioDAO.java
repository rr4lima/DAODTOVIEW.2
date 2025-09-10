
package DAO;

import DTO.FuncionarioDTO;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
        private final List<FuncionarioDTO> funcionarios = new ArrayList<>();

    public FuncionarioDAO() {
    }

    
    public void adcFunc(FuncionarioDTO funcionario) {
        funcionarios.add(funcionario);
    }

    public void listarFunc() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado");
        } else {
            for (FuncionarioDTO funcionario : funcionarios) {
                System.out.println(funcionario);
                
        }
    
        }
    }
}


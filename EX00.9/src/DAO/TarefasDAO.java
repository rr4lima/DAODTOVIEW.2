package DAO;

import DTO.TarefasDTO;
import java.util.ArrayList;
import java.util.List;

public class TarefasDAO {

    private final List<TarefasDTO> tarefas = new ArrayList<>();

    public void adcTarefa(TarefasDTO tarefa) {
        tarefas.add(tarefa);
    }

    public String listarTarefas() {
        if (tarefas.isEmpty()) {
            return "Nenhuma tarefa cadastrada.";
        } else {
            for (TarefasDTO tarefa : tarefas) {
                System.out.println(tarefa);
            }
        }
        return null;
    }
}
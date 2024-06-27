package tarefas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tarefas.api.model.Tarefas;

public interface TarefaRepository extends JpaRepository<Tarefas,Long> {

}

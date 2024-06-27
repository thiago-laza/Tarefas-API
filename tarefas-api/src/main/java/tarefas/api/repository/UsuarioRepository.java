package tarefas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tarefas.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

}

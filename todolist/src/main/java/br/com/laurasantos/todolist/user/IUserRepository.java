package br.com.laurasantos.todolist.user;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/* INTERFACE É UM MODELO/CONTRATO QUE TEMOS DENTRO DA NOSSA APLICAÇÃO, NÃO PODEMOS IMPLEMENTAR OS MÉTODOS, QUE SERÃO DENTRO DE UMA OUTRA CLASSE */
/* <> recebe generator */


public interface IUserRepository extends JpaRepository<UserModel, UUID>{
    UserModel findByUsername(String username);
    
}

package environment.project.repository;

import environment.project.model.UserDTO;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;


@Mapper
@Repository
public interface UserRepository {
    List<UserDTO> getUsers();
    void insertUser(UserDTO userDTO);
    void updateUser(UserDTO userDTO);
    void deleteUser(UserDTO userDTO);
}

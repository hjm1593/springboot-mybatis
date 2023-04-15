package environment.project.service;

import environment.project.model.UserDTO;
import environment.project.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> getMembers() {
        return userRepository.getUsers();
    }

    @Override
    public void insertMember() {
        UserDTO userDTO = new UserDTO();
//        userDTO.setUserid("test1");
//        userDTO.setPassword("4567");
        userRepository.insertUser(userDTO);
    }

    @Override
    public void updateMember() {
        UserDTO userDTO = new UserDTO();
//        userDTO.setUserid("test1");
//        userDTO.setPassword("7890");
        userRepository.updateUser(userDTO);
    }

    @Override
    public void deleteMember() {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserid("test1");
        userRepository.deleteUser(userDTO);
    }

}

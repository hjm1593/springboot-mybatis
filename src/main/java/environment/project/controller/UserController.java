package environment.project.controller;

import environment.project.model.UserDTO;
import environment.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import environment.project.service.UserService;

import java.util.HashMap;
import java.util.List;

//@RestController
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/v1/users")
    public List<UserDTO> getUsers(){
        return userService.getMembers();
    }

    @GetMapping("/v1/insert")
    public void insertUser(){
        userService.insertMember();
    }

    @GetMapping("/v1/update")
    public void updateUser(){
        userService.updateMember();
    }

    @GetMapping("/v1/delete")
    public void deleteUser(){
        userService.deleteMember();
    }

    @GetMapping("/login")
    public String loginForm(){
        return "loginForm";
    }
}

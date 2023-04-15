package environment.project.service;

import environment.project.model.UserDTO;

import java.util.List;

public interface UserService {
   List<UserDTO> getMembers();
   void insertMember();
   void updateMember();
   void deleteMember();
}

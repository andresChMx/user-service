package pe.edu.upc.onewebs.service;
import pe.edu.upc.onewebs.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    Page<User> getAllUsersPage(Pageable pageable);

    User getUserById(Long userId);
    User getUserByUsername(String username);
}

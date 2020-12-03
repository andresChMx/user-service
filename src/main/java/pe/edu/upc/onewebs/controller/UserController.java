package pe.edu.upc.onewebs.controller;

import pe.edu.upc.onewebs.entity.User;
import pe.edu.upc.onewebs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/")

    public List<User> getAllUsers(){
        return this.userService.getAllUsers();
    }

    @GetMapping("/page")
    public Page<User> getAllUsers(@PageableDefault Pageable pageable){
        return this.userService.getAllUsersPage(pageable);
    }

    @GetMapping("/username/{username}")
    public User getAllUsers(@PathVariable String username){
        return this.userService.getUserByUsername(username);
    }

    @GetMapping("/{userId}")
    public User getAllUsers(@PathVariable Long userId){
        return this.userService.getUserById(userId);
    }


}

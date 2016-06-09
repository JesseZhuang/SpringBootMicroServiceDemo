package io.bittigerX;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // JSON api
public class UserController {

    @Autowired // like JavaEE @Inject
    private UserEntityRepo userEntityRepo;

    @RequestMapping(value = "/users/{name}", method = RequestMethod.GET)
    public List<UserEntity> getUsers(@PathVariable String name){
        return userEntityRepo.findByName(name);
    }
}

package fcode.controller;

import fcode.model.User;
import fcode.response.Response;
import fcode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<Response<List<User>>> getListUser() {
        return ResponseEntity.ok(new Response<>(this.userService.getListUser()));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Response<User>> getUserById(@PathVariable("id") String id) {
        return ResponseEntity.ok(new Response<>(this.userService.getUserById(id)));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Response<User>> createUser(@Valid @RequestBody User user, BindingResult result) {
        if (result.hasErrors()) {
            List<String> errors = new ArrayList<>();
            result.getAllErrors().forEach(erro -> errors.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<User>(errors));
        }

        return ResponseEntity.ok(new Response<>(this.userService.createUser(user)));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Response<User>> editUser(@PathVariable("id") String id, @Valid @RequestBody User user, BindingResult result) {
        if (result.hasErrors()) {
            List<String> errors = new ArrayList<>();
            result.getAllErrors().forEach(erro -> errors.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<User>(errors));
        }

        user.setId(id);
        return ResponseEntity.ok(new Response<>(this.userService.editUser(user)));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Response<Integer>> deleteUser(@PathVariable("id") String id) {
        this.userService.deleteUser(id);
        return ResponseEntity.ok(new Response<>(1));
    }

}

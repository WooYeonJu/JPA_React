package hello.springmvc.web;

import hello.springmvc.domain.User;
import hello.springmvc.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/joinForm")
    public String joinUser(User joinUser){
        userService.joinUser(joinUser);
        return "redirect:/home";
    }

}

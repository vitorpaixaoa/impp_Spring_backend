package com.compasso.uol.impp.Controller;

import com.compasso.uol.impp.Entity.User;
import com.compasso.uol.impp.Service.ImppService;
import com.compasso.uol.impp.Service.UserService;
import com.compasso.uol.impp.ViewModel.UserDay;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@RestController
@Slf4j
public class ImppControler {

    @Autowired
    UserService userService;

    @Autowired
    ImppService imppService;


    @GetMapping("/im-day")
    public ResponseEntity<List<UserDay>> listDays() {
        List<User> userList = userService.listAll();
        return ResponseEntity.ok(imppService.showList(userList));
    }

    @GetMapping("/docs")
    public void docs(HttpServletResponse response) throws IOException {
        response.sendRedirect("http://localhost:8080/swagger-ui/index.html");
    }
}

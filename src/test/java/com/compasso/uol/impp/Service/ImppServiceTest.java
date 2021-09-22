package com.compasso.uol.impp.Service;

import com.compasso.uol.impp.Entity.User;
import com.compasso.uol.impp.Repository.UserRepository;
import com.compasso.uol.impp.ViewModel.UserDay;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.CollectionUtils;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@ActiveProfiles("test")
@ExtendWith(MockitoExtension.class)
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
public class ImppServiceTest {

    private List<User> allUsers;

    @InjectMocks
    private ImppService imppService;

    @BeforeEach
    public void sertup(){
        allUsers = new ArrayList<>();
        allUsers.add(new User(1L, "Maria"));
        allUsers.add(new User(2L, "João"));
        allUsers.add(new User(3L, "Gabi"));
        allUsers.add(new User(4L, "Zeca"));
    }

    @AfterEach
    public void tearDown(){
        allUsers = null;
    }

    @Test
    public void listAllDayUsers_shoudReturn_aListWidhDaysAnUsers(){
        List<UserDay> userDaysList = imppService.showList(allUsers);
        assertFalse(CollectionUtils.containsAny(allUsers, userDaysList));
    }

}

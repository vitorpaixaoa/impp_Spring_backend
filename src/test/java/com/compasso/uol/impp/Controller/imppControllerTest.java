package com.compasso.uol.impp.Controller;

import com.compasso.uol.impp.Entity.User;
import com.compasso.uol.impp.Service.ImppService;
import com.compasso.uol.impp.Service.UserService;
import com.compasso.uol.impp.ViewModel.UserDay;
import org.hibernate.service.spi.InjectService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ExtendWith(MockitoExtension.class)
@AutoConfigureMockMvc
@WebMvcTest
public class imppControllerTest {

    private List<UserDay> userDayList;
    private List<User> allUsers;

    @MockBean
    UserService userService;

    @MockBean
    ImppService imppService;

    @Autowired
    private MockMvc mockMvc;



    @InjectMocks
    ImppControler imppControle;



    @BeforeEach
    public void setup(){
        userDayList = new ArrayList<>();
        allUsers = new ArrayList<>();
        allUsers.add(new User(1L, "Maria"));
        allUsers.add(new User(2L, "João"));
        allUsers.add(new User(3L, "Gabi"));
        allUsers.add(new User(4L, "Zeca"));
    }



    public void tearDown(){
        userDayList = null;
    }

    @Test
    public void getMapping_ListAll_DayUers_shouldReturn_aListOfDayUsrs() throws Exception {
        mockMvc.perform(get("/im-day")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(""))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }
}

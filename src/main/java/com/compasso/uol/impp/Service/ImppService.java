package com.compasso.uol.impp.Service;

import com.compasso.uol.impp.Entity.User;
import com.compasso.uol.impp.Repository.UserRepository;
import com.compasso.uol.impp.ViewModel.UserDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ImppService {

    @Autowired
    UserService userService;

    public List<UserDay> showList(List<User> userList){

        List<UserDay> userDaysList = new ArrayList<>();


        Calendar date = Calendar.getInstance(TimeZone.getTimeZone("GMT-3"));
        date.setTime(new Date());
        date.add(Calendar.DATE, -1);

        int  j = 0;
        for (int i = 1; i <= 120 ; i++){
            UserDay userDay = new UserDay();
            if (!isWeekend(date)){
                User user = userList.get(j);
                userDay.setUser(user);
                j = j +1;
            }
            userDay.setDate(date.getTime());

            userDaysList.add(userDay);
            date.add(Calendar.DATE,1);
            if (j >= userList.size()){ j = 0; }
        }
        return userDaysList;
    }

    private static boolean isWeekend(Calendar date){
        if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            return true;
        }else if(date.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
            return true;
        }else {
            return false;
        }
    }
}

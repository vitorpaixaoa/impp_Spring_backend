package com.compasso.uol.impp.ViewModel;

import com.compasso.uol.impp.Entity.User;
import lombok.*;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDay {


    private User user;

    @Temporal(TemporalType.DATE)
    private Date date;
}

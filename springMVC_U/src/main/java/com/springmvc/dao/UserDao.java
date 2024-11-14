package com.springmvc.dao;

import com.springmvc.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class UserDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Transactional(readOnly = false)
    public int saveUser(User user){
        int id = (int) this.hibernateTemplate.save(user);
        return id;
    }

}

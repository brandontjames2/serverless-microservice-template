package org.enlighted.users.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;

import com.google.inject.Inject;

import org.enlighted.users.model.User;

@ApplicationScoped
public class UsersService {
    @Inject
    EntityManager em;

    /**
     * Returns all the users in the system.
     *
     * @return List of users.
     */
    public List<User> getAllUsers() {
        return em.createQuery("select * from app_user").getResultList();
    }
}
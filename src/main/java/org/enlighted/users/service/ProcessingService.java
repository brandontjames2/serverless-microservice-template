package org.enlighted.users.service;

import java.sql.Timestamp;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.enlighted.users.lambda.InputObject;
import org.enlighted.users.lambda.OutputObject;
import org.enlighted.users.model.User;
import org.jboss.logging.Logger;

@ApplicationScoped
public class ProcessingService {

    private static Logger log = Logger.getLogger(ProcessingService.class.getName());

    @Inject
    UsersService usersService;

    public OutputObject process(InputObject input) {
        List<User> users = usersService.getAllUsers();
        User user = users.get(0);
        log.info("Found user with id: " + user.getId());
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String result = timestamp + " " + input.getGreeting() + " " + user.getFirstName() + "!";
        OutputObject out = new OutputObject();
        out.setResult(result);
        return out;
    }
}
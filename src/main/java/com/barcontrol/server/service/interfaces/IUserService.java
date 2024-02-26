package com.barcontrol.server.service.interfaces;

import com.barcontrol.server.entity.User;

import java.util.List;

public interface IUserService {

    /* Lista de usuarios */
    List<User> getAllUsers();

    /* Obtener un solo usuario */
    User getUser( Integer id );

    /* Creación de usuario */
    User createUser( User user );


}

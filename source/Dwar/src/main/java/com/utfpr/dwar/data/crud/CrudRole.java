/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.dwar.data.crud;


import com.utfpr.dwar.data.entity.*;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author alexandrelerario
 */
public class CrudRole extends AbstractCrud<Role> {

    private EntityManager em;

    private static final String PU = EMNames.EMN1;

    public CrudRole() {
        super(Role.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlengi.cos731.bellisimo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author hjita
 */
public interface UserRepository extends CrudRepository<User, Long> 
{
    List<User> findByEmail(String prodName);
}

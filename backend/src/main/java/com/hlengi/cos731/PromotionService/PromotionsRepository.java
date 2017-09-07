/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlengi.cos731.PromotionService;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author hjita
 */
public interface PromotionsRepository extends CrudRepository<Promotion, Long> 
{
    List<Promotion> findByProduct(String prodName);
}

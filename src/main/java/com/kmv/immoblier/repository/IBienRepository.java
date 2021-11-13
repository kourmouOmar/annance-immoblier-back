package com.kmv.immoblier.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kmv.immoblier.entites.BienEntity;
/**
* @author : KOURMOU Omar
* @see : <kourmou.omar@gmail.com>
* @creation : 13/11/21
* @version : 1.0
*/

@Repository
public interface IBienRepository  extends JpaRepository<BienEntity, Long> {

}

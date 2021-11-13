package com.kmv.immoblier.services;

import java.util.List;

import com.kmv.immoblier.controllers.dto.BienDto;
import com.kmv.immoblier.entites.BienEntity;


/**
 * Spring service "Bien"
 * 
 * @author : kourmou omar
 * @creation : 13/11/21
 * @version : 1.0
 */

public interface IBienService {

	/**
	 * Get Bien by Id
	 * 
	 * @param idBien
	 * @return BienEntity
	 */
	BienEntity getBienById(Long idBien);

	/**
	 * get all Bien
	 *
	 * @return List<BienEntity>
	 */
	List<BienEntity> getAllBiens();

	/**
	 * add Bien
	 *
	 * @param BienDto
	 * @return BienEntity
	 */
	BienEntity addBien(BienDto BienDto);

	/**
	 * update Bien
	 *
	 * @param BienDto
	 * @return BienEntity
	 */
	BienEntity updateBien(BienDto BienDto);

	/**
	 * delete Bien
	 *
	 * @param idBien
	 * @return BienEntity
	 */
	void deleteBien(Long idBien);

}

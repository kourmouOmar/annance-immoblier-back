package com.kmv.immoblier.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kmv.immoblier.controllers.dto.BienDto;
import com.kmv.immoblier.entites.BienEntity;
import com.kmv.immoblier.enums.RsMethodEnum;
import com.kmv.immoblier.services.IBienService;
import com.kmv.immoblier.utils.Constants;

/**
 * Spring controller "biens"
 * 
 * @author : kourmou omar
 * @creation : 13/11/21
 * @version : 1.0
 */

@RestController
@RequestMapping("/biens")
public class BienController {
	
	private static Logger logger = LoggerFactory.getLogger(BienController.class);
	
	@Autowired
	private ServerProperties serverProperties;
	
	@Autowired
	private IBienService bienService;
	
	/**
	* Get all biens
	*
	* @author kourmou omar
	* @param BienDto
	* @return {ResponseEntity}
	*
	*/
	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	public ResponseEntity<List<BienDto>>  getAllAcheteurs(){
		if (logger.isInfoEnabled()) {
			logger.info( null ,serverProperties.getPort(), "get all biens", null,
			RsMethodEnum.GET.getValue(), "/biens/v0", null);
		}
		/* get all bien */
		return new ResponseEntity<List<BienDto>>(BienDto.entitiesToDtos(bienService.getAllBiens()), HttpStatus.OK);
	}
	
	/**
	* Get bien by id
	*
	* @author kourmou omar
	* @param id
	* @return {ResponseEntity}
	*
	*/
	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public ResponseEntity<BienEntity>  getAcheteurById(@PathVariable Long id) {
		if (logger.isInfoEnabled()) {
			logger.info( null ,serverProperties.getPort(), "get bien by id", null,
			RsMethodEnum.GET.getValue(), "/biens/v0", "id:"+id);
		}
		/* return bien by id */
		return new ResponseEntity<BienEntity>(bienService.getBienById(id), HttpStatus.OK);
	}
	
	/**
	* save bien
	*
	* @author kourmou omar
	* @param BienDto
	* @return {ResponseEntity}
	*
	*/
	@PostMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public ResponseEntity<BienDto> addAcheteur(@RequestBody BienDto bienDto) {
		if (logger.isInfoEnabled()) {
			logger.info( null ,serverProperties.getPort(), "save bien", null,
			RsMethodEnum.POST.getValue(), "/biens/v0", null);
		}
		/* add bien */
		return new ResponseEntity<BienDto>(BienDto.entityToDto(bienService.addBien(bienDto)), HttpStatus.OK);
	}
	
	/**
	* update bien
	*
	* @author kourmou omar
	* @param BienDto
	* @return {ResponseEntity}
	*
	*/
	@PutMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public ResponseEntity<BienDto>  updateAcheteur(@RequestBody BienDto BienDto) {
		if (logger.isInfoEnabled()) {
			logger.info( null ,serverProperties.getPort(), "update bien", null,
			RsMethodEnum.PUT.getValue(), "/biens/v0", null);
		}
		/* update bien */
		return new ResponseEntity<BienDto>(BienDto.entityToDto(bienService.updateBien(BienDto)), HttpStatus.OK);
	}
	
	/**
	* delete bien
	*
	* @author kourmou omar
	* @param id
	* @return {ResponseEntity}
	*
	*/
	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public ResponseEntity<BienDto>  deleteAcheteur(@PathVariable Long id) {
		if (logger.isInfoEnabled()) {
			logger.info( null ,serverProperties.getPort(), "delet bien by id", null,
			RsMethodEnum.POST.getValue(), "/biens/v0", "id: "+id);
		}
		/* delete bien */
		bienService.deleteBien(id);
		return new ResponseEntity<BienDto>(HttpStatus.OK);
	}

}

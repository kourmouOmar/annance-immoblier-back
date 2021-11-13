package com.kmv.immoblier.services.impl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmv.immoblier.controllers.dto.BienDto;
import com.kmv.immoblier.entites.BienEntity;
import com.kmv.immoblier.repository.IBienRepository;
import com.kmv.immoblier.services.IBienService;

@Service
@Transactional
public class BienService implements IBienService {

	private static Logger logger = LoggerFactory.getLogger(BienService.class);

	@Autowired
	IBienRepository bienRepository;

	@Override
	public BienEntity getBienById(Long idBien) {
		Date dateDeb = new Date();
		/* get bien by id */
		BienEntity bien = bienRepository.getById(idBien);
		if (logger.isInfoEnabled()) {
			logger.info("get bien by id", dateDeb, new Date(), null);
		}
		return bien;
	}

	@Override
	public List<BienEntity> getAllBiens() {
		Date dateDeb = new Date();
		/* get all biens */
		List<BienEntity> biens = bienRepository.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("get all biens ", dateDeb, new Date(), null);
		}
		return biens;
	}

	@Override
	public BienEntity addBien(BienDto BienDto) {
		Date dateDeb = new Date();
		BienEntity bienSaved =  null;
		try {
			/* save bien */
			bienSaved = bienRepository.save(BienDto.dtoToEntity(BienDto));
		}catch(Exception e){
			logger.error(e.getMessage(), dateDeb, new Date(), null);
		}
		if (logger.isInfoEnabled()) {
			logger.info("save  bien ", dateDeb, new Date(), null);
		}
		return bienSaved;
	}

	@Override
	public BienEntity updateBien(BienDto BienDto) {
		Date dateDeb = new Date();
		BienEntity bienUpdated =  null;
		try {
			/* update bien */
			bienUpdated = bienRepository.save(BienDto.dtoToEntity(BienDto));
		}catch(Exception e){
			logger.error(e.getMessage(), dateDeb, new Date(), null);
		}
		if (logger.isInfoEnabled()) {
			logger.info("update bien ", dateDeb, new Date(), null);
		}
		return bienUpdated;
	}

	@Override
	public void deleteBien(Long idBien) {
		Date dateDeb = new Date();
		try {
			/* get save biens */
			bienRepository.deleteById(idBien);
		}catch(Exception e){
			logger.error(e.getMessage(), dateDeb, new Date(), null);
		}
		if (logger.isInfoEnabled()) {
			logger.info("delete bien ", dateDeb, new Date(), null);
		}

	}

}

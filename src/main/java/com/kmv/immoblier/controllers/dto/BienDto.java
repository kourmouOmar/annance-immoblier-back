package com.kmv.immoblier.controllers.dto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kmv.immoblier.entites.BienEntity;
import com.kmv.immoblier.utils.Functions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BienDto implements Serializable {

	private static final long serialVersionUID = 1L;

    private Long idBien;
    private String titre;
    private String description;
    private byte[] image;
    
   
	/**
     * Convert BienEntity -> BienDto
     * @return BienDto
     */
    public static BienDto entityToDto(BienEntity entity){
		BienDto dto = null;
		if(entity != null){
			dto = new BienDto();
        	dto.setIdBien(entity.getIdBien());
        	dto.setTitre(entity.getTitre());  
        	dto.setDescription(entity.getDescription());
        	dto.setImage(entity.getImage()); 
		}
		return  dto;
    }
	/**
     * Convert BienDto -> BienEntity
     * @param BienDto
     */
    public static BienEntity dtoToEntity(BienDto dto){
		BienEntity entity = null;
		if(dto != null){
			entity = new BienEntity();
        	entity.setIdBien(dto.getIdBien()) ;
        	entity.setTitre(dto.getTitre());   
        	entity.setDescription(dto.getDescription()); 
        	entity.setImage(dto.getImage()); 
		}
		
		return  entity;
    }
    /**
     * Convert list BienDto -> list BienEntity
     * @param List<BienDto>
     */
    public static List<BienEntity> dtosToEntities(List<BienDto> listDto){
		List<BienEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(BienDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list BienEntity -> list BienDto
     * @param List<BienEntity>
     */
    public static List<BienDto> entitiesToDtos(List<BienEntity> listEntity){
		List<BienDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(BienEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}

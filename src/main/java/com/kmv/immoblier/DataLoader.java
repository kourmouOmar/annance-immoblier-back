package com.kmv.immoblier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kmv.immoblier.entites.BienEntity;
import com.kmv.immoblier.repository.IBienRepository;

@Component
public class DataLoader {

	private IBienRepository  bienRepository;
	
    @Autowired
    public DataLoader(IBienRepository  bienRepository) {
        this.bienRepository = bienRepository;
        LoadBiens();
    }

    private void LoadBiens() {
    	List<BienEntity> biens = new ArrayList<>();
		biens.add(new BienEntity((long) 1,"titre1","description 1",null));
		biens.add(new BienEntity((long) 2,"titre2","description 2",null));
		biens.add(new BienEntity((long) 3,"titre34","description 3",null));
		biens.add(new BienEntity((long) 4,"titre4","description 4",null));
		
		biens.forEach(v->{
			bienRepository.save(v);
		});		
    }
}

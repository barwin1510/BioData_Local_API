package com.project.bio_data.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bio_data.model.BD;
import com.project.bio_data.repository.BDRepository;

@Service
public class BDS {
	
	@Autowired
	private BDRepository bdRepository;
	
	public List<BD> get(){
		return bdRepository.findAll();
	}
	
	public BD getInfo(Long id) {
		Optional<BD> d = bdRepository.findById(id);
		if(d.isPresent()) {
			return d.get();
		}
		return new BD();
	}
	
	public String post(BD bd) {
		bdRepository.save(bd);
		return "Posted Successfully";
	}
	
	public String put(Long id,BD bd) {
		Optional<BD> b = bdRepository.findById(id);
		if(b.isPresent()) {
			BD d = b.get();
			d.setName(bd.getName());
			d.setDate_of_birth(bd.getDate_of_birth());
			d.setFather_name(bd.getFather_name());
			d.setMother_name(bd.getMother_name());
			d.setFather_occupation(bd.getFather_occupation());
			d.setMother_occupation(bd.getMother_occupation());
			d.setHighest_education(bd.getHighest_education());
			d.setAddress(bd.getAddress());
			bdRepository.save(d);
			return "Updated Successfully";
		}
		return "Not Found";
	}
	
	public String del(Long id) {
		if(bdRepository.existsById(id)) {
			bdRepository.deleteById(id);
			return "Deleted Successfully";
		}
		return "Not Found";
	}
}

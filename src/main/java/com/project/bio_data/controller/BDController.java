package com.project.bio_data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.bio_data.model.BD;
import com.project.bio_data.service.BDS;

@RestController
public class BDController {
	
	@Autowired
	private BDS bds;
	
	@GetMapping()
	public String welcome() {
		return "Welcome to Bio Data : " + "\n" + "\n" + 
				"You can use Postman to test my project:" + "\n" + "\n" + 
				"Get(/api) = to see all data," + "\n" + "\n" + 
				"Get(/api/{id}) = to see unique data," + "\n" +"\n" + 
				"Post(/api) = ' name(String), date_of_birth(String), gender(String), father_name(String), mother_name(String), father_occupation(String), mother_occupation(String), highest_education(String), adress(String) ' - data format to post the data,"+ "\n" + "\n" + 
				"Put(/api/{id}) = to update data," + "\n" + "\n" + 
				"Delete(/api/{id}) = to delete data.";
	}
	
	@GetMapping("api")
	public List<BD> get(){
		return bds.get();
	}
	
	@GetMapping("api/{id}")
	public BD getInfo(@PathVariable Long id) {
		return bds.getInfo(id);
	}
	
	@PostMapping("api")
	public String post(@RequestBody BD bd) {
		return bds.post(bd);
	}
	
	@PutMapping("api/{id}")
	public String put(@PathVariable Long id, @RequestBody BD bd) {
		return bds.put(id,bd);
	}
	
	@DeleteMapping("api/{id}")
	public String del(@PathVariable Long id) {
		return bds.del(id);
	}
	
}

package com.example.demo;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Produit;
import com.example.demo.model.Salle;
import com.example.demo.repository.ProduitRepository;
import com.example.demo.repository.SalleRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
@WebMvcTest
public class TestApplicationTests {

	@Autowired
	ProduitRepository produitRepository;
	SalleRepository salleRepository;
	@Autowired
	MockMvc mockMvc;

	@Test
	public void contextLoads() throws Exception {

//		MvcResult mvcResult = mockMvc.perform(
//				MockMvcRequestBuilders.get("produits/all").accept(MediaType.APPLICATION_JSON)
//		).andReturn();
//		
//		System.out.println(mvcResult.getResponse());
		
		 Produit p = new Produit();
		 p.setNom("HP");
		 p.setPrix(3000);
		 p.setDateAchat(new Date());
		
		 produitRepository.save(p);

		 Salle salle = new Salle();
			salle.setId(0);
			salle.setCapacite(0);
			salle.setCode(null);
			salle.setType(null);
			salleRepository.save(salle);
	}

}

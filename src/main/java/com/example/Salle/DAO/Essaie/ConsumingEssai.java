package com.example.Salle.DAO.Essaie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.Salle.Entities.Essai;

//@Repository("EssaiDao")
public class ConsumingEssai implements EssaiDAO {

	  
	/*private  JdbcTemplate jdbc;
	
	
	@Autowired
	public ConsumingEssai(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}



	@Override
	public List<Essai> retrieveEssaie() {
		String sql =" SELECT * FROM essaie WHERE NOT name ='lele' ";
		
		return jdbc.query(sql, (resultSet,i)->{
			Long num =Long.parseLong(resultSet.getString("id"));
			String nom = resultSet.getString("name");
			Essai essaie = new Essai();
			essaie.setId(num);
			essaie.setName(nom);
			return essaie;
		});
		
	}
	
	
//	public static void main(String args[]) {
//		JdbcTemplate jdbc1;
//String sql =" SELECT * FROM essaie ";
//		
//	   jdbc1.query(sql, (resultSet,i)->{
//			System.out.println(""+resultSet.getString("id"));
//			Long num =Long.parseLong(resultSet.getString("id"));
//			String nom = resultSet.getString("name");
//			Essai essaie = new Essai();
//			essaie.setId(num);
//			essaie.setName(nom);
//			return essaie;
//		});
//	}
*/
}

package com.fisi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fisi.model.Persona;

@Controller
@RequestMapping("/")
public class PersonaController extends JdbcDaoSupport{
	
	@Autowired
	public PersonaController(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
	ModelAndView mv = new ModelAndView();
	int id;
	List<Persona> lista;

	@RequestMapping(value="/crudDemo", method= RequestMethod.GET)
	public ModelAndView listar() {
		String sql ="select * from persona ORDER BY ide";
		
		lista = getJdbcTemplate().query(sql, new BeanPropertyRowMapper<Persona>(Persona.class));
		mv.addObject("lista", lista);
		mv.setViewName("crudDemo");
		return mv;
	}
	
	@RequestMapping(value="/agregar", method= RequestMethod.GET)
	public ModelAndView agregar() {
		mv.addObject(new Persona());
		mv.setViewName("agregar");
		return mv;
	}
	
	@RequestMapping(value="/agregar", method= RequestMethod.POST)
	public ModelAndView agregar(Persona persona) {
		String sql = "INSERT INTO PERSONA (nombres, correo, nacionalidad) VALUES (?, ?, ?)";
		getJdbcTemplate().update(sql, new Object[] {persona.getNombres(), persona.getCorreo(), persona.getNacionalidad()});
		return new ModelAndView("redirect:/crudDemo");
	}
	
	@RequestMapping(value="/editar", method= RequestMethod.GET)
	public ModelAndView editar(HttpServletRequest request) {
		id = Integer.parseInt(request.getParameter("id"));
		
		String sql = "select * from persona where ide ="+id;
		
		lista = getJdbcTemplate().query(sql, new BeanPropertyRowMapper<Persona>(Persona.class));
		mv.addObject("lista", lista);
		mv.setViewName("editar");
		return mv;
	}
	
	@RequestMapping(value="/editar", method= RequestMethod.POST)
	public ModelAndView editar(Persona persona) {
		String sql = "UPDATE persona SET nombres=?, correo=?, nacionalidad=? WHERE ide=?";
		getJdbcTemplate().update(sql, new Object[] {persona.getNombres(), persona.getCorreo(), persona.getNacionalidad(), id});
		return new ModelAndView("redirect:/crudDemo");
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(HttpServletRequest request) {
		id = Integer.parseInt(request.getParameter("id"));
		String sql = "DELETE FROM persona WHERE  ide=?";
		getJdbcTemplate().update(sql, new Object[] {id});
		return new ModelAndView("redirect:/crudDemo");
	}
	
}

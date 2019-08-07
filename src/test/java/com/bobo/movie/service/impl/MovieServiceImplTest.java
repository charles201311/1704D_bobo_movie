package com.bobo.movie.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bobo.movie.domain.Movie;
import com.bobo.movie.service.MovieService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class MovieServiceImplTest {

	@Resource
	MovieService  movieService  ;
	
	
	@Test
	public void testSelects() {
	
		/*
		 * List<Movie> list = movieService.selects(map); System.out.println(list);
		 */
		
	}

}

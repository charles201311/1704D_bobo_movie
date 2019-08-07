package com.bobo.movie.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;

import com.bobo.movie.dao.MovieMapper;
import com.bobo.movie.domain.Movie;
import com.bobo.movie.service.MovieService;
import com.bobo.movie.vo.MovieVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Resource
	private MovieMapper movieMapper;

	@Override
	public PageInfo<Movie> selects(MovieVO  movieVO,Integer pageNum,Integer pageSize) {
		  PageHelper.startPage(pageNum, pageSize);
		 List<Movie> list = movieMapper.selects(movieVO);
		 PageInfo<Movie> info = new PageInfo<Movie>(list);
		return info;
	}

	@Override
	public int update(MovieVO movieVO) {
		// TODO Auto-generated method stub
		return movieMapper.update(movieVO);
	}

}

package com.bobo.movie.service;

import java.util.List;
import java.util.Map;

import com.bobo.movie.domain.Movie;
import com.bobo.movie.vo.MovieVO;
import com.github.pagehelper.PageInfo;

public interface MovieService {
	/**
	 * 
	 * @Title: selects 
	 * @Description: 电影列表查询
	 * @param map
	 * @return
	 * @return:  PageInfo<Movie>
	 */
	PageInfo<Movie> selects(MovieVO  movieVO,Integer pageNum,Integer pageSize);
	
	/**
	 * 更新状态
	 * @Title: update 
	 * @Description: TODO
	 * @param movieVO
	 * @return
	 * @return: int
	 */
	int update(MovieVO  movieVO);
}

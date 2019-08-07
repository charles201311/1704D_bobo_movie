package com.bobo.movie.dao;

import java.util.List;

import com.bobo.movie.domain.Movie;
import com.bobo.movie.vo.MovieVO;

public interface MovieMapper {
	
	/**
	 * 
	 * @Title: selects 
	 * @Description: 电影列表查询
	 * @param map
	 * @return
	 * @return: List<Movie>
	 */
	List<Movie> selects(MovieVO  movieVO);
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

package com.bobo.movie.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bobo.movie.domain.Movie;
import com.bobo.movie.service.MovieService;
import com.bobo.movie.utils.PageUtil;
import com.bobo.movie.vo.MovieVO;
import com.github.pagehelper.PageInfo;


//2222222222


////1111111111111111111111111111


@Controller
public class MovieController {

	@Resource
	private MovieService movieService;

	@RequestMapping(value = "selects")
	public String list(HttpServletRequest request,MovieVO  movieVO,
			@RequestParam(defaultValue ="1") Integer pageNum,@RequestParam(defaultValue = "2")Integer pageSize) {

	    PageInfo<Movie> info = movieService.selects(movieVO,pageNum,pageSize);
	    
	    //使用分页工具类
	    PageUtil.pageNum(request, "/selects", pageSize, info.getList(), (int)info.getTotal(), pageNum);
	    
	    
	    request.setAttribute("movies", info.getList());
	    request.setAttribute("movieVO", movieVO);
		return "list";
	}
	
	@ResponseBody
	@RequestMapping("update")
	public boolean update(MovieVO movieVO) {
		return movieService.update(movieVO)>0;
	}

}

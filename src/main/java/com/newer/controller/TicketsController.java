package com.newer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newer.dao.StadiaDao;
import com.newer.dao.TicketsDao;
import com.newer.domian.Stadia;
import com.newer.domian.Tickets;
import com.newer.dto.PageDto;

@Controller
@RequestMapping("ticket")
public class TicketsController {
	@Autowired
	private TicketsDao ticketsDao;
	@Autowired
	private StadiaDao stadiaDao;

	// 分页查询所有门票信息
	@RequestMapping("ticketSearch")
	public String ticketSearch(PageDto pageDto,ModelMap modelMap) {
		// 实现分页
		PageHelper.startPage(pageDto.getPage(), pageDto.getPageSize());
		List<Tickets> list = ticketsDao.selectAll();
		PageInfo<Tickets> pageinfo=new PageInfo<Tickets>(list);
		modelMap.addAttribute("pageinfo", pageinfo);
		//返回到查看门票信息页面
		return "selectTicket";
	}
	
	//to修改页面
	@RequestMapping("toupdate")
	public String toupdate(Integer id,ModelMap modelMap) {
		//根据编号查询门票信息
		Tickets tickets=ticketsDao.selectByPrimaryKey(id);
		//查询所有场馆信息
		List<Stadia> list=stadiaDao.selectAll();
		//绑定门票信息到作用域
		modelMap.addAttribute("tickets", tickets);
		modelMap.addAttribute("list", list);
		return "TicketModify";
	}

}

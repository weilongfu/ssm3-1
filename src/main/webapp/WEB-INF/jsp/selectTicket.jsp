<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="../dist/css/bootstrap.min.css">
	<link rel="stylesheet" href="dist/css/bootstrap.min.css"/>
		<link rel="stylesheet" href="dist/css/bootstrap-table.css"/>
		<script type="text/javascript" src="dist/js/jquery-3.4.1.min.js" ></script>
		<script type="text/javascript" src="dist/js/bootstrap.min.js" ></script>
		<script type="text/javascript" src="dist/js/bootstrap-table.js" ></script>
		<script type="text/javascript" src="dist/js/bootstrap-table-zh-CN.js" ></script>
<title>门票信息</title>
<script>
		
		
		
</script>	
</head>
<body>
	<p align="center">
	<h1 align="center">门票详细信息</h1>
	</p>
	<br>
	<br>
	<br>

	<div class="row">
		<div class="col-lg-offset-9">
			<button class="btn btn-success">新增门票信息</button>
		</div>
	</div>

	<br>
	<div class="container">
		<table class="table table-hover">
			<tr>
				<th>编号</th>
				<th>比赛项目</th>
				<th>开始时间</th>
				<th>价格</th>
				<th>剩余票数</th>
				<th>操作</th>
			</tr>

			<c:forEach var="tickets" items="${pageinfo.list}">
				<tr>
					<td>${tickets.ticketid}</td>
					<td>${tickets.ticketname}</td>
					<td>${tickets.beginTimeString}</td>
					<td>${tickets.price}</td>
					<td>${tickets.totalcount-tickets.ordercount}</td>
					<td><a href="toupdate?id=${tickets.ticketid}">修改</a> <a href="delete?id=${tickets.ticketid}">删除</a></td>
				</tr>
			</c:forEach>

			<tr align="center">
				<td colspan="5"><span style="color: red">${pageinfo.pageNum }</span>/${pageinfo.pages }
					<a href="ticketSearch?page=1">首页</a> | <a
					href="ticketSearch?page=${pageinfo.prePage }">上一页</a> | <a
					href="ticketSearch?page=${pageinfo.nextPage }">下一页</a> | <a
					href="ticketSearch?page=${pageinfo.lastPage }">尾页</a></td>
			</tr>
		</table>
	</div>

	
</body>
</html>
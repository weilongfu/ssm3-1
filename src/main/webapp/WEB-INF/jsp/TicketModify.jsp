<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../Css/default.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="Div">
        <p align="center">
            <b>比赛项目门票详细信息</b></p>
    </div>
    <div align="center">
        <table class="divTab" width="50%">
            <tr align="left">
                <td>
                    比赛名称:</td>
                <td>
                    <input id="Text1" type="text" value="${tickets.ticketname}" /><span style="color: Red;">不能为空</span></td>
            </tr>
            <tr align="left">
                <td>
                    比赛场地:</td>
                <td>
                    <select id="SelStadium">
                        <option value="0">请选择</option>
                       <c:forEach items="${list }" var="stadia">
                          <option value="${stadia.name}">${stadia.name}</option>
                       </c:forEach>
                    </select>
                </td>
            </tr>
            <tr align="left">
                <td>
                    开始时间:</td>
                <td>
                    <input id="Text4" type="text" value="${tickets.beginTimeString }" /><span style="color: Red;">不能为空</span></td>
            </tr>
            <tr align="left">
                <td>
                    价格:</td>
                <td>
                    <input id="Text5" type="text" value="${tickets.price}" /><span style="color: Red;">不能为空且必须为数字</span></td>
            </tr>
            <tr align="left">
                <td>
                    备注:</td>
                <td>
                    <textarea id="TextArea1" style="width: 260px; height: 84px">${tickets.descn}</textarea></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input id="Button1" type="button" value="修改" />
                    <input id="Button2" type="button" value="重置" /></td>
            </tr>
        </table>
    </div>
</body>
</html>
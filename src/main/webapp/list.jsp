<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <% String path = request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css">
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
</head>
<body>
	<form action="list" method="post">
		价格：<input type="text" name="startPrice"> ~ <input type="text" name="endPrice"><br><br>
		占比：<input type="text" name="startSaleay"> ~ <input type="text" name="endSaleay"> <br><br>
		选择排序：<select name="sort">
			<option value=""></option>
			<option value="id">序号</option>
			<option value="name">名称</option>
			<option value="price">价格</option>
			<option value="saleay">占比</option>
		</select>
		排序属性：<select name="type">
			<option value="2"></option>
			<option value="asc">升序</option>
			<option value="desc">降序</option>
		</select>
		<input type="submit" value="查询">
	</form>
	
	<input type="button" value="读取文件添加数据" onclick="add()">
	<table>
		<thead>
			<tr>
				<th>序号</th>
				<th>名称</th>
				<th>价格</th>
				<th>占比</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.list }" var="g">
				<tr>
					<td>${g.id}</td>
					<td>${g.name}</td>
					<td>${g.price}</td>
					<td>${g.saleay}%</td>
				</tr> 
			</c:forEach>
		</tbody>
	</table>
	<input type="button" value="首页" onclick="page(1)">
	<c:if test="${page.pageNum - 7 >= 1 }"><input type="button" value="1" onclick="page(1)">...</c:if>
 	<c:if test="${page.pageNum - 3 >= 1 }"><input type="button" value="${page.pageNum - 3 }" onclick="page('${page.pageNum - 3}')"></c:if>
	<c:if test="${page.pageNum - 2 >= 1 }"><input type="button" value="${page.pageNum - 2 }" onclick="page('${page.pageNum - 2}')"></c:if>
	<c:if test="${page.pageNum - 1 >= 1 }"><input type="button" value="${page.pageNum - 1 }" onclick="page('${page.pageNum - 1}')"></c:if>
	<input type="button" value="${page.pageNum }" onclick="page('${page.pageNum}')">
	<c:if test="${page.pageNum + 1 <= page.pages }"><input type="button" value="${page.pageNum + 1 }" onclick="page('${page.pageNum + 1}')"></c:if>
	<c:if test="${page.pageNum + 2 <= page.pages }"><input type="button" value="${page.pageNum + 2 }" onclick="page('${page.pageNum + 2}')"></c:if>
	<c:if test="${page.pageNum + 3 <= page.pages}"><input type="button" value="${page.pageNum + 3 }" onclick="page('${page.pageNum + 3}')"></c:if>
	<c:if test="${page.pageNum + 7 <= page.pages}">....<input type="button" value="${page.pages }" onclick="page('${page.pages}')"></c:if>
	<input type="button" value="上一页" onclick="page('${page.pageNum - 1 < 1 ? page.pageNum:page.pageNum - 1}')">
	<input type="button" value="下一页" onclick="page('${page.pageNum + 1 > page.pages ? page.pageNum:page.pageNum + 1}')">
	<input type="button" value="尾页" onclick="page('${page.pages}')">
</body>
<script type="text/javascript">
	function add() {
		location = "add";
	}
	
	function page(pageNum){
		location = "list?pageNum="+pageNum;
	}
</script>
</html>
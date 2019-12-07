<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<LINK href="webresources/css/css.css" type="text/css" rel="stylesheet">
<script src="webresources/js/jquery-1.8.2.min.js"></script>
</head>
<body>
		${selectGoods}
		<form action="select" method="post">
			价格范围:<input type="text" name="beginprice" value="${vo.beginprice}">-<input type="text" name="endprice" value="${vo.endprice}">元
			已售百分比:<input type="text" name="beginsales" value="${vo.beginsales}">-<input type="text" name="endsales" value="${vo.endsales}">%
			排序:<select name="sortingtype">
					<option value="price" ${vo.sortingtype=='price'?'selected':''}>价格</option>
					<option value="sales" ${vo.sortingtype=='sales'?'selected':''}>已售百分比</option>
				</select>
				<select name="sort">
					<option value="ASC" ${vo.sort=='ASC'?'selected':''}>正序</option>
					<option value="DESC" ${vo.sort=='DESC'?'selected':''}>倒序</option>
				</select>
				<input type="hidden" name="page" class="page">
				<button>查询</button><br>
		</form>
		<table>
		  <tr>
		    <th>id</th>
		    <th>商品名</th>
		    <th>价格</th>
		    <th>百分比</th>
		  </tr>
		  <c:forEach items="${selectGoods.list}" var="list">
		  	  <tr>
			    <td>${list.id}</td>
			    <td>${list.name}</td>
			    <td>${list.price}</td>
			    <td>${list.sales}</td>
			  </tr>
		  </c:forEach>
		  <td colspan="4">
		  		<input type="button" value="首页" onclick="page(1)">
		  		<input type="button" value="上一页" onclick="page(${selectGoods.prePage})">
		  		<input type="button" value="下一页" onclick="page(${selectGoods.nextPage})">
		  		<input type="button" value="尾页" onclick="page(${selectGoods.pages})">
		  </td>
		</table>
		<script type="text/javascript">
			function page(id){
				$(".page").val(id);
				$("form").submit();
			}
		</script>
</body>
</html>
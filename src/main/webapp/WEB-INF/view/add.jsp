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
		<input type="button" value="添加" onclick="add()">
		<script type="text/javascript">
			function add(){
				location="add";
			}
		</script>
</body>
</html>
<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
		<script src="https://code.jquery.com/jquery-1.11.3.js"></script>
		<script src="<c:url value='/common/js/common.js'/>"></script>
	</head> 
	<script>
	//alert('1');
		util.initSelectBox('master','master','','Y');
	</script>
	<body>
	<div style="border:1px solid;width:100%;height:50px;text-align:right;">${sserver}</div>
		<h2>${message}</h2>
		<h1>${combo}</h1>
		<select id="master" style="width:140px;" onChange="javascript:util.initSelectBox('client', $(this).val(), '','Y');"></select>
		<select id= "client" style="width:140px;">
			<option value="selected=">-select-</option>
		</select>
	</body>
</html>

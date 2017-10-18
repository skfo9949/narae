<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script src="<c:url value='/common/js/common.js'/>"></script>
<script>
	function doReg() {
		$('#form').submit();
	}
</script>
</head>
<body>
	<div
		style="border: 1px solid; width: 100%; height: 50px; text-align: right;">${sserver}</div>
	<form id="form" name="form" method="post"
		action="<c:url value='/study/doReg.html'/>">


		<label>Name </label> <input type="text" name="name" id="name" /><br />

		<label>Email </label> <input type="text" name="email" id="email" /><br />

		<label>Password </label> <input type="text" name="password"
			id="password" /><br /> <label>성별</label> <span><input
			type="radio" name="sex" id="man" value="M" /><label for="man">남</label></span>
		<span><input type="radio" name="sex" id="woman" value="W" /><label
			for="woman">여</label></span><br /> <label>취미</label> <input type="checkbox"
			id="hobby1" name="hobby1" value="1"><label for="hobby1">독서</label>
		<input type="checkbox" id="hobby2" name="hobby2" value="1"><label
			for="hobby2">운동</label><br /> <input type="button" value="등록"
			onClick="javascript:doReg();">

	</form>
</body>
</html>

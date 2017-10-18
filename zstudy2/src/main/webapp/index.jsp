<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
<script src="https://code.jquery.com/jquery-1.11.3.js"></script>
<script src="<c:url value='/common/js/common.js'/>"></script>

</head>

<script>
	/* 		function getMessage(){
	 $.ajax({
	 method:"POST",
	 url:"<c:url value='/study/getMessage.html'/>",
	 dataType:"JSON",
	 data:null,
	 error:function(){alert('error');},
	 success:result
	 });
	 }
	 */
	function getMessage() {
		util.requestSync('<c:url value='/study/getMessage.html'/>', null,
				'post', result);
	}
	function result(data) {
		alert(data.result);
	}
	function showMessage() {
		$('#frame').load("<c:url value="/study/showMessage.html" />");
	}
	function showLoad(url) {
		$('#frame').load(url, function(response, status) {
			if (status == 'error') {
				$('#frame').html(response);
			}
		})
	}
</script>


<body>
<div id="leftFrame" style="float:left;width:200px;height:500px;">
	<c:url value="/study/showMessage.html" var="messageUrl" />
	1.
	<a href="${messageUrl}">Click to enter</a>
	<br /> 2.
	<input type="button" value="getMessage"
		onclick="javascript:getMessage()" />
	<br> 3.
	<a href="<c:url value='/study/getMessage1.html'/>">404 Error</a>
	<br> 4.
	<a href="<c:url value='/study/getMessageByZero.html'/>">By zero
		Error</a>
	<br> 5.
	<a href="<c:url value='/study/getMessage500.html'/>">500 Error</a>
	<br> 6.
	<a href="<c:url value='/study/registForm.html'/>">회원가입</a>
	<!-- </br> -->
	<hr />
	1.
	<span onClick="javascript:showLoad('${messageUrl}');"
		style="cursor: pointer; cursor: hand;">Click to enter</span>
	<br /> 2.
	<span
		onClick="javascript:showLoad('<c:url value="/study/getMessage1.html" />');"
		style="cursor: pointer; cursor: hand;">404 Error</span>
	<br /> 3.
	<span
		onClick="javascript:showLoad('<c:url value="/study/getMessage404.html" />');"
		style="cursor: pointer; cursor: hand;">404 Error</span>
	<br /> 4.
	<span
		onClick="javascript:showLoad('<c:url value="/study/getMessageByZero.html" />');"
		style="cursor: pointer; cursor: hand;">By zero Error</span>
	<br /> 5.
	<span
		onClick="javascript:showLoad('<c:url value="/study/getMessage500.html" />');"
		style="cursor: pointer; cursor: hand;">500 Error</span>
	<br /> 6.
	<span
		onClick="javascript:showLoad('<c:url value="/study/registForm.html" />');"
		style="cursor: pointer; cursor: hand;">회원가입</span>
	<br />
	<hr />
	</div>
	<div id="frame"
		style="width: calc(100% - 202px); width: -moz-calc(100% - 
 202px); width: -webkit-calc(100% - 202px); overflow: overflow-y; height: 100%; border: solid 1px; float: left;"></div>
</body>
</html>

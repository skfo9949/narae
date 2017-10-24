<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<script>
	var result = '${msg}';
	
	if(result =='success'){
		alert('처리가 완료되었습니다.');
	}
</script>
<!-- left column  -->
<div class="col-md-12">
	<!-- general form elements -->

	<div class="box">
		<div class="box-header with-boarder">
			<h3 class="box-title">ListAll PAGE</h3>
		</div>
		<div class="box-body">
			<table class="table table-bordered">
				<tr>
					<th style="width: 10px">BNO</th>
					<th>TITLE</hh>
					<th>WRITER</th>
					<th>REGDATE</th>
					<th style="width: 40px">VIEWCNT</th>
				</tr>
				
				<c:forEach items="${list }" var="boardVO" >
					<tr>
						<td>${boardVO.bno }</td>
						<td><a href='/board/read?bno=${boardVO.bno }'>${boardVO.title }</a></td>
						<td>${boardVO.writer }</td>
						<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${boardVO.regdate }"/></td>
						<td><span class="badge bg-red">${boardVO.viewcnt }</span></td>
					</tr>
				</c:forEach>
				
				
			</table>

		</div>
		<!-- /.box-body  -->
		<div class="box-footer">Footer</div>
		<!-- /.box-footer  -->

		
	</div>
</div>

<%@include file="/WEB-INF/views/include/footer.jsp"%>
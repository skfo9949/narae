<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/header.jsp"%>
<script>
	$(document).ready(function() {
		var formObj = $("form[role='form']");
		console.log(formObj);

		//수정버튼.
		$(".btn-warning").on("click", function() {
			formObj.attr("action", "/board/modify");
			formObj.attr("method", "get");
			formObj.submit();
		});
		
		//삭제버튼.
		$(".btn-danger").on("click", function() {
			formObj.attr("action", "/board/remove");
			formObj.submit();
		});

		//목록페이지 버튼.
		$(".btn-primary").on("click", function() {
			self.location = "/board/listAll";
		});

	});
</script>

<form role="form" method="post">
	<input type="hidden" name="bno" value="${boardVO.bno }">
</form>

<div class="box-header with-boarder">
	<h3 class="box-title">READ PAGE</h3>
</div>
<div class="box-body">
	<div class="form-group">
		<label for="exampleInputEmail1">Title</label> <input type="text"
			name="title" class="form-control" value="${boardVO.title }"
			readonly="readonly">
	</div>
	<div class="form-group">
		<label for="exampleInputPassword1">Content</label>
		<textarea class="form-control" name="content" row="3"
			readonly="readonly">${boardVO.content }</textarea>
	</div>
	<div>
		<label for="exampleInputEmail1">Writer</label> <input type="text"
			name="writer" class="form-control" value="${boardVO.writer }"
			readonly="readonly">
	</div>
</div>

<div class="box-footer">
	<button type="submit" class="btn btn-warning">Modify</button>
	<button type="submit" class="btn btn-danger">REMOVE</button>
	<button type="submit" class="btn btn-primary">LIST ALL</button>
</div>

<%@include file="/WEB-INF/views/include/footer.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/header.jsp"%>
<script>
	$(document).ready(function() {
		var formObj = $("form[role='form']");
		console.log(formObj);

		//수정버튼.
		$(".modifyBtn").on("click", function() {
			formObj.attr("action", "/sboard/modifyPage");
			formObj.attr("method", "get");
			formObj.submit();
		});

		//삭제버튼.
		$(".removeBtn").on("click", function() {
			formObj.attr("action", "/sboard/removePage");
			formObj.submit();
		});

		//목록페이지 버튼.
		$(".goListBtn").on("click", function() {
			formObj.attr("method", "get");
			formObj.attr("action", "/sboard/list");
			formObj.submit();
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
	<button type="submit" class="btn btn-warning modifyBtn">Modify</button>
	<button type="submit" class="btn btn-danger removeBtn">REMOVE</button>
	<button type="submit" class="btn btn-primary goListBtn">LIST
		ALL</button>
</div>


<form role="form" action="modifyPage" method="post">
	<input type="hidden" name="bno" value="${boardVO.bno }"> <input
		type="hidden" name="page" value="${cri.page }"> <input
		type="hidden" name="perPageNum" value="${cri.perPageNum }"> <input
		type="hidden" name="searchType" value="${cri.searchType }"> <input
		type="hidden" name="keyword" value="${cri.keyword }">
</form>

<div class="row">
	<div class="col-md-12">
		<div class="box box-success">
			<div class="box header">
				<h3 class="box-title">ADD NEW REPLY</h3>
			</div>

			<div class="box-body">
				<label for="newReplyWriter">Writer</label> <input
					class="form-control" type="text" placeholder="USER ID"
					id="newReplyWriter"> <label for="newReplyText">ReplyText</label>
				<input class="form-control" type="text" placeholder="REPLY TEXT"
					id="newReplyText">
			</div>
			<!-- /.box-body -->
			<div class="box-footer">
				<button type="submit" class="btn btn-primary" id="replyAddBtn">ADD
					REPLY</button>
			</div>

			<!-- The time line -->
			<ul class="timeline">
				<!-- timeline time label -->
				<li class="time-label" id="repliesDiv"><span class="bg-grenn">
					Replies List</span></li>
			</ul>
			
			<div class='text-center'>
				<ul id="pagination" class="pagination pagination-sm no-margin">
				</ul>
			</div>
		</div>
	</div>
</div>
<%@include file="/WEB-INF/views/include/footer.jsp"%>
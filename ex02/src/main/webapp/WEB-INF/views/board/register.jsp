<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/header.jsp"%>

<form role="form" method="post">
	<div class="box-header with-boarder">
		<h3 class="box-title">REGISTER PAGE</h3>
	</div>
	<div class="box-body">
		<div class="form-group">
			<label for="exampleInputEmail1">Title</label> <input type="text"
				name="title" class="form-control" placeholder="Enter Title">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Content</label>
			<textarea class="form-control" name="content" row="3"
				placeholder="Enter..."></textarea>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Writer</label> <input type="text"
				name="writer" class="form-control" placeholder="Enter Writer">
		</div>
		<!-- /.box-body  -->

		<div class="box-footer">
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</div>
</form>

<%@include file="/WEB-INF/views/include/footer.jsp"%>



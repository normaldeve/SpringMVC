<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Spring MVC01</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
 
<div class="container">
  <h2>Spring MVC01</h2>
  <div class="panel panel-default">
    <div class="panel-heading">Board</div>
        <div class="panel-body">
        	<table class="table table-bordered table-hover">
        		<tr>
        			<td>번호</td>
        			<td>제목</td>
        			<td>내용</td>
        			<td>작성자</td>
        			<td>작성일</td>
        			<td>조회수</td>
        		</tr>
        		<c:forEach var="bo" items="${list}">
        			<tr>
        				<td>${bo.idx}</td>
        				<td>${bo.title}</td>
	        			<td>${bo.content}</td>
	        			<td>${bo.writer}</td>
	        			<td>${bo.indate}</td>
	        			<td>${bo.count}</td>
	        		</tr>
        		</c:forEach>
        	</table>
        </div>
    <div class="panel-footer">인프런_스프_1탄_김준우</div>
  </div>
</div>

</body>
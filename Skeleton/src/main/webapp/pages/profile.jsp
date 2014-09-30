<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<c:import url="template/header.jsp" />

<h1>User Profile:</h1>
<div>
	<p>ID: ${user.id}</p>
	<p>Name: ${user.firstName} ${user.lastName} </p>
	<p>Email: ${user.email}</p>
	<p>Team: ${user.team.teamName}</p>
	
</div>


<c:import url="template/footer.jsp" />
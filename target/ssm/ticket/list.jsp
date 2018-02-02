<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>${ticketInfo.customerId}</td>
			<td>${ticketInfo.customerName}</td>
			<td>${ticketInfo.customerTel}</td>
			<td>${ticketInfo.ticketId}</td>
			<td>${ticketInfo.ticketAddress}</td>
			<td>${ticketInfo.ticketPrice}</td>
		</tr>
	</table>
</body>
</html>
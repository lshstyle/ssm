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
			<td>${customerInfo.customerId}</td>
			<td>${customerInfo.customerName}</td>
			<td>${customerInfo.customerTel}</td>
			<td>
				<table>
					<c:forEach items="${customerInfo.tickets}" var="ticket">
						<tr>
							<td>${ticket.ticketId}</td>
							<td>${ticket.ticketAddress}</td>
							<td>${ticket.ticketPrice}</td>
						</tr>
					</c:forEach>
				</table>
			</td>
		</tr>
	</table>
</body>
</html>
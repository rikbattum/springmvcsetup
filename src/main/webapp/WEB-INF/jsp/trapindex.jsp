<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<title>Books</title>
</head>
<body>
	<table>
		<tr>
			<th>${message}</th>
		</tr>
		<c:forEach items="${trappen}" var="trap">
			<tr>
				<td>${trap.id}</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>
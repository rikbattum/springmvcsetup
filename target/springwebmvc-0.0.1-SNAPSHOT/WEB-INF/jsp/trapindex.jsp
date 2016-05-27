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
			<th>Title</th>
		</tr>
		<c:forEach items="${books}" var="book">
			<tr>
				<td>${book.title}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
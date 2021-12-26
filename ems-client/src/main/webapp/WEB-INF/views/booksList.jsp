<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table border="2">
<tr><th>BookID</th><th>Name</th><th>Price</th></tr>

<c:forEach items="${list}" var="book">
				

				<tr>
					<td><c:out value="${book.bookId}" /></td>
					<td><c:out value="${book.name}" /></td>
					<td><c:out value="${book.price}" /></td>
                 </tr>
                 </c:forEach>
                 
                 </table>
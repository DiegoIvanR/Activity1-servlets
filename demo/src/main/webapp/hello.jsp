<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>Hello from JSP!</h2>

<c:forEach items="${['Java','HTTP','Servlets']}" var="item">
  <p>${item}</p>
</c:forEach>

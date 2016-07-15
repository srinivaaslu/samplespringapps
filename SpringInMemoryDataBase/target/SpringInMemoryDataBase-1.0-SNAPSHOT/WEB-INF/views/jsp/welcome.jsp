<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1>Spring MVC + Embedded database example</h1>

<h2>${msg}</h2>
<c:forEach items="${user}" var="userObj">
    <table>
        <tr>
            <td>${userObj.name}</td>
        </tr>
    </table>
</c:forEach>
<h2>${user}</h2>

</body>
</html>
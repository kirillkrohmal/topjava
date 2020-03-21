<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Счетчик калорий</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <h2><a href="${pageContext.request.contextPath}/list">Home</a></h2>

    <div class="form-group">
        <a href="${pageContext.request.contextPath}/createForm">Add Meal</a>

        <table class="table">
            <thead class="thead-light">
            <tr>
                <th>ID</th>
                <th>Date</th>
                <th>Description</th>
                <th>Calories</th>
                <th>Update your items</th>
                <th>Delete your items</th>
            </tr>

            <c:forEach var="meal" items="${meals}">
                <c:url var="updateLink" value="/updateForm">
                    <c:param name="mealId" value="${meal.id}"/>
                </c:url>

                <c:url var="deleteLink" value="/delete">
                    <c:param name="mealId" value="${meal.id}"/>
                </c:url>

                <tr>
                    <td>${meal.id}</td>
                    <td>${meal.datetime}</td>
                    <td>${meal.description}</td>
                    <td>${meal.calories}</td>
                    <td><p><a href="${updateLink}">Update</a></p></td>
                    <td><p><a href="${deleteLink}">Delete</a></p></td>
                </tr>
            </c:forEach>
            </thead>
        </table>
    </div>
</div>
</body>
</html>
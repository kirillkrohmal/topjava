<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Счетчик калорий</title>]
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <h2><a href="meals.jsp">Home</a></h2>

    <div class="form-group">
        <a href="updatemealForm.jsp">Add Meal</a>

        <table class="table">
            <thead class="thead-light">
            <tr>
                <th>Date</th>
                <th>Description</th>
                <th>Calories</th>
                <th>Update your items</th>
                <th>Delete your items</th>
            </tr>

            <c:forEach var="meals" items="${mealsItem}">
                <tr>
                    <td>${meals.date}</td>
                    <td>${meals.description}</td>
                    <td>${meals.calories}</td>
                    <td>${meals.calories}</td>
                    <td>${meals.calories}</td>
                </tr>
            </c:forEach>
            </thead>
        </table>
    </div>
</div>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Редактировать еду</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <h2><a href="meals.jsp">Home</a></h2>
    <h2>Редактировать еду</h2>
    <div id="row">
        <div class="col-md-9">

            <div class="form-group">
                <div class="col-md-12">
                    <label for="datetime" type="table" class="table">DateTime</label>
                    <input id="datetime" name="datetime"/>
                </div>
            </div>

            <div class="form-group">
                <div class="col-md-12">
                    <label for="description" type="table" class="table">Description</label>
                    <input id="description" name="description"/>
                </div>
            </div>

            <div class="form-group">
                <div class="col-md-12">
                    <label for="calories" type="table" class="table">Calories</label>
                    <input id="calories" name="calories"/>
                </div>
            </div>

        </div>
    </div>


    <button type="button" class="btn btn-default" name="saveMeals">Save</button>
    <button type="button" class="btn btn-default" name="cancelMeals">Cancel</button>

</div>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo List</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm2rXO2XhzZv5CiL0JuVNRlTx" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <div class="row mt-5">
            <div class="col-sm-12 col-md-8 col-lg-6 mx-auto">
                <h1 class="text-center mb-4">Todo List</h1>
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th>Title</th>
                            <th>Description</th>
                            <th>Due Date</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${tasks}" var="task">
                            <tr>
                                <td>${task.title}</td>
                                <td>${task.description}</td>
                                <td>${task.dueDate}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <h2 class="text-center my-4">Add New Task</h2>
                <form action="${pageContext.request.contextPath}/tasks" method="post">
                    <div class="form-group">
                        <label for="title">Title:</label>
                        <input type="text" class="form-control" id="title" name="title" required>
                    </div>
                    <div class="form-group">
                        <label for="description">Description:</label>
                        <textarea class="form-control" id="description" name="description" rows="3" required></textarea>
                    </div>
                    <div class="form-group">
                        <label for="due_date">Due Date:</label>
                        <input type="date" class="form-control" id="due_date" name="due_date" required>
                    </div>
                    <button type="submit" class="btn btn-primary">Add Task</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>

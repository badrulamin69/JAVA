<%@page import="model.Employee" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Employee e = (Employee) request.getAttribute("employee");

    // Prevent null error
    if (e == null) {
        response.sendRedirect(request.getContextPath() + "/pages/index.jsp");
        return;
    }

    // Format date safely
    String formattedDate = "";
    if (e.getJoiningDate() != null) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        formattedDate = sdf.format(e.getJoiningDate());
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Employee</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body style="background:#f5f6fa;">

<div class="container mt-5">
    <div class="card p-4 shadow">

        <h3 class="mb-3">Edit Employee</h3>

        <p><strong>ID:</strong> <%= e.getId() %></p>

        <form action="<%= request.getContextPath() %>/employee" method="post">
            <input type="hidden" name="action" value="update">
            <input type="hidden" name="id" value="<%= e.getId() %>">

            <div class="mb-3">
                <label>Name</label>
                <input type="text" name="name"
                       class="form-control"
                       value="<%= e.getName() %>"
                       required>
            </div>

            <div class="mb-3">
                <label>Designation</label>
                <input type="text" name="designation"
                       class="form-control"
                       value="<%= e.getDesignation() %>"
                       required>
            </div>

            <div class="mb-3">
                <label>Salary</label>
                <input type="number" name="salary"
                       class="form-control"
                       value="<%= e.getSalary() %>"
                       required>
            </div>

            <div class="mb-3">
                <label>Joining Date</label>
                <input type="date" name="joiningDate"
                       class="form-control"
                       value="<%= formattedDate %>"
                       required>
            </div>

            <button type="submit" class="btn btn-primary">Update</button>

            <a href="<%= request.getContextPath() %>/pages/index.jsp"
               class="btn btn-secondary">
                Cancel
            </a>
        </form>

    </div>
</div>

</body>
</html>
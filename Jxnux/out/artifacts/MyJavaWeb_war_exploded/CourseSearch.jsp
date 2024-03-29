<%@ page import="model.CourseTable" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="css/mycss.css">
<html>
<head>
    <title>查询结果</title>
</head>
<body>
<%
    List<CourseTable> courseTables = (ArrayList) session.getAttribute("courseTables");
    Iterator<CourseTable> iterator = courseTables.iterator();
    CourseTable courseTable = null;
%>
<h2>查询结果</h2>
<table class="tables">
    <caption>开课表</caption>
    <tr align="center">
        <th>课程号</th>
        <th>课程名</th>
        <th>上课时间</th>
        <th>教师姓名</th>
        <th>教师工号</th>
        <th>学分</th>
    </tr>
    <%
        while (iterator.hasNext()) {
            courseTable = iterator.next();

    %>
    <tr align="center">
        <td><%=courseTable.getCourseId()%>
        </td>
        <td><%=courseTable.getCourseName()%>
        </td>
        <td><%=courseTable.getTime()%>
        </td>
        <td><%=courseTable.getTeacherName()%>
        </td>
        <td><%=courseTable.getTeacherId()%>
        </td>
        <td><%=courseTable.getCourseCredit()%>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>

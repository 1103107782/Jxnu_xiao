
<%@ page import="model.UserTable,java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="css/mycss.css">
<html>

<head>
    <title>主页</title>
</head>
<body>
<%
    UserTable userTable = (UserTable) session.getAttribute("user");
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-hh:mm");
%>
<div class="head1">
    <form action="loginOutServlet" method="get">
        欢迎 <%=userTable.getName()%>登陆本系统！<%=simpleDateFormat.format(new Date())%>
        <input type="submit" class="myButton2" value="退出">
    </form>
</div>
<div>
    <%--分区显示--%>
    <iframe align="left" name="ifram1" id="ifram1" frameborder="1" width="14%" height="100%" src="MainLeft.jsp">
    </iframe>
    <iframe align="left" name="ifram3" id="ifram3" scrolling="no" frameborder="0" width="85%" height="60px"
            src="MainTop.jsp">
    </iframe>
    <iframe align="left|bottom" name="ifram2" id="ifam2" frameborder="0" width="85%" height="100%"
            src="MainRight.jsp">
    </iframe>
</div>
</body>
</html>

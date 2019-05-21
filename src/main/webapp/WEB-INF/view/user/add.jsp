<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>人员---增加</title>
</head>
<body>
<form>
    <ul>
        <li>
            <h4>姓名:</h4>
            <input name="name" id="name" style="width: 140px;"/>
        </li>
        <li>
            <h4>年龄:</h4>
            <input name="age" id="age" style="width: 140px;"/>
        </li>
        <li>
            <h4>工号:</h4>
            <input name="jobNo" id="jobNo" style="width: 140px;"/>
        </li>
        <li>
            <h4>姓名:</h4>
            <input name="name" id="userName" style="width: 140px;"/>
        </li>
        <li>
            <h4>部门:</h4>
            <select name  = "deptNo" id="deptNo" style="width: 140px;">
                <c:forEach items="${depts}" var="dept">
                    <option name = "${dept.id}" value = "${dept.deptNo}">${dept.deptName}</option>
                </c:forEach>
            </select>
        </li>
        <li>
            <h4>员工等级:</h4>
            <select name  = "rank" id="rank" style="width: 140px;">
                <c:forEach items="${ranks}" var="rank">
                    <option name ="${rank.id}" value="${rank.rank}">${rank.description}</option>
                </c:forEach>
            </select>
        </li>
    </ul>
<button id="addUser">添加</button>



</form>
</body>
</html>

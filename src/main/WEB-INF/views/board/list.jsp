<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<script src="/resources/js.jquery.min.js">
$(document).ready(function() {

});
</script>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <table style="border: 1px solid;">\
        <tr>
            <td>NO</td>
            <td>제목</td>
            <td>작성자</td>
            <td>작성일</td>
            <td>조회수</td>
        </tr>
        <c:forEach var="board" items="boardList" varStatus="loop">
            <tr>
                <td>${board.seq}</td>
                <td>${board.title}</td>
                <td>${board.writer}</td>
                <td>${board.regDate}</td>
                <td>${board.hit}</td>
            </tr>
        </c:forEach>
    </table>

    <button id="newBoard"></button>

</body>
</html>
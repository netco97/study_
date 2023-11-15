<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function deleteRestaurant(no){
	let ok = confirm('정말 삭제 합니까?');
	if(ok){
		location.href = 'DelRestaurantC?no='+ no;
	}
}
</script>
</head>
<body>
<h2 style="color: red">${r }</h2>
<button onclick="location.href='HC'">등록</button>
	<table border = 1>
		<tr><th>가게명</th><th>대표메뉴</th><th>장소</th></tr>
		<c:forEach var="r" items="${restaurants}">
			<tr>
				<td>${r.name }</td>
				<td>${r.menu }</td>
				<td>${r.place }</td>
				<td><button onclick="deleteRestaurant(${r.no});">삭제</button></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
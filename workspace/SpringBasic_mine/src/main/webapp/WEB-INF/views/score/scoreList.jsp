<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>점수 결과 화면</h2>
		<c:forEach var="vo" items="${list}" varStatus="status">
		번호: ${status.index }	
		이름: ${vo.name }
		국어: ${vo.kor }
		영어: ${vo.eng }
		수학: ${vo.math }
		<button type="button" onclick="location.href='scoreDelete?sno=${status.index}';">삭제</button>
		<br>
		</c:forEach>
	<br>
	<a href="scoreRegist">점수추가 등록</a>
	
	
	
	
	
	<script>
		(function() {
			if('${num}' !== '' ) {
				alert('${num}' + '가 삭제 되었습니다');
			}
			
		})()
	
	</script>
	
	
	
	
	
	
	
</body>
</html>
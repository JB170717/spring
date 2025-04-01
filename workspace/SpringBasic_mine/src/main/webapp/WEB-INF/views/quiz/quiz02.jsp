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
	
	<!--
	생일축하 메시지를 입력받을 받아, result페이지로 리디렉션 합니다.
	
	"년-월-일 메시지" 형태로 데이터를 변경하여
	result페이지에서는 생일축하 메시지를 1회성 출력해주세요.
	-->
	
		
	<form action="birthForm" method="post">
		생년월일:<br>
		<input type="text" name="year" maxlength="4" size="4" placeholder="년(4자)">
		<select name="month">
			<c:forEach var="i" begin="1" end="12">
				<option>${i }</option>
			</c:forEach>
		</select>
		<input type="text" name="day" maxlength="2" size="4" placeholder="일">
		<input type="text" name="msg" placeholder="축하 메시지">
				
		
		<input type="submit" value="전송">
	</form>
</body>
</html>
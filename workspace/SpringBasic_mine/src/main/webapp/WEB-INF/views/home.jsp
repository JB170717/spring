<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>
		Hello world!  
	</h1>

	<P>  The time on the server is ${serverTime}. </P>
	
	<script>
		//이런 느낌으로 접근할 수 있음
		var msg= '${msg}';
		if(msg != ''){
			alert(msg);
		}
	</script>
	
	
	
	
</body>
</html>

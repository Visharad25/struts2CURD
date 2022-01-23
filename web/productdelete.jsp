<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Delete</title>
</head>
<body>
	<h2>Delete Product</h2>
        <jsp:include page="menu.jsp"></jsp:include>
	<span><s:property value="msg" /></span><br><br>
	<a href="reportproduct">
		<button type="button">Report</button>
	</a>
</body>
</html>

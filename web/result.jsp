<%@ page import="java.util.*" %>
<html>
<head><title>Beer Advice</title></head>
<body>
<h1>Beer Advice</h1>
<%
	List style=(List)request.getAttribute("style");
	Iterator it=style.iterator();
	while(it.hasNext()){
		out.print("<br />try: "+it.next());
	}
%>
</body>
</html>

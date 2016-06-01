<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mengendalikan Arduino Via Web</title>
</head>
<body>
	<H1>Mengendalikan  LED</H1>
	<FORM ACTION="HelloServlet" METHOD="post">
		<INPUT TYPE="radio" NAME="radios" VALUE="on" CHECKED>
		ON <BR>
		<INPUT TYPE="radio" NAME="radios"
			VALUE="off"> OFF <BR>
	 <INPUT TYPE="submit" VALUE="Submit">
			
	</FORM>

</body>
</html>
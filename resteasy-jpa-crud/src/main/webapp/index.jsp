<html>
<head>
<title>JPA With Rest Demo In JBoss AS7</title>
</head>
<body>

	<h1>Add An Employee</h1>
	<table border="10%">
		<form action="resteasy/services/create" method="post">
			<TR>
				<TD>Enter Employee ID</TD>
				<TD><input name="empno" type="text" value="" /></TD>
			</TR>
			<TR>
				<TD>Enter Employee Name</TD>
				<TD><input name="empname" type="text" value="" /></TD>
			</TR>
			<TR>
				<TD><input type="submit" value="Add Employee" /></TD>
				<TD><input type="reset" value="Clear" /></TD>
			</TR>
		</form>
	</table>

	<h1>Remove An Employee</h1>
	<table border="10%">
		<form action="resteasy/services/removeemployee" method="post">
			<TR>
				<TD>Enter Employee ID</TD>
				<TD><input name="empno" type="text" value="" /></TD>
			</TR>
			<TR>
				<TD></TD>
				<TD><input type="submit" value="Remove Employee" /></TD>
			</TR>
		</form>
	</table>

	<h1>Find An Employee</h1>
	<table border="10%">
		<form action="resteasy/services/findemployee" method="post">
			<TR>
				<TD>Enter Employee ID</TD>
				<TD><input name="empno" type="text" value="" /></TD>
			</TR>
			<TR>
				<TD></TD>
				<TD><input type="submit" value="Find Employee" /></TD>
			</TR>
		</form>
	</table>

	<h1>Find All Employees</h1>
	<a href="resteasy/services/findall">Find All Employees</a>

</body>
</html>
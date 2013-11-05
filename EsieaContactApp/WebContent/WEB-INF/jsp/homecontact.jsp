
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Contact ESIEA- Spring App</title>
    <style type="text/css">
	    body {
	    width:80%;
	    margin:20px auto;
	    }
	    h2{
	   	text-align:center;
	    }
    </style>
    
</head>
<body>
	<header>
		<h2>Contact Manager</h2>
	</header>
	
	<div id="main">
		<p> Le contact  ${lastname} ${firstname} a bien été à la base donnée</p> 
	
			<div >
				
				<span ><a href="addcontact.html">Creer un contact</a></span>
				<span ><a href="home.html">Home</a></span>
			</div>					
	</div>
	<table>
   <tr>
       <td>${lastName}</td>
   </tr>
   <tr>
       <td>${firstName}</td>

   </tr>
</table>
	
</body>
</html>
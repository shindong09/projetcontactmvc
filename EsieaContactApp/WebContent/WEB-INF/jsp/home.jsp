
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
		<p> Bienvenue ${lastname} ${firstname} dans l'application de gestion de Contact</p> 
	
			<div >
				<h1>${firstName} ${lastName}</h1>
				<span ><a href="addcontact.html">Creer un contact</a></span>
				<span ><a href="home.html">Home</a></span>
			</div>					
			
	</div>
</body>
</html>
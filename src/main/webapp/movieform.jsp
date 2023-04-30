<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Movie Form</h1>

             <form action="submit" method="post">
                           <input type="text" name="moviename" placeholder="MovieName"><br><br>
                           <input type="text" name="actorname" placeholder="ActorName"><br><br>
                           <input type="text" name="actressname" placeholder="ActressName"><br><br>
                           <input type="date" name="releasedate" placeholder="Release Date"><br><br>
                           <input type="number" name="budget" placeholder="Budget"><br><br>
                           <input type="submit" value="Submit">
              
       </form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <h2 class="text-success">Login Page Display</h2>
 
 <div class ="container">
      <div class="mb-2 mt-2">
      <form action ="login" method ="post">
        <label>Username::</label>
        <input type = "text" placeholder ="Enter The Username" name ="username" class="form-control w-25" >
        </div>
        <div class="mb-2 mt-2">
        <label>Password::</label>
        <input type = "password" name ="password"  placeholder ="Enter The Password" class="form-control w-25" >
        </div>
        <button type ="submit" class="btn btn-success">Login</button>
      </form>
      </div>
 </div>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Main</title>
  </head>
  <body>
  Index
  <form action="${pageContext.request.contextPath}/index/abra" method="post">
    <div class="container">
      <label for="q"><b>Query</b></label>
      <input type="text" placeholder="Enter uri" name="q" required>

      <label for="level"><b>Level</b></label>
      <input type="text" placeholder="Enter level" name="level" required>

      <button type="submit" class="registerbtn">Index</button>
    </div>
  </form>
  </body>
</html>

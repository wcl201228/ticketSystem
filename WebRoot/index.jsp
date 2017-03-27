<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%
     String basePath = request.getContextPath() + "/";
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="X-UA-Compatible" content="IE=8">
  <meta http-equiv="content-type" content="text/html;charset=utf-8" />
    
    <title>index</title>
	<script type="text/javascript" src="<%=basePath %>js/jquery-1.8.0.min.js"></script>
  </head>
  
  <body>
      1111
  </body>
  <script type="text/javascript">
      $(document).ready(function() {
          window.location.href = '<%=basePath%>user/showUser.do?uid='+1;
      });
  
  </script>
</html>

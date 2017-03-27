<<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
     String basePath = request.getContextPath() + "/";
 %>
<!DOCTYPE HTML>
<html>
  <head>
	<title>测试</title>
	<script type="text/javascript" src="<%=basePath %>js/jquery-1.8.0.min.js"></script>
  </head>
  
  <body>
    ${test}
  </body>
  <script type="text/javascript">
      $(document).ready(function() {
          $.ajax({
              type: 'POST',
              url: '<%=basePath%>user/test2.do',
              data: {'test':'aaaaa'},
              dataType: 'JSON',
              async: false,
              success: function(result) {
                  alert(result);
              },
              error: function() {
                  alert(arguments[1]);
              }
          });
      });
  
  </script>
</html

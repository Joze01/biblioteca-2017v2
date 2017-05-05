<%-- 
    Document   : login
    Created on : 19-abr-2017, 1:38:56
    Author     : Jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="assent/header.jsp"/>
        <title>Biblioteca - 2017 - Login</title>
    </head>
    <body>

        
  <body class="login">
    <div>
      <a class="hiddenanchor" id="signin"></a>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
              <form method="post" action="/biblioteca-2017v2/autenticarServlet">
              <h1>Login</h1>
              <div>
                <input type="text" id="user" name="user" class="form-control" placeholder="Username" required="" />
              </div>
              <div>
                <input type="password" name="password" id="password" class="form-control" placeholder="Password" required="" />
              </div>
              <div>
                <input type="submit" class="btn btn-default submit" value="Log in" /> 
              </div>

              <div class="clearfix"></div>

              <div class="separator">
                

                <div class="clearfix"></div>
                <br />

                <div>
                  <h1><i class="fa fa-building"></i> Biblioteca UDB!</h1>
                </div>
              </div>
            </form>
          </section>
        </div>

      </div>
    </div>
  </body>
        
    
        <jsp:include page="assent/footer.jsp"/>
    
</html>

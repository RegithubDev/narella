<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding = "UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context_path" value="<%=request.getContextPath()%>"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
	<style type="text/css">
.topbar {
    background: #0178bc;
    background: -moz-linear-gradient(left, #318f94 0%, #5ec58c 100%);
    background: -webkit-linear-gradient(left, #318f94 0%, #5ec58c 100%);
    background: linear-gradient(to right, #318f94 0%, #5ec58c 100%);}
footer {
    bottom: 0;
    color: #54667a;
    left: 0px;
    text-align: center;
    padding: 7px 5px;
    position: absolute;
    right: 0;
    border-top: 1px solid rgba(120, 130, 140, 0.13);
    background: #ffffff;
}
.topbar {
    position: relative;
    z-index: 50;
}
article, aside, dialog, figcaption, figure, footer, header, hgroup, main, nav, section {
    display: block;
}

* {
    outline: none;
}
*, ::after, ::before {
    box-sizing: border-box;
}
user agent stylesheet
footer {
    display: block;
}
body {
    background: #fff;
    font-family: "Rubik", sans-serif;
    margin: 0;
    overflow-x: hidden;
    color: #54667a;
    font-weight: 300;
}
body {
    margin: 0;
    font-family: -apple-system,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif,"Apple Color Emoji","Segoe UI Emoji","Segoe UI Symbol";
    font-size: 1rem;
    font-weight: 400;
    line-height: 1.5;
    color: #212529;
    text-align: left;
    background-color: #fff;
}
.float-left {
    float: left!important;
}
html body .m-l-180 {
    margin-left: 180px;
}
.float-right {
    float: right!important;
}
html body .font-11 {
    font-size: 11px;
}
footer.footer {
    padding: 0.4rem 0.7rem;
    min-height: 2.35rem;
    -webkit-transition: .3s ease all;
    transition: .3s ease all;
}
	</style>
</head>
<body>
<!-- footer goes here -->

  			<footer class="footer topbar">
                  <small class="font-10 float-left text-white"> &copy; <span id="currentYear"></span> | Designed & Developed by Re Sustainability Limited. All Rights Reserved.</small>
				  <small class="font-10 float-left m-l-180 text-white hidden-sm-down"><a href="https://resustainability.com/privacy-policy/" class="link text-white" target="_blank">Privacy Policy </a> &nbsp;&nbsp;|&nbsp;&nbsp; <a href="https://resustainability.com/disclaimer-statements/" class="link text-white" target="_blank">Disclaimer Statement </a> </small>
				  <!-- <small class="font-11 float-right text-white hidden-sm-down">Follow us at : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					  <a href="https://facebook.com/ramkyenviroengineers/" class="link text-white" target="_blank"><i class="fa fa-facebook-f m-r-20"></i></a>
					  <a href="https://in.linkedin.com/company/ramky-enviro-engineers-ltd" class="link text-white" target="_blank"><i class="fa fa-linkedin m-r-20"></i></a>
					  <a href="https://twitter.com/ramkyenviro?lang=en" class="link text-white" target="_blank"><i class="fa fa-twitter m-r-20"></i></a>
				  </small> -->
                  <small class="font-10 float-right m-r-40 text-white hidden-sm-down"><a href="https://resustainability.com/contact/" class="link text-white" target="_blank">Contact Us </a>&nbsp;&nbsp;|&nbsp;&nbsp; Visit Us : <a href="https://resustainability.com" class="link text-white" target="_blank">resustainability.com</a></small>
            </footer>
             <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
     <script>
   
     document.getElementById("currentYear").innerHTML = new Date().getFullYear();
     </script>
</body>
</html>
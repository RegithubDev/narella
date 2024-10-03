<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding = "UTF-8"%>
<%@page import="com.resustainability.reisp.constants.CommonConstants"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">

<html class="loading" lang="en" data-textdirection="ltr">
  <!-- BEGIN: Head-->
  
<!-- Mirrored from pixinvent.com/demo/vuexy-html-bootstrap-admin-template/html/ltr/horizontal-menu-template/auth-login-basic.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 07 Aug 2022 05:37:17 GMT -->
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
	<meta http-equiv="Pragma" content="no-cache" />
	<meta http-equiv="Expires" content="0" />
    <meta name="google-signin-client_id" content="46521935412-0pl18k3a2mq7fs8nrl1853qcie9h5fjb.apps.googleusercontent.com">
    <title>Login Page - Project Name</title>
     <link rel="icon" type="image/png" sizes="96x96" href="<c:url value="/resources/images/AAYUSH-favicon.png"/>" >

    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,300;0,400;0,500;0,600;1,400;1,500;1,600" rel="stylesheet">

    <!-- BEGIN: Vendor CSS-->
    <link rel="stylesheet"  href="<c:url value="/resources/vendors/css/vendors.min.css"/>">
    
    <!-- END: Vendor CSS-->

    <!-- BEGIN: Theme CSS-->
    <link rel="stylesheet"  href="<c:url value="/resources/css/bootstrap.min.css" />">
    <link rel="stylesheet"  href="<c:url value="/resources/css/bootstrap-extended.min.css" />">
    <link rel="stylesheet"  href="<c:url value="/resources/css/colors.min.css" />">
    <link rel="stylesheet"  href="<c:url value="/resources/css/components.min.css" />">
    <link rel="stylesheet"  href="<c:url value="/resources/css/themes/dark-layout.min.css" />">
    <link rel="stylesheet"  href="<c:url value="/resources/css/themes/bordered-layout.min.css" />">
    <link rel="stylesheet"  href="<c:url value="/resources/css/themes/semi-dark-layout.min.css" />">
    <!-- BEGIN: Page CSS-->
    <link rel="stylesheet"  href="<c:url value="/resources/css/core/menu/menu-types/horizontal-menu.min.css" />">
    <link rel="stylesheet"  href="<c:url value="/resources/css/plugins/forms/form-validation.css" />">
    <link rel="stylesheet"  href="<c:url value="/resources/css/pages/authentication.css" />">
    <!-- END: Page CSS-->

    <!-- BEGIN: Custom CSS-->
    <link rel="stylesheet"  href="<c:url value="/resources/css/style.css"/>">
    <!-- END: Custom CSS-->
<style>
form .error:not(input) {
    color: #ea5455 !important;
    font-size: .9rem !important;
}
.card-img {
    max-width: 29%;
    margin-left: -1%;
    margin-top: -6%;
}
input:-webkit-autofill, input:-webkit-autofill:hover, input:-webkit-autofill:focus, input:-webkit-autofill:active {
    animation: input_background_autofill 0s forwards;
    -webkit-text-fill-color: #260202 !important;
}
</style>
  </head>
  <!-- END: Head-->
<%-- <jsp:include page="../views/layout/header.jsp"></jsp:include>
 --%>  <!-- BEGIN: Body-->
  <body class="horizontal-layout horizontal-menu blank-page navbar-floating footer-static  " data-open="hover" data-menu="horizontal-menu" data-col="blank-page">
    <!-- BEGIN: Content-->
    <div class="app-content content ">
      <div class="content-overlay"></div>
      <div class="header-navbar-shadow"></div>
      <div class="content-wrapper">
        <div class="content-header row">
        </div>
        <div class="content-body"><div class="auth-wrapper auth-basic px-2">
  <div class="auth-inner my-2">
    <!-- Login basic -->
    <div class="row clearfix">
							    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							        <c:if test="${not empty success }">
							            <div class="center-align m-1 close-message"><span style="color: black;" >${success}</span></div>
							        </c:if>
							        <c:if test="${not empty invalidEmail }">
							            <div class="center-align m-1 close-message"><span style="color: red;" >${invalidEmail}</span></div>
							        </c:if>
							    </div>
							</div>
    <div class="card mb-0">
      <div class="card-body">
        <a href="https://ramkyenviroengineers.com/" class="brand-logo">
         <img src="<c:url value="/resources/images/Aayush-Safety.png"/>" width="100" height="100" alt="logo" class="card-img">
         <!--  <h2 class="brand-text text-primary ms-1">RE</h2> -->
        </a>
		 <div class=" justify-content-center"><h4 class="card-title mb-1">Welcome to Idea Submission Portal! 👋</h4> </div>
        <div class="auth-footer-btn d-flex justify-content-center" id="signin-container">
          <div class="g-signin2"  onclick="ClickLogin();" data-onsuccess="onSignIn"><a href="#"  class="btn btn-google">
            <i data-feather="mail"></i>
          </a></div>
         
        </div>
      </div>
    </div>
    <!-- /Login basic -->
		  </div>
		</div>
        </div>
      </div>
    </div>
    <!-- END: Content-->

    <!-- BEGIN: Vendor JS-->
    <script src="<c:url value="/resources/vendors/js/vendors.min.js" />"></script>
    <!-- BEGIN Vendor JS-->

    <!-- BEGIN: Page Vendor JS-->
    <script src="<c:url value="/resources/vendors/js/ui/jquery.sticky.js" />"></script>
    <script src="<c:url value="/resources/vendors/js/forms/validation/jquery.validate.min.js" />"></script>
    <!-- END: Page Vendor JS-->
    <script src="https://apis.google.com/js/platform.js?onload=onLoad" async defer></script>
    <!-- BEGIN: Theme JS-->
    <script src="<c:url value="/resources/js/core/app-menu.min.js" />"></script>
    <script src="<c:url value="/resources/js/core/app.min.js" />"></script>
    <!-- END: Theme JS-->

    <!-- BEGIN: Page JS-->
    <script src="<c:url value="/resources/js/scripts/pages/auth-login.js" />"></script>
    <!-- END: Page JS-->
<form action="<%=request.getContextPath() %>/login" name="loginForm" id="loginForm" method="post">
		<input type="hidden" name="email" id="email"/>
	</form>
  <script>
  $(document).ready(function(){
	  $("#connectedke1hn4ffwo6").html('sign in');
		
	});
  var clicked = false;
  function ClickLogin(){
	  clicked=true;
  }
  function onLoad() {
      gapi.load('auth2', function() {
        gapi.auth2.init();
      });
    }
	function onSignIn(googleUser) {
		  if (clicked) {
		  var profile = googleUser.getBasicProfile();
		  $("#signout-container").show();
		  $("#signin-container").hide();
		  $("#loggedUserImage").attr("src", profile.getImageUrl());
		  $("#loggedUsername").html(profile.getName());
		  $("#loggedUserEmail").html(profile.getEmail());
		  console.log('ID: ' + profile.getId()); // Do not send to your backend! Use an ID token instead.
		  console.log('Name: ' + profile.getName());
		  console.log('Image URL: ' + profile.getImageUrl());
		  console.log('Email: ' + profile.getEmail()); // This is null if the 'email' scope is not present.
		  if('${success}' == null || '${success}' == ''){
    		  if('${invalidEmail}' == null || '${invalidEmail}' == ''){
    			  $("#email").val(profile.getEmail());
	    		  $("#loginForm").submit();
    		  }else{
    			 alert(profile.getEmail()+" do not have access to login. Please try with registered mail account (or) contact to admin.");
    			 signOut();
		      }
	      }else if('${success}' == 'Successfully logged out'){
	    	  if('${invalidEmail}' == null || '${invalidEmail}' == ''){
    			  $("#email").val(profile.getEmail());
	    		  $("#loginForm").submit();
    		  }
	      }else{
		      signOut();
	      }
		  
		  }
		}
		function signOut() {
			 gapi.auth2.getAuthInstance().disconnect();
			 window.location.href = '<%=request.getContextPath()%>/logout';
		}
  </script>
  </body>
  <!-- END: Body-->

<!-- Mirrored from pixinvent.com/demo/vuexy-html-bootstrap-admin-template/html/ltr/horizontal-menu-template/auth-login-basic.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 07 Aug 2022 05:37:17 GMT -->
</html>
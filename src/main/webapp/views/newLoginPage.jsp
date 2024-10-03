<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>

<html class="loading" lang="en" data-textdirection="ltr">
  <!-- BEGIN: Head-->
  
<!-- Mirrored from pixinvent.com/demo/vuexy-html-bootstrap-admin-template/html/ltr/horizontal-menu-template/auth-login-cover.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 07 Aug 2022 05:36:01 GMT -->
<head>
	 <meta charset="UTF-8">
   <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
   
    <meta name="google-signin-client_id" content="46521935412-0pl18k3a2mq7fs8nrl1853qcie9h5fjb.apps.googleusercontent.com">
    <title>Login - RE Sustainability</title>
    <link rel="apple-touch-icon" href="<c:url value="/resources/images/ico/apple-icon-120.html"/>">
      <link rel="icon" type="image/png" sizes="96x96" href="/reisp/resources/images/AAYUSH-favicon.png" >
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,300;0,400;0,500;0,600;1,400;1,500;1,600" rel="stylesheet">

    <!-- BEGIN: Vendor CSS-->
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendors/css/vendors.min.css"/>">
    <!-- END: Vendor CSS-->

    <!-- BEGIN: Theme CSS-->
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap-extended.min.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/colors.min.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/components.min.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/themes/dark-layout.min.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/themes/bordered-layout.min.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/themes/semi-dark-layout.min.css"/>">
	<script src="<c:url value="/resources/js/jQuery-v.3.5.min.js"  />"></script>
    <!-- BEGIN: Page CSS-->
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/core/menu/menu-types/horizontal-menu.min.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/plugins/forms/form-validation.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/pages/authentication.css"/>">
    <!-- END: Page CSS-->

    <!-- BEGIN: Custom CSS-->
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css"/>">
    <!-- END: Custom CSS-->
<style>
.mb-1 {
    margin-bottom: 2rem!important;
}
	.h2, h2 {
	    font-size: 1.914rem !important; 
	}
.p-5 {
    padding: 0rem!important;
}
.ms-2 {
    margin-left: 4.9rem!important;
}
.imgDiv div {
    position: absolute;
    top: 0; right: 455px; bottom: 0; left: 0;
}
.img-fluid, .img-thumbnail {
    width: 100% !important;
   height: 100% !important;
}
.horizontal-menu footer {
    position: fixed;
}
.text-shadow{
	color: black !important;}
.carousel-indicators {
	bottom: 28px !important;
}
.auth-wrapper.auth-cover .brand-logo {
    left: 70% !important;
    margin-top: 8rem !important;
}

.fr-text{
    font-size: .75rem
}
</style>
  </head>
  <!-- END: Head-->

  <!-- BEGIN: Body-->
  <body class="horizontal-layout horizontal-menu blank-page navbar-floating footer-static  " data-open="hover" data-menu="horizontal-menu" data-col="blank-page">
    <!-- BEGIN: Content-->
    <div class="app-content content ">
      <div class="content-overlay"></div>
      <div class="header-navbar-shadow"></div>
      <div class="content-wrapper">
        <div class="content-header row">
        </div>
        <div class="content-body">
          <div class="auth-wrapper auth-cover">
            <div class="auth-inner row m-0">
            
              <!-- Brand logo--> 
		               
            
              <!-- /Brand logo-->
              <!-- Left Text-->
              
              <div class=" d-none d-lg-flex col-lg-8 align-items-center p-5 ">
                 <div class="w-100 d-lg-flex align-items-center justify-content-center px-5 imgDiv"  id="imgDiv">
				          <div id="carousel-example-caption" class="carousel slide" data-bs-ride="carousel">
				            <ol class="carousel-indicators">
				              <li data-bs-target="#carousel-example-caption" data-bs-slide-to="0" class="active"></li>
				              <li data-bs-target="#carousel-example-caption" data-bs-slide-to="1"></li>
				              <li data-bs-target="#carousel-example-caption" data-bs-slide-to="2"></li>
				            </ol>
				            <div class="carousel-inner">
				              <div class="carousel-item active">
				                <img class="img-fluid" src="<c:url value="/resources/images/SafetyP1.png"/>" alt="First slide" />
				                <div class="carousel-caption d-none d-md-block">
				                  <!-- <h3 class="text-white">First Slide Label</h3> -->
				                 <!--  <p class="text-white">
				                    Donut jujubes I love topping I love sweet. Jujubes I love brownie gummi bears I love donut sweet
				                    chocolate. Tart chocolate marshmallow.Tart carrot cake muffin.
				                  </p> -->
				                </div>
				              </div>
				    <%--           <div class="carousel-item">
				                <img class="img-fluid" src="<c:url value="/resources/images/Safety2.png"/>" alt="Second slide" />
				                <div class="carousel-caption d-none d-md-block">
				                 <!--  <p class="text-white">
				                    Tart macaroon marzipan I love soufflé apple pie wafer. Chocolate bar jelly caramels jujubes
				                    chocolate cake gummies. Cupcake cake I love cake danish carrot cake.
				                  </p> -->
				                </div>
				              </div>
				              <div class="carousel-item">
				                <img class="img-fluid" src="<c:url value="/resources/images/Safety3.png"/>" alt="Third slide" />
				                <div class="carousel-caption d-none d-md-block">
				                  <!-- <p class="text-white">
				                    Pudding sweet pie gummies. Chocolate bar sweet tiramisu cheesecake chocolate cotton candy pastry
				                    muffin. Marshmallow cake powder icing.
				                  </p> -->
				                </div>
				              </div> --%>
				                <div class="carousel-item">
				                <img class="img-fluid" src="<c:url value="/resources/images/SafetyP2.png"/>" alt="Third slide" />
				                <div class="carousel-caption d-none d-md-block">
				                  <!-- <p class="text-white">
				                    Pudding sweet pie gummies. Chocolate bar sweet tiramisu cheesecake chocolate cotton candy pastry
				                    muffin. Marshmallow cake powder icing.
				                  </p> -->
				                </div>
				              </div>
				                <div class="carousel-item">
				                <img class="img-fluid" src="<c:url value="/resources/images/SafetyP3.png"/>" alt="Third slide" />
				                <div class="carousel-caption d-none d-md-block">
				                  <!-- <p class="text-white">
				                    Pudding sweet pie gummies. Chocolate bar sweet tiramisu cheesecake chocolate cotton candy pastry
				                    muffin. Marshmallow cake powder icing.
				                  </p> -->
				                </div>
				              </div>
				            </div>
				            <a
				              class="carousel-control-prev"
				              data-bs-target="#carousel-example-caption"
				              role="button"
				              data-bs-slide="prev"
				            >
				              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
				              <span class="visually-hidden">Previous</span>
				            </a>
				            <a
				              class="carousel-control-next"
				              data-bs-target="#carousel-example-caption"
				              role="button"
				              data-bs-slide="next"
				            >
				              <span class="carousel-control-next-icon" aria-hidden="true"></span>
				              <span class="visually-hidden">Next</span>
				            </a>
				          </div>
				    </div>
              </div>
              <!-- /Left Text-->
              <!-- Login-->
              
              <div class="d-flex col-lg-4 align-items-center auth-bg px-2 p-lg-2">
               <!-- Login basic -->
				 	
                <div class="col-12 col-sm-8 col-md-6 mt-1 col-lg-12 px-xl-2 mx-auto">
				<img src="<c:url value="/resources/images/logo/protect-main.png"/>" href="https://ramkyenviroengineers.com/"  alt="logo" class="mb-2 ms-2">
                <div style="color: red;" >${invalidEmail} ${multipleLoginFound}</div>
                <h3><strong>Welcome to</strong></h3>
              
                  <h4 class="mb-2">Re Sustainability Safety Portal</h4>
                   <hr class="m-b-10 fr-text m-t-0">
                  <div class="p-10 text-center"> 
                     <img class="box-title m-b-15" src="<c:url value="/resources/images/login_icon.png"/>"  height="107" width="102">      
    				<br></div>
    				
	               <div class="auth-footer-btn d-flex justify-content-center mt-1" id="signin-container">
			          <div class="g-signin2"  onclick="ClickLogin();" data-onsuccess="onSignIn"><a href="#"  class="btn btn-google">
			            <i data-feather="mail"></i>
			          </a></div>
			        </div>
			        <p class="mt-2 text-secondary fw-bolder">Please ensure username should be your Email ID @resustainability.com</p>
			        <p class=" fr-text text-secondary">Incase of any login issue, connect on <a href="mailto:it.helpdesk@resustainability.com" class="link"><u>it.helpdesk@resustainability.com</u></a></p>
                 	<hr class="m-b-10 fr-text m-t-0">
                 	<p class=" fr-text">Signing up in this Safety Portal confirms your acceptance to ReSL IT Application Usage Policy </p>
                 
             <div class="m-t-30 "><p class="font-10 fr-text">Safety Portal © 2022. ReSL, All Rights Reserved.</p></div>
                </div>
                	
              </div>
              
              <!-- /Login-->
            </div>
          </div>
        </div>
      </div>
    </div>
     <!-- footer included -->
   <%--  <jsp:include page="../views/layout/footer.jsp"></jsp:include>  --%> 
    <!-- END: Content-->
	<form action="<%=request.getContextPath() %>/login" name="loginForm" id="loginForm" method="post">
		<input type="hidden" name="email_id" id="email_id"/>
		<input id="profileImg" name="profileImg" type="hidden" />
		<input id="gToken" name="user_session_id" type="hidden" />
		<input id="device_type" name="device_type" type="hidden" />
	</form>
	
    <!-- BEGIN: Vendor JS-->
    <script src="<c:url value="/resources/vendors/js/vendors.min.js"/>"></script>
    <!-- BEGIN Vendor JS-->
	<script type="text/javascript" src="css3-mediaqueries.js"></script>
    <!-- BEGIN: Page Vendor JS-->
    <script src="<c:url value="/resources/vendors/js/ui/jquery.sticky.js"/>"></script>
    <script src="<c:url value="/resources/vendors/js/forms/validation/jquery.validate.min.js"/>"></script>
    <!-- END: Page Vendor JS-->
	<script src="https://apis.google.com/js/platform.js?onload=onLoad" async defer></script>
    <!-- BEGIN: Theme JS-->
    <script src="<c:url value="/resources/js/core/app-menu.min.js"/>"></script>
    <script src="<c:url value="/resources/js/core/app.min.js"/>"></script>
    <!-- END: Theme JS-->
 	<script src="<c:url value="/resources/js/core/app-menu.min.js"/>"></script>
    <script src="<c:url value="/resources/js/core/app.min.js"/>"></script>
    <script src="<c:url value="/resources/js/scripts/customizer.min.js"/>"></script>
    <!-- BEGIN: Page JS-->
    <script src="<c:url value="/resources/js/scripts/pages/auth-login.js"/>"></script>
    <!-- END: Page JS-->

    <script>
    $.getJSON("https://api.ipify.org?format=json",  function(data) { 
		$(".page-loader-2").hide();
		//$("#publicIPA").html(data.ip); 
		console.log(data.ip); 
		
    }); 
   $(window).on('load',  function(){
     if (feather) {
       feather.replace({ width: 14, height: 14 });
     }
     var ua = navigator.userAgent;
	    var checker = {
	      iphone: ua.match(/(iPhone|iPod|iPad)/),
	      blackberry: ua.match(/BlackBerry/),
	      android: ua.match(/Android/),
	       Mozilla: ua.match(/Mozilla/),
	       Chrome: ua.match(/Chrome/)
	    };
	    if (checker.android){
	        console.log("android")
	        $("#device_type").val("mobile");
	    }
	    else if (checker.iphone){
	    	 $("#device_type").val("mobile");
	    }
	    else if (checker.blackberry){
	    	 $("#device_type").val("mobile");
	    }
	    else if (checker.Mozilla){
	    	 $("#device_type").val("desktop");
	    	 
	    }
	    else if (checker.Chrome){
	    	 $("#device_type").val("desktop");
	    }
	    else {
	    	 $("#device_type").val("desktop");
	    } 
   })
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
			  console.log('Email: ' + profile.getEmail()); // This is null if the 'email_id' scope is not present.
			  window.localStorage.setItem("selectedOption", 'undefined');
			  if('${success}' == null || '${success}' == ''){
	    		  if('${invalidEmail}' == null || '${invalidEmail}' == ''){
	    			  $("#email_id").val(profile.getEmail());
	    			  $("#profileImg").val(profile.getImageUrl());
	    			  $("#gToken").val(profile.getId());
		    		  $("#loginForm").submit();
	    		  }else{
	    			 alert(profile.getEmail()+" do not have access to login. Please try with registered mail account (or) contact to admin.");
	    			 signOut();
			      }
		      }else if('${success}' == 'Successfully logged out'){
		    	  if('${invalidEmail}' == null || '${invalidEmail}' == ''){
	    			  $("#email_id").val(profile.getEmail());
	    			  $("#profileImg").val(profile.getImageUrl());
	    			  $("#gToken").val(profile.getId());
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

<!-- Mirrored from pixinvent.com/demo/vuexy-html-bootstrap-admin-template/html/ltr/horizontal-menu-template/auth-login-cover.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 07 Aug 2022 05:36:01 GMT -->
</html>
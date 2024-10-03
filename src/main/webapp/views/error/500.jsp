<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
    <!--[if IE 9 ]><html class="ie9"><![endif]-->
   <html>
    <head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error page</title>
   <link rel="icon" type="image/png" sizes="96x96" href="<c:url value="/resources/images/AAYUSH-favicon.png"/>" >

    <link rel="stylesheet" href="<c:url value="/resources/css/materialize-v.1.0.min.css" />" >
    <style>
        body {
            background-color: antiquewhite;
        }
/* card positon and styling */
        .row {
            display: flex;
            height: 85vh;
        }

        .row>.col {
            margin: auto;
        }

        .card-action a {
            color: blue !important;
            margin-right: 0 !important;
        }

        .card-content * {
            text-shadow: 0px 10px 5px #bbb;
        }

/* color change animation code */
        @keyframes color-change {

            50% {
                color: red;
                transform: scale(1.2);
            }

            100% {
                color: black;
            }
        }

        h1 {
            color: #DD1F2C;
            font-size: 5rem;
            margin-top: 1.68rem;
            animation-name: color-change;
            animation-duration: 1s;
            /* animation-direction: alternate; */
            animation-iteration-count: infinite;
        }
    </style>
</head>

<body>

    <!-- header  starts-->
    <nav>
        <div class="nav-wrapper blue darken-3">
            <div class="">
                <a href="<%=request.getContextPath() %>/home" class="brand-logo fs"><img src="<c:url value="/resources/images/Aayush-Safety.png"/>" alt="Logo"> REISP</a>
                <a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="fa fa-bars"></i></a>

            </div>
        </div>
    </nav>

    <!-- header ends  -->
    
<!-- error card in single row  -->
    <div class="row">
        <div class="col s12 m3">
            <div class="card center-align">
                <div class="card-content">
                     <h1>500</h1>
                    <h6>Server Error. Try Later</h6>
                </div>
                <div class="card-action">
                    <a href="<%=request.getContextPath()%>/">Go to Home</a>
                </div>
            </div>
        </div>
    </div>



    <!-- footer  -->
    <div class="footer-container">
        <div class="footer-copyright blue lighten-5 bottom">
            <div class="container">
                <!-- <span>Copyright 2020 @ mrvc.indianrailways.gov.in | Designed & Developed by</span> --> <img
                    src="<c:url value="/resources/images/Aayush-Safety.png"/>" class="footer-img" alt="footer image">
            </div>
        </div>
    </div>

    <!-- <script src="js/jQuery.min.js"></script>
    <script src="js/materialize.min.js"></script> -->

</body>

</html>

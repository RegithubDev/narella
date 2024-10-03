<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding = "UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<!--
Template Name: Safety - Vuejs, HTML & Laravel Admin Dashboard Template
Author: PixInvent
Website: http://www.pixinvent.com/
Contact: hello@pixinvent.com
Follow: www.twitter.com/pixinvents
Like: www.facebook.com/pixinvents
Purchase: https://1.envato.market/vuexy_admin
Renew Support: https://1.envato.market/vuexy_admin
License: You must have a valid license purchased only from themeforest(the above link) in order to legally use the theme for your project.

-->
<html class="loading" lang="en" data-textdirection="ltr">
  <!-- BEGIN: Head--> 
  
<!-- Mirrored from pixinvent.com/demo/vuexy-html-bootstrap-admin-template/html/ltr/horizontal-menu-template/table-datatable-basic.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 07 Aug 2022 05:37:16 GMT -->
<head>
   
<style>
.mdl-grid{
	display: flex !important;
    padding: 4px;
    justify-content: space-between;
    height: 4.5rem;
} 
.dt-table{
display: block !important;
height: 100%;
}
.modal {
    width: 100% !important;
}
.required{
	color:red;
}
.my-error-class {
 	 color:red;
}
.my-valid-class {
 	 color:green;
}
.select2-container--default .select2-selection--single .select2-selection__arrow b {
     left: -25% !important;
    margin-top: 1p% !important;
}
body {
    font-family: var(--bs-body-font-family) !important;
}
.dark-layout h1, .dark-layout h2, .dark-layout h3, .dark-layout h4, .dark-layout h5, .dark-layout h6, .dark-layout span  {
    color: #D0D2D6;
}
.select2-container--classic .select2-selection--single .select2-selection__arrow b, .select2-container--default .select2-selection--single .select2-selection__arrow b {
    background-image: url(data:image/svg+xml,%3Csvg xmlns=\'http://www.w3.org/2000/svg\' viewBox=\'0 0 24 24\' fill=\'none\' stroke=\'%23d8d6de\' stroke-width=\'2\' stroke-linecap=\'round\' stroke-linejoin=\'round\' class=\'feather feather-chevron-down\'%3E%3Cpolyline points=\'6 9 12 15 18 9\'%3E%3C/polyline%3E%3C/svg%3E);
    background-size: 18px 14px,18px 14px !important;
    background-repeat: no-repeat !important;
    height: 1rem !important;
    padding-right: 1.5rem !important;
    margin-left: 0 !important;
    margin-top: 0 !important;
    left: -8px !important;
    border-style: none !important;
}
.btn-upload {
    padding: 10px 20px;
    margin-left: 10px;
}
.upload-input-group {
    margin-bottom: 10px;
}

.input-group>.custom-select:not(:last-child), .input-group>.form-control:not(:last-child) {
  height: 45px;
}
#container {
  width: 100%;
  display: flex;
}
.box {
  flex: 1;
}
</style>
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=0,minimal-ui">
    <meta name="description" content="Safety admin is super flexible, powerful, clean &amp; modern responsive bootstrap 4 IRM with unlimited possibilities.">
    <meta name="keywords" content="admin template,IRM, Safety admin template, dashboard template, flat admin template, responsive admin template, web app">
    <meta name="author" content="PIXINVENT">
  <title>IRM - Submit</title>
       <link rel="icon" type="image/png" sizes="96x96" href="/reisp/resources/images/AAYUSH-favicon.png" >
	<script src="/reisp/resources/js/jQuery-v.3.5.min.js"  ></script>
    <!-- BEGIN: Vendor CSS-->
      <link rel="apple-touch-icon" href="/reisp/resources/images/ico/apple-icon-120.html">
	<link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,300;0,400;0,500;0,600;1,400;1,500;1,600" rel="stylesheet">
    <!-- BEGIN: Vendor CSS-->
    <link rel="stylesheet" type="text/css" href="/reisp/resources/vendors/css/vendors.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/vendors/css/tables/datatable/dataTables.bootstrap5.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/vendors/css/tables/datatable/responsive.bootstrap5.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/vendors/css/tables/datatable/buttons.bootstrap5.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/vendors/css/tables/datatable/rowGroup.bootstrap5.min.css">
     <link rel="stylesheet" type="text/css" href="/reisp/resources/css/bootstrap-extended.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/vendors/css/pickers/flatpickr/flatpickr.min.css">
    <!-- END: Vendor CSS-->
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
	  <link rel="stylesheet" href="<c:url value="/resources/css/font-awesome-v.4.7.css" />">
    <!-- BEGIN: Theme CSS-->
    <link rel="stylesheet" type="text/css" href="/reisp/resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/css/bootstrap-extended.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/css/colors.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/css/components.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/css/themes/dark-layout.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/css/themes/bordered-layout.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/css/themes/semi-dark-layout.min.css">
   <link rel="stylesheet" type="text/css" href="/reisp/resources/vendors/css/forms/select/select2.min.css">
    <!-- BEGIN: Page CSS-->
    <link rel="stylesheet" type="text/css" href="/reisp/resources/css/core/menu/menu-types/horizontal-menu.min.css">
    <!-- END: Page CSS-->
      <link rel="stylesheet" type="text/css" href="/reisp/resources/vendors/css/file-uploaders/dropzone.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/css/plugins/forms/form-file-uploader.min.css">
    <!-- BEGIN: Custom CSS-->
    <link rel="stylesheet" type="text/css" href="/reisp/resources/css/style.css">
    <!-- END: Custom CSS-->

  </head>
  <!-- END: Head-->

  <!-- BEGIN: Body-->
  <body class="horizontal-layout horizontal-menu  navbar-floating footer-static  " data-open="hover" data-menu="horizontal-menu" data-col="">

    <!-- BEGIN: Header-->
	<jsp:include page="../views/layout/header.jsp"></jsp:include> 


    <!-- END: Header-->
    <!-- BEGIN: Main Menu-->
    <div class="horizontal-menu-wrapper">
      <div class="header-navbar navbar-expand-sm navbar navbar-horizontal floating-nav navbar-light navbar-shadow menu-border container-xxl" role="navigation" data-menu="menu-wrapper" data-menu-type="floating-nav">
        <div class="navbar-header">
          <ul class="nav navbar-nav flex-row">
            <li class="nav-item me-auto"><a class="navbar-brand" href="index-2.html"><span class="brand-logo">
                  <svg viewbox="0 0 139 95" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" height="24">
                    <defs>
                      <lineargradient id="linearGradient-1" x1="100%" y1="10.5120544%" x2="50%" y2="89.4879456%">
                        <stop stop-color="#000000" offset="0%"></stop>
                        <stop stop-color="#FFFFFF" offset="100%"></stop>
                      </lineargradient>
                      <lineargradient id="linearGradient-2" x1="64.0437835%" y1="46.3276743%" x2="37.373316%" y2="100%">
                        <stop stop-color="#EEEEEE" stop-opacity="0" offset="0%"></stop>
                        <stop stop-color="#FFFFFF" offset="100%"></stop>
                      </lineargradient>
                    </defs>
                    <g id="Page-1" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
                      <g id="Artboard" transform="translate(-400.000000, -178.000000)">
                                             			         <img src="<%=request.getContextPath() %>/resources/images/Aayush-Safety.png" width="50" height="40" class="card-img">

                      </g>
                    </g>
                  </svg></span>
                <h2 class="brand-text mb-0">Safety</h2></a></li>
            <li class="nav-item nav-toggle"><a class="nav-link modern-nav-toggle pe-0" data-bs-toggle="collapse"><i class="d-block d-xl-none text-primary toggle-icon font-medium-4" data-feather="x"></i></a></li>
          </ul>
        </div>
        <div class="shadow-bottom"></div>
        <!-- Horizontal menu content-->
 			<jsp:include page="../views/layout/menu.jsp"></jsp:include> 
      </div>
    </div>
    <!-- END: Main Menu-->

    <!-- BEGIN: Content-->
    <div class="app-content content ">
      <div class="content-overlay"></div>
      <div class="header-navbar-shadow"></div>
      <div class="content-wrapper container-xxl p-0">
        <div class="content-header row">
              <div class="content-header-left col-md-9 col-12 mb-2">
            <div class="row breadcrumbs-top">
              <div class="col-12">
                <h2 class="content-header-title float-start mb-0">IRM </h2>
                <div class="breadcrumb-wrapper">
                  <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="<%=request.getContextPath() %>/home">Home</a>
                    </li>
 					<li class="breadcrumb-item"><a href="<%=request.getContextPath() %>/irm">IRM</a>
                    </li>
                    <li class="breadcrumb-item active">IRM - Submit
                    </li>
                  </ol>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="content-body"><!-- Dashboard Analytics Start -->
<section id="dashboard-analytics">
<div class="row match-height" >
<div class="col-lg-4 col-sm-6 col-12"  style="box-sizing:border-box; display:table;">
</div>
<!-- <div class="col-lg-4 col-sm-6 col-12"  style="box-sizing:border-box; display:table;">
  <div class="col-lg-3 col-sm-3 col-6"  style="padding: 1rem;display:table-cell;">
       <div class="col-md-12 mb-1">
              <select class="select2 form-select" id="select2-irm_type-container" name="irm_type"  onchange="showFrom(this.value);">
                <option value="">Select IRM Type</option>
                <option value="UA">Unsafe Act</option>
                <option value="UC">Unsafe Condition</option>
                <option value="NM">Near Miss</option>
                <option value="HA">Hazard</option>
                <option value="IB">Ideabox</option>
              </select>
 	   </div>
          <h2 class="fw-bolder mt-1"></h2>
    </div>

</div> -->
<div class="col-lg-4 col-sm-6 col-12"  style="box-sizing:border-box; display:table;">
</div>
<!-- <div class="col-lg-2 col-sm-2 col-12"  style="box-sizing:border-box; display:table;">
    <div class="col-lg-3 col-sm-3 col-6"  style="padding: .5rem;display:table-cell;">
     <button class="btn btn-primary col-md-12" style="margin-top: 10px; width: 45%;     background-color: gainsboro"  onclick="getIRMList();"><i class="fa fa-search" aria-hidden="true"></i></button>
         <button class="btn btn-primary col-md-12" style="margin-top: 10px; width: 45%;     background-color: gainsboro"  onclick="clearFilter();"><i class="fa fa-undo" aria-hidden="true"></i></button>
     </div>
</div>
  <div class="col-lg-4 col-sm-4 col-12"style="
    display: flex;
    align-items: center;
">
    <div class="col-lg-4 col-sm-6 col-6">
    <button type="button" class="btn " data-bs-toggle="modal" data-bs-target="#addIRM"style="margin-top: 17px; color: white !important; background-color: orange !important; width: 42%;"><i class="fa fa-add" aria-hidden="true"></i></button>
         <button class="btn col-md-12" style="margin-top: 17px; width: 42%;     background-color: #14e014 !important;color: white !important;"  onclick="exportIRM();"><i class="fa fa-download" aria-hidden="true"></i></button>
     </div>
  
  </div> -->
     
</div> 

<section id="multiple-column-form">
  <div class="row" id="showOnIncidentSelect" >
    <div class="col-12">
      <div class="card">
        <div class="card-header border-bottom badge bg-primary pt-1 pb-1">
          <h4 class="card-title text-white"><span id="incidentValue">IRM Form</span></h4><p id="demo"></p>
        
        </div>
      <!--   <div class="card-header">
        </div> -->
        <div class="card-body mt-1">
          <form class="form " action="<%=request.getContextPath() %>/irm-submit" id="irmForm" name="irmForm" method="post" class="form-horizontal" role="form" enctype="multipart/form-data">
          <input type="hidden" id="approver_code" name="approver_code" />
           <input type="hidden" id="approver_type" name="approver_type" />
            <input type="hidden" id="email_id" name="email_id" />
             <input type="hidden" id="approver_name" name="approver_name" />
             <input type="hidden" id="incident_name" name="incident_name" />
               <input name="person_location" id="person_location" type="hidden" />
            <div class="row">
              <div class="col-md-6 col-6">
               <div class="mb-1">
                   <label class="form-label" for="select2-basic">Project</label><span class="required"> *</span>
                    <p class="form-control" >${sessionScope.BASE_PROJECT_CODE } - ${sessionScope.BASE_PROJECT }</p>
                    <input type="hidden" id="project_code" name="project_code" value="${sessionScope.BASE_PROJECT_CODE }"/>
	           
	        <%--       <option value="">Select Project</option>
	             <c:forEach var="obj" items="${projectsList}">
					<option value="${obj.project_code }" >[${obj.project_code }] - ${obj.project_name }</option>
				</c:forEach>
	            </select> --%>
	             <span id="select2-project_code-containerError" class="error-msg" ></span>
                </div>
              </div>
              <div class="col-md-6 col-6">
                <div class="mb-1">
                   <label class="form-label" for="select2-basic">Department</label><span class="required"> *</span>
	            <select 
	              id="select2-department_code-container"
	              name="department_code"
	              class="select2 form-select select2Form"
	              aria-label="Default select example" onchange="roleMapping();"
	            >
	            <option value="">Select Department</option>
	            </select>
	             <span id="select2-department_code-containerError" class="error-msg" ></span>
                </div>
              </div>
              <div class="col-md-6 col-6">
                <div class="mb-1">
                   <label class="form-label" for="select2-basic">Location</label><span class="required"> *</span>
	            <select 
	              id="select2-location-container"
	              name="location"
	              class="select2 form-select select2Form"
	              aria-label="Default select example"
	            >
	            <option value="">Select Location</option>
	            </select>
	             <span id="select2-location-containerError" class="error-msg" ></span>
                </div>
              </div>
              <div class="col-md-6 col-6">
                 <div class="mb-1">
                   <label class="form-label" for="select2-basic">Incident Type</label><span class="required">* </span>
	            <select 
	              id="select2-incident_type-container"
	              name="incident_type"
	              class="select2 form-select select2Form"
	              aria-label="Default select example" onchange="roleMapping(); showFrom(this.value);" 
	            >
					<option value="">Select Incident Type</option>	   
					<option value="AC">Accident</option>	  
					<option value="NM">Near Miss</option>	
					<option value="UA">Unsafe Act</option>	
					<option value="UC">Unsafe Condition</option>	         
					
					   </select>
	             <span id="select2-incident_type-containerError" class="error-msg" ></span>
                </div>
              </div>
              <div class="col-md-6 col-6"> 
                 <div class="mb-1">
                   <label class="form-label" for="select2-basic">Risk Type</label><span class="required"> *</span>
	            <select 
	              id="select2-risk_type-container"
	              name="risk_type"
	              class="select2 form-selec select2Formt"
	              aria-label="Default select example"
	            >
	              <option value="">Select Risk Type</option>
	              <option value="High">High</option>
	              <option value="Medium">Medium</option>
	              <option value="Low">Low</option>
	            </select>
	             <span id="select2-risk_type-containerError" class="error-msg" ></span>
                </div>
              </div>
              	 <div class="col-md-6 col-6">
                 <div class="mb-1">
                    <label class="form-label" for="select2-multiple">Incident Category</label>
              <select class="select2 form-select" id="select2-multiple" name="incident_category"  data-placeholder="Select Incident Category" multiple >
	              <option value="Injury">Injury </option>
	              <option value="Fire">Fire  </option>
	              <option value="Property/Equip"> Property/Equip </option>
	              <option value="Damage">Damage  </option>
	              <option value="Chem. spill/overflow">Chem. spill/overflow </option>
<!-- 	              <option value="Other">Other  </option>
 -->	            
	            </select>
	             <span id="select2-ptw_code-containerError" class="error-msg" ></span>
                </div>
              </div>
   			 <div class="col-md-12 col-12">
                 <div class="mb-1">
                   <label class="form-label" for="select2-basic">Permit To Work (PTW)</label><span class="required"> </span>
	            <select 
	              id="select2-ptw_code-container"
	              name="ptw_code"
	              class="select2 form-select select2Form"
	              aria-label="Default select example"
	            >
					<option value="">Select PTW Code</option>	            </select>
	             <span id="select2-ptw_code-containerError" class="error-msg" ></span>
                </div>
              </div>
              <div class="col-md-8 col-12"> 
                <div class="mb-1">
                  <label class="form-label" for="email-id-column">Description</label><span class="required"> *</span>
                 <textarea data-length="1000" class="form-control char-textarea" id="textarea-counter" name="description" rows="3" placeholder="Description" style="height: 100px"></textarea>
                </div>
                <span id="select2-description-containerError" class="error-msg" ></span>
              </div>
               
              <div class="col-md-4 col-12" style="
    margin-top: 2rem;
">  <div class="mb-1">
                <div class="control-group" id="fields">
	                     
	                           <div class="controls">
	                               <div class="entry input-group upload-input-group">
	                                   <input class="form-control" id="files${index.count }" name="mediaList" type="file" placeholder="choose relevent file">
	                                   <button class="btn btn-upload btn-success btn-add" type="button">
	                                       <i class="fa fa-plus"></i>
	                                   </button>
	                               </div>
	                           </div>
	                       </div>  </div>
              </div>
			 
             <div class="alert " role="alert">
              <div class="alert-body fw-normal">
              <div class="pull-left">
                   <h6 ><span id="incidentValue">IRM Reviewer : </span><span id="approverForIncident" style="color: orange;">No Reviewer Assigned</span> </h6>
              </div>
              </div>
            </div>
            <div class="col-12 " style="text-align: center;">
               <div>
                <button type="button" class="btn btn-primary me-1" id="sBtn" onclick="submitIRM();">Submit</button>
               	<a href="<%=request.getContextPath()%>/irm" class="btn btn-outline-secondary" >Cancel</a>
                </div>
              </div>
              
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
  <div class="alert alert-info" role="alert">
              <h4 class="alert-heading">Important Note :</h4>
              <div class="alert-body">
               <p>&#x2022; Location Access is Mandatory without it, Form cannot be submitted.</p>
               <p>&#x2022; Please Select Appropriate Incident Type.</p>
               <p>&#x2022; Mandatory Fields are mentioned with Star(*)</p>
              </div>
            </div>
</section>
<!-- Basic Floating Label Form section end -->
							
 										
</section>

											
 																					
 																					
 																					
<!-- Dashboard Analytics end -->

        </div>
      </div>
    </div>
    <!-- END: Content-->


    <!-- BEGIN: Customizer-->
    <div class="customizer d-none d-md-block"><a class="customizer-toggle d-flex align-items-center justify-content-center" href="#"><i class="spinner" data-feather="settings"></i></a><div class="customizer-content">
  <!-- Customizer header -->
  <div class="customizer-header px-2 pt-1 pb-0 position-relative">
    <h4 class="mb-0">Theme Customizer</h4>
    <p class="m-0">Customize & Preview in Real Time</p>

    <a class="customizer-close" href="#"><i data-feather="x"></i></a>
  </div>

  <hr />

  <!-- Styling & Text Direction -->
  <div class="customizer-styling-direction px-2">
    <p class="fw-bold">Skin</p>
    <div class="d-flex">
      <div class="form-check me-1">
        <input
          type="radio"
          id="skinlight"
          name="skinradio"
          class="form-check-input layout-name"
          checked
          data-layout=""
        />
        <label class="form-check-label" for="skinlight">Light</label>
      </div>
      <div class="form-check me-1">
        <input
          type="radio"
          id="skinbordered"
          name="skinradio"
          class="form-check-input layout-name"
          data-layout="bordered-layout"
        />
        <label class="form-check-label" for="skinbordered">Bordered</label>
      </div>
      <div class="form-check me-1">
        <input
          type="radio"
          id="skindark"
          name="skinradio"
          class="form-check-input layout-name"
          data-layout="dark-layout"
        />
        <label class="form-check-label" for="skindark">Dark</label>
      </div>
      <div class="form-check">
        <input
          type="radio"
          id="skinsemidark"
          name="skinradio"
          class="form-check-input layout-name"
          data-layout="semi-dark-layout"
        />
        <label class="form-check-label" for="skinsemidark">Semi Dark</label>
      </div>
    </div>
  </div>

  <hr />

  <!-- Menu -->
  <div class="customizer-menu px-2">
    <div id="customizer-menu-collapsible" class="d-flex">
      <p class="fw-bold me-auto m-0">Menu Collapsed</p>
      <div class="form-check form-check-primary form-switch">
        <input type="checkbox" class="form-check-input" id="collapse-sidebar-switch" />
        <label class="form-check-label" for="collapse-sidebar-switch"></label>
      </div>
    </div>
  </div>
  <hr />

  <!-- Layout Width -->
  <div class="customizer-footer px-2">
    <p class="fw-bold">Layout Width</p>
    <div class="d-flex">
      <div class="form-check me-1">
        <input type="radio" id="layout-width-full" name="layoutWidth" class="form-check-input" checked />
        <label class="form-check-label" for="layout-width-full">Full Width</label>
      </div>
      <div class="form-check me-1">
        <input type="radio" id="layout-width-boxed" name="layoutWidth" class="form-check-input" />
        <label class="form-check-label" for="layout-width-boxed">Boxed</label>
      </div>
    </div>
  </div>
  <hr />

  <!-- Navbar -->
  <div class="customizer-navbar px-2">
    <div id="customizer-navbar-colors">
      <p class="fw-bold">Navbar Color</p>
      <ul class="list-inline unstyled-list">
        <li class="color-box bg-white border selected" data-navbar-default=""></li>
        <li class="color-box bg-primary" data-navbar-color="bg-primary"></li>
        <li class="color-box bg-secondary" data-navbar-color="bg-secondary"></li>
        <li class="color-box bg-success" data-navbar-color="bg-success"></li>
        <li class="color-box bg-danger" data-navbar-color="bg-danger"></li>
        <li class="color-box bg-info" data-navbar-color="bg-info"></li>
        <li class="color-box bg-warning" data-navbar-color="bg-warning"></li>
        <li class="color-box bg-dark" data-navbar-color="bg-dark"></li>
      </ul>
    </div>

    <p class="navbar-type-text fw-bold">Navbar Type</p>
    <div class="d-flex">
      <div class="form-check me-1">
        <input type="radio" id="nav-type-floating" name="navType" class="form-check-input" checked />
        <label class="form-check-label" for="nav-type-floating">Floating</label>
      </div>
      <div class="form-check me-1">
        <input type="radio" id="nav-type-sticky" name="navType" class="form-check-input" />
        <label class="form-check-label" for="nav-type-sticky">Sticky</label>
      </div>
      <div class="form-check me-1">
        <input type="radio" id="nav-type-static" name="navType" class="form-check-input" />
        <label class="form-check-label" for="nav-type-static">Static</label>
      </div>
      <div class="form-check">
        <input type="radio" id="nav-type-hidden" name="navType" class="form-check-input" />
        <label class="form-check-label" for="nav-type-hidden">Hidden</label>
      </div>
    </div>
  </div>
  <hr />

  <!-- Footer -->
  <div class="customizer-footer px-2">
    <p class="fw-bold">Footer Type</p>
    <div class="d-flex">
      <div class="form-check me-1">
        <input type="radio" id="footer-type-sticky" name="footerType" class="form-check-input" />
        <label class="form-check-label" for="footer-type-sticky">Sticky</label>
      </div>
      <div class="form-check me-1">
        <input type="radio" id="footer-type-static" name="footerType" class="form-check-input" checked />
        <label class="form-check-label" for="footer-type-static">Static</label>
      </div>
      <div class="form-check me-1">
        <input type="radio" id="footer-type-hidden" name="footerType" class="form-check-input" />
        <label class="form-check-label" for="footer-type-hidden">Hidden</label>
      </div>
    </div>
  </div>
</div>

    </div>
    <!-- End: Customizer-->

    <div class="sidenav-overlay"></div>
    <div class="drag-target"></div>


<div class="modal fade show" id="addNewCard" tabindex="-1" aria-labelledby="addNewCardTitle" style="display: block; padding-left: 0px;" aria-modal="true" role="dialog">
  <div class="modal-dialog modal-dialog-centered">
    <div class="modal-content">
      <div class="modal-header bg-transparent">
      </div>
      <div class="modal-body px-sm-5 mx-50 pb-1 mt-1">
        <h4 class="text-center mb-1" id="addNewCardTitle"><i class='fa fa-map-marker' aria-hidden='true'></i> <span id="errVal">Allow Location to Access this Form.</span></h4>
          <div class="col-12 text-center">
            <button type="reset" class="btn btn-outline-secondary mt-1 waves-effect" data-bs-dismiss="modal" aria-label="Close">
              Close
            </button>
          </div>
      </div>
    </div>
  </div>
</div>


    <!-- BEGIN: Footer-->
    <footer class="footer footer-static footer-light">
      <p class="clearfix mb-0"><span class="float-md-start d-block d-md-inline-block mt-25">COPYRIGHT  &copy;  <span id="currentYear"></span> ,| Powered by<a class="ms-25" href="https://ramkyenviroengineers.com/" target="_blank">Re Sustainability Limited</a><span class="d-none d-sm-inline-block"> . All Rights Reserved.</span></span></p>
    </footer>
    <button class="btn btn-primary btn-icon scroll-top" type="button"><i data-feather="arrow-up"></i></button>
    <!-- END: Footer-->

 
    <!-- BEGIN: Vendor JS-->
    <script src="/reisp/resources/vendors/js/vendors.min.js"></script>
    <!-- BEGIN Vendor JS-->

    <!-- BEGIN: Page Vendor JS-->
    <script src="/reisp/resources/vendors/js/ui/jquery.sticky.js"></script>
    <script src="/reisp/resources/vendors/js/forms/select/select2.full.min.js"></script>
    <script src="/reisp/resources/vendors/js/charts/apexcharts.min.js"></script>
    <script src="/reisp/resources/vendors/js/extensions/toastr.min.js"></script>
    <script src="/reisp/resources/vendors/js/extensions/moment.min.js"></script>
    <script src="/reisp/resources/vendors/js/tables/datatable/jquery.dataTables.min.js"></script>
    <script src="/reisp/resources/vendors/js/tables/datatable/datatables.buttons.min.js"></script>
    <script src="/reisp/resources/vendors/js/tables/datatable/dataTables.bootstrap5.min.js"></script>
    <script src="/reisp/resources/vendors/js/tables/datatable/dataTables.responsive.min.js"></script>
    <script src="/reisp/resources/vendors/js/tables/datatable/responsive.bootstrap5.js"></script>
    <!-- END: Page Vendor JS-->
 <script src="/reisp/resources/js/materialize-v.1.0.min.js "  ></script>
    <script src="/reisp/resources/js/jquery-validation-1.19.1.min.js"  ></script>
    <script src="/reisp/resources/js/jquery.dataTables-v.1.10.min.js"  ></script>
     <script src="/reisp/resources/js/datetime-moment-v1.10.12.js"  ></script>
         <script src="/reisp/resources/js/dataTables.material.min.js"  ></script>
      <script src="/reisp/resources/js/moment-v2.8.4.min.js"  ></script>
    <!-- BEGIN: Theme JS-->
    <script src="/reisp/resources/js/core/app-menu.min.js"></script>
    <script src="/reisp/resources/js/core/app.min.js"></script>
    <script src="/reisp/resources/js/scripts/customizer.min.js"></script>
     <script src="/reisp/resources/js/scripts/forms/form-select2.min.js"></script>
    <!-- END: Theme JS-->
   <script src="/reisp/resources/js/scripts/pages/modal-add-new-cc.min.js"></script>
    <script src="/reisp/resources/js/scripts/pages/page-pricing.min.js"></script>
    <script src="/reisp/resources/js/scripts/pages/modal-add-new-address.min.js"></script>
    <script src="/reisp/resources/js/scripts/pages/modal-create-app.min.js"></script>
    <script src="/reisp/resources/js/scripts/pages/modal-two-factor-auth.min.js"></script>
    <script src="/reisp/resources/js/scripts/pages/modal-edit-user.min.js"></script>
    <script src="/reisp/resources/js/scripts/pages/modal-share-project.min.js"></script>
    <!-- BEGIN: Page JS-->
     <script src="/reisp/resources/js/scripts/pages/dashboard-analytics.min.js"></script>
    <script src="/reisp/resources/js/scripts/pages/app-invoice-list.min.js"></script>
    <script src="/reisp/resources/vendors/js/file-uploaders/dropzone.min.js"></script>
    <script src="/reisp/resources/js/scripts/forms/form-file-uploader.min.js"></script>
    <!-- END: Page JS-->
    
  <form action="<%=request.getContextPath()%>/export-company" name="exportIRMForm" id="exportIRMForm" target="_blank" method="post">	
      
        <input type="hidden" name="company_code" id="exportIRM_filter" />
        <input type="hidden" name="status" id="exportStatus_filter" />
	</form>
    <script>
      $(window).on("load",(function(){
    	  var x = document.getElementById("demo");
    	  $('#sBtn').attr('disabled', true);
    	  if (navigator.geolocation) {
    		  var ssss =   navigator.geolocation.getCurrentPosition(showPosition,showError);
    		  } else { 
    			  x.innerHTML = "Geolocation is not supported by this browser.";
    		  }
    	  
    	  function showPosition(position) {
    		  $('#person_location').val(position.coords.latitude + ','+position.coords.longitude)
    		  var loc =  $('#person_location').val() ;
        	  if( loc != null || loc != ''){
        		  $('#sBtn').removeAttr('disabled');
        		  $('#addNewCard').modal().hide();
        	  }
        	  
    		}
    	  function showError(error) {
    		  switch(error.code) {
    		    case error.PERMISSION_DENIED:
    		    	 $('#addNewCard').modal('show');
    		    	 $('#errVal').html("Allow Location to Access this Form.")
    		      break;
    		    case error.POSITION_UNAVAILABLE:
    		    	 $('#addNewCard').modal('show');
    		    	 $('#errVal').html("Location information is unavailable, Please Allow Location to Access this Form.")
    		      break;
    		    case error.TIMEOUT:
    		    	 $('#addNewCard').modal('show');
    		    	 $('#errVal').html("The request to get user location timed out, Allow Location to Access this Form.")
    		      break;
    		    case error.UNKNOWN_ERROR:
    		    	 $('#addNewCard').modal('show');
    		    	 $('#errVal').html("An unknown error occurred.")
    		      break;
    		  }
    		}
    	  
          if (feather) {
            feather.replace({ width: 14, height: 14 });
          }
          $('.modal').modal({ dismissible: false });
          getIRMList();
          var project = '${sessionScope.BASE_PROJECT_CODE}';
          getDepartmentList(project);
          getLocationList(project);
         }));
      document.getElementById("currentYear").innerHTML = new Date().getFullYear();
      
      function clearFilter(){
		    	$("#select2-company_filter-container").val("");
		    	$("#select2-status_filter-container").val("");
		    	window.location.href= "<%=request.getContextPath()%>/company";
	    }
      
      function getIRMFilterList() {
	        var company_code = $("#select2-company_filter-container").val();
	        var status = $("#select2-status_filter-container").val();
	        if ($.trim(company_code) == "") {
	        	$("#select2-company_filter-container option:not(:first)").remove();
	        	var myParams = { company_code: company_code, status: status };
	            $.ajax({
	                url: "<%=request.getContextPath()%>/ajax/getIRMFilterList",
	                data: myParams, cache: false,async: false,
	                success: function (data) {
	                    if (data.length > 0) {
	                        $.each(data, function (i, val) {
	                             $("#select2-company_filter-container").append('<option value="' + val.company_code + '">'+ "[ "+$.trim(val.company_code) +" ]"+" - " + $.trim(val.company_name) +'</option>');
	                        });
	                    }
	                },error: function (jqXHR, exception) {
	    	   			      $(".page-loader").hide();
	       	          	  getErrorMessage(jqXHR, exception);
	       	     	  }
	            });
	        }
	    }
      function getStatusFilterList() {
    	  var company_code = $("#select2-company_filter-container").val();
	        var status = $("#select2-status_filter-container").val();
	        if ($.trim(status) == "") {
	        	$("#select2-status_filter-container option:not(:first)").remove();
	        	var myParams = { company_code: company_code, status: status };
	            $.ajax({
	                url: "<%=request.getContextPath()%>/ajax/getStatusFilterList",
	                data: myParams, cache: false,async: false,
	                success: function (data) {
	                    if (data.length > 0) {
	                        $.each(data, function (i, val) {
	                             $("#select2-status_filter-container").append('<option value="' + val.status + '">' + $.trim(val.status) +'</option>');
	                        });
	                    }
	                },error: function (jqXHR, exception) {
	    	   			      $(".page-loader").hide();
	       	          	  getErrorMessage(jqXHR, exception);
	       	     	  }
	            });
	        }
	    }

	    function exportIRM(){
	    	 var company_code = $("#select2-company_filter-container").val();
	         var status = $("#select2-status_filter-container").val();
	    	
	    	 $("#exportIRM_filter").val(company_code);
	     	 $("#exportStatus_filter").val(status);
	     	 $("#exportIRMForm ").submit();
	  	}
	    
	    function getIRMList(){
	    	getIRMFilterList('');
	    	getStatusFilterList('');
	    	var company_code = $("#select2-company_filter-container").val();
	        var status = $("#select2-status_filter-container").val();
	        $('#allCompanies').html(0)
    		$('#activeCompanies').html(0)
    		$('#inActiveCompanies').html(0)

	    } 
	    
	    function getIRM(company_code,status,company_name,id){
	    	 $('#company_name_edit').val('');
			 $('#company_code_edit').val('');
			 $('select[name^="status"] option:selected').removeAttr("selected");
		      $('#id').val($.trim(id));
		      $('#updateIRM').modal('show');
		      $('#updateIRM #company_name_edit').val($.trim(company_name)).focus();
		      $('#updateIRM #company_code_edit').val($.trim(company_code)).focus();
		      if(status != null && status != ''  && status != "undefined"){
		    	  $('select[name^="status"] option[value="'+ status +'"]').attr("selected",true);
		    	  $('select').select2();
		      }
	   }
	    
	    function getErrorMessage(jqXHR, exception) {
	  	    var msg = '';
	  	    if (jqXHR.status === 0) {
	  	        msg = 'Not connect.\n Verify Network.';
	  	    } else if (jqXHR.status == 404) {
	  	        msg = 'Requested page not found. [404]';
	  	    } else if (jqXHR.status == 500) {
	  	        msg = 'Internal Server Error [500].';
	  	    } else if (exception === 'parsererror') {
	  	        msg = 'Requested JSON parse failed.';
	  	    } else if (exception === 'timeout') {
	  	        msg = 'Time out error.';
	  	    } else if (exception === 'abort') {
	  	        msg = 'Ajax request aborted.';
	  	    } else {
	  	        msg = 'Uncaught Error.\n' + jqXHR.responseText;
	  	    }
	  	    console.log(msg);
        }
	    
	    function submitIRM(){
	    	if(validator.form()){ // validation perform
	        	document.getElementById("irmForm").submit();	
	    	}
	    }
	  
	   
	    var validator =	$('#irmForm').validate({
	   	 errorClass: "my-error-class",
	   	 validClass: "my-valid-class",
	   	 ignore: ":hidden:not(.select2 form-select)",
	   		    rules: {
	   		 		  "project_code": {
	   			 			required: true
	   			 	  },"department_code": {										
	   			 			required: true
	   			 	  },"location": {
	   	                 	required: true,
	   			 	  },"description": {
	   	                 	required: true,
	   			 	  },"risk_type": {
	   	                 	required: true,
	   			 	  },"incident_type": {
	   	                 	required: true,
	   			 	  }
	   			 	  
	   			 	  
	   		 	},
	   		    messages: {
	   		 		 "project_code": {
	   				 	required: 'Required',
	   			 	  },"department_code": {
	   			 		required: 'Required'
	   			 	  },"location": {
	   		 			required: 'Required'
	   		 	  	  },"description": {
	   		 			required: 'Required'
	   		 	  	  },"risk_type": {
	   		 			required: 'Required'
	   		 	  	  },"incident_type": {
	   		 			required: 'Required'
	   		 	  	  }
	      		},
	      		errorPlacement:function(error, element){
	      		 	if (element.attr("id") == "select2-project_code-container" ){
	   				 document.getElementById("select2-project_code-containerError").innerHTML="";
	   		 		 error.appendTo('#select2-project_code-containerError');
	   			}else if(element.attr("id") == "select2-department_code-container" ){
	   			   document.getElementById("select2-department_code-containerError").innerHTML="";
	   		 	   error.appendTo('#select2-department_code-containerError');
	   			}else if(element.attr("id") == "select2-location-container" ){
	   				document.getElementById("select2-location-containerError").innerHTML="";
	   			 	error.appendTo('#select2-location-containerError');
	   			}else if(element.attr("id") == "select2-risk_type-container" ){
	   				document.getElementById("select2-risk_type-containerError").innerHTML="";
	   			 	error.appendTo('#select2-risk_type-containerError');
	   			}else if(element.attr("id") == "select2-incident_type-container" ){
	   				document.getElementById("select2-incident_type-containerError").innerHTML="";
	   			 	error.appendTo('#select2-incident_type-containerError');
	   			}else if(element.attr("id") == "textarea-counter" ){
	   				document.getElementById("select2-description-containerError").innerHTML="";
	   			 	error.appendTo('#select2-description-containerError');
	   			}else{
	   					error.insertAfter(element);
	   	        } 
	      		},invalidHandler: function (form, validator) {
	               var errors = validator.numberOfInvalids();
	               if (errors) {
	                   var position = validator.errorList[0].element;
	                   jQuery('html, body').animate({
	                       scrollTop:jQuery(validator.errorList[0].element).offset().top - 100
	                   }, 1000);
	               }
	           },submitHandler:function(form){
	   	    	//form.submit();
	   	    }
	   	}); 
	   	$('.select2Form').change(function(){
	   	    if ($(this).val() != ""){
	   	        $(this).valid();
	   	    }
	   	});
	   	
	   	$('input').change(function(){
	   	    if ($(this).val() != ""){
	   	        $(this).valid();
	   	    }
	   	});
	   	
	   	function getDeptAndLocationList(project){
	   		getDepartmentList(project);
	   		getLocationList(project);
	   	}
	   	
	    function getDepartmentList(Project) {
		        if ($.trim(Project) != "") {
		        	$("#select2-department_code-container option:not(:first)").remove();
		        	var myParams = { project: Project };
		            $.ajax({
		                url: "<%=request.getContextPath()%>/ajax/getDepartments",
		                data: myParams, cache: false,async: false,
		                success: function (data) {
		                    if (data.length > 0) {
		                        $.each(data, function (i, val) {
		                             $("#select2-department_code-container").append('<option value="' + val.department_code + '">' +'[ '+ $.trim(val.department_code) +' ] - '+ $.trim(val.department_name) + '</option>');
		                        });
		                    }
		                },error: function (jqXHR, exception) {
		    	   			      $(".page-loader").hide();
		       	          	  getErrorMessage(jqXHR, exception);
		       	     	  }
		            });
		        }
		    }
	    
	    function getLocationList(Project) {
	        if ($.trim(Project) != "") {
	        	$("#select2-location-container option:not(:first)").remove();
	        	var myParams = { project_code: Project };
	            $.ajax({
	                url: "<%=request.getContextPath()%>/ajax/getLocations",
	                data: myParams, cache: false,async: false,
	                success: function (data) {
	                    if (data.length > 0) {
	                        $.each(data, function (i, val) {
	                             $("#select2-location-container").append('<option value="' + val.location_code + '">' +'[ '+ $.trim(val.location_code) +' ] - '+ $.trim(val.location_name) + '</option>');
	                        });
	                    }
	                },error: function (jqXHR, exception) {
	    	   			      $(".page-loader").hide();
	       	          	  getErrorMessage(jqXHR, exception);
	       	     	  }
	            });
	        }
	    }

	    function roleMapping(){
	    	$("#approverForIncident").html('No Reviewer Assigned').css("color", "orange");
	    	var project_code = $("#project_code").val();
	    	var department_code = $("#select2-department_code-container").val();
	    	var incident_type = $("#select2-incident_type-container").val();
	        if ($.trim(project_code) != "" && $.trim(department_code) != "" && $.trim(incident_type) != "" ) {
	        	var myParams = { project_code: project_code,department_code : department_code, incident_type : incident_type };
	            $.ajax({
	                url: "<%=request.getContextPath()%>/ajax/getRoleMappingforIRMForm",
	                data: myParams, cache: false,async: false,
	                success: function (data) {
	                    if (data.length > 0) {
	                        $.each(data, function (i, val) {
	                        	if($.trim(val.user_name) != ''){
	                        		$("#approverForIncident").html(val.user_name).css("color", "#05f305").append('&nbsp; <i class="fa fa-check" aria-hidden="true"></i>');
	                        		$("#approver_code").val(val.user_id);
	                        		$("#approver_type").val(val.role_code);
	                        		$("#email_id").val(val.email_id);
	                        		$("#approver_name").val(val.user_name);
	                        	}else{
	                        		 $("#approver_code").val(null);
	                        		 $("#approver_type").val("No Reviewer Assigned");
	                        		 $("#approverForIncident").html('No Reviewer Found').css("color", "red");
	                        	}
	                        });
	                    }else{
	                    	  $("#approverForIncident").html('No Reviewer Found').css("color", "red");
	                    	  $("#approver_code").val(null);
                      		  $("#approver_type").val(null);
	                    }
	                },error: function (jqXHR, exception) {
	    	   			      $(".page-loader").hide();
	       	          	  getErrorMessage(jqXHR, exception);
	       	     	  }
	            });
	        }
	    	
	    }
	    $("#btn").click(function() {
	    	 $("#irmForm")[0].reset();
    		 $("#select2-project_code-container").val('').trigger('change');
    		 $("#select2-department_code-container").val('').trigger('change');
    		 $("#select2-location-container").val('').trigger('change');
    		 $("#select2-ptw_code-container").val('').trigger('change');
    		 $("#select2-risk_type-container").val('').trigger('change');
    		 $("#select2-incident_type-container").val('').trigger('change');
        });
	    function showFrom(incident){
	    	if(incident != ''){
	    		/*  $("#irmForm")[0].reset();
	    		 $("#select2-project_code-container").val('').trigger('change');
	    		 $("#select2-department_code-container").val('').trigger('change');
	    		 $("#select2-location-container").val('').trigger('change');
	    		 $("#select2-ptw_code-container").val('').trigger('change');
	    		 $("#select2-risk_type-container").val('').trigger('change');
	    		 $("#select2-incident_type-container").val('').trigger('change'); */
		    	// $('#showOnIncidentSelect').css("display","block");
		    	 $('#incident_type').val(incident)
	    		// $("#approverForIncident").html('No Reviewer Assigned').css("color", "orange");
		    	 var incident_name = $('#select2-incident_type-container').find(":selected").text();
		    	 $('#incident_name').val(incident_name)
		    	 $('#incidentValue').html(incident_name+" Form ").css("text-transform", "uppercase");
	    	}else{
	    		 $('#showOnIncidentSelect').css("display","none");
	    	}
	    }
	    

        $(function () {
            $(document).on('click', '.btn-add', function (e) {
                e.preventDefault();

                var controlForm = $('.controls:first'),
                    currentEntry = $(this).parents('.entry:first'),
                    newEntry = $(currentEntry.clone()).appendTo(controlForm);

                newEntry.find('input').val('');
                controlForm.find('.entry:not(:last) .btn-add')
                    .removeClass('btn-add').addClass('btn-remove')
                    .removeClass('btn-success').addClass('btn-danger')
                    .html('<span class="fa fa-trash"></span>');
            }).on('click', '.btn-remove', function (e) {
                $(this).parents('.entry:first').remove();

                e.preventDefault();
                return false;
            });
        });


    </script>
  </body>
  <!-- END: Body-->

<!-- Mirrored from pixinvent.com/demo/vuexy-html-bootstrap-admin-template/html/ltr/horizontal-menu-template/dashboard-analytics.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 07 Aug 2022 05:36:10 GMT -->
</html>
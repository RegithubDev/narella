<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding ="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page import="com.resustainability.reisp.constants.CommonConstants"%>
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
.card-imgs {
    margin-left: -9.5% !important;
}
.textAreaColumn{
    width:100%;    
}
.textAreaColumn div{
    float:left;
    width:50%;
    padding:10px;
    box-sizing: border-box;
}

.textAreaColumn div span{
    display:block;
}

.textAreaColumn div textarea{
    box-sizing: border-box;
    width:100%;
    border:1px solid grey;
    min-height:5rem;
    border-top-right-radius: 1rem;
}
.p-1 {
    padding: 1!important;
}
@media print {
  .noPrint{
    display:none;
  }
}
h1{
  color:#f6f6;
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
.btn.disabled, .btn:disabled, fieldset:disabled .btn {
    pointer-events: painted !important;
    opacity: 1.65 !important;
}
.py-1 {
    padding-top: 1rem!important;
    padding-bottom: 1rem!important;
    padding-left: 2rem;
        color: #6E6B7B;
}
::file-selector-button {
  display: none;
}
</style>
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=0,minimal-ui">
    <meta name="description" content="Safety admin is super flexible, powerful, clean &amp; modern responsive bootstrap 4 IRM with unlimited possibilities.">
    <meta name="keywords" content="admin template,IRM, Safety admin template, dashboard template, flat admin template, responsive admin template, web app">
    <meta name="author" content="PIXINVENT">
  <title>IRM - Action</title>
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
        <link rel="stylesheet" type="text/css" href="/reisp/resources/vendors/css/pickers/pickadate/pickadate.css">
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
  <body class="horizontal-layout horizontal-menu  navbar-floating footer-static " data-open="hover" data-menu="horizontal-menu" data-col="">

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
                                             			         <img src="<%=request.getContextPath() %>/resources/images/logo/P2-LoginPage.png" width="" height="40" class="card-imgs">

                      </g>
                    </g> 
                  </svg></span>
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
     <div class="app-content content">
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
                   <c:if test="${sessionScope.BASE_ROLE ne 'User' }"> <li class="breadcrumb-item"><a href="<%=request.getContextPath() %>/home">Home</a>
                    </li></c:if>
                     <li class="breadcrumb-item"><a href="<%=request.getContextPath() %>/irm">IRM</a>
                    </li>

                    <li class="breadcrumb-item active">IRM Reviewer Action 
                    </li>
                  </ol>
                </div>
              </div>
            </div>
          </div>
        </div>
 <div class="">
      <div class="content-overlay"></div>
      <div class="header-navbar-shadow"></div>
      <div class="content-wrapper container-xxl p-0">
        <div class="content-header row">
        </div>
        <div class="content-body"><section class="invoice-preview-wrapper">
  <div class="row invoice-preview">
    <!-- Invoice -->
    <div class="col-xl-10 col-md-8 col-12" id="printableArea">
    <form class="form" action="<%=request.getContextPath() %>/irm-update-submit" id="irmForm" name="irmForm" method="post" class="form-horizontal invoice-repeater" role="form" enctype="multipart/form-data">
        <fieldset <c:if test="${sessionScope.BASE_ROLE eq 'User' }" > disabled</c:if> >
      <div class="card invoice-preview-card">
      
        <div class="card-body invoice-padding pb-0">
          <!-- Header starts -->
          <div class="d-flex justify-content-between flex-md-row flex-column invoice-spacing mt-0">
            <div>
              <div class="logo-wrapper">
                <svg
                  viewBox="0 0 139 95"
                  version="1.1"
                  xmlns="http://www.w3.org/2000/svg"
                  xmlns:xlink="http://www.w3.org/1999/xlink"
                  height="24"
                >
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
			         <img src="<%=request.getContextPath() %>/resources/images/logo/P2-LoginPage.png" width="" height="40" class="card-imgs" >
                    </g>
                  </g>
                </svg>
              </div>
              <p class="card-text mb-25 mt-1"><b>Project </b>:  [${IRMDetails.sbu_code }]/[${IRMDetails.project_code }] - ${IRMDetails.project_name } </p>
              <p class="card-text mb-25"><b>Department </b>: [${IRMDetails.department_code }] - ${IRMDetails.department_name } </p>
              <p class="card-text mb-0"><b>Location </b>: [${IRMDetails.location_code }] - ${IRMDetails.location_name } </p>
            </div>
           <div class="mt-md-0 mt-2">
              <h4 class="invoice-title">
                Incident No : 
                <span class="invoice-number">#${IRMDetails.document_code }</span>
              </h4>
              <div class="invoice-date-wrapper">
                <p class="invoice-date"><b>Date </b>: ${IRMDetails.created_date } </p>
                <p class="invoice-date"><b>Last Updated </b>: ${IRMDetails.action_taken }<c:if test ="${empty IRMDetails.action_taken }" ><span id="lastDate"></span> </c:if></p>
                 <p class="invoice-date-title"><b> Current Status </b> :
                  <c:if test ="${IRMDetails.status ne 'Reviewed' && IRMDetails.mainStatus ne 'Resolved' }" >  <span class="badge rounded-pill badge-light-warning me-1" id="app_type">In Progress </span> </c:if>
                   <c:if test ="${IRMDetails.status eq 'Reviewed' || IRMDetails.mainStatus eq 'Resolved'}" >  <span class="badge rounded-pill badge-light-success me-1">Resolved</span> </c:if>
                   </p> 
              </div>
  
            </div>
          </div>
          <!-- Header ends -->
        </div>

        <hr class="invoice-spacing" />
  		<input type="hidden"  name="document_code" value="${IRMDetails.document_code }"/>  
  		<input type="hidden"  name="incident_type" value="${IRMDetails.incident_type }"/>  
        <!-- Address and Contact starts -->
<%--         <div class="card-body invoice-padding pt-0">
          <div class="row invoice-spacing">
            <div class="col-xl-8 p-1">
              <h6 class="mb-25"></h6>
              <p class="card-text mb-25"><b> Incident Type </b> : ${IRMDetails.incident_type }</p>
             
            </div>
            <div class="col-xl-4 p-0 mt-xl-0 mt-2">
              <h6 class="mb-2"></h6>
              <table>
                <tbody>

                  <tr>
                    <td class="pe-1"><b> Risk Type </b>:</td>
                    <td>${IRMDetails.risk_type }</td>
                  </tr>

                </tbody>
              </table>
            </div>
          </div>
        </div> --%>
        <!-- Address and Contact ends -->

        <!-- Invoice Description starts -->
        <div class="table-responsive">
          <table class="table" style=" border-spacing: 0px;
            table-layout: fixed;
            margin-left: auto;
            margin-right: auto;">
            <thead>
              <tr>
                <th class="py-1"> Incident Details</th>
               
                <th class="py-1"></th>
                 <th class="py-1"></th>
              </tr>
            </thead>
            <tbody>
            <tr style="
    border-style: hidden;
">
            <td class="py-1">
             <p class="card-text">
             <b> Incident Type </b> : ${IRMDetails.incident_type }
             </p>
            </td>
            <td class="py-1">
             <p class="card-text">
             <b> Risk Type </b> : ${IRMDetails.risk_type }
             </p>
            </td>
            <td class="py-1">
            
            </td>
            </tr>
              <tr>
                <td class="py-1" >
                  <p class="card-text">
                  <b>Description </b> : <br> ${IRMDetails.description }
                  </p>
                </td>
                <td class="py-1">
                 <p class="card-text">
                <b>Attachments </b>: <br>
               
                 <c:choose>
  					 <c:when test="${  fn:contains( IRMDetails.photo, ',' ) }">
		  	                <c:set var="filesList" value="${fn:split(IRMDetails.photo, ',')}" />
			                 <c:choose>
					         <c:when test ="${fn:length(filesList) gt 0}" >
					             <c:forEach var="obj" items="${filesList}">
									<input type="hidden" id="design_file_ids" value="${obj}"/>
							        <a href="<%=CommonConstants.SAFETY_FILE_SAVING_PATH_LOC%>${IRMDetails.document_code }/${obj }" class="filevalue" download ="${obj}"><i class="fa fa-arrow-down"></i>
				                  <span class="fw-bold">${obj }</span></a><br>
								</c:forEach>
					         </c:when>
					         <c:otherwise>
					          <p >   <i class="fa-solid fa-file"></i> No Attachments Found!</p>
					         </c:otherwise>
					      </c:choose>
			      </c:when>
			       <c:otherwise>
			       <c:if test="${ not empty fn:trim(IRMDetails.photo) }">
		        		<input type="hidden" id="design_file_ids" value="${IRMDetails.photo}"/>
				        <a href="<%=CommonConstants.SAFETY_FILE_SAVING_PATH_LOC%>${IRMDetails.document_code }/${IRMDetails.photo }" class="filevalue" download ="${IRMDetails.photo}"><i class="fa fa-arrow-down"></i>
	                    <span class="fw-bold">${IRMDetails.photo }</span></a>
			       </c:if>
			        <c:if test="${ empty fn:trim(IRMDetails.photo) }">
			         <p >   <i class="fa-solid fa-file"></i> No Attachments Found!</p>
			        </c:if>
			         </c:otherwise>
			       </c:choose>
			         </p>
                </td>
                <td class="py-1">
            <b>Incident Category </b> : <br>
             <c:choose>
 					 <c:when test="${  fn:contains( IRMDetails.incident_category, ',' ) }">
	  	                <c:set var="filesList" value="${fn:split(IRMDetails.incident_category, ',')}" />
		                 <c:choose>
				         <c:when test ="${fn:length(filesList) gt 0}" >
				             <c:forEach var="obj" items="${filesList}">
			                <span class="">&#x2022; ${obj }</span><br>
							</c:forEach>
				         </c:when>
				         <c:otherwise>
				          <p >  <i class="fa-solid fa-file"></i> No Data Found!</p>
				         </c:otherwise>
				      </c:choose>
		      </c:when>
		       <c:otherwise>
		       <c:if test="${ not empty fn:trim(IRMDetails.incident_category) }">
                    <span class="">&#x2022; ${IRMDetails.incident_category}</span>
		       </c:if>
		        <c:if test="${ empty fn:trim(IRMDetails.incident_category) }">
		         <p ></p>
		        </c:if>
		       </c:otherwise>
	       </c:choose>
            </td>
              </tr>
            </tbody>
          </table>
        </div>
      
       <input type="hidden"  name="email_id" value="${IRMDetails.email_id }"/>
       <c:if test ="${fn:length(IRMDetails.irmIncidentsList) eq 0}">
           <script>
			       $('#app_type').removeClass('badge rounded-pill badge-light-warning me-1');
			       $('#app_type').html('<b>No Reviewer Assigned</b>').addClass('text-danger')
		    </script>
         </c:if>
         <c:forEach var="fObj" items="${IRMDetails.irmIncidentsList }" varStatus="index">
         <fieldset>
     <div class="table-responsive" <c:if test ="${empty fObj.approver_code }"> style ="display:none;"</c:if>
      <c:if test="${fObj.status eq 'Send Back' && sessionScope.USER_ID ne fObj.approver_code || fObj.status eq 'Sent Back' && sessionScope.USER_ID ne fObj.approver_code }" > style="display:none;" </c:if>  >
     <script>
        if('${fObj.action_taken}' != ''){
         	$('#lastDate').html('${fObj.action_taken}');
        }
     </script>
    
     <div class="card" 
     <c:if test="${sessionScope.USER_ID ne fObj.approver_code   && sessionScope.BASE_ROLE ne 'Admin' && empty fObj.corrective_action }" > style="display:none;" </c:if>  
     
     >
       
        <div class="col-12">
              <div class="alert alert-primary" role="alert">
                <div class="py-1"><strong>ACTION TAKEN </strong></div>
            </div>
            <p class="badge rounded-pill badge-light-success me-1 invoice-total-title" style=" margin-left: 2rem;"><b>Level ${index.count } : </b>${fObj.approver_type }</p>
        <div class="card-body">
         <c:if test ="${fn:length(IRMDetails.irmIncidentsList) eq 1  &&  fObj.status eq 'In Progress' }" >
        
<div class="content-body"><section class="form-control-repeater">
  <div class="row">
    <!-- Invoice repeater -->
    <div class="col-12">
      <div class="card">
       <div class="" style=" margin-left: 2rem;">
       <h5 class="card-title">Root Cause Analysis</h5>
       <div class="card-header" style=" margin-left: -2rem;">
        <div class="col-md-12 col-12 mb-1">
              <label class="form-label" for="select2-multiple1">Investigation Team</label>
               <select class="select2 form-select" id="investigation_team" name="investigation_team"  data-placeholder="Select Users" multiple >
              <c:forEach var="obj" items="${userList}">
              	   <option value="${obj.user_id }"  <c:if test="${  fn:contains( fObj.investigation_team, obj.user_id ) }"> selected</c:if> >
              	  ${obj.user_name } -  ${obj.base_role } -  ${obj.base_department }</option>
              </c:forEach>
	            </select>
	             <span id="select2-investigation_team-containerError" class="error-msg" ></span>
          </div>
        </div>
   		<div class="row">
   	  		<input type="hidden" id="id${index.count }" name="rca_id" value="${obj.rca_id }">
            <div class=" col-md-3 col-4 form-check form-check-danger">
              <input type="checkbox" class="form-check-input" id="ua_checkbox" onchange="displayIncidentDropdown('UA');" <c:if test="${  fn:contains( fObj.incident_type, 'UA' ) }"> checked</c:if> >
               <input type="hidden" id="ua_incident" name="incident_types" <c:if test="${  fn:contains( fObj.incident_type, 'UA' ) }"> value="UA"</c:if> />
              <label class="form-check-label" for="colorCheck5">Unsafe Act</label>
            </div>
             <div class=" col-md-3 col-4 form-check form-check-danger">
              <input type="checkbox" class="form-check-input" id="uc_checkbox" onchange="displayIncidentDropdown('UC');" <c:if test="${  fn:contains( fObj.incident_type, 'UC' ) }"> checked</c:if> >
              <input type="hidden" id="uc_incident" name="incident_types"  <c:if test="${  fn:contains( fObj.incident_type, 'UC' ) }"> value="UC"</c:if> />
              <label class="form-check-label" for="colorCheck5">Unsafe Condition</label>
            </div>
             <div class="col-md-3 col-4 form-check form-check-danger">
              <input type="checkbox" class="form-check-input" id="nm_checkbox" onchange="displayIncidentDropdown('NM');" <c:if test="${  fn:contains( fObj.incident_type, 'Near Miss' ) }"> checked</c:if> >
              <input type="hidden" id="nm_incident" name="incident_types"  <c:if test="${  fn:contains( fObj.incident_type, 'Near Miss' ) }"> value="Near Miss"</c:if> />
              <label class="form-check-label" for="colorCheck5">Management Deficiencies</label>
            </div>
                <div class="col-md-3 col-4"> 
                 <div class="mb-1">
                 <!--   <label class="form-label" for="select2-basic">Incident Seviourity</label><span class="required"> *</span> -->
	            <select 
	              id="select2-risk_type-container"
	              name="incident_seviourity"
	              class="select2 form-selec select2Form"
	              aria-label="Default select example"
	            >
	              <option value="">Incident Seviourity</option>
	              <option value="Major" <c:if test="${fObj.incident_seviourity eq 'Major'}"> selected</c:if>>Major</option>
	              <option value="Medium" <c:if test="${fObj.incident_seviourity eq 'Medium'}"> selected</c:if>>Medium</option>
	              <option value="Minor" <c:if test="${fObj.incident_seviourity eq 'Minor'}"> selected</c:if>>Minor</option>
	            </select>
	             <span id="select2-incident_seviourity-containerError" class="error-msg" ></span>
                </div>
              </div>
          </div>
		<div class="row">
          <div class="col-md-4 col-12 mt-1"  id="ua_dp_toggle"  <c:if test="${ empty fObj.ua_type }"> style="display : none"</c:if>  >
                 <div class="mb-1">
                    <label class="form-label" for="select2-multiple1">Unsafe Act<span class="required"> *</span></label>
              <select class="select2 form-select" id="ua_dp" name="ua_type"  data-placeholder="Select Unsafe Act" multiple >
	              <option value="Improper work technique"  <c:if test="${  fn:contains( fObj.ua_type, 'Improper work technique' ) }"> selected</c:if> >Improper work technique </option>
	              <option value="Safety rule violation" <c:if test="${  fn:contains( fObj.ua_type, 'Safety rule violation' ) }"> selected</c:if>>Safety rule violation  </option>
	              <option value="Improper PPE or PPE not used" <c:if test="${  fn:contains( fObj.ua_type, 'Improper PPE or PPE not used' ) }"> selected</c:if>> Improper PPE or PPE not used</option>
	              <option value="Operating without authority" <c:if test="${  fn:contains( fObj.ua_type, 'Operating without authority' ) }"> selected</c:if>>Operating without authority  </option>
	              <option value="Failure to warn or secure" <c:if test="${  fn:contains( fObj.ua_type, 'Failure to warn or secure' ) }"> selected</c:if>>Failure to warn or secure</option>
	              
	              <option value="Operating at improper speeds" <c:if test="${  fn:contains( fObj.ua_type, 'Operating at improper speeds' ) }"> selected</c:if>>Operating at improper speeds</option>
	              <option value="By-passing safety devices" <c:if test="${  fn:contains( fObj.ua_type, 'By-passing safety devices' ) }"> selected</c:if>>By-passing safety devices</option>
	              <option value="Guards not used" <c:if test="${  fn:contains( fObj.ua_type, 'Guards not used' ) }"> selected</c:if>> Guards not used</option>
	              <option value="Improper loading or placement" <c:if test="${  fn:contains( fObj.ua_type, 'Improper loading or placement' ) }"> selected</c:if>>Improper loading or placement</option>
	              <option value="Improper lifting" <c:if test="${  fn:contains( fObj.ua_type, 'Improper lifting' ) }"> selected</c:if>>Improper lifting</option>
	              
	              <option value="Servicing machinery in motion" <c:if test="${  fn:contains( fObj.ua_type, 'Servicing machinery in motion' ) }"> selected</c:if>>Servicing machinery in motion</option>
	              <option value="Horseplay" <c:if test="${  fn:contains( fObj.ua_type, 'Horseplay' ) }"> selected</c:if>>Horseplay</option>
	              <option value="Drug or alcohol use" <c:if test="${  fn:contains( fObj.ua_type, 'Drug or alcohol use' ) }"> selected</c:if>> Drug or alcohol use</option>
	              <option value="Unnecessary haste" <c:if test="${  fn:contains( fObj.ua_type, 'Unnecessary haste' ) }"> selected</c:if>>Unnecessary haste </option>
	              <option value="Unsafe act of others" <c:if test="${  fn:contains( fObj.ua_type, 'Unsafe act of others' ) }"> selected</c:if>>Unsafe act of others</option>
	              
	            </select>
	             <span id="select2-ua_dp-containerError" class="error-msg" ></span>
                </div>
              </div>
               <div class="col-md-4 col-12 mt-1"  id="uc_dp_toggle" <c:if test="${  empty fObj.uc_type }"> style="display : none"</c:if> >
                 <div class="mb-1">
                    <label class="form-label" for="select2-multiple2">Unsafe Condition<span class="required"> *</span></label>
              <select class="select2 form-select" id="uc_dp" name="uc_type"  data-placeholder="Select Unsafe Condition" multiple >
	              <option value="Poor workstation design or layout"  <c:if test="${  fn:contains( fObj.uc_type, 'Poor workstation design or layout' ) }"> selected</c:if>>Poor workstation design or layout</option>
	              <option value="Congested work area" <c:if test="${  fn:contains( fObj.uc_type, 'Congested work area' ) }"> selected</c:if>>Congested work area </option>
	              <option value="Hazardous substances" <c:if test="${  fn:contains( fObj.uc_type, 'Hazardous substances' ) }"> selected</c:if>>Hazardous substances</option>
	              <option value="Operating without authority" <c:if test="${  fn:contains( fObj.uc_type, 'Operating without authority' ) }"> selected</c:if>>Operating without authority  </option>
	              <option value="Fire or explosion hazard" <c:if test="${  fn:contains( fObj.uc_type, 'Fire or explosion hazard' ) }"> selected</c:if>>Fire or explosion hazard</option>
	              
	              <option value="Inadequate ventilation" <c:if test="${  fn:contains( fObj.uc_type, 'Inadequate ventilation' ) }"> selected</c:if>>Inadequate ventilation</option>
	              <option value="Improper material storage" <c:if test="${  fn:contains( fObj.uc_type, 'Improper material storage' ) }"> selected</c:if>>Improper material storage</option>
	              <option value="Improper tool or equipment" <c:if test="${  fn:contains( fObj.uc_type, 'Improper tool or equipment' ) }"> selected</c:if>> Improper tool or equipment</option>
	              <option value="Insufficient knowledge of job" <c:if test="${  fn:contains( fObj.uc_type, 'Insufficient knowledge of job' ) }"> selected</c:if>>Insufficient knowledge of job</option>
	              <option value="Slippery conditions" <c:if test="${  fn:contains( fObj.uc_type, 'Slippery conditions' ) }"> selected</c:if>>Slippery conditions</option>
	              
	              <option value="Excessive noise" <c:if test="${  fn:contains( fObj.uc_type, 'Excessive noise' ) }"> selected</c:if>>Excessive noise</option>
	              <option value="Inadequate guarding of hazards" <c:if test="${  fn:contains( fObj.uc_type, 'Inadequate guarding of hazards' ) }"> selected</c:if>>Inadequate guarding of hazards</option>
	              <option value="Defective tools/ equipment" <c:if test="${  fn:contains( fObj.uc_type, 'Defective tools/ equipment' ) }"> selected</c:if>> Defective tools/ equipment</option>
	              <option value="Insufficient lighting" <c:if test="${  fn:contains( fObj.uc_type, 'Insufficient lighting' ) }"> selected</c:if>>Insufficient lighting</option>
	              <option value="Inadequate fall AAYUSHion" <c:if test="${  fn:contains( fObj.uc_type, 'Inadequate fall AAYUSHion' ) }"> selected</c:if>>Inadequate fall AAYUSHion</option>
	            </select>
	             <span id="select2-uc_dp-containerError" class="error-msg" ></span>
                </div>
              </div>
               <div class="col-md-4 col-12 mt-1" id="nm_dp_toggle"  <c:if test="${ empty fObj.management_type}"> style="display : none"</c:if> >
                 <div class="mb-1">
                    <label class="form-label" for="select2-multiple3">Management Deficiencies<span class="required"> *</span></label>
              <select class="select2 form-select" id="nm_dp" name="management_type"  data-placeholder="Select Near Miss" multiple >
	             <option value="Lack of written procedures/policies" <c:if test="${  fn:contains( fObj.management_type, 'Lack of written procedures/policies' ) }"> selected</c:if>>Lack of written procedures/policies</option>
	              <option value="Safety rules not enforced" <c:if test="${  fn:contains( fObj.management_type, 'Safety rules not enforced' ) }"> selected</c:if>>Safety rules not enforced</option>
	              <option value="Hazards not identified" <c:if test="${  fn:contains( fObj.management_type, 'Hazards not identified' ) }"> selected</c:if>>Hazards not identified</option>
	              <option value="PPE unavailable" <c:if test="${  fn:contains( fObj.management_type, 'PPE unavailable' ) }"> selected</c:if>>PPE unavailable</option>
	              <option value="Insufficient worker training" <c:if test="${  fn:contains( fObj.management_type, 'Insufficient worker training' ) }"> selected</c:if>>Insufficient worker training</option>
	               
	              <option value="Insufficient supervisor training" <c:if test="${  fn:contains( fObj.management_type, 'Insufficient supervisor training' ) }"> selected</c:if>>Insufficient supervisor training</option>
	              <option value="Improper maintenance" <c:if test="${  fn:contains( fObj.management_type, 'Improper maintenance' ) }"> selected</c:if>>Improper maintenance</option>
	              <option value="Inadequate supervision" <c:if test="${  fn:contains( fObj.management_type, 'Inadequate supervision' ) }"> selected</c:if>>Inadequate supervision</option>
	              <option value="Inadequate job planning" <c:if test="${  fn:contains( fObj.management_type, 'Inadequate job planning' ) }"> selected</c:if>>Inadequate job planning</option>
	              <option value="Inadequate hiring practices" <c:if test="${  fn:contains( fObj.management_type, 'Inadequate hiring practices' ) }"> selected</c:if>>Inadequate hiring practices</option>
	              
	              <option value="Inadequate workplace inspection" <c:if test="${  fn:contains( fObj.management_type, 'Inadequate workplace inspection' ) }"> selected</c:if>>Inadequate workplace inspection</option>
	              <option value="Inadequate equipment" <c:if test="${  fn:contains( fObj.management_type, 'Inadequate equipment' ) }"> selected</c:if>>Inadequate equipment</option>
	              <option value="Unsafe design or construction" <c:if test="${  fn:contains( fObj.management_type, 'Unsafe design or construction' ) }"> selected</c:if>>Unsafe design or construction</option>
	              <option value="Unrealistic scheduling" <c:if test="${  fn:contains( fObj.management_type, 'Unrealistic scheduling' ) }"> selected</c:if>>Unrealistic scheduling</option>
	              <option value="Poor process design" <c:if test="${  fn:contains( fObj.management_type, 'Poor process design' ) }"> selected</c:if>>Poor process design</option>
	            </select>
	             <span id="select2-nm_dp-containerError" class="error-msg" ></span>
                </div>
              </div>

          </div>
          </div> 
          <hr>
        <div class="card-body invoice-repeater">
            <div data-repeater-list="">
             <c:choose>
		         <c:when test = "${fn:length(fObj.capaList) gt 0}">
		          <c:forEach var="obj" items  = "${fObj.capaList }" varStatus ="index">
		           <div data-repeater-item="">
                <div class="row d-flex align-items-end">
                  <div class="col-md-3 col-12">
                   <input type="hidden" id="id${index.count }" name="capa_id" value="${obj.capa_id }">
                    <div class="mb-1">
                      <label class="form-label active" for="itemname">Corrective Action<span class="required"> *</span></label>
		                   <c:if test ="${fObj.status eq 'In Progress' }" > <p> 
									<input type="text" class=" form-control"  placeholder="Corrective Action"  name="cas" 
					                  <c:if test ="${fObj.status eq 'In Progress' }" > id="corrective_action"  </c:if>
					                  <c:if test ="${fObj.status ne 'In Progress' || sessionScope.BASE_ROLE eq 'Management' }" > readonly </c:if> value="${obj.ca }" />
							</c:if>
		                  <c:if test ="${fObj.status eq 'In Progress' }" >  <span id="corrective_actionError" class="invalid-feedback" ></span></c:if>
						</div>
                  </div>

                  <div class="col-md-3 col-12">
                    <div class="mb-1">
                      <label class="form-label active" for="itemcost">Preventive Action<span class="required"> *</span></label>
		                   <c:if test ="${fObj.status eq 'In Progress' }" > <p>
		                     <input type="text"  class=" form-control" placeholder="Preventive Action"
		                      <c:if test ="${fObj.status eq 'In Progress' }" > id="preventive_action" name="pas"   </c:if>
		                      <c:if test ="${fObj.status ne 'In Progress' || sessionScope.BASE_ROLE eq 'Management'  }" > readonly </c:if> value="${obj.pa }" />
							</c:if>
		                    <c:if test ="${fObj.status eq 'In Progress' }" >  <span id="preventive_actionError" class="invalid-feedback" ></span></c:if>
                    </div>
                  </div>

                <div class="col-md-2 col-12">
                    <div class="mb-1">
                      <label class="form-label active" for="itemquantity">Remarks</label>
				                   <c:if test ="${fObj.status eq 'In Progress' }" > <p>
				                  <input type="text"  id="remarks${index.count }" class=" form-control" placeholder="Remarks"
				                   <c:if test ="${fObj.status eq 'In Progress' }" >  name="remarkss" </c:if>
				                    <c:if test ="${fObj.status ne 'In Progress' || sessionScope.BASE_ROLE eq 'Management'  }" > readonly </c:if> value="${obj.remarks }" />
	                   	</c:if>                    </div>
                  </div> 

                  <div class="col-md-2 col-12">
                    <div class="mb-1">
                      <label class="form-label" for="pd-default">Target Date</label>
          				<input type="date" id="fp-default" class="form-control datepicker" name="tentative_dates" placeholder="YYYY-MM-DD" value="${obj.tentative_date }">
                    </div>
                  </div>
                   <div class="col-md-2 col-12">
                    <div class="mb-1">
                      <label class="form-label" for="pd-default">Attachment</label>
          				<input type="file" id="mediaList" name="mediaList" class="form-control" >
          				<c:if test="${not empty obj.attachment  }"> 
          				 <a target="_blank" href="<%=CommonConstants.SAFETY_FILE_SAVING_PATH_LOC%>${IRMDetails.document_code }/${fObj.approver_type }/${obj.attachment }" 
           					 ><i class="fa fa-eye"></i><span> ${obj.attachment }</span>
							                  </a>
						 <input type="hidden"  name="docs" value="${obj.attachment }" /> </c:if>
                    </div>
                  </div>

                  <div class="col-md-1 col-12 mb-50">
                    <div class="mb-1">
                      <button class="btn btn-outline-danger text-nowrap px-1" data-repeater-delete="" type="button">
                        <span class="fa fa-trash"></span>
                      </button>
                    </div>
                  </div>
                </div>
                <hr>
              </div>
		          
		          </c:forEach>
		         </c:when>
		         <c:otherwise>
		      <div data-repeater-item="">
                <div class="row d-flex align-items-end">
                  <div class="col-md-3 col-12">
                    <div class="mb-1">
                      <label class="form-label active" for="itemname">Corrective Action<span class="required"> *</span></label>
                    	 <c:if test ="${fObj.status ne 'In Progress' }" > <p > ${fObj.corrective_action }</p> </c:if>
		                   <c:if test ="${fObj.status eq 'In Progress' }" > <p> 
									<input type="text" class=" form-control"  placeholder="Corrective Action"  name="cas" 
					                  <c:if test ="${fObj.status eq 'In Progress' }" > id="corrective_action"  </c:if>
					                  <c:if test ="${fObj.status ne 'In Progress' || sessionScope.BASE_ROLE eq 'Management' }" > readonly </c:if> value="${fObj.corrective_action }" />
							</c:if>
		                  <c:if test ="${fObj.status eq 'In Progress' }" >  <span id="corrective_actionError" class="invalid-feedback" ></span></c:if>
						</div>
                  </div>

                  <div class="col-md-3 col-12">
                    <div class="mb-1">
                      <label class="form-label active" for="itemcost">Preventive Action<span class="required"> *</span></label>
                      <c:if test ="${fObj.status ne 'In Progress' }" > <p >${fObj.preventive_action }</p> </c:if>
		                   <c:if test ="${fObj.status eq 'In Progress' }" > <p>
		                     <input type="text"  class=" form-control" placeholder="Preventive Action"
		                      <c:if test ="${fObj.status eq 'In Progress' }" > id="preventive_action" name="pas"   </c:if>
		                      <c:if test ="${fObj.status ne 'In Progress' || sessionScope.BASE_ROLE eq 'Management'  }" > readonly </c:if> value="${fObj.preventive_action }" />
							</c:if>
		                    <c:if test ="${fObj.status eq 'In Progress' }" >  <span id="preventive_actionError" class="invalid-feedback" ></span></c:if>
                    </div>
                  </div>

                <div class="col-md-2 col-12">
                    <div class="mb-1">
                      <label class="form-label active" for="itemquantity">Remarks</label>
       							   <c:if test ="${fObj.status ne 'In Progress' }" > <p > ${fObj.remarks }</p> </c:if>
				                   <c:if test ="${fObj.status eq 'In Progress' }" > <p>
				                  <input type="text"  id="remarks${index.count }" class=" form-control" placeholder="Remarks"
				                   <c:if test ="${fObj.status eq 'In Progress' }" >  name="remarkss" </c:if>
				                    <c:if test ="${fObj.status ne 'In Progress' || sessionScope.BASE_ROLE eq 'Management'  }" > readonly </c:if> value="${fObj.remarks }" />
	                   	</c:if>                    </div>
                  </div> 

                  <div class="col-md-2 col-12">
                    <div class="mb-1">
                      <label class="form-label" for="pd-default">Target Date</label>
                       <input type="date" id="fp-default" class="form-control datepicker" name="tentative_dates" placeholder="YYYY-MM-DD" value="${obj.tentative_date }">
          			<!-- 	<input type="date" id="fp-default" class="form-control datepicker"  name="tentative_dates" placeholder="YYYY-MM-DD" > -->
                    </div>
                  </div>
                   <div class="col-md-2 col-12">
                    <div class="mb-1">
                      <label class="form-label" for="pd-default">Attachment</label>
          				<input type="file" id="mediaList" name="mediaList" class="form-control" >
                    </div>
                  </div>

                  <div class="col-md-1 col-12 mb-50">
                    <div class="mb-1">
                      <button class="btn btn-outline-danger text-nowrap px-1" data-repeater-delete="" type="button">
                        <span class="fa fa-trash"></span>
                      </button>
                    </div>
                  </div>
                </div>
                <hr>
              </div>
		         </c:otherwise>
		      </c:choose>
            
            </div>
            <div class="row">
              <div class="col-12">
                <button class="btn btn-icon btn-primary" type="button" data-repeater-create="">
                  <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-plus me-25"><line x1="12" y1="5" x2="12" y2="19"></line><line x1="5" y1="12" x2="19" y2="12"></line></svg>
                  <span>Add New</span>
                </button>
              </div>
            </div>
        </div>
            <c:if test="${ not empty fn:trim(fObj.sb_notes) && fObj.status eq 'In Progress'}">
             <div class="col-md-12 col-12 mb-1">
             <div class="card shadow-none bg-transparent border-danger">
		        <div class="card-body">
		          <h6 class="card-title">Send Back Notes :</h6>
		          <p class="card-text">${fObj.sb_notes }</p>
		        </div>
		      </div>
             </div>
             </c:if>
      </div>
    </div>
    <!-- /Invoice repeater -->
  </div>
</section>

        </div>

         </c:if>
          <c:if test ="${ fObj.status eq 'Reviewed' && fn:contains(fObj.approver_type, 'L1') }" >
          
          <div class="content-body">
            <section class="form-control-repeater">
			  <div class="row">
			    <div class="col-12">
			      <div class="card">
			       <div class="" style=" margin-left: 2rem;">
			       <div class="card-header" style=" margin-left: -3rem;">
			        <div class="col-md-12 col-12 mb-1">
			              <label class="form-label" for="select2-multiple1">Investigation Team</label>
			               <select class="select2 form-select" id="investigation_team" name="investigation_team"  data-placeholder="Select Users" multiple disabled >
			              <c:forEach var="obj" items="${userList}">
			              	   <option value="${obj.user_id }"  <c:if test="${  fn:contains( fObj.investigation_team, obj.user_id ) }"> selected</c:if> >
			              	  ${obj.user_name } -  ${obj.base_role } -  ${obj.base_department }</option>
			              </c:forEach>
				            </select>
				             <span id="select2-investigation_team-containerError" class="error-msg" ></span>
			          </div>
			          <h5 class="card-title">Root Cause Analysis</h5>
			        </div>
			         <div class="row">
			            <div class="col-md-3 col-4">
			              <input type="checkbox" class="form-check-input" id="ua_checkbox" onchange="displayIncidentDropdown('UA');"
			               <c:if test = "${fn:contains(fObj.incident_type, 'UA')}">
					         checked
					      </c:if>disabled
			              >
			              <label class="form-check-label" for="colorCheck5">Unsafe Act</label>
			            </div>
			             <div class="col-md-3 col-4 form-check form-check-danger">
			              <input type="checkbox" class="form-check-input" id="uc_checkbox" onchange="displayIncidentDropdown('UC');"
			              <c:if test = "${fn:contains(fObj.incident_type, 'UC')}">  checked  </c:if>disabled
			              >
			              <label class="form-check-label" for="colorCheck5">Unsafe Condition</label>
			            </div>
			             <div class="col-md-3 col-4 form-check form-check-danger mb-1"> 
			              <input type="checkbox" class="form-check-input" id="nm_checkbox" onchange="displayIncidentDropdown('NM');"
			              <c:if test = "${fn:contains(fObj.incident_type, 'Near Miss')}">
					         checked
					      </c:if>disabled
			              >
			              <label class="form-check-label" for="colorCheck5">Near Miss</label>
			            </div>
			                <div class="col-md-3 col-6 "> 
			                 <div class="mb-1">
			                   <p class="form-label fw-bold" for="select2-basic">Incident Seviourity</p><span class="required"> </span>
				        			<span class="badge badge-light-secondary">${fObj.incident_seviourity }</span>
			                </div>
			              </div>
			           </div>
					<div class="row">
				
			          <div class="col-md-4 col-12 mt-1"  id="ua_dp_toggle"
			          	<c:if test = "${empty fObj.ua_type}">   style="display : none"  </c:if>
			          >
			                 <div class="mb-1">
			                    <p class="fw-bold" for="select2-multiple1">Unsafe Act</p>
						           <c:choose>
				  					 <c:when test="${  fn:contains( fObj.ua_type, ',' ) }">
						  	                <c:set var="filesList" value="${fn:split(fObj.ua_type, ',')}" />
							                 <c:choose>
									         <c:when test ="${fn:length(filesList) gt 0}" >
									             <c:forEach var="obj" items="${filesList}">
								                <span class="">&#x2022; ${obj }</span><br>
												</c:forEach>
									         </c:when>
									         <c:otherwise>
									          <p >  <i class="fa-solid fa-file"></i> No Data Found!</p>
									         </c:otherwise>
									      </c:choose>
							      </c:when>
							       <c:otherwise>
							       <c:if test="${ not empty fn:trim(fObj.ua_type) }">
					                    <span class="">&#x2022; ${fObj.ua_type}</span>
							       </c:if>
							        <c:if test="${ empty fn:trim(fObj.ua_type) }">
							         <p > <i class="fa-solid fa-file"></i> No Data Found!</p>
							        </c:if>
							       </c:otherwise>
						       </c:choose>
			                </div>
			              </div>
			               <div class="col-md-4 col-12 mt-1"  id="uc_dp_toggle" 
			        		<c:if test = "${empty fObj.uc_type}">   style="display : none"  </c:if>
			               >
			                 <div class="mb-1">
			                    <p class="fw-bold" for="select2-multiple2">Unsafe Condition</p>
			                     <c:choose>
				  					 <c:when test="${  fn:contains( fObj.uc_type, ',' ) }">
						  	                <c:set var="filesList" value="${fn:split(fObj.uc_type, ',')}" />
							                 <c:choose>
									         <c:when test ="${fn:length(filesList) gt 0}" >
									             <c:forEach var="obj" items="${filesList}">
								                <span class="">&#x2022; ${obj }</span><br>
												</c:forEach>
									         </c:when>
									         <c:otherwise>
									          <p >  <i class="fa-solid fa-file"></i> No Data Found!</p>
									         </c:otherwise>
									      </c:choose>
							      </c:when>
							       <c:otherwise>
							       <c:if test="${ not empty fn:trim(fObj.uc_type) }">
					                    <span class="">&#x2022; ${fObj.uc_type}</span>
							       </c:if>
							        <c:if test="${ empty fn:trim(fObj.uc_type) }">
							         <p > <i class="fa-solid fa-file"></i> No Data Found!</p>
							        </c:if>
							       </c:otherwise>
						       </c:choose>
			                </div>
			              </div>
			               <div class="col-md-4 col-12 mt-1" id="nm_dp_toggle" 
			               	<c:if test = "${empty fObj.management_type}">   style="display : none"  </c:if>
			               >
			                 <div class="mb-1">
			                    <p class="fw-bold" for="select2-multiple3">Management Deficiencies</p>
			                     <c:choose>
				  					 <c:when test="${  fn:contains( fObj.management_type, ',' ) }">
						  	                <c:set var="filesList" value="${fn:split(fObj.management_type, ',')}" />
							                 <c:choose>
									         <c:when test ="${fn:length(filesList) gt 0}" >
									             <c:forEach var="obj" items="${filesList}">
								                <span class="">&#x2022; ${obj }</span><br>
												</c:forEach>
									         </c:when>
									         <c:otherwise>
									          <p >  <i class="fa-solid fa-file"></i> No Data Found!</p>
									         </c:otherwise>
									      </c:choose>
							      </c:when>
							       <c:otherwise>
							       <c:if test="${ not empty fn:trim(fObj.management_type) }">
					                    <span class="">&#x2022; ${fObj.management_type}</span>
							       </c:if>
							        <c:if test="${ empty fn:trim(fObj.management_type) }">
							         <p > <i class="fa-solid fa-file"></i> No Data Found!</p>
							        </c:if>
							       </c:otherwise>
						       </c:choose>
			                </div>
			              </div>
			          </div>
			          </div> 
			          <hr>
			          <div class="row" id="table-small">
  <div class="col-12">
    <div class="card">
      <div class="table-responsive">
        <table class="table table-sm">
          <thead>
            <tr>
              <th>Corrective Action</th>
              <th>Preventive Action</th>
              <th>Remarks</th>
              <th>Target Date</th>
              <th>Documents</th>
            </tr>
          </thead>
          <tbody>
          <c:forEach var="obj" items  = "${fObj.capaList }" varStatus ="index">
         	<tr>
              <td>${obj.ca }</td>
              <td>${obj.pa }</td>
              <td>${obj.remarks }</td>
              <td>${obj.tentative_date }</td>
              <td>
                 <c:if test="${ not empty fn:trim(fObj.attachment) }">
                   <a   download="${obj.attachment }" href="<%=CommonConstants.SAFETY_FILE_SAVING_PATH_LOC%>${IRMDetails.document_code }/${fObj.approver_type }/${obj.attachment }" 
           			 ><i class="fa fa-arrow-down"></i><span> ${obj.attachment }</span></a>
                 </c:if>
                 <c:if test="${ empty fn:trim(fObj.attachment) }">
                   <p >  <i class="fa-solid fa-file"></i> </p>
                 </c:if>
            
              </td>
            </tr>
      	  </c:forEach>
           
            
          </tbody>
        </table>
      </div>
    </div>
  </div>
</div>
<!-- Small Table end -->
			          
			      </div>
			    </div>
			    <!-- /Invoice repeater -->
			  </div>
			</section>

        </div>
         
          </c:if>
         <c:if test ="${not empty  fObj.approver_type && not fn:contains(fObj.approver_type, 'L1') }"  >
          <div class="row">
            <div class="col-md-6 col-12 mb-1">
              <label class="form-label" for="exampleFormControlTextarea1"><b>Corrective Action</b><span class="required"> *</span></label>
		               <c:if test ="${fObj.status ne 'In Progress' }" > <p > ${fObj.corrective_action }</p> </c:if>
		                   
		                   <c:if test ="${fObj.status eq 'In Progress' }" > <p> 
									<textarea class=" form-control"  rows="3"  placeholder="Corrective Action"
					                  <c:if test ="${fObj.status eq 'In Progress' }" > id="corrective_action" name="corrective_action"   </c:if>
					                  <c:if test ="${fObj.status ne 'In Progress' || sessionScope.BASE_ROLE eq 'Management' }" > readonly </c:if>>${fObj.corrective_action }</textarea>
							</c:if>
		                  <c:if test ="${fObj.status eq 'In Progress' }" >  <span id="corrective_actionError" class="invalid-feedback" ></span></c:if>
            </div>
              <div class="col-md-6 col-12 mb-1">
              <label class="form-label" for="exampleFormControlTextarea1"><b>Preventive Action</b><span class="required"> *</span></label>
		             <c:if test ="${fObj.status ne 'In Progress' }" > <p >${fObj.preventive_action }</p> </c:if>
		                   
		                   <c:if test ="${fObj.status eq 'In Progress' }" > <p>
		                      <textarea  class=" form-control" rows="3"  placeholder="Preventive Action"
		                      <c:if test ="${fObj.status eq 'In Progress' }" > id="preventive_action" name="preventive_action"   </c:if>
		                      <c:if test ="${fObj.status ne 'In Progress' || sessionScope.BASE_ROLE eq 'Management'  }" > readonly </c:if>>${fObj.preventive_action }</textarea>
							</c:if>
							
		                       <c:if test ="${fObj.status eq 'In Progress' }" >  <span id="preventive_actionError" class="invalid-feedback" ></span></c:if>
            </div>
              <div class="col-md-6 col-12 mb-1">
               <label class="form-label" for="exampleFormControlTextarea1"><b>Remarks</b><span class="required"> </span></label>
				                  <c:if test ="${fObj.status ne 'In Progress' }" > <p > ${fObj.remarks }</p> </c:if>
				                   <c:if test ="${fObj.status eq 'In Progress' }" > <p>
				                   <textarea id="remarks${index.count }" class=" form-control"  rows="3"  placeholder="Remarks"
				                   <c:if test ="${fObj.status eq 'In Progress' }" >  name="remarks" </c:if>
				                    <c:if test ="${fObj.status ne 'In Progress' || sessionScope.BASE_ROLE eq 'Management'  }" > readonly </c:if>>${fObj.remarks }</textarea>
	                   	</c:if>
            </div>
            <div class="col-md-6 col-12 mb-1">
              <label class="form-label" for="exampleFormControlTextarea1"><b>Attachments</b><span class="required"> </span></label><br>
				    <c:choose>
				         <c:when test ="${fObj.status eq 'In Progress' && sessionScope.BASE_ROLE ne 'Management'  }">
					    <c:choose>
	  					 <c:when test="${  fn:contains( fObj.attachment, ',' ) }">
			  	                <c:set var="filesList" value="${fn:split(fObj.attachment, ',')}" />
								   <c:forEach var="obj" items="${filesList}">
								     <div class="control-group" id="fields">
			                           <div class="controls">
			                               <div class="entry input-group upload-input-group">
			                                <a href="<%=CommonConstants.SAFETY_FILE_SAVING_PATH_LOC%>${IRMDetails.document_code }/${fObj.approver_type }/${obj}" class="filevalue" download ="${fObj.attachment}"><i class="fa fa-arrow-down"></i>
							                  </a>
											 <input type=file id="files${index.count }" value="${obj}" class="form-control"  name="mediaList"/>
	                                   			<c:if test="${sessionScope.USER_ID eq fObj.approver_code || sessionScope.BASE_ROLE eq 'Admin' }" >
		                                  	 <button class="btn btn-upload  btn-danger btn-remove" type="button">
		                                      <span class="fa fa-trash"></span>
		                                  	 </button>
	                                    </c:if> 
	                                    </div> 
			                           </div> 
			                       </div> 
							    </c:forEach>
							  <div class="control-group" id="fields">
	                           <div class="controls">
	                               <div class="entry input-group upload-input-group">
	                                   <input class="form-control" id="files${index.count }" name="mediaList" type="file" placeholder="choose relevent file">
	                                   <c:if test="${sessionScope.USER_ID eq fObj.approver_code || sessionScope.BASE_ROLE eq 'Admin' }" >
		                                   <button class="btn btn-upload btn-success btn-add" type="button">
		                                       <i class="fa fa-plus"></i>
		                                   </button>
	                                    </c:if> 
	                               </div>
	                           </div>
	                       </div>
											
				      </c:when>
				       <c:otherwise> 
				       <c:if test="${ not empty fn:trim(fObj.attachment) }">
				        <div class="control-group" id="fields">
	                           <div class="controls">
	                               <div class="entry input-group upload-input-group">
			        		 <input class="form-control" id="files${index.count }" name="mediaList" type="text" placeholder="choose relevent file" value="${fObj.attachment}">
	                                   <c:if test="${sessionScope.USER_ID eq fObj.approver_code || sessionScope.BASE_ROLE eq 'Admin' }" >
		                                    <button class="btn btn-upload  btn-danger btn-remove" type="button">
		                                      <span class="fa fa-trash"></span>
		                                   </button>
	                                    </c:if> 
	                                </div>
	                           </div>
	                       </div>
	                        <div class="control-group" id="fields">
	                           <div class="controls">
	                               <div class="entry input-group upload-input-group">
	                                   <input class="form-control" id="files${index.count }" name="mediaList" type="file" placeholder="choose relevent file">
	                                   <input type="hidden" id="design_file_ids" value="${fObj.attachment}"/>
								        <a href="<%=CommonConstants.SAFETY_FILE_SAVING_PATH_LOC%>${IRMDetails.document_code }/${fObj.approver_type }/${fObj.attachment}" class="filevalue" download ="${fObj.attachment}"><i class="fa fa-arrow-down"></i>
					                    <span class="fw-bold">${fObj.attachment}</span></a>
	                                   <c:if test="${sessionScope.USER_ID eq fObj.approver_code || sessionScope.BASE_ROLE eq 'Admin' }" >
		                                   <button class="btn btn-upload btn-success btn-add" type="button">
		                                       <i class="fa fa-plus"></i>
		                                   </button>
	                                    </c:if> 
	                               </div>
	                           </div>
	                       </div> 
				       </c:if>
				        <c:if test="${ empty fn:trim(fObj.attachment) }">
				          <div class="control-group" id="fields">
	                           <div class="controls">
	                               <div class="entry input-group upload-input-group">
	                                   <input class="form-control" id="files${index.count }" name="mediaList" type="file" placeholder="choose relevent file">
	                                   <c:if test="${sessionScope.USER_ID eq fObj.approver_code || sessionScope.BASE_ROLE eq 'Admin' }" >
		                                   <button class="btn btn-upload btn-success btn-add" type="button">
		                                       <i class="fa fa-plus"></i>
		                                   </button>
	                                    </c:if> 
	                               </div>
	                           </div>
	                       </div>
				        </c:if>
				       </c:otherwise>
			       </c:choose>
			         </c:when>
			         <c:otherwise>
				    <c:choose>
	  					 <c:when test="${  fn:contains( fObj.attachment, ',' ) }">
			  	                <c:set var="filesList" value="${fn:split(fObj.attachment, ',')}" />
				                 <c:choose>
						         <c:when test ="${fn:length(filesList) gt 0}" >
						             <c:forEach var="obj" items="${filesList}">
										<input type="hidden" id="design_file_ids" value="${obj}"/>
								        <a   style="  margin-left: 1.7rem;" href="<%=CommonConstants.SAFETY_FILE_SAVING_PATH_LOC%>${IRMDetails.document_code }/${fObj.approver_type }/${obj }" class="filevalue" download ="${obj}"><i class="fa fa-arrow-down"></i>
					                <span class="fw-bold">${obj }</span></a><br>
									</c:forEach>
						         </c:when>
						         <c:otherwise>
						          <p >  <i class="fa-solid fa-file"></i> No Attachments Found!</p>
						         </c:otherwise>
						      </c:choose>
				      </c:when>
				       <c:otherwise>
				       <c:if test="${ not empty fn:trim(fObj.attachment) }">
			        		<input type="hidden" id="design_file_ids" value="${fObj.attachment}"/>
					        <a href="<%=CommonConstants.SAFETY_FILE_SAVING_PATH_LOC%>${IRMDetails.document_code }/${fObj.approver_type }/${fObj.attachment}" class="filevalue" download ="${fObj.attachment}"><i class="fa fa-arrow-down"></i>
		                    <span class="fw-bold">${fObj.attachment}</span></a>
				       </c:if>
				        <c:if test="${ empty fn:trim(fObj.attachment) }">
				         <p > <i class="fa-solid fa-file"></i> No Attachments Found!</p>
				        </c:if>
				       </c:otherwise>
			       </c:choose>
				 </c:otherwise>
			   </c:choose>
            </div>
              <c:if test ="${  fn:contains(fObj.approver_type , 'L3' ) }" > <input name="level_status" value="Closed"  type="hidden"/>  </c:if>
              <c:if test ="${  fn:contains(fObj.approver_type , 'L2' ) }" >  
             		<div class="col-lg-3 col-sm-3 col-6"  >
				       <div class="col-md-12 mb-1">
				              <select class="select2 form-select" id="select2-status-container" name="level_status"  
				               <c:if test ="${fObj.status ne 'In Progress' }" > disabled </c:if>> 
				                <option value="">Select Status</option>
				                <option value="Pending" <c:if test="${fObj.level_status eq 'Pending' }">selected</c:if>>Pending</option>
				                <option value="In Progress"  <c:if test="${fObj.level_status eq 'In Progress' }">selected</c:if>>In Progress</option>
				                <option value="Closed"  <c:if test="${fObj.level_status eq 'Closed' }">selected</c:if>>Closed</option>
				              </select>
				 	   </div>
				          <h2 class="fw-bolder mt-1"></h2>
				    </div>
	                    </c:if>
            <c:if test="${ not empty fn:trim(fObj.sb_notes) && fObj.status eq 'In Progress'}">
             <div class="col-md-12 col-12 mb-1">
             <div class="card shadow-none bg-transparent border-danger">
		        <div class="card-body">
		          <h6 class="card-title">Send Back Notes :</h6>
		          <p class="card-text">${fObj.sb_notes }</p>
		        </div>
		        
		      </div>
		      
             </div>
            
             </c:if>
          </div>
         </c:if>
        </div>
      </div>
     </div>
    <div class="table-responsive">
  
      <c:if test ="${fObj.status eq 'In Progress' }" >  
      
    <script>
	    var app_type ="${IRMDetails.irmRolesList[fn:length(IRMDetails.irmIncidentsList) - 1].role_code }";
	    $('#app_type').addClass('badge rounded-pill badge-light-warning me-1');
	    if(app_type != '' && app_type.indexOf('L2') != -1 && '${IRMDetails.irmRolesList[fn:length(IRMDetails.irmIncidentsList)].employee_code}' != ''){
	       $('#app_type').html('Action Taken <br> Review Inprogress')
	    }else if(app_type != '' && !(app_type.indexOf('L1') != -1) && '${IRMDetails.irmRolesList[fn:length(IRMDetails.irmIncidentsList)].employee_code}' == ''){
	       $('#app_type').html('Review Done <br> Closure Pending')
	    }else if(app_type == ''){
	       $('#app_type').removeClass('badge rounded-pill badge-light-warning me-1');
	       $('#app_type').html('<b>No Reviewer Assigned</b>').addClass('text-danger')
	    }
    </script>
       <input type="hidden"  name="approver_type_name" value="${fObj.approver_type }"/>  
       <input type="hidden"  name="approver_type" value="${IRMDetails.irmRolesList[fn:length(IRMDetails.irmIncidentsList)].role_code }"/>  
 		<input type="hidden"  name="employee_code" value="${IRMDetails.irmRolesList[fn:length(IRMDetails.irmIncidentsList)].employee_code }"/> 
       <input type="hidden"  name="email_id" value="${IRMDetails.irmRolesList[fn:length(IRMDetails.irmIncidentsList)].email_id }"/>
       <input type="hidden"  name="incident_category" value="${IRMDetails.incident_category}"/>
       
       <input type="hidden"  name="next_level_user" value="${fObj.approver_name }"/>
       <input type="hidden"  name="approver_type_before" value="${fObj.approver_type }"/>  
       <input type="hidden"  name="employee_code_before" value="${fObj.approver_code }"/>
      <%--  <c:if test ="${empty IRMDetails.irmRolesList[fn:length(IRMDetails.irmIncidentsList)].employee_code }" >   <input type="hidden"  name="user_id" value="${fObj.user_id }"/>  </c:if> --%>
       </c:if>

  <%--   <input type="hidden"  name="project_code" value="${fObj.project_code }"/>
    <input type="hidden"  name="department_code" value="${fObj.department_code }"/> --%>
    
     <div class="">
        <div class="col-12">
              <div class="alert alert-primary" role="alert">
                <div class="py-1"><strong>REVIEWER</strong> </div>
            </div>
          <div class="row">
            <div class="col-md-4 col-12 mb-0" style=" margin-left: 2rem;">
               <c:choose>
			         <c:when test ="${not empty fObj.approver_name}">
				          <p class="text-primary"><b>Name : </b>${fObj.approver_name }</p>
	                   	  <p class="text-primary"><b>Email : </b>${fObj.email_id }</p>
			         </c:when>
			         <c:otherwise>
			           <h6 class="text-danger"><b>No Reviewer Assigned </b></h6> 
			             <p class="badge badge-light-dark">Please Assign a Reviewer for further Actions!</p>
			         </c:otherwise>
			      </c:choose>
            </div>
              <div class="col-md-6 col-12 mb-0" style="text-align: center;">
                              <c:if test ="${fObj.status eq 'In Progress' && not empty fObj.approver_name && sessionScope.USER_ID eq fObj.approver_code || sessionScope.BASE_ROLE eq 'Admin'}" >
                   <c:if test ="${fObj.status eq 'In Progress' }" >
	                <button type="button" class="btn btn-primary me-1" 
	                 <c:if test ="${fObj.status ne 'In Progress' }" >disabled</c:if>
	                 
	                  onclick="submitIRM();">
	                   <c:if test ="${not empty IRMDetails.irmRolesList[fn:length(IRMDetails.irmIncidentsList)].employee_code  }" >  
	                   	Submit Review
	                    </c:if>
	                      <c:if test ="${empty IRMDetails.irmRolesList[fn:length(IRMDetails.irmIncidentsList)].employee_code  && IRMDetails.status ne 'Resolved'}" >  
	                   	Approved
	                    </c:if>
	                  </button>
	                 <c:if test ="${fn:length(IRMDetails.irmIncidentsList) gt 1  &&  fObj.status eq 'In Progress' }" >
	                  <button type="button" class="btn btn-warning me-1"   onclick="sendBackPopUp();" title="Send Back" data-bs-toggle="modal" data-bs-target="#exampleModalCenter">
	          			 Send Back 
	          			   </button>
	                 </c:if>
	                   <a href="<%=request.getContextPath()%>/irm" class="btn btn-outline-secondary" ><i class="fa fa-arrow-left" aria-hidden="true"></i> Back</a>
	                  </c:if>
	                  </c:if>
	                  <c:if test ="${fObj.status ne 'In Progress'}" >
	                	<button type="button"  class="btn btn-success me-1" 
	                 	<c:if test ="${fObj.status ne 'In Progress' }" >disabled</c:if>>
	                   <i class="fa fa-check" aria-hidden="true"></i>
	                     <c:if test ="${empty IRMDetails.irmRolesList[fn:length(IRMDetails.irmIncidentsList)].employee_code}" >  
	                    	Resolved 
	                      </c:if>
	                       <c:if test ="${not empty IRMDetails.irmRolesList[fn:length(IRMDetails.irmIncidentsList)].employee_code }" >  
	                    	   ${fObj.status} 
	                      </c:if>
	                 
	                    
	                  </button>
	                    </c:if> 
	                   <c:if test ="${empty IRMDetails.irmRolesList[fn:length(IRMDetails.irmIncidentsList)].employee_code && fObj.status ne 'In Progress' }" >
	                  	<a href="<%=request.getContextPath()%>/irm" class="btn btn-outline-secondary" ><i class="fa fa-arrow-left" aria-hidden="true"></i> Back</a>
	                  </c:if>
	                  <c:if test ="${sessionScope.BASE_ROLE eq 'User' && fObj.status eq 'In Progress' &&  sessionScope.BASE_ROLE ne 'Admin' || sessionScope.USER_ID ne fObj.approver_code && fObj.status eq 'In Progress' &&  sessionScope.BASE_ROLE ne 'Admin'}" >
	                  	<a href="<%=request.getContextPath()%>/irm" class="btn btn-outline-secondary" ><i class="fa fa-arrow-left" aria-hidden="true"></i> Back</a>
	                  </c:if>
	               
            </div>
          </div>
      </div>
     </div>
        </div>
        </div>

         </fieldset>
      </c:forEach>
            <c:if test ="${fn:length(IRMDetails.irmIncidentsList) eq 0}">
          <div class="col-12">
 			<div class="alert alert-primary" role="alert">
                <div class="py-1"><strong>REVIEWER</strong> </div>
            </div>
	   </div>
	   <div class="row">
            <div class="col-md-12 col-12 mb-0" style=" margin-left: 2rem;">
 				<h6 class="text-danger"><b>No Reviewer Assigned </b></h6> 
			        <p class="badge badge-light-dark">Please Assign a Reviewer for further Actions!</p>
			</div>
			<div class="col-md-12 col-12 mb-0" style="text-align:center;">
 				<a href="<%=request.getContextPath()%>/irm" class="btn btn-outline-secondary" ><i class="fa fa-arrow-left" aria-hidden="true"></i> Back</a>
			</div>
     </div>
		</c:if>
        <!-- Invoice Description ends -->

        <hr class="invoice-spacing" />
<!-- 
        Invoice Note starts
        <div class="card-body invoice-padding pt-0">
          <div class="row">
            <div class="col-12">
   				<div class="col-12" style="text-align: center;">
	                <button type="button" class="btn btn-primary me-1" onclick="submitIRM();">Reviewed</button>
	                <a href="" class="btn btn-outline-secondary" onclick="irmForm.reset();">Go back</a>
                </div>
            </div>
          </div>
        </div> -->
        <!-- Invoice Note ends -->
      </div>
        </fieldset >
        		<div
                class="modal fade"
                id="exampleModalCenter"
                tabindex="-1"
                aria-labelledby="exampleModalCenterTitle"
                aria-hidden="true"
              >
                <div class="modal-dialog modal-dialog-centered">
                  <div class="modal-content">
                    <div class="modal-header">
                      <h5 class="modal-title" id="exampleModalCenterTitle">Send Back</h5>
                      <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                     <div class="row">
                     	<input type="hidden" name="ca_before" value="${IRMDetails.irmIncidentsList[fn:length(IRMDetails.irmIncidentsList) - 2].corrective_action }" />
                      	<input type="hidden" name="pa_before" value="${IRMDetails.irmIncidentsList[fn:length(IRMDetails.irmIncidentsList) - 2].preventive_action }" />
                       	<input type="hidden" name="remarks_before" value="${IRMDetails.irmIncidentsList[fn:length(IRMDetails.irmIncidentsList) - 2].remarks }" />
                        <input type="hidden" name="doc_before" value="${IRMDetails.irmIncidentsList[fn:length(IRMDetails.irmIncidentsList) - 2].attachment }" />
                        <input type="hidden" name="type_prevs" value="${IRMDetails.irmIncidentsList[fn:length(IRMDetails.irmIncidentsList) - 2].approver_type }" />
                        <input type="hidden" name="approver_prvs" value="${IRMDetails.irmIncidentsList[fn:length(IRMDetails.irmIncidentsList) - 2].approver_code }" />
			            <div class="col-12">
			              <div class="mb-1">
			                <label class="form-label" for="exampleFormControlTextarea1">Add Comments<span class="required"> *</span></label>
			                <textarea class="form-control" id="exampleFormControlTextarea1" name="sb_notes" rows="3" placeholder="Comments" onkeyup="checkLength(this)"></textarea>
			              </div>
			               <span id="exampleFormControlTextarea1Error" class="invalid-feedback" ></span>
			            </div>
			           
			          </div>
                    </div>
                    <div class="modal-footer">
                      <button type="button"  onclick="sendBackIRM();" id="dBtn" disabled class="btn btn-primary" >Send Back</button>
                    </div>
                  </div>
                </div>
              </div>
      </form>
    </div>
    <!-- /Invoice -->

    <!-- Invoice Actions -->
    <div class="col-xl-2 col-md-4 col-12 invoice-actions mt-md-0 mt-2">
      <div class="card">
        <div class="card-body">

          <a class="btn btn-outline-secondary w-100 mb-75"  onclick="printDiv('printableArea')" class="noPrint"><i class="fa fa-print"></i> Print</a>

        </div>
      </div>
    </div>
    <!-- /Invoice Actions -->
  </div>
</section>
	
<!-- Send Invoice Sidebar -->


        </div>
      </div>
    </div>
    <!-- END: Content-->

<!-- Basic Floating Label Form section end -->
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
        <script src="/reisp/resources/vendors/js/forms/repeater/jquery.repeater.min.js"></script>
    
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
 <script src="/reisp/resources/js/materialize-v.1.0.min.js"  ></script>
    <script src="/reisp/resources/js/jquery-validation-1.19.1.min.js"  ></script>
    <script src="/reisp/resources/js/jquery.dataTables-v.1.10.min.js"  ></script>
     <script src="/reisp/resources/js/datetime-moment-v1.10.12.js"  ></script>
         <script src="/reisp/resources/js/dataTables.material.min.js"  ></script>
      <script src="/reisp/resources/js/moment-v2.8.4.min.js"  ></script>
    <!-- BEGIN: Theme JS-->
    <script src="/reisp/resources/js/core/app-menu.min.js"></script>
    <script src="/reisp/resources/js/core/app.min.js"></script>
    <script src="/reisp/resources/js/scripts/customizer.min.js"></script>
        <script src="/reisp/resources/js/scripts/forms/form-repeater.min.js"></script>
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
      <script src="/reisp/resources/js/scripts/extensions/ext-component-blockui.js"></script> 
      
       <script src="/reisp/resources/vendors/js/pickers/pickadate/picker.js"></script>
    <script src="/reisp/resources/vendors/js/pickers/pickadate/picker.date.js"></script>
    <script src="/reisp/resources/vendors/js/pickers/pickadate/picker.time.js"></script>
    <script src="/reisp/resources/vendors/js/pickers/pickadate/legacy.js"></script>
    <script src="/reisp/resources/vendors/js/pickers/flatpickr/flatpickr.min.js"></script>
    
        <script src="/reisp/resources/js/scripts/forms/pickers/form-pickers.min.js"></script>
    

    <!-- END: Page JS-->
    
  <form action="<%=request.getContextPath()%>/export-company" name="exportIRMForm" id="exportIRMForm" target="_blank" method="post">	
      
        <input type="hidden" name="company_code" id="exportIRM_filter" />
        <input type="hidden" name="status" id="exportStatus_filter" />
	</form>
    <script>
      $(window).on("load",(function(){
    	  
          if (feather) {
            feather.replace({ width: 14, height: 14 });
          }
          $('.modal').modal({ dismissible: false });
    
          if('${sessionScope.BASE_ROLE}' != 'User'){
        	  $('#irmForm').children(':input').attr('disabled', 'disabled');
          }
          //getIRMList();
         }));
      document.getElementById("currentYear").innerHTML = new Date().getFullYear();
      
      function clearFilter(){
		    	$("#select2-company_filter-container").val("");
		    	$("#select2-status_filter-container").val("");
		    	window.location.href="<%=request.getContextPath()%>/company";
	    }
      
      function getIRMFilterList() {
	        var company_code = $("#select2-company_filter-container").val();
	        var status = $("#select2-status_filter-container").val();
	        if ($.trim(company_code) =="") {
	        	$("#select2-company_filter-container option:not(:first)").remove();
	        	var myParams = { company_code: company_code, status: status };
	            $.ajax({
	                url:"<%=request.getContextPath()%>/ajax/getIRMFilterList",
	                data: myParams, cache: false,async: false,
	                success: function (data) {
	                    if (data.length > 0) {
	                        $.each(data, function (i, val) {
	                             $("#select2-company_filter-container").append('<option value="' + val.company_code + '">'+"["+$.trim(val.company_code) +" ]"+" -" + $.trim(val.company_name) +'</option>');
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
	        if ($.trim(status) =="") {
	        	$("#select2-status_filter-container option:not(:first)").remove();
	        	var myParams = { company_code: company_code, status: status };
	            $.ajax({
	                url:"<%=request.getContextPath()%>/ajax/getStatusFilterList",
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
	     	 $("#exportIRMForm").submit();
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
		      if(status != null && status != ''  && status !="undefined"){
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
	        	//document.getElementById("irmForm").submit();	
	    	}
	    }
	    var validator =	$('#irmForm').validate({
		   	 errorClass:"my-error-class is-invalid",
		   	 validClass:"my-valid-class is-valid",
		   	 ignore:":hidden:not(.select2 form-select)",
		   		    rules: {
		   		 		 "corrective_action": {
		   			 			required: true
		   			 	  },"preventive_action": {										
		   			 			required: true
		   			 	  }, "ua_type": {
		   			 		  required:"#ua_checkbox:checked"
		   			 	  },"uc_type": {
		   			 		  required:"#uc_checkbox:checked"
		   			 	  },"management_type": {
		   			 		  required:"#nm_checkbox:checked"
		   			 	  },"incident_seviourity": {										
		   			 			required: true
		   			 	  }
		   		 	},
		   		    messages: {
		   		 			"corrective_action": {
		   				 	required: 'Required',
		   			 	  },"preventive_action": {
		   			 		required: 'Required'
		   			 	  },"ua_type": {
		   			 		required: 'Required'
		   			 	  },"uc_type": {
		   			 		required: 'Required'
		   			 	  },"management_type": {
		   			 		required: 'Required'
		   			 	  },"incident_seviourity": {
		   			 		required: 'Required'
		   			 	  }
		      		},
		      		errorPlacement:function(error, element){
		      		 	if (element.attr("id") =="corrective_action" ){
		   				 document.getElementById("corrective_actionError").innerHTML="";
		   		 		 error.appendTo('#corrective_actionError');
		   			}else if(element.attr("id") =="preventive_action" ){
		   			   document.getElementById("preventive_actionError").innerHTML="";
		   		 	   error.appendTo('#preventive_actionError');
		   			}else if(element.attr("id") =="ua_dp" ){
			   			   document.getElementById("select2-ua_dp-containerError").innerHTML="";
			   		 	   error.appendTo('#select2-ua_dp-containerError');
			   		}else if(element.attr("id") =="uc_dp" ){
			   			   document.getElementById("select2-uc_dp-containerError").innerHTML="";
			   		 	   error.appendTo('#select2-uc_dp-containerError');
			   		}else if(element.attr("id") =="nm_dp" ){
			   			   document.getElementById("select2-nm_dp-containerError").innerHTML="";
			   		 	   error.appendTo('#select2-nm_dp-containerError');
			   		}else if(element.attr("id") =="select2-risk_type-container" ){
			   			   document.getElementById("select2-incident_seviourity-containerError").innerHTML="";
			   		 	   error.appendTo('#select2-incident_seviourity-containerError');
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
	   /*  $.validator.addMethod("requiredIfChecked", function (val, ele, arg) {
	        if ($("#ua_checkbox").is(":checked") && ($.trim(val) == '')) { return false; }
	        return true;
	    }, "Required "); */

	    function sendBackIRM(){
	    		 $('#exampleModalCenter').modal('hide');
	        	document.getElementById("irmForm").submit();	
	    }
	  
	   	$('.select2Form').change(function(){
	   	    if ($(this).val() !=""){
	   	        $(this).valid();
	   	    }
	   	});
	   	
	   	$('input').change(function(){
	   	    if ($(this).val() !=""){
	   	        $(this).valid();
	   	    }
	   	});
	   	
	   	function getDeptAndLocationList(project){
	   		getDepartmentList(project);
	   		getLocationList(project);
	   	}
	   	
	    function getDepartmentList(Project) {
		        if ($.trim(Project) !="") {
		        	$("#select2-department_code-container option:not(:first)").remove();
		        	var myParams = { project: Project };
		            $.ajax({
		                url:"<%=request.getContextPath()%>/ajax/getDepartments",
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
	        if ($.trim(Project) !="") {
	        	$("#select2-location-container option:not(:first)").remove();
	        	var myParams = { project_code: Project };
	            $.ajax({
	                url:"<%=request.getContextPath()%>/ajax/getLocations",
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
	    	$("#approverForIncident").html('Not Assigned').css("color","orange");
	    	var project_code = $("#select2-project_code-container").val();
	    	var department_code = $("#select2-department_code-container").val();
	        if ($.trim(project_code) !="" && $.trim(department_code) !="" ) {
	        	var myParams = { project_code: project_code,department_code : department_code };
	            $.ajax({
	                url:"<%=request.getContextPath()%>/ajax/getRoleMappingforIRMForm",
	                data: myParams, cache: false,async: false,
	                success: function (data) {
	                    if (data.length > 0) {
	                        $.each(data, function (i, val) {
	                        	if($.trim(val.user_name) != ''){
	                        		$("#approverForIncident").html(val.user_name).css("color","#05f305").append('&nbsp; <i class="fa fa-check" aria-hidden="true"></i>');
	                        		$("#approver_code").val(val.user_id);
	                        		$("#approver_type").val(val.role_code);
	                        		$("#email_id").val(val.email_id);
	                        		$("#approver_name").val(val.user_name);
	                        	}else{
	                        		 $("#approver_code").val(null);
	                        		 $("#approver_type").val("No Approver Assigned");
	                        		 $("#approverForIncident").html('No Approver Found').css("color","red");
	                        	}
	                        });
	                    }else{
	                    	  $("#approverForIncident").html('No Approver Found').css("color","red");
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
        });
	    function showFrom(incident){
	    	if(incident != ''){
	    		 $("#irmForm")[0].reset();
	    		 $("#select2-project_code-container").val('').trigger('change');
	    		 $("#select2-department_code-container").val('').trigger('change');
	    		 $("#select2-location-container").val('').trigger('change');
	    		 $("#select2-ptw_code-container").val('').trigger('change');
	    		 $("#select2-risk_type-container").val('').trigger('change');
		    	 $('#showOnIncidentSelect').css("display","block");
		    	 $('#incident_type').val(incident)
	    		 $("#approverForIncident").html('Not Assigned').css("color","orange");
		    	 var incident_name = $('#select2-irm_type-container').find(":selected").text();
		    	 $('#incident_name').val(incident_name)
		    	 $('#incidentValue').html(incident_name+" Form").css("text-transform","uppercase");
	    	}else{
	    		 $('#showOnIncidentSelect').css("display","none");
	    	}
	    }
	    
	    function printDiv(divName) {
	        var printContents = document.getElementById(divName).innerHTML;
	        var originalContents = document.body.innerHTML;
	        document.body.innerHTML = printContents;
	        window.print();
	        document.body.innerHTML = originalContents;
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

        $('.datepicker').live("click", function() {
            $(this).datepicker({
                changeMonth: true,
                changeYear: true,
                gotoCurrent: true,
                dateFormat: 'yy-mm-dd',
                yearRange: '1980:c',
                defaultDate: '-10y'
            }).datepicker('show');
        });
    
    function displayIncidentDropdown(button){
    	if(button == 'UA'){
    		if($('#ua_checkbox').is(":checked")){
    			$('#ua_incident').val('UA');
    			$('#ua_dp_toggle').css('display','block');
    		}else{
    			$('#ua_incident').val('');
    			$('#ua_dp_toggle').css('display','none');
    		}
    	}else if(button == 'UC'){
    		if($('#uc_checkbox').is(":checked")){
    			$('#uc_incident').val('UC');
    			$('#uc_dp_toggle').css('display','block');
    		}else{
    			$('#uc_incident').val('');
    			$('#uc_dp_toggle').css('display','none');
    		}
    	}else if(button == 'NM'){
    		if($('#nm_checkbox').is(":checked")){
    			$('#nm_incident').val('Near Miss');
        		$('#nm_dp_toggle').css('display','block');
    		}else{
    			$('#nm_incident').val('');
        		$('#nm_dp_toggle').css('display','none');
    		}
    	}else{
    		$('#ua_dp_toggle').css('display','none');
    		$('#uc_dp_toggle').css('display','none');
    		$('#nm_dp_toggle').css('display','none');
    	}
    	
    }
function checkLength(val){
	 var len = val.value.length;
	  if (len >= 500) {
		  $('#dBtn').attr('disabled', true);
	  }else if(len == 0){
		  $('#dBtn').attr('disabled', true);
	  } else{
		  $('#dBtn').removeAttr('disabled');
	  }
	  
}

    </script>
  </body>
  <!-- END: Body-->

<!-- Mirrored from pixinvent.com/demo/vuexy-html-bootstrap-admin-template/html/ltr/horizontal-menu-template/dashboard-analytics.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 07 Aug 2022 05:36:10 GMT -->
</html>
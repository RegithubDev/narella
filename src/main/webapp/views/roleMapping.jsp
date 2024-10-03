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
</style>
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=0,minimal-ui">
    <meta name="description" content="Safety admin is super flexible, powerful, clean &amp; modern responsive bootstrap 4 Company with unlimited possibilities.">
    <meta name="keywords" content="admin template,Company, Safety admin template, dashboard template, flat admin template, responsive admin template, web app">
    <meta name="author" content="PIXINVENT">
  <title>Role Mapping</title>
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
                <h2 class="content-header-title float-start mb-0">Role Mapping </h2>
                <div class="breadcrumb-wrapper">
                  <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="<%=request.getContextPath() %>/home">Home</a>
                    </li>
                    <li class="breadcrumb-item">Masters
                    </li>
                    <li class="breadcrumb-item active">Role Mapping
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
<div class="col-lg-6 col-sm-6 col-12"  style="box-sizing:border-box; display:table;">


	<div class="col-lg-12 col-sm-6 col-12"  style="box-sizing:border-box; display:table;">
		  <div class="col-lg-3 col-sm-3 col-6"  style="padding: 1rem;display:table-cell;">
	       <div class="col-md-12 mb-1">
	              <select class="select2 form-select" id="select2-project-filter-container"  >
	                <option value="">Select Project</option>
	              </select>
	 	   </div>
	          <h2 class="fw-bolder mt-1"></h2>
	   	 </div>
	      <div class="col-lg-3 col-sm-3 col-6"  style="padding: 1rem;display:table-cell;">
	       <div class="col-md-12 mb-1">
	              <select class="select2 form-select" id="select2-department_filter-container">
	                <option value="">Select Department</option>
	              </select>
	 	   </div>
	          <h2 class="fw-bolder mt-1"></h2>
	    </div>

	</div>
	<div class="col-lg-12 col-sm-6 col-12"  style="box-sizing:border-box; display:table;">
		 
	      <div class="col-lg-3 col-sm-3 col-6"  style="padding: 1rem;display:table-cell;">
	       <div class="col-md-12 mb-1">
	              <select class="select2 form-select" id="select2-roles_filter-container">
	                 <option value="">Select Employee Code</option>
	                
	              </select>
	 	   </div>
	          <h2 class="fw-bolder mt-1"></h2>
	    </div>
	  <div class="col-lg-3 col-sm-3 col-6"  style="padding: 1rem;display:table-cell;">
       <div class="col-md-12 mb-1">
              <select class="select2 form-select" id="select2-incident-filter-container" >
               <option value="">Select Incident Type</option>
              </select>
 	   </div>
          <h2 class="fw-bolder mt-1"></h2>
    </div>
	</div>
</div>
<div class="col-lg-2 col-sm-2 col-12"  style="box-sizing:border-box; display:table;">
    <div class="col-lg-3 col-sm-3 col-6"  style="padding: .5rem;display:table-cell; ">
     <button class="btn btn-primary col-md-12" style="margin-top: 10px; width: 45%;     background-color: gainsboro"  onclick="getRolemappingList();"><i class="fa fa-search" aria-hidden="true"></i></button>
         <button class="btn btn-primary col-md-12" style="margin-top: 10px; width: 45%;     background-color: gainsboro"  onclick="clearFilter();"><i class="fa fa-undo" aria-hidden="true"></i></button>
     </div>
</div>


  <div class="col-lg-4 col-sm-4 col-12"style="
    display: flex;
    align-items: end;
">
    <div class="col-lg-4 col-sm-6 col-6">
    <button type="button" class="btn "  onclick="addBox();" data-bs-toggle="modal" data-bs-target="#addCompany"style="margin-top: 17px; color: white !important; background-color: orange !important; width: 42%;"><i class="fa fa-plus" aria-hidden="true"></i></button>
         <button class="btn col-md-12" style="margin-top: 17px; width: 42%;     background-color: #14e014 !important;color: white !important;"  onclick="exportCompany();"><i class="fa fa-download" aria-hidden="true"></i></button>
     </div>
  
  </div>
     
</div> 
<%--   <div class="row match-height" style=" display: flex;  justify-content: left ">
    <!-- Greetings Card starts -->

    <!-- Greetings Card ends -->
    <!-- Subscribers Chart Card starts -->

    <div class="col-lg-3 col-sm-3 col-6">
      <div class="card">
        <div class="card-header flex-column align-items-start pb-0">
          <div class="avatar bg-light-primary p-50 m-0">
            <div class="avatar-content">
              <i data-feather="users" class="font-medium-5"></i>
            </div>
          </div>
          <h3 class="fw-bolder mt-1"><span id= "allProjects">${sessionScope.ALL_COMPANIES}</span></h3>
          <p class="card-text">Total Projects</p>
        </div>
      </div>
    </div>
    <!-- Subscribers Chart Card starts -->
    <div class="col-lg-3 col-sm-3 col-6">
      <div class="card">
        <div class="card-header flex-column align-items-start pb-0">
          <div class="avatar bg-light-primary p-50 m-0">
            <div class="avatar-content">
              <i data-feather="zap" class="font-medium-5"></i>
            </div>
          </div>
          <h3 class="fw-bolder mt-1"><span id= "activeProjects">${sessionScope.ACTIVE_COMPANIES}</span></h3>
          <p class="card-text">Active Projects</p>
        </div>
      </div>
    </div>
    <!-- Subscribers Chart Card ends -->

    <!-- Orders Chart Card starts -->
    <div class="col-lg-3 col-sm-3 col-6">
      <div class="card">
        <div class="card-header flex-column align-items-start pb-0">
          <div class="avatar bg-light-warning p-50 m-0">
            <div class="avatar-content">
              <i data-feather="zap-off" class="font-medium-5"></i>
            </div>
          </div>
          <h3 class="fw-bolder mt-1"><span id= "inActiveProjects">${sessionScope.INACTIVE_COMPANIES}</span></h3>
          <p class="card-text">Inactive Projects</p>
        </div>
      </div>
    </div>
    
    <!-- Orders Chart Card ends -->
  </div> --%>
  <!-- List DataTable -->
  <div>
  	
  </div>
  <div class="row">
  
    <div class="col-12">
    
      <div class="card invoice-list-wrapper">
        <div class="card-datatable table-responsive">
       <div class="dt-buttons" style="height : 0.5em;">
      
        </div>
          <table id="datatable-company" class="invoice-list-table table is-zebra w-full text-left">
            <thead>
              <tr>
                <th>#</th>
                <th>Action</th>
                 <th>Status</th>
                <th>Project</th>
                <th class="text-truncate">Department</th>
                  <th>Level</th>
                <th>Employee code</th>
              
              </tr>
            </thead>
          </table>
        </div>
      </div>
    </div>
  </div>
  <!--/ List DataTable -->
  




  																				 <!--  model -->
    
<div class="modal fade" id="addCompany" tabindex="-1" aria-hidden="true">
  <div class="modal-dialog modal-lg modal-dialog-centered modal-edit-user">
    <div class="modal-content">
      <div class="modal-header bg-transparent">
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body pb-5 px-sm-5 pt-50">
        <div class="text-center mb-2">
          <h1 class="mb-1">Add Role Mapping</h1>
        </div>
        <form id="addCompanyForm" class="row gy-1 pt-75" action="<%=request.getContextPath() %>/add-role-mapping" method="post" class="form-horizontal" role="form" >
		<input type="hidden" name="email_id" id="email"  />
		<div class="col-12 col-md-6">
            <label class="form-label" for="select2-basic">Project</label><span class="required"> *</span>
            <select 
              id="select2-project_add-container"
              name="project"
              class="select2 form-select formSelect"
              aria-label="Default select example" onchange="filterRoles_add(); deptFilter();"
            >
              <option value="">Select Project</option>
             	<c:forEach var="obj" items="${projectsList}">
					<option value="${obj.project_code }" >[${obj.project_code }] - ${obj.project_name }</option>
				</c:forEach>
            </select>
             <span id="select2-project_add-containerError" class="error-msg" ></span>
          </div>
          <div class="col-12 col-md-6">
            <label class="form-label" for="select2-basic">Department</label><span class="required"> *</span>
            <select 
              id="select2-department_code_add-container"
              name="department_code"
              class="select2 form-select formSelect"
              aria-label="Default select example"  onchange="filterRoles_add();"
            >
              <option value="">Select Department</option>
             	<%-- <c:forEach var="obj" items="${deptList}">
					<option value="${obj.department_code }" >[${obj.department_code }] - ${obj.department_name }</option>
				</c:forEach> --%>
            </select>
             <span id="select2-department_code_add-containerError" class="error-msg" ></span>
          </div>

	   <div class="col-12 col-md-6">
            <label class="form-label" for="select2-basic">Incident Type</label><span class="required"> *</span>
            <select 
              id="select2-safety_type_add-container"
              name="safety_type"
              class="select2 form-select formSelect"
              aria-label="Default select example" onchange="filterRoles_add();"
            >
             <option value="">Select Incident Type</option>	   
					<option value="AC">Accident</option>	  
					<option value="NM">Near Miss</option>	
					<option value="UA">Unsafe Act</option>	
					<option value="UC">Unsafe Condition</option>
                
               <!--   <option value="HA">Hazard</option> -->
              
            </select>
             <span id="select2-safety_type_add-containerError" class="error-msg" ></span>
          </div>
   		  <div class="col-12 col-md-6">
            <label class="form-label" for="select2-basic">Roles</label><span class="required"> *</span>
            <select 
              id="select2-roles_add-container"
              name="role_code"
              class="select2 form-select formSelect"
              aria-label="Default select example"
            >
              <option value="">Select Roles</option>
             
            </select>
             <span id="select2-roles_add-containerError" class="error-msg" ></span>
          </div>
          
          
         <div class="col-12 col-md-6">
            <label class="form-label" for="select2-basic">Employees List</label><span class="required"> *</span>
            <select 
              id="select2-employee_code_add-container"
              name="employee_code"
              class="select2 form-select formSelect"
              aria-label="Default select example"  onchange="setEmail();"
            >
              <option value="">Select Employees</option>
             	<c:forEach var="obj" items="${empList}">
					<option email ="${obj.email_id }" value="${obj.user_id }" >[${obj.user_id }] - ${obj.user_name }</option>
				</c:forEach>
            </select>
             <span id="select2-employee_code_add-containerError" class="error-msg" ></span>
          </div>
          <div class="col-12 col-md-6">
            <label class="form-label" for="select2-basic">Status</label><span class="required"> *</span>
            <select 
              id="select2-status_add-container"
              name="status"
              class="select2 form-select formSelect"
              aria-label="Default select example" 
            >
              <option value="">Select Status</option>
             	<option value="Active" >Active</option>
             	<option value="Inactive" >Inactive</option>
            </select>
             <span id="select2-status_add-containerError" class="error-msg" ></span>
          </div>
          <div class="col-12 text-center mt-2 pt-50">
            <button type="submit" class="btn btn-primary me-1" onclick="addCompany();">Add</button>
            <button type="reset" class="btn btn-outline-secondary" data-bs-dismiss="modal" aria-label="Close">
              Discard
            </button>
          </div>
        </form>
      </div>
    </div>
  </div>
</div>
 																					<!--  model end -->
 
  																				 <!-- Update model -->
    
<div class="modal fade" id="updateCompany" tabindex="-1" aria-hidden="true">
  <div class="modal-dialog modal-lg modal-dialog-centered modal-edit-user">
    <div class="modal-content">
      <div class="modal-header bg-transparent">
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body pb-5 px-sm-5 pt-50">
        <div class="text-center mb-2">
          <h1 class="mb-1">Edit Company</h1>
        </div>
        <form id="updateCompanyForm" class="row gy-1 pt-75" action="<%=request.getContextPath() %>/update-role-mapping" method="post" class="form-horizontal" role="form" >
        <input type="hidden" id="id" name="id" />
				<div class="col-12 col-md-6">
            <label class="form-label" for="select2-basic">Project</label><span class="required"> *</span>
         <%--    <select 
              id="select2-project_edit-container"
              name="project"
              class="select2 form-select formSelect"
              aria-label="Default select example" 
            >
              <option value="">Select Project</option>
             	<c:forEach var="obj" items="${projectsList}">
					<option value="${obj.project_code }" >[${obj.project_code }] - ${obj.project_name }</option>
				</c:forEach>
            </select> --%>
             <input
              type="text"
              id="select2-project_edit-container"
              name="project"
              class="form-control"
              placeholder="eg : Re Sustainablity"
              value=""
              readonly
            />
             <span id="select2-project_edit-containerError" class="error-msg" ></span>
          </div>
          <div class="col-12 col-md-6">
            <label class="form-label" for="select2-basic">Department</label><span class="required"> *</span>
          <%--   <select 
              id="select2-department_code_edit-container"
              name="department_code"
              class="select2 form-select formSelect"
              aria-label="Default select example" 
            >
              <option value="">Select Department</option>
             	<c:forEach var="obj" items="${deptList}">
					<option value="${obj.department_code }" >[${obj.department_code }] - ${obj.department_name }</option>
				</c:forEach>
            </select> --%>
             <input
              type="text"
              id="select2-department_code_edit-container"
              name="department_code"
              class="form-control"
              placeholder="eg : Re Sustainablity"
              value=""
              readonly
            />
             <span id="select2-department_code_edit-containerError" class="error-msg" ></span>
          </div>

	   <div class="col-12 col-md-6">
            <label class="form-label" for="select2-basic">Incident Type</label><span class="required"> *</span>
        <!--     <select 
              id="select2-safety_type_edit-container"
              name="safety_type"
              class="select2 form-select formSelect"
              aria-label="Default select example" onchange="filterRoles_edit(this.value);"
            >
              <option value="">Select Incident</option>
               <option value="UA">Unsafe Act</option>
                 <option value="UC">Unsafe Condition</option>
                 <option value="NM">Near Miss</option>
                 <option value="HA">Hazard</option>
              
            </select> -->
            <input
              type="text"
             id="select2-safety_type_edit-container"
              name="safety_type"
              class="form-control"
              placeholder="eg : Re Sustainablity"
              value=""
              readonly
            />
             <span id="select2-safety_type_edit-containerError" class="error-msg" ></span>
          </div>
   		  <div class="col-12 col-md-6">
            <label class="form-label" for="select2-basic">Roles</label><span class="required"> *</span>
              <input
              type="text"
              id="select2-roles_edit-container"
              name="role_code"
              class="form-control"
              placeholder="eg : Re Sustainablity"
              value=""
              readonly
            />
           <!--  <select 
              id="select2-roles_edit-container"
              name="role_code"
              class="select2 form-select formSelect"
              aria-label="Default select example"
            >
              <option value="">Select Roles</option>
             
            </select> -->
             <span id="select2-roles_edit-containerError" class="error-msg" ></span>
          </div>
         <div class="col-12 col-md-6">
            <label class="form-label" for="select2-basic">Employees List</label><span class="required"> *</span>
            <select disabled
              id="select2-employee_code_edit-container"
              name="employee_code"
              class="select2 form-select formSelect"
              aria-label="Default select example" 
            >
              <option value="">Select Employees</option>
             	<c:forEach var="obj" items="${empList}">
					<option value="${obj.user_id }" >[${obj.user_id }] - ${obj.user_name }</option>
				</c:forEach>
            </select>
             <span id="select2-employee_code_edit-containerError" class="error-msg" ></span>
          </div>
               <div class="col-12 col-md-6">
            <label class="form-label" for="select2-basic">Status</label><span class="required"> *</span>
            <select 
              id="select2-status_edit-container"
              name="update_status"
              class="select2 form-select formSelect"
              aria-label="Default select example"   onchange = "mappingUserSecurity();"
            >
              <option value="">Select Status</option>
             	<option value="Active" >Active</option>
             	<option value="Inactive" >Inactive</option>
            </select>
             <span id="select2-status_edit-containerError" class="error-msg" ></span>
          </div>
           <div class="col-12 col-md-12">
             <span id="mappingError" class="badge badge-light-danger" ></span>
          </div>
          <div class="col-12 text-center mt-2 pt-50">
            <button type="submit" class="btn btn-primary me-1" onclick="updateCompany();" id="uBtn">Update</button>
            <button type="reset" class="btn btn-outline-secondary" data-bs-dismiss="modal" aria-label="Close">
              Discard
            </button>
          </div>
        </form>
      </div>
    </div>
  </div>
</div>
 																					<!--  model end -->		
 																					
 																					
 																					
 										
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
    <!-- END: Page JS-->
    
  <form action="<%=request.getContextPath()%>/export-role-mapping" name="exportCompanyForm" id="exportCompanyForm" target="_blank" method="post">	
      
        <input type="hidden" name="structure_type_fk" id="exportStructure_type_fk" />
        <input type="hidden" name="drawing_type_fk" id="exportDrawing_type_fk" />
	</form>
    <script>
      $(window).on("load",(function(){
    	  
          if (feather) {
            feather.replace({ width: 14, height: 14 });
          }
          $('.modal').modal({ dismissible: false });
          getRolemappingList();
         }));
      document.getElementById("currentYear").innerHTML = new Date().getFullYear();
      
      function clearFilter(){
		    	$("#select2-project-filter-container").val("");
		    	$("#select2-roles_filter-container").val("");
		    	window.location.href= "<%=request.getContextPath()%>/role-mapping";
	    }
      
      function setEmail(){
    	  var userId = $("#select2-employee_code_add-container").val();
    	  if(userId != ''){
    		 var email = $("#select2-employee_code_add-container").find('option:selected').attr('email')
    		 $('#email').val(email)
    	  }
      }
      function deptFilter(){
    	  var project = $("#select2-project_add-container").val();
    	    if ($.trim(project) != "" ) {
	        	$("#select2-department_code_add-container option:not(:first)").remove();
	        	var myParams = {project: project};
	            $.ajax({
	                url: "<%=request.getContextPath()%>/ajax/getFilteredDeptList",
	                data: myParams, cache: false,async: false,
	                success: function (data) {
	                    if (data.length > 0) {
	                        $.each(data, function (i, val) {
		                      $("#select2-department_code_add-container").append('<option  value="' + val.department_code + '">'+$.trim(val.department_name) +'</option>');
	                    	});
	                     }           
	                    },error: function (jqXHR, exception) {
	    	   			      $(".page-loader").hide();
	       	          	  getErrorMessage(jqXHR, exception);
	       	     	  }
	            });
	        }
      }
      function filterRoles_add(){
    	    var project = $("#select2-project_add-container").val();
	        var department_code = $("#select2-department_code_add-container").val();
	        var type = $("#select2-safety_type_add-container").val();
	        if ($.trim(type) != "" && $.trim(project) != "" && $.trim(department_code) != "") {
	        	$("#select2-roles_add-container option:not(:first)").remove();
	        	var myParams = {safety_type: type,project: project,department_code: department_code };
	            $.ajax({
	                url: "<%=request.getContextPath()%>/ajax/getFilteredRolesList",
	                data: myParams, cache: false,async: false,
	                success: function (data) {
	                    if (data.length > 0) {
	                        $.each(data, function (i, val) {
		                      $("#select2-roles_add-container").append('<option  value="' + val.role_code + '">'+$.trim(val.role_code) +'</option>');
	                    	});
	                     }           
	                    },error: function (jqXHR, exception) {
	    	   			      $(".page-loader").hide();
	       	          	  getErrorMessage(jqXHR, exception);
	       	     	  }
	            });
	        }
      }

      function filterRoles_edit(type){
    	    var project = $("#select2-project_edit-container").val();
	        var department_code = $("#select2-department_code_edit-container").val();
	        var type = $("#select2-safety_type_add-container").val();
	        if ($.trim(type) != "") {
	        	$("#select2-roles_edit-container option:not(:first)").remove();
	        	var myParams = {safety_type: type,project: project,department_code: department_code };
	            $.ajax({
	                url: "<%=request.getContextPath()%>/ajax/getFilteredRolesList",
	                data: myParams, cache: false,async: false,
	                success: function (data) {
	                    if (data.length > 0) {
	                        $.each(data, function (i, val) {
	                        	 $("#select2-roles_edit-container").append('<option  value="' + val.role_code + '">'+$.trim(val.role_code) +'</option>');
	                        });
	                    }
	                },error: function (jqXHR, exception) {
	    	   			      $(".page-loader").hide();
	       	          	  getErrorMessage(jqXHR, exception);
	       	     	  }
	            });
	        }
  	  
    }
 
      function getDeptFilterList() {
	        var project = $("#select2-project-filter-container").val();
	        var employee_code = $("#select2-roles_filter-container").val();
	        var department_code = $("#select2-department_filter-container").val();
	    	var safety_type = $("#select2-incident-filter-container").val();
	        if ($.trim(department_code) == "") {
	        	$("#select2-department_filter-container option:not(:first)").remove();
	        	var myParams = {project: project, employee_code: employee_code, department_code : department_code, safety_type : safety_type};
	            $.ajax({
	                url: "<%=request.getContextPath()%>/ajax/getDeptFilterListFromRoleMapping",
	                data: myParams, cache: false,async: false,
	                success: function (data) {
	                    if (data.length > 0) {
	                        $.each(data, function (i, val) {
	                             $("#select2-department_filter-container").append('<option value="' + val.department_code + '">'+ "[ "+$.trim(val.department_code) +" ]"+" - " + $.trim(val.department_name) +'</option>');
	                        });
	                    }
	                },error: function (jqXHR, exception) {
	    	   			      $(".page-loader").hide();
	       	          	  getErrorMessage(jqXHR, exception);
	       	     	  }
	            });
	        }
	    }
      function getempFilterList() {
    	  var project = $("#select2-project-filter-container").val();
	        var employee_code = $("#select2-roles_filter-container").val();
	        var department_code = $("#select2-department_filter-container").val();
	    	var safety_type = $("#select2-incident-filter-container").val();
	        if ($.trim(employee_code) == "") {
	        	$("#select2-roles_filter-container option:not(:first)").remove();
	        	var myParams = {project: project, employee_code: employee_code, department_code : department_code, safety_type : safety_type};
	            $.ajax({
	                url: "<%=request.getContextPath()%>/ajax/getempFilterListInRoleMapping",
	                data: myParams, cache: false,async: false,
	                success: function (data) {
	                    if (data.length > 0) {
	                        $.each(data, function (i, val) {
	                             $("#select2-roles_filter-container").append('<option value="' + val.employee_code + '">' + "[ "+$.trim(val.employee_code) +" ]"+" - " + $.trim(val.user_name) +'</option>');
	                        });
	                    }
	                },error: function (jqXHR, exception) {
	    	   			      $(".page-loader").hide();
	       	          	  getErrorMessage(jqXHR, exception);
	       	     	  }
	            });
	        }
	    }
      function getProjectFilter() {
    	  var project = $("#select2-project-filter-container").val();
	        var employee_code = $("#select2-roles_filter-container").val();
	        var department_code = $("#select2-department_filter-container").val();
	    	var safety_type = $("#select2-incident-filter-container").val();
	        if ($.trim(project) == "") {
	        	$("#select2-project-filter-container option:not(:first)").remove();
	        	var myParams = {project: project, employee_code: employee_code, department_code : department_code, safety_type : safety_type};
	            $.ajax({
	                url: "<%=request.getContextPath()%>/ajax/getProjectFilterFromRoleMapping",
	                data: myParams, cache: false,async: false,
	                success: function (data) {
	                    if (data.length > 0) {
	                        $.each(data, function (i, val) {
	                             $("#select2-project-filter-container").append('<option value="' + val.project + '">' +"[ "+$.trim(val.project) +" ]"+" - " + $.trim(val.project_name) +'</option>');
	                        });
	                    }
	                },error: function (jqXHR, exception) {
	    	   			      $(".page-loader").hide();
	       	          	  getErrorMessage(jqXHR, exception);
	       	     	  }
	            });
	        }
	    }
      function mappingUserSecurity(){
    	  var project = $("#select2-project_edit-container").val();
	        var employee_code1 = $("#select2-employee_code_edit-container").val();
	        var department_code = $("#select2-department_code_edit-container").val();
	    	var safety_type = $("#select2-safety_type_edit-container").val();
	    	var role = $("#select2-roles_edit-container").val();
	    	var status = $("#select2-status_edit-container").val();
	    	
	        if ($.trim(project) != "" && $.trim(employee_code1) != "" && $.trim(department_code) != "" && $.trim(role) != "" && status != 'Inactive') {
	        	var myParams = {project: project, department_code : department_code, safety_type : safety_type,role_code : role};
	            $.ajax({
	                url: "<%=request.getContextPath()%>/ajax/getMappingUserSecurity",
	                data: myParams, cache: false,async: false,
	                success: function (data) {
	                    if (data.length > 0) {
	                        $.each(data, function (i, val) {
	                        	var employee_code = $.trim(val.employee_code);
	                        	var role_code = $.trim(val.role_code);
	                        	   //if ($.trim(project) === $.trim(val.project) && $.trim(department_code) === $.trim(val.department_code)   && $.trim(role) === role_code && status === $.trim(val.status)    && safety_type === $.trim(val.safety_type) && $.trim(employee_code1) != employee_code) { 
	                        		 $("#mappingError").html('This Action can not be done!, An Active is User Already Available with this mapping!');
	 	                             $('#uBtn').attr("disabled", true);
	                        	 // }
	                           
	                        }); 
	                    }else{
	                    	 $("#mappingError").html('');
	                    	 $('#uBtn').removeAttr("disabled");
	                    }
	                },error: function (jqXHR, exception) {
	    	   			      $(".page-loader").hide();
	       	          	  getErrorMessage(jqXHR, exception);
	       	     	  }
	            });
	        }
      }
      function getRoleMasterFilterList() {
    	    var project = $("#select2-project-filter-container").val();
	        var employee_code = $("#select2-roles-filter-container").val();
	        var department_code = $("#select2-department_filter-container").val();
	    	var safety_type = $("#select2-incident-filter-container").val();
	        if ($.trim(safety_type) == "") {
	        	$("#select2-incident-filter-container option:not(:first)").remove();
	        	var myParams = {project: project, employee_code: employee_code, department_code : department_code, safety_type : safety_type};
	            $.ajax({
	                url: "<%=request.getContextPath()%>/ajax/getRoleMasterFilterListinRoleMapping",
	                data: myParams, cache: false,async: false,
	                success: function (data) {
	                    if (data.length > 0) {
	                        $.each(data, function (i, val) {
	                             $("#select2-incident-filter-container").append('<option  value="' + val.safety_type + '">' + "[ "+$.trim(val.safety_type) +" ]"+" - " + $.trim(val.incident_type) +'</option>');
	                        });
	                    }
	                },error: function (jqXHR, exception) {
	    	   			      $(".page-loader").hide();
	       	          	  getErrorMessage(jqXHR, exception);
	       	     	  }
	            });
	        }
	    }

	    function exportCompany(){
	    	 var project = $("#select2-project-filter-container").val();
	         var employee_code = $("#select2-roles_filter-container").val();
	    	
	    	 $("#exportCompany_filter").val(project);
	     	 $("#exportStatus_filter").val(employee_code);
	     	 $("#exportCompanyForm ").submit();
	  	}
	    
	    function getRolemappingList(){
	    	getDeptFilterList('');
	    	getempFilterList('');
	    	getProjectFilter('');
	    	getRoleMasterFilterList('');
	    	var project = $("#select2-project-filter-container").val();
	        var employee_code = $("#select2-roles_filter-container").val();
	    	var department_code = $("#select2-department_filter-container").val();
	    	var safety_type = $("#select2-incident-filter-container").val();
	     
	     	table = $('#datatable-company').DataTable();
			table.destroy();
			$.fn.dataTable.moment('DD-MMM-YYYY');
			table = $('#datatable-company').DataTable({
				"bStateSave": true,  
	     		fixedHeader: true,
	         	//Default: Page display length
					"iDisplayLength" : 10,
					"iData" : {
						"start" : 52
					},"iDisplayStart" : 0,
					"drawCallback" : function() {
					},
	            columnDefs: [],
	            // "ScrollX": true,
	            //"scrollCollapse": true,
	            "sScrollX": "100%",
	            "sScrollXInner": "100%",
	            "bScrollCollapse": true,
	            "initComplete" : function() {
					}
	        }).rows().remove().draw();
			table.state.clear();		
		 	var myParams = {project: project, employee_code: employee_code, department_code : department_code, safety_type: safety_type};
			$.ajax({url : "<%=request.getContextPath()%>/ajax/getRoleMappings",type:"POST",data:myParams,success : function(data){    				
					if(data != null && data != '' && data.length > 0){    					
		         		$.each(data,function(key,val){
		         			var company_data = "'"+val.safety_type+"','"+val.employee_code+"','"+val.project_name+"','"+val.id+"','"+val.department_code+"','"+val.department_name+"','"+val.project+"','"+val.role_code+"','"+val.status+"'";
		                    var actions = '<a href="javascript:void(0);"  onclick="getRoleMapping('+company_data+');" class="btn btn-primary"  title="Edit"><i class="fa fa-pencil"></i></a>';    	                   	
		                   	var rowArray = [];    	                 
		            		
		                   	rowArray.push($.trim(val.id));
		                	rowArray.push($.trim(actions));  
		                 	rowArray.push($.trim(val.status));
		                	rowArray.push("["+ $.trim(val.project)+"]"+" - "+ val.project_name);
		                	rowArray.push("["+ $.trim(val.department_code)+"]"+" - "+ val.department_name);
		                	rowArray.push("[ "+val.role_code+" ]");
		                	rowArray.push("["+ $.trim(val.employee_code)+"]"+" - "+ val.user_name);       
		                    table.row.add(rowArray).draw( true );
						});
					}
				},error: function (jqXHR, exception) {
		         	getErrorMessage(jqXHR, exception);
		     }});
	    } 
	    
	    function getRoleMapping(safety_type,employee_code,p_name,id,c_code,s_code,c_name,role_code,status){
	    	 $("#mappingError").html('');
        	 $('#uBtn').removeAttr("disabled");
	    	 $('#project_name_edit').val('');
	    	 $('#safety_type_edit').val('');
			 $('select[name^="employee_code"] option:selected').removeAttr("selected");
			 $('select[name^="project"] option:selected').removeAttr("selected");
			 $('select[name^="department_code"] option:selected').removeAttr("selected");
			 $('select[name^="safety_type"] option:selected').removeAttr("selected");
			 $('select[name^="update_status"] option:selected').removeAttr("selected");
		      $('#id').val($.trim(id));
		      $('#updateCompany').modal('show');
		      $('#updateCompany #safety_type_edit').val($.trim(safety_type)).focus();
		      $('#updateCompany #project_name_edit').val($.trim(p_name)).focus();
		      $('#updateCompany #select2-project_edit-container').val($.trim(c_name)).focus();
		      $('#updateCompany #select2-safety_type_edit-container').val($.trim(safety_type)).focus();
		      $('#updateCompany #select2-department_code_edit-container').val($.trim(c_code)).focus();
		      $('#updateCompany #select2-roles_edit-container').val($.trim(role_code)).focus();
		      if(c_code != null && c_code != ''  && c_code != "undefined"){
		    	  $('select[name^="employee_code"] option[value="'+ employee_code +'"]').attr("selected",true);
		    	  $('select[name^="project"] option[value="'+ c_name +'"]').attr("selected",true);
		    	  $('select[name^="department_code"] option[value="'+ c_code +'"]').attr("selected",true);
		    	  $('select[name^="safety_type"] option[value="'+ safety_type +'"]').attr("selected",true);
		    	  $('select[name^="update_status"] option[value="'+ status +'"]').attr("selected",true);
		    	  if(safety_type != null && safety_type != ''  && safety_type != "undefined"){
			    	  filterRoles_edit(safety_type);
			    	  $('select[name^="role_code"] option[value="'+ role_code +'"]').attr("selected",true);
		    	  }
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
	    
	    function addCompany(){
	    	if(validator.form()){ // validation perform
	        	document.getElementById("addCompanyForm").submit();	
	    	}
	    }
	    function updateCompany(){
	    	if(validator1.form()){ // validation perform
	    		$('#select2-employee_code_edit-container').removeAttr("disabled")
	        	document.getElementById("updateCompanyForm").submit();	
	    	}
	    }
	    var validator1 =	$('#updateCompanyForm').validate({
		   	 errorClass: "my-error-class",
		   	 validClass: "my-valid-class",
		   	 ignore: ":hidden:not(.select2 form-select)",
		   		    rules: {
		   		 		  "safety_type": {
		   			 			required: true
		   			 	  },"project": {										
		   			 			required: true
		   			 	  },"role_code": {
		   	                 	required: true,
		   			 	  },"department_code": {										
		   			 			required: true
		   			 	  },"employee_code": {
		   	                 	required: true,
		   			 	  },"update_status": {
		   	                 	required: true,
		   			 	  }
		   		 	},
		   		    messages: {
		   		 		 "safety_type": {
		   				 	required: 'Required',
		   			 	  },"project": {
		   			 		required: 'Required'
		   			 	  },"role_code": {
		   		 			required: 'Required'
		   		 	  	  },"department_code": {
		   			 		required: 'Required'
		   			 	  },"employee_code": {
		   		 			required: 'Required'
		   		 	  	  },"update_status": {
		   		 			required: 'Required'
		   		 	  	  }
		      		},
		      		errorPlacement:function(error, element){
		      		 	if (element.attr("id") == "select2-safety_type_edit-container" ){
		   				 document.getElementById("select2-safety_type_edit-containerError").innerHTML="";
		   		 		 error.appendTo('#select2-safety_type_edit-containerError');
			   			}else if(element.attr("id") == "select2-employee_code_edit-container" ){
			   			   document.getElementById("select2-employee_code_edit-containerError").innerHTML="";
			   		 	   error.appendTo('#select2-employee_code_edit-containerError');
			   			}else if(element.attr("id") == "select2-roles_edit-container" ){
			   				document.getElementById("select2-roles_edit-containerError").innerHTML="";
			   			 	error.appendTo('#select2-roles_edit-containerError');
			   			}else if(element.attr("id") == "select2-project_edit-container" ){
			   				document.getElementById("select2-project_edit-containerError").innerHTML="";
			   			 	error.appendTo('#select2-project_edit-containerError');
			   			}else if(element.attr("id") == "select2-department_code_edit-container" ){
			   				document.getElementById("select2-department_code_edit-containerError").innerHTML="";
			   			 	error.appendTo('#select2-department_code_edit-containerError');
			   			}else if(element.attr("id") == "select2-status_edit-container" ){
			   				document.getElementById("select2-status_edit-containerError").innerHTML="";
			   			 	error.appendTo('#select2-status_edit-containerError');
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
	    var validator =	$('#addCompanyForm').validate({
	   	 errorClass: "my-error-class",
	   	 validClass: "my-valid-class",
	   	 ignore: ":hidden:not(.select2 form-select)",
	   		    rules: {
			   		     "safety_type": {
					 			required: true
					 	  },"project": {										
					 			required: true
					 	  },"role_code": {
			                 	required: true,
					 	  },"department_code": {										
					 			required: true
					 	  },"employee_code": {
			                 	required: true,
					 	  },"status": {
			                 	required: true,
					 	  }
				 	},
				    messages: {
				 		 "safety_type": {
						 	required: 'Required',
					 	  },"project": {
					 		required: 'Required'
					 	  },"role_code": {
				 			required: 'Required'
				 	  	  },"department_code": {
					 		required: 'Required'
					 	  },"employee_code": {
				 			required: 'Required'
				 	  	  },"status": {
				 			required: 'Required'
				 	  	  }
		   		},
	      		errorPlacement:function(error, element){
	      			if (element.attr("id") == "select2-safety_type_add-container" ){
		   				 document.getElementById("select2-safety_type_add-containerError").innerHTML="";
		   		 		 error.appendTo('#select2-safety_type_add-containerError');
			   			}else if(element.attr("id") == "select2-employee_code_add-container" ){
			   			   document.getElementById("select2-employee_code_add-containerError").innerHTML="";
			   		 	   error.appendTo('#select2-employee_code_add-containerError');
			   			}else if(element.attr("id") == "select2-roles_add-container" ){
			   				document.getElementById("select2-roles_add-containerError").innerHTML="";
			   			 	error.appendTo('#select2-roles_add-containerError');
			   			}else if(element.attr("id") == "select2-project_add-container" ){
			   				document.getElementById("select2-project_add-containerError").innerHTML="";
			   			 	error.appendTo('#select2-project_add-containerError');
			   			}else if(element.attr("id") == "select2-department_code_add-container" ){
			   				document.getElementById("select2-department_code_add-containerError").innerHTML="";
			   			 	error.appendTo('#select2-department_code_add-containerError');
			   			}else if(element.attr("id") == "select2-status_add-container" ){
			   				document.getElementById("select2-status_add-containerError").innerHTML="";
			   			 	error.appendTo('#select2-status_add-containerError');
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
	   	$('.formSelect').change(function(){
	   	    if ($(this).val() != ""){
	   	        $(this).valid();
	   	    }
	   	});
	   	
	   	$('input').change(function(){
	   	    if ($(this).val() != ""){
	   	        $(this).valid();
	   	    }
	   	});
	  	function addBox(){
	   		$('select[name^="project"] option:selected').removeAttr("selected");
	   		$('select[name^="department_code"] option:selected').removeAttr("selected");
	   		$('select[name^="employee_code"] option:selected').removeAttr("selected");
	   		$('select[name^="safety_type"] option:selected').removeAttr("selected");
	   		$('select[name^="role_code"] option:selected').removeAttr("selected");
	   		$('select[name^="update_status"] option:selected').removeAttr("selected");
	   		$('select').select2();
	   	}
    </script>
  </body>
  <!-- END: Body-->

<!-- Mirrored from pixinvent.com/demo/vuexy-html-bootstrap-admin-template/html/ltr/horizontal-menu-template/dashboard-analytics.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 07 Aug 2022 05:36:10 GMT -->
</html>
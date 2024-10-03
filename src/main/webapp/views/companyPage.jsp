<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<!--
Template Name: Vuexy - Vuejs, HTML & Laravel Admin Dashboard Template
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
  
<!-- Mirrored from pixinvent.com/demo/vuexy-html-bootstrap-admin-template/html/ltr/horizontal-menu-template/dashboard-analytics.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 07 Aug 2022 05:36:09 GMT -->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=0,minimal-ui">
  <style>

.modal-body {
    overflow-y:visible;
}
	div.dataTables_wrapper div.dataTables_filter input {
	    margin-left: 0.5em;
	    width: 15rem !important;
		}
        p a {
            color: blue
        }
        .input-field .searchable_label{
      		font-size:0.85rem;
        } 
        td,th{
        	box-sizing:content-box !important;
        }
 		
        .fw-300{
        	width:300px !important;
        	max-width:300px;
        }
        .dataTables_filter label::after{
         	content:'';
         }
         .right-btns .fa{
         	position:relative;
         	top:-35px;
         }
         .right-btns .fa+.fa{
         	right:-10px;
         }
        @media only screen and (max-width: 1024px){ 
			
			.dataTables_scrollBody tbody tr td:last-of-type,
			.no-sort{
				padding:3px !important;
				max-width: 45px;
			}
			.mob-btn{
				padding:0 12px;
			}
			.hideCOl{
				display:none;
			}
			.fw-300{width:30vw !important;
        	max-width:30vw; }
			
			}
		.no-sort.sorting_asc:before,
		.no-sort.sorting_asc:after{
		    opacity:0 !important;
		    content:'' !important;
		}
	.m-n1 {
        margin: -2rem auto 0;
    }

    @media only screen and (max-width: 1024px) {
        .mob-mar {
            text-align: left;
        }

        .exportButton .btn {
            padding-left: 6px;
            padding-right: 6px;
        }
    }
.modal{
    width: 65% !important
}
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
 .error-msg label{color:red!important;}
td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px !important;
  margin:5px;
}
 .input-field .searchable_label {
            font-size: 0.55rem;
        }
  input[type=number] {
      -moz-appearance: textfield;
  }
tr:nth-child(even) {
  background-color: #dddddd;
}
div.addDiv {
  text-align: right;
}
h4{
 text-align: center;
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
input::-webkit-outer-spin-button,
input::-webkit-inner-spin-button {
  -webkit-appearance: none;
  margin: 0;
}

/* Firefox */
input[type=number] {
  -moz-appearance: textfield;
}
.select2-container {
    z-index: 9999 !important;
}

.select2-container .select2-selection--single {
    width: 26rem !important;
}
.offset-l4 >.select2-container {
   width: 18rem !important;
    z-index: 1 !important;
}
.offset-l4 >.select2-container .select2-selection--single {
   width: 18rem !important;
}
#togglePassword{
	margin-left: -30px; 
	cursor: pointer;
}
 .row .col.l3 {
    width: 19% !important;
    margin-left: auto;
    left: 30rem !important;
    right: auto;
}
.swal2-popup{
    width:18em !important;
    height: 13em !important;
}
.mdl-grid{
	display: flex !important;
    padding: 4px;
    justify-content: space-between;
    height: 4.5rem;
} 
.dataTables_scrollHeadInner{
    width: 1272px !important;
    padding-right: 0px !important;
}
.dt-table{
display: block !important;
height: 100%;
}
mdl-cell mdl-cell--6-col{
	padding: 0 791px 0 32px !important;
} 
.right-btns{
	    padding: 0 28px 0 0 !important;
}
.dark-layout h1, .dark-layout h2, .dark-layout h3, .dark-layout h4, .dark-layout h5, .dark-layout h6, .dark-layout span  {
    color: #D0D2D6;
}
.dt-buttons{
    padding: 0 0 0 39em;
}
.modal {
    width: 100% !important;
}

</style>
    <title>Company</title>
        <link rel="icon" type="image/png" sizes="96x96" href="/reisp/resources/images/AAYUSH-favicon.png" >

	<script src="<c:url value="/resources/js/jQuery-v.3.5.min.js"  />"></script>
    <!-- BEGIN: Vendor CSS-->
    <link rel="stylesheet" type="text/css" href="/reisp/resources/vendors/css/vendors.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/vendors/css/charts/apexcharts.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/vendors/css/extensions/toastr.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/vendors/css/tables/datatable/dataTables.bootstrap5.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/vendors/css/tables/datatable/responsive.bootstrap5.min.css">
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
    <link rel="stylesheet" type="text/css" href="/reisp/resources/css/pages/modal-create-app.min.css">
    <!-- BEGIN: Page CSS-->
    <link rel="stylesheet" type="text/css" href="/reisp/resources/css/core/menu/menu-types/horizontal-menu.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/css/plugins/charts/chart-apex.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/css/plugins/extensions/ext-component-toastr.min.css">
    <link rel="stylesheet" type="text/css" href="/reisp/resources/css/pages/app-invoice-list.min.css">
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
  <div id="test" style="float:right">

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
                        <g id="Group" transform="translate(400.000000, 178.000000)">
                          <path class="text-primary" id="Path" d="M-5.68434189e-14,2.84217094e-14 L39.1816085,2.84217094e-14 L69.3453773,32.2519224 L101.428699,2.84217094e-14 L138.784583,2.84217094e-14 L138.784199,29.8015838 C137.958931,37.3510206 135.784352,42.5567762 132.260463,45.4188507 C128.736573,48.2809251 112.33867,64.5239941 83.0667527,94.1480575 L56.2750821,94.1480575 L6.71554594,44.4188507 C2.46876683,39.9813776 0.345377275,35.1089553 0.345377275,29.8015838 C0.345377275,24.4942122 0.230251516,14.560351 -5.68434189e-14,2.84217094e-14 Z" style="fill:currentColor"></path>
                          <path id="Path1" d="M69.3453773,32.2519224 L101.428699,1.42108547e-14 L138.784583,1.42108547e-14 L138.784199,29.8015838 C137.958931,37.3510206 135.784352,42.5567762 132.260463,45.4188507 C128.736573,48.2809251 112.33867,64.5239941 83.0667527,94.1480575 L56.2750821,94.1480575 L32.8435758,70.5039241 L69.3453773,32.2519224 Z" fill="url(#linearGradient-1)" opacity="0.2"></path>
                          <polygon id="Path-2" fill="#000000" opacity="0.049999997" points="69.3922914 32.4202615 32.8435758 70.5039241 54.0490008 16.1851325"></polygon>
                          <polygon id="Path-21" fill="#000000" opacity="0.099999994" points="69.3922914 32.4202615 32.8435758 70.5039241 58.3683556 20.7402338"></polygon>
                          <polygon id="Path-3" fill="url(#linearGradient-2)" opacity="0.099999994" points="101.428699 0 83.0667527 94.1480575 130.378721 47.0740288"></polygon>
                        </g>
                      </g>
                    </g>
                  </svg></span>
                <h2 class="brand-text mb-0">Vuexy</h2></a></li>
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
        </div>
        <div class="content-body"><!-- Dashboard Analytics Start -->
<section id="dashboard-analytics">
  <div class="row match-height">
    <!-- Greetings Card starts -->

    <!-- Greetings Card ends -->
    <!-- Subscribers Chart Card starts -->
    <div class="col-lg-3 col-sm-3 col-3">
      <div class="card">
        <div class="card-header flex-column align-items-start pb-0">
            <div class="col-md-12 mb-1">
              <label class="card-text" for="select2-basic">Company Filter</label>
              <select class="select2 form-select" id="company_filter" name="company_code" onchange="getCompanyList()">
                <option value="">select</option>
              </select>
              <div>
                    <button class="btn bg-m waves-effect waves-light" style="margin-top: 10px; width: 45%;     background-color: gainsboro"  onclick="clearFilter();">Clear filter</button>
              </div>
            </div>
          <h2 class="fw-bolder mt-1"></h2>
        </div>
      </div>
    </div>
    <div class="col-lg-3 col-sm-3 col-3">
      <div class="card">
        <div class="card-header flex-column align-items-start pb-0">
          <div class="avatar bg-light-primary p-50 m-0">
            <div class="avatar-content">
              <i data-feather="users" class="font-medium-5"></i>
            </div>
          </div>
          <h3 class="fw-bolder mt-1">${sessionScope.ALL_COMPANIES}</h3>
          <p class="card-text">Total Companies</p>
        </div>
      </div>
    </div>
    <!-- Subscribers Chart Card starts -->
    <div class="col-lg-3 col-sm-3 col-3">
      <div class="card">
        <div class="card-header flex-column align-items-start pb-0">
          <div class="avatar bg-light-primary p-50 m-0">
            <div class="avatar-content">
              <i data-feather="users" class="font-medium-5"></i>
            </div>
          </div>
          <h3 class="fw-bolder mt-1">${sessionScope.ACTIVE_COMPANIES}</h3>
          <p class="card-text">Active Companies</p>
        </div>
      </div>
    </div>
    <!-- Subscribers Chart Card ends -->

    <!-- Orders Chart Card starts -->
    <div class="col-lg-3 col-sm-3 col-3">
      <div class="card">
        <div class="card-header flex-column align-items-start pb-0">
          <div class="avatar bg-light-warning p-50 m-0">
            <div class="avatar-content">
              <i data-feather="package" class="font-medium-5"></i>
            </div>
          </div>
          <h3 class="fw-bolder mt-1">${sessionScope.INACTIVE_COMPANIES}</h3>
          <p class="card-text">Inactive Companies</p>
        </div>
      </div>
    </div>
    <!-- Orders Chart Card ends -->
  </div>
  <!-- List DataTable -->
  <div>
  	
  </div>
  <div class="row">
  
    <div class="col-12">
    
      <div class="card invoice-list-wrapper">
        <div class="card-datatable table-responsive">
       <div class="dt-buttons" style="height : 0.5em;">
       <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#addCompany" style="position: relative; top: 1em;">Add Company</button>
        </div>
          <table id="datatable-company" class="invoice-list-table table is-zebra w-full text-left">
            <thead>
              <tr>
                <th>#</th>
                <th>Action</th>
                <th>Company Code</th>
                <th class="text-truncate">Company Name</th>
                <th>Status</th>
                 <th>Created Date</th>
                 <th>Created by</th>
                 <th>Modified Date</th>
                 <th>Modified by</th>
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
          <h1 class="mb-1">Add Company</h1>
        </div>
        <form id="addCompanyForm" class="row gy-1 pt-75" action="<%=request.getContextPath() %>/add-company" method="post" class="form-horizontal" role="form" >
		<div class="col-12 col-md-12">
            <label class="form-label" for="modalEditUserFirstName">Company Name</label><span class="required"> *</span>
            <input
              type="text"
              id="company_name_add"
              name="company_name"
              class="form-control"
              placeholder="eg : Re sustainablity"
              value=""
              data-msg="Please enter your first name"
            />
             <span id="company_name_addError" class="error-msg" ></span>
          </div>
          <div class="col-12 col-md-6">
            <label class="form-label" for="modalEditUserLastName">Company Code</label><span class="required"> *</span>
            <input
              type="text"
              id="company_code_add"
              name="company_code"
              class="form-control"
              placeholder="eg : RE"
              value=""
              data-msg="Please enter your last name"
            />
             <span id="company_code_addError" class="error-msg" ></span>
          </div>
          <div class="col-12 col-md-6">
            <label class="form-label formSelect validate-dropdown" for="modalEditUserStatus">Status</label><span class="required"> *</span>
            <select
              id="status_add"
              name="status"
              class="form-select"
              aria-label="Default select example"
            >
              <option value="">select</option>
              <option value="Active">Active</option>
              <option value="Inactive">Inactive</option>
            </select>
             <span id="status_addError" class="error-msg" ></span>
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
        <form id="updateCompanyForm" class="row gy-1 pt-75" action="<%=request.getContextPath() %>/update-company" method="post" class="form-horizontal" role="form" >
        <input type="hidden" id="id" name="id" />
		<div class="col-12 col-md-12">
            <label class="form-label" for="modalEditUserFirstName">Company Name</label><span class="required"> *</span>
            <input
              type="text"
              id="company_name_edit"
              name="company_name"
              class="form-control"
              placeholder="eg : Re sustainablity"
              value=""
              data-msg="Please enter your first name"
            />
             <span id="company_name_editError" class="error-msg" ></span>
          </div>
          <div class="col-12 col-md-6">
            <label class="form-label" for="modalEditUserLastName">Company Code</label><span class="required"> *</span>
            <input
              type="text"
              id="company_code_edit"
              name="company_code"
              class="form-control"
              placeholder="eg : RE"
              value=""
              data-msg="Please enter your last name"
            />
             <span id="company_code_editError" class="error-msg" ></span>
          </div>
          <div class="col-12 col-md-6">
            <label class="form-label formSelect validate-dropdown" for="modalEditUserStatus">Status</label><span class="required"> *</span>
            <select
              id="status_edit"
              name="status"
              class="form-select"
              aria-label="Default select example"
            >
              <option value="">select</option>
              <option value="Active">Active</option>
              <option value="Inactive">Inactive</option>
            </select>
             <span id="status_editError" class="error-msg" ></span>
          </div>
          <div class="col-12 text-center mt-2 pt-50">
            <button type="submit" class="btn btn-primary me-1" onclick="updateCompany();">Update</button>
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
      <p class="clearfix mb-0"><span class="float-md-start d-block d-md-inline-block mt-25">COPYRIGHT  &copy;  <span id="currentYear"></span> ,| Designed & Developed by<a class="ms-25" href="https://ramkyenviroengineers.com/" target="_blank">Re Sustainability Limited</a><span class="d-none d-sm-inline-block"> . All Rights Reserved.</span></span></p>
    </footer>
    <button class="btn btn-primary btn-icon scroll-top" type="button"><i data-feather="arrow-up"></i></button>
    <!-- END: Footer-->

 
    <!-- BEGIN: Vendor JS-->
    <script src="/reisp/resources/vendors/js/vendors.min.js"></script>
    <!-- BEGIN Vendor JS-->

    <!-- BEGIN: Page Vendor JS-->
    <script src="/reisp/resources/vendors/js/ui/jquery.sticky.js"></script>
    <script src="/reisp/resources/vendors/js/charts/apexcharts.min.js"></script>
    <script src="/reisp/resources/vendors/js/extensions/toastr.min.js"></script>
    <script src="/reisp/resources/vendors/js/extensions/moment.min.js"></script>
    <script src="/reisp/resources/vendors/js/tables/datatable/jquery.dataTables.min.js"></script>
    <script src="/reisp/resources/vendors/js/tables/datatable/datatables.buttons.min.js"></script>
    <script src="/reisp/resources/vendors/js/tables/datatable/dataTables.bootstrap5.min.js"></script>
    <script src="/reisp/resources/vendors/js/tables/datatable/dataTables.responsive.min.js"></script>
    <script src="/reisp/resources/vendors/js/tables/datatable/responsive.bootstrap5.js"></script>
    <!-- END: Page Vendor JS-->
 <script src="<c:url value="/resources/js/materialize-v.1.0.min.js "  />"></script>
    <script src="<c:url value="/resources/js/jquery-validation-1.19.1.min.js"  />"></script>
    <script src="<c:url value="/resources/js/jquery.dataTables-v.1.10.min.js"  />"></script>
     <script src="<c:url value="/resources/js/datetime-moment-v1.10.12.js"  />"></script>
         <script src="<c:url value="/resources/js/dataTables.material.min.js"  />"></script>
      <script src="<c:url value="/resources/js/moment-v2.8.4.min.js"  />"></script>
    <!-- BEGIN: Theme JS-->
    <script src="/reisp/resources/js/core/app-menu.min.js"></script>
    <script src="/reisp/resources/js/core/app.min.js"></script>
    <script src="/reisp/resources/js/scripts/customizer.min.js"></script>
    <!-- END: Theme JS-->
   <script src="/reisp/resources/js/scripts/pages/modal-add-new-cc.min.js"></script>
    <script src="/reisp/resources/js/scripts/pages/page-pricing.min.js"></script>
    <script src="/reisp/resources/js/scripts/pages/modal-add-new-address.min.js"></script>
    <script src="/reisp/resources/js/scripts/pages/modal-create-app.min.js"></script>
    <script src="/reisp/resources/js/scripts/pages/modal-two-factor-auth.min.js"></script>
    <script src="/reisp/resources/js/scripts/pages/modal-edit-user.min.js"></script>
    <script src="/reisp/resources/js/scripts/pages/modal-share-project.min.js"></script>
    <!-- BEGIN: Page JS-->
    
    <script src="/reisp/resources/js/scripts/pages/app-invoice-list.min.js"></script>
    <!-- END: Page JS-->

    <script>
      $(window).on("load",(function(){
    	  
          if (feather) {
            feather.replace({ width: 14, height: 14 });
          }
          $('.modal').modal({ dismissible: false });
          getCompanyList();
         }));
      document.getElementById("currentYear").innerHTML = new Date().getFullYear();
      
      function clearFilter(){
	    	if($("#company_filter").val() != ""){
		    	$("#company_filter").val("");
		    	window.location.href= "<%=request.getContextPath()%>/company";
	    	}
	    }
      
      function getCompanyFilterList() {
	        var company_code = $("#company_filter").val();
	        if ($.trim(company_code) == "") {
	        	$("#company_filter option:not(:first)").remove();
	        	var myParams = { company_code: company_code };
	            $.ajax({
	                url: "<%=request.getContextPath()%>/ajax/getCompanyFilterList",
	                data: myParams, cache: false,async: false,
	                success: function (data) {
	                    if (data.length > 0) {
	                        $.each(data, function (i, val) {
	                             $("#company_filter").append('<option value="' + val.company_code + '">'+ $.trim(val.company_code) +" - " + $.trim(val.company_name) +'</option>');
	                        });
	                    }
	                },error: function (jqXHR, exception) {
	    	   			      $(".page-loader").hide();
	       	          	  getErrorMessage(jqXHR, exception);
	       	     	  }
	            });
	        }
	    }
      
	    function getCompanyList(){
	    	getCompanyFilterList('');
	    	var company_code = $("#company_filter").val();
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
				/* 		$('.dataTables_filter input[type="search"]')
								.attr('placeholder', 'Search')
								.css({
									'width' : '300px ',
									'display' : 'inline-block'
								});
						var input = $('.dataTables_filter input')
								.unbind()
								.bind('keyup',function(e){
							    if (e.which == 13){
							    	self.search(input.val()).draw();
							    }
							}), self = this.api(), $searchButton = $('<i class="fa fa-search" title="Go" >')
						.click(function() {
							self.search(input.val()).draw();
						}), 
						$clearButton = $('<i class="fa fa-close" title="Reset">')
						.click(function() {
							input.val('');
							$searchButton.click();
						})
						$('.dataTables_filter').append( '<div class="right-btns"></div>');
						$('.dataTables_filter div').append( $searchButton, $clearButton); */ 					
					}
	        }).rows().remove().draw();
			table.state.clear();		
		 	var myParams = {company_code : company_code};
			$.ajax({url : "<%=request.getContextPath()%>/ajax/getCompanies",type:"POST",data:myParams,success : function(data){    				
					if(data != null && data != '' && data.length > 0){    					
		         		$.each(data,function(key,val){
		         			var company_data = "'"+val.company_code+"','"+val.status+"','"+val.company_name+"','"+val.id+"'";
		                    var actions = '<a href="javascript:void(0);"  onclick="getCompany('+company_data+');" class="btn btn-primary"  title="Edit"><i class="fa fa-pencil"></i></a>';    	                   	
		                   	var rowArray = [];    	                 
		            
		                   	rowArray.push($.trim(val.id));
		                	rowArray.push($.trim(actions));  
		                   	rowArray.push($.trim(val.company_code));
		                   	rowArray.push($.trim(val.company_name));
		                   	rowArray.push($.trim(val.status));
		                   	rowArray.push($.trim(val.created_date));  
		                   	rowArray.push($.trim(val.created_by));
		                   	rowArray.push($.trim(val.modified_date));
		                   	rowArray.push($.trim(val.modified_by));
		                    table.row.add(rowArray).draw( true );
						});
					}
				},error: function (jqXHR, exception) {
		         	getErrorMessage(jqXHR, exception);
		     }});
	    } 
	    
	    function getCompany(company_code,status,company_name,id){
	    	 $('#company_name_edit').val('');
			 $('#company_code_edit').val('');
			 $('select[name^="status"] option:selected').removeAttr("selected");
		      $('#id').val($.trim(id));
		      $('#updateCompany').modal('show');
		      $('#updateCompany #company_name_edit').val($.trim(company_name)).focus();
		      $('#updateCompany #company_code_edit').val($.trim(company_code)).focus();
		      if(status != null && status != ''  && status != "undefined"){
		    	  $('select[name^="status"] option[value="'+ status +'"]').attr("selected",true);
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
	        	document.getElementById("updateCompanyForm").submit();	
	    	}
	    }
	    var validator1 =	$('#updateCompanyForm').validate({
		   	 errorClass: "my-error-class",
		   	 validClass: "my-valid-class",
		   	 ignore: ":hidden:not(.validate-dropdown)",
		   		    rules: {
		   		 		  "company_name": {
		   			 			required: true
		   			 	  },"company_code": {										
		   			 			required: true
		   			 	  },"status": {
		   	                 	required: true,
		   			 	  }
		   		 	},
		   		    messages: {
		   		 		 "company_name": {
		   				 	required: 'Required',
		   			 	  },"company_code": {
		   			 		required: 'Required'
		   			 	  },"status": {
		   		 			required: 'Required'
		   		 	  	  }
		      		},
		      		errorPlacement:function(error, element){
		      		 	if (element.attr("id") == "company_name_edit" ){
		   				 document.getElementById("company_name_editError").innerHTML="";
		   		 		 error.appendTo('#company_name_editError');
		   			}else if(element.attr("id") == "company_code_edit" ){
		   			   document.getElementById("company_code_editError").innerHTML="";
		   		 	   error.appendTo('#company_code_editError');
		   			}else if(element.attr("id") == "status_edit" ){
		   				document.getElementById("status_editError").innerHTML="";
		   			 	error.appendTo('#status_editError');
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
	   	 ignore: ":hidden:not(.validate-dropdown)",
	   		    rules: {
	   		 		  "company_name": {
	   			 			required: true
	   			 	  },"company_code": {										
	   			 			required: true
	   			 	  },"status": {
	   	                 	required: true,
	   			 	  }
	   		 	},
	   		    messages: {
	   		 		 "company_name": {
	   				 	required: 'Required',
	   			 	  },"company_code": {
	   			 		required: 'Required'
	   			 	  },"status": {
	   		 			required: 'Required'
	   		 	  	  }
	      		},
	      		errorPlacement:function(error, element){
	      		 	if (element.attr("id") == "company_name_add" ){
	   				 document.getElementById("company_name_addError").innerHTML="";
	   		 		 error.appendTo('#company_name_addError');
	   			}else if(element.attr("id") == "company_code_add" ){
	   			   document.getElementById("company_code_addError").innerHTML="";
	   		 	   error.appendTo('#company_code_addError');
	   			}else if(element.attr("id") == "status_add" ){
	   				document.getElementById("status_addError").innerHTML="";
	   			 	error.appendTo('#status_addError');
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
	   	
    </script>
  </body>
  <!-- END: Body-->

<!-- Mirrored from pixinvent.com/demo/vuexy-html-bootstrap-admin-template/html/ltr/horizontal-menu-template/dashboard-analytics.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 07 Aug 2022 05:36:10 GMT -->
</html>
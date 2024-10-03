<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<style>
.select2-container--default .select2-selection--single .select2-selection__arrow b {
    border-color: #888 transparent transparent transparent;
    border-style: solid;
    border-width: 5px 4px 0 4px;
    height: 0;
    left: 50%;
    margin-left: -26px;
    margin-top: -2px;
    position: absolute;
    top: 50%;
    width: 0;
}
.select2-container--default .select2-selection--single .select2-selection__arrow {
    height: 26px;
    position: absolute;
    top: 1px;
    right: 30px !important;
    width: 20px;
}
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
.select2-container .select2-selection--single {
	width: 17rem !important;
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
.swal2-icon {

}
</style>
<title>Users - Home Page</title>
 <link rel="icon" type="image/png" sizes="96x96" href="<c:url value="/resources/images/AAYUSH-favicon.png"/>" >

    <link rel="stylesheet" href="<c:url value="/resources/css/materialize-v.1.0.min.css" />" >
    <link rel="stylesheet" href="<c:url value="/resources/css/material-design-lite-v.1.0.css" /> ">
    <link rel="stylesheet" href="<c:url value="/resources/css/sweetalert-v.1.1.0.min.css"/>"  > 
    <link rel="stylesheet" href="<c:url value="/resources/css/font-awesome-v.4.7.css" />">   
    <link rel="stylesheet" href="<c:url value="/resources/css/datatable-material.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/rits.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/select2.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/searchable-dropdown.css"/>">	
    <link rel="stylesheet" media="screen and (max-device-width: 1024px)" href="<c:url value="/resources/css/mobile-form-template.css" />"/>
    <link rel="stylesheet" media="screen and (max-device-width: 1024px)" href="<c:url value="/resources/css/mobile-grid-template.css"/>" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendors/css/extensions/sweetalert2.min.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/plugins/extensions/ext-component-sweet-alerts.min.css"/>">
<%--     <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css"/>">
 --%></head>
<body>
 <!-- header included -->
     <jsp:include page="../views/layout/header.jsp"></jsp:include>
	<div class="row">
		<div class="row">
			<div class="col s12 m12">
				<div class="card">
					<div class="card-content">
						<span class="card-title headbg">
							<div class="center-align bg-m p-2 m-b-5">
								<!-- <h6 class="hide-on-med-and-down">Update User</h6> -->
								<h6 class="mob-mar">Users List</h6>
								  <div class="col s12  right-align">
                                <a class="waves-effect waves-light btn bg-s modal-trigger t-c" href="#addUpdateModal">
                                    <i class="fa fa-plus-circle"></i> &nbsp; Add User</a>
                            </div>								
							</div>
						</span>
					   <div class="row no-mar" style="margin-bottom: 0;">
							<div class="row clearfix">
							    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							        <c:if test="${not empty success }">
							            <div class="center-align m-1 close-message">${success}</div>
							        </c:if>
							        <c:if test="${not empty error }">
							            <div class="center-align m-1 close-message">${error}</div>
							        </c:if>
							         <c:if test="${not empty welcome }">
							            <div class="center-align m-1 close-message"></div>
							        </c:if>
							    </div>
							</div>
							<div class="col m8 s12 l9 center-align">
								<div class="row no-mar">
									<div class="col s6 m6 l4 input-field  offset-l4">
										<p class="searchable_label left-align">Designation</p>
										<select class="searchable filter01" name="designation"
											id="designation_filter" onchange="getUserList();">
											<option value="" >Select</option>
										</select>
									</div>
									<div class="col s1 m1 l1 offset-l offset-m"></div>
									<div class="col s5 m3 l2 input-field center-align">
										<button
											class="btn bg-m waves-effect waves-light t-c clear-filters"
											style="margin-top: 10px; width: 100%;"
											onclick="clearFilter();">Clear Filter</button>
									</div>
								</div>
							</div>
							
  
							<div class="col m3 hide-on-small-only"></div>
				
						</div>
					    <a class="btn btn-outline-primary" id="position-top-end" style="display:none"></a>
				
						  <!-- Subscribers Chart Card starts -->
    <div class="col l12 center-align">
      <div class="card col l3">
        <div class="card-header flex-column align-items-start pb-0">
          <div class="avatar bg-light-primary p-50 m-0">
          </div>
          <h2 class="fw-bolder mt-1"><i class='fas fa-user-friends' style='font-size:36px'></i>&nbsp;<span id="count"></span></h2>
          <span class="card-text" id="designationList"> </span>
        </div>
        <div id="gained-chart"></div>
      </div>
    </div>
    
					  <div>
						<div class="row">
							<div class="col m12 s12">
								<table id="datatable-user" class="mdl-data-table">
										<thead>
											<tr>
												<th>User ID</th>
									            <th>User Name</th>
									            <th>Designation</th>
									            <th>E-mail</th>
												<th>Mobile</th>
												<th class="no-sort">Action</th>
											</tr>
										</thead>
										<tbody>
									
										</tbody>
									</table>
							</div>
						</div>

	</div>
      <!-- Add Modal Training -->
    <div id="addUpdateModal" class="modal">
	<form class="col s12" id="addUserForm" name="addUserForm" action="<%=request.getContextPath() %>/add-user" method="post" class="form-horizontal" role="form" >
            <div class="modal-content">
                <h5 class="modal-header">Add New User <span class="right modal-action modal-close"><span
                            class="material-icons">x</span></span></h5>
           	  <div class="row">
		    <div class="input-field col s6 m6 l6">
		      <input  id="user_name" type="text" name="user_name" class="validate">
		      <label for="user_name">First Name<span class="required"> *</span></label>
		      <span id="user_nameError" class="error-msg" ></span> 
		    </div>
		    <div class="input-field col s6 m6 l6">
		       <p class="searchable_label">Designation<span class="required"> *</span></p>
		     <select id="designation" name="designation" class="searchable validate-dropdown formSelect " >
                 <option value="">Select</option>
                 <c:forEach var="obj" items="${deptList }">
                 	<option value="${obj.designation }">${obj.designation }</option>
                 </c:forEach>
             </select>
             <span id="designationError" class="error-msg" ></span>
		    </div>
		  </div>
		   <div class="row">
		      <div class="input-field col s6 m6 l6">
		      <input id="password" name="password" type="text" class="validate"><i class="fa-solid fa-eye" id="togglePassword"></i>
		      <label for="last_name">Password<span class="required"> *</span></label>
		       <span id="passwordError" class="error-msg" ></span> 
		    </div>
		      <div class="input-field col s6 m6 l6 "> 
		      <input id="mobile_number" name="mobile_number" type="number" class="validate">
		      <label for="mobile_number">Mobile<span class="required"> *</span></label>
		       <span id="mobile_numberError" class="error-msg" ></span> 
		    </div>
		  </div>
		  <div class="row">
		    <div class="col s12 m12 l12 input-field">
		      <input id="email" name="email" type="email" class="validate">
		      <label for="email">Email<span class="required"> *</span></label><br>
		       <span id="emailError" class="error-msg" ></span> 
		    </div>
		    
		  </div>
		  <div class="modal-footer">
	      <!--   <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
	        <button type="button" class="btn btn-primary">Save changes</button> -->
	        
	          <div class="modal-footer">
	         <div class="container container-no-margin">
                   <div class="row">
                       <div class="col s6 m6 mt-brdr center-align">
                           <div class="m-1">
                  			  <button type="button" onclick="addUser();" class="btn waves-effect waves-light bg-m" style="min-width:90px">Add</button>
                           </div>
                       </div>
                      <div class="col s6 m6 mt-brdr center-align">
                           <div class=" m-1">
                                 <a data-dismiss="modal" class="btn waves-effect waves-light bg-s w-text modal-action modal-close" >Close</a>
                           </div>
                       </div>
                   </div>
               </div>
           </div>
         </div>
        </div>
        </form>
	     </div>
	     
	        <!-- Update Modal Training -->
    <div id="onlyUpdateModal" class="modal">
	<form class="col s12" id="updateUserForm" name="updateUserForm" action="<%=request.getContextPath() %>/update-user" method="post" class="form-horizontal" role="form">
            <div class="modal-content">
                <h5 class="modal-header">Update User <span class="right modal-action modal-close" ><span
                            class="material-icons">x</span></span></h5>
           	  <div class="row">
		    <div class="input-field col s6 m6 l6">
		   	  <input  id="userId" type="hidden" name="user_id" class="validate">
		      <input  id="user_name_new" type="text" name="user_name_new" class="validate">
		      <label for="user_name_new">First Name<span class="required"> *</span></label>
		      <span id="user_name_newError" class="error-msg" ></span> 
		    </div>
		    <div class="input-field col s6 m6 l6">
		       <p class="searchable_label">Designation<span class="required"> *</span></p>
		     <select id="designation_new" name="designation_new" class="searchable validate-dropdown formSelect" >
                 <option value="">Select</option>
                 <c:forEach var="obj" items="${deptList }">
                 	<option value="${obj.designation }">${obj.designation }</option>
                 </c:forEach>
             </select>
             <span id="designation_newError" class="error-msg" ></span>
		    </div>
		  </div>
		   <div class="row">
		
		      <div class="input-field col s6 m6 l6 "> 
		      <input id="mobile_number_new" name="mobile_number_new" type="number" class="validate">
		      <label for="mobile_number_new">Mobile<span class="required"> *</span></label>
		       <span id="mobile_number_newError" class="error-msg" ></span> 
		    </div>
		     <div class="col s6 m6 l6 input-field">
		      <input id="email_new" name="email_new" type="email" class="validate">
		      <label for="email_new">Email<span class="required"> *</span></label><br>
		       <span id="email_newError" class="error-msg" ></span> 
		    </div>
		  </div>
		  <div class="modal-footer">
	          <div class="modal-footer">
	         <div class="container container-no-margin">
                   <div class="row">
                       <div class="col s6 m6 mt-brdr center-align">
                           <div class="m-1">
                  			  <button type="button" onclick="updateUser();" class="btn waves-effect waves-light bg-m" style="min-width:90px">Update</button>
                           </div>
                       </div>
                      <div class="col s6 m6 mt-brdr center-align">
                           <div class=" m-1">
                                 <a data-dismiss="modal" class="btn waves-effect waves-light bg-s w-text modal-action modal-close" >Close</a>
                           </div>
                       </div>
                   </div>
               </div>
           </div>
         </div>
        </div>
        </form>
	     </div>
		</div>
		</div>
		</div>
	</div>
  </div>
</div>

 	<script src="<c:url value="/resources/js/jQuery-v.3.5.min.js"  />"></script>
    <script src="<c:url value="/resources/js/materialize-v.1.0.min.js "  />"></script>
    <script src="<c:url value="/resources/js/jquery-validation-1.19.1.min.js"  />"></script>
    <script src="<c:url value="/resources/js/jquery.dataTables-v.1.10.min.js"  />"></script>
    <script src="<c:url value="/resources/js/dataTables.material.min.js"  />"></script>
    <script src="<c:url value="/resources/js/select2.min.js"  />"></script>
    <script src="<c:url value="/resources/js/moment-v2.8.4.min.js"  />"></script>
    <script src="<c:url value="/resources/js/datetime-moment-v1.10.12.js"  />"></script>
    <script src="<c:url value="/resources/js/sweetalert-v.1.1.0.min.js"  />"></script>
     <script src="<c:url value="/resources/vendors/js/extensions/sweetalert2.all.min.js" />"></script>
      <script src="<c:url value="/resources/js/scripts/extensions/ext-component-sweet-alerts.min.js" />"></script>
    <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
    <form name="getForm" id="getForm" method="post">
    	<input type="hidden" name="user_id" id="user_id" />
    </form>
    <script>
$(document).ready(function () {
	  $('.modal').modal({ dismissible: false });
	  $('select:not(.searchable)').formSelect();
      $('.searchable').select2();
      getUserList();
      $('#designationList').text(' Total Users');
      if('${welcome}' != ''){
    		  Swal.fire({
    			  position:"top-end",
    			  icon:"success",
    			  title:"Welcome ${sessionScope.USER_NAME}",
    			  showConfirmButton:!1,
    			  timer:1500,
    			  customClass:{confirmButton:"btn btn-primary"},
    			  buttonsStyling:!1})
      }
   
});

function getDesignationFilterList(work) {
    var designation = $("#designation_filter").val();
    if ($.trim(designation) == "") {
    	
    	$("#designation_filter option:not(:first)").remove();
    	var myParams = { designation: designation };
        $.ajax({
            url: "<%=request.getContextPath()%>/ajax/getDesignationFilterListInUser",
            data: myParams, cache: false,async: false,
            success: function (data) {
                if (data.length > 0) {
                    $.each(data, function (i, val) {
                         $("#designation_filter").append('<option name="' + val.count + '" total="' + val.totalCount + '" value="' + val.designation + '">' + $.trim(val.designation) +'</option>');
                    });
                }
                $('.searchable').select2();
            },error: function (jqXHR, exception) {
	   			      $(".page-loader").hide();
   	          	  getErrorMessage(jqXHR, exception);
   	     	  }
           
        });
    }
    if ($.trim(designation) != "") {
    	 var count = $("#designation_filter").find('option:selected').attr("name");
      	 $('#designationList').text(designation+' available');
      	 $('#count').text(count);
       }
}
var totalCount = 0;
function getUserList() {
		getDesignationFilterList('');
	 	
		var designation = $("#designation_filter").val();
		
	   	table = $('#datatable-user').DataTable();
		table.destroy();
		var i = 0;
		$.fn.dataTable.moment('DD-MMM-YYYY');
		var rowLen = 0;
		var myParams =  "designation="
				+ designation ;

		/***************************************************************************************************/

		$("#datatable-user")
				.DataTable(
						{
							"bProcessing" : true,
							"bServerSide" : true,
							"sort" : "position",
							//bStateSave variable you can use to save state on client cookies: set value "true" 
							"bStateSave" : false,
							 stateSave: true,
							 "fnStateSave": function (oSettings, oData) {
							 	localStorage.setItem('MRVCDataTables', JSON.stringify(oData));
							},
							 "fnStateLoad": function (oSettings) {
								return JSON.parse(localStorage.getItem('MRVCDataTables'));
							 },
							//Default: Page display length
							"iDisplayLength" : 10,
							"iData" : {
								"start" : 52
							},
							//We will use below variable to track page number on server side(For more information visit: http://legacy.datatables.net/usage/options#iDisplayStart)
							"iDisplayStart" : 0,
							"fnDrawCallback" : function() {
								//Get page numer on client. Please note: number start from 0 So
								//for the first page you will see 0 second page 1 third page 2...
								//Un-comment below alert to see page number
								//alert("Current page number: "+this.fnPagingInfo().iPage);
							var cou = $('#datatable-user tbody tr:visible').length
							 $('#count').text(cou);
							},
							//"sDom": 'l<"toolbar">frtip',
							"initComplete" : function() {
								$('.dataTables_filter input[type="search"] ')
										.attr('placeholder', 'Search')
										.css({
											'width' : '350px ',
											'display' : 'inline-block'
										});

								var input = $('.dataTables_filter input ')
										.unbind()
										.bind('keyup',function(e){
										    if (e.which == 13){
										    	self.search(input.val()).draw();
										    }
										}), self = this.api(), $searchButton = $(
										'<i class="fa fa-search" title="Go" >')
								//.text('Go')
								.click(function() {
									self.search(input.val()).draw();
								}), $clearButton = $(
										'<i class="fa fa-close" title="Reset">')
								//.text('X')
								.click(function() {
									input.val('');
									$searchButton.click();
								})
								$('.dataTables_filter').append(
										'<div class="right-btns"></div>');
								$('.dataTables_filter div').append(
										$searchButton, $clearButton);
								rowLen = $('#datatable-user tbody tr:visible').length
							
								/* var input = $('.dataTables_filter input').unbind(),
								self = this.api(),
								$searchButton = $('<i class="fa fa-search">')
								           //.text('Go')
								           .click(function() {			   	                    	 
								              self.search(input.val()).draw();
								           })			   	        
								  $('.dataTables_filter label').append($searchButton); */
							}
							,
							columnDefs : [ {
								"targets" : 'no-sort',
								"orderable" : false,
							},{targets:[2,3,4],
			                       className: 'hideCOl td-align-right'},{ targets: [0], className: 'no-sort'  }
			                       ,{ targets: [1], className: 'td-align-center'  }
			                ],
							"sScrollX" : "100%",
							"sScrollXInner" : "100%",
							"ordering":false,
							"bScrollCollapse" : true,
							"language" : {
								"info" : "_START_ - _END_ of _TOTAL_",
								paginate : {
									next : '<i class="fa fa-angle-right"></i>', 
									previous : '<i class="fa fa-angle-left"></i>'  
								}
							},
							
							"bDestroy" : true,
							"sAjaxSource" : "	<%=request.getContextPath()%>/ajax/get-users?"+myParams,
		        "aoColumns": [
		        	
		            { "mData": function(data,type,row){
                        if($.trim(data.user_id) == ''){ return '-'; }else{ return data.user_id ; }
 		            } },
 		         	{ "mData": function(data,type,row){
                        if($.trim(data.user_name) == ''){ return '-'; }else{ return data.user_name ; }
 		            } },
 		       
		            { "mData": function(data,type,row){ 
		            	if($.trim(data.designation) == ''){ return '-'; }else{ return data.designation; }
		            } },
		         	{ "mData": function(data,type,row){
		            	if($.trim(data.email) == ''){ return '-'; }else{ return data.email; }
		            } },
		            { "mData": function(data,type,row){
		            	if($.trim(data.mobile_number) == ''){ return '-'; }else{ return data.mobile_number; } 
		            } },
		         	{ "mData": function(data,type,row){
		         		
		         		var user_data = "'"+data.user_id+"','"+data.user_name+"','"+data.designation+"','"+data.email+"','"+data.mobile_number+"'";
	                    var actions = '<a href="javascript:void(0);"  onclick="getUser('+user_data+');" class="btn waves-effect waves-light bg-m t-c mob-btn" ><i class="fa fa-pencil"></i></a>'
	                    +'<a onclick="deleteUser('+user_data+');" class="btn waves-effect waves-light bg-s t-c "><i class="fa fa-trash"></i></a>';
	                    totalCount = "'"+data.totalCount+"'"
		            	return actions;
		            } }
		            
		        ]
		    });
}
function updateUser(){
	if(validator1.form()){ // validation perform
    	document.getElementById("updateUserForm").submit();	
	}
}
function getUser(userId,user_name,designation,email,mobile){
		 $('#user_name_new').val('');
		 $('#email_new').val('');
		 $('#mobile_number_new').val('');
		 $('#designation_new').val('');
		 $('#designation_new').prop("selected", false);
		 if(email == null || email == "undefined"){email = '' }
		 if(mobile == null || mobile == "undefined"){mobile = '' }
	      $('#userId').val($.trim(userId))
	      $('#onlyUpdateModal').modal('open');
	      $('#onlyUpdateModal #user_name_new').val($.trim(user_name)).focus();
	      $('#onlyUpdateModal #email_new').val($.trim(email)).focus();
	      $('#onlyUpdateModal #mobile_number_new').val($.trim(mobile)).focus();
	      if(designation != null && designation != ''  && designation != "undefined"){
	    	$('select[name^="designation_new"] option[value="'+ designation +'"]').attr("selected","selected");
	      }
	      $('.searchable').select2();
}

function addUser(){
	if(validator.form()){ // validation perform
    	document.getElementById("addUserForm").submit();	
	}
}
var validator1 =	$('#updateUserForm').validate({
	 errorClass: "my-error-class",
	 validClass: "my-valid-class",
	 ignore: ":hidden:not(.validate-dropdown)",
		    rules: {
		 		  "user_name_new": {
			 		required: true
			 	  },"designation_new": {										
			 		required: true
			 	  },"mobile_number_new": {
		 		    required: true,
			 		  minlength:10,
			 		  maxlength:14,
			 		  number: true
			 	  },"email_new": {
		 		    required: true,
	                   email: true
			 	  }
		 	},
		    messages: {
		 		 "user_name_new": {
				 	required: 'Required',
			 	  },"designation_new": {
			 		required: 'Required'
			 	  },"mobile_number_new": {
		 			required: 'Required'
		 	  	  },"email_new": {
		 			required: 'Required'
		 	  	  }
  		},
  		errorPlacement:function(error, element){
  		 	if (element.attr("id") == "user_name_new" ){
				 document.getElementById("user_name_newError").innerHTML="";
		 		 error.appendTo('#user_name_newError');
			}else if(element.attr("id") == "designation_new" ){
			   document.getElementById("designation_newError").innerHTML="";
		 	   error.appendTo('#designation_newError');
			}else if(element.attr("id") == "mobile_number_new" ){
				document.getElementById("mobile_number_newError").innerHTML="";
			 	error.appendTo('#mobile_number_newError');
			}else if(element.attr("id") == "email_new" ){
				document.getElementById("email_newError").innerHTML="";
			 	error.appendTo('#email_newError');
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
var validator =	$('#addUserForm').validate({
	 errorClass: "my-error-class",
	 validClass: "my-valid-class",
	 ignore: ":hidden:not(.validate-dropdown)",
		    rules: {
		 		  "user_name": {
			 		required: true
			 	  },"designation": {										
			 		required: true
			 	  },"password": {
	                    required: !0,
	                    strongePassword: true,
		 		    	maxlength : 8
			 	  },"mobile_number": {
			 		  required: true,
			 		  minlength:10,
			 		  maxlength:14,
			 		  number: true
			 	  },"email": {
		 		    required: true,
	                   email: true
			 	  }
		 	},
		    messages: {
		 		 "user_name": {
				 	required: 'Required',
			 	  },"designation": {
			 		required: 'Required'
			 	  },"password": {
		 			required: 'Required'
		 	  	  },"mobile_number": {
		 			required: 'Required'
		 	  	  },"email": {
		 			required: 'Required'
		 	  	  }
   		},
   		errorPlacement:function(error, element){
   		 	if (element.attr("id") == "user_name" ){
				 document.getElementById("user_nameError").innerHTML="";
		 		 error.appendTo('#user_nameError');
			}else if(element.attr("id") == "designation" ){
			   document.getElementById("designationError").innerHTML="";
		 	   error.appendTo('#designationError');
			}else if(element.attr("id") == "password" ){
				document.getElementById("passwordError").innerHTML="";
			 	error.appendTo('#passwordError');
			}else if(element.attr("id") == "mobile_number" ){
				document.getElementById("mobile_numberError").innerHTML="";
			 	error.appendTo('#mobile_numberError');
			}else if(element.attr("id") == "email" ){
				document.getElementById("emailError").innerHTML="";
			 	error.appendTo('#emailError');
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
	
	$.validator.addMethod("strongePassword", function(value) {
	    return /^[A-Za-z0-9\d=!\-@._*]*$/.test(value) && /[a-z]/.test(value) && /\d/.test(value) && /[A-Z]/.test(value);
	},"The password must contain at least 1 number, at least 1 lower case letter, and at least 1 upper case letter"); 

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
	
	 function deleteUser(user_id){
	    	$("#user_id").val(user_id);
	    	showCancelMessage();
	    }
	    	
	    
	  	//This function is used to get error message for all ajax calls
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
	    
	    
	  	
	    function showCancelMessage() {
	    	swal({
	            title: "Are you sure?",
	            text: "You will be changing the status of the record!",
	            type: "warning",
	            showCancelButton: true,
	            confirmButtonColor: "#DD6B55",
	            confirmButtonText: "Yes, delete it!",
	            cancelButtonText: "No, cancel it!",
	            closeOnConfirm: false,
	            closeOnCancel: false
	        }, function (isConfirm) {
	            if (isConfirm) {
	               // swal("Deleted!", "Record has been deleted", "success");
	            	$('#getForm').attr('action', '<%=request.getContextPath()%>/delete-user');
	    	    	$('#getForm').submit();
	           }else {
	                swal("Cancelled", "Record is safe :)", "error");
	            }
	        });
	    }
	    
	    function clearFilter(){
	    	$("#designation_filter").val("");
	    	window.location.href= "<%=request.getContextPath()%>/home";
	    }
	    const togglePassword = document.querySelector('#togglePassword');
	    const password = document.querySelector('#password');

	    togglePassword.addEventListener('click', function (e) {
	      // toggle the type attribute
	      const type = password.getAttribute('type') === 'text' ? 'password' : 'text';
	      password.setAttribute('type', type);
	      // toggle the eye slash icon
	      this.classList.toggle('fa-eye-slash');
	  });
</script>		
		   
		
</div>
	
</body>
</html>
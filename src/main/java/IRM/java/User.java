package IRM.java;

public class User {

	private String user_id,user_name,user_role,user_session_id,minutes,gToken,reporting_to,reporting_to_id,profileImg,current_project,id,	last_login_date_time,totalCount,password,email_id,mobile_number,user_name_new,designation_new,email_new,contact_number,totalUers,count,
	company_code,	project_code,	project_name,	status,	created_date,	created_by,	modified_date,	modified_by,all_users,active_users,inActive_users,
	location_code,	location_name,	company_name,module_id,	module_type,role,p_add,p_view,p_edit,p_approvals,p_reports,p_dashboards,p_auto_email,
	base_sbu,base_project,base_role,message,sbu_name,end_date,days,hours,last_login,	user_login_time,base_department,	user_logout_time,device_type,device_type_no,
	module_name,module_url,timePeriod;
	int session_count,time_period;
	
	public String getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}

	public String getMinutes() {
		return minutes;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}

	public String getLast_login() {
		return last_login;
	}

	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}

	public int getTime_period() {
		return time_period;
	}

	public void setTime_period(int time_period) {
		this.time_period = time_period;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getBase_department() {
		return base_department;
	}

	public void setBase_department(String base_department) {
		this.base_department = base_department;
	}

	public String getSbu_name() {
		return sbu_name;
	}

	public void setSbu_name(String sbu_name) {
		this.sbu_name = sbu_name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getP_add() {
		return p_add;
	}

	public void setP_add(String p_add) {
		this.p_add = p_add;
	}

	public String getP_view() {
		return p_view;
	}

	public void setP_view(String p_view) {
		this.p_view = p_view;
	}

	public String getP_edit() {
		return p_edit;
	}

	public void setP_edit(String p_edit) {
		this.p_edit = p_edit;
	}

	public String getP_approvals() {
		return p_approvals;
	}

	public void setP_approvals(String p_approvals) {
		this.p_approvals = p_approvals;
	}

	public String getP_reports() {
		return p_reports;
	}

	public void setP_reports(String p_reports) {
		this.p_reports = p_reports;
	}

	public String getP_dashboards() {
		return p_dashboards;
	}

	public void setP_dashboards(String p_dashboards) {
		this.p_dashboards = p_dashboards;
	}

	public String getP_auto_email() {
		return p_auto_email;
	}

	public void setP_auto_email(String p_auto_email) {
		this.p_auto_email = p_auto_email;
	}

	public String getBase_sbu() {
		return base_sbu;
	}

	public void setBase_sbu(String base_sbu) {
		this.base_sbu = base_sbu;
	}

	public String getBase_project() {
		return base_project;
	}

	public void setBase_project(String base_project) {
		this.base_project = base_project;
	}

	public String getBase_role() {
		return base_role;
	}

	public void setBase_role(String base_role) {
		this.base_role = base_role;
	}

	public String getReporting_to_id() {
		return reporting_to_id;
	}

	public void setReporting_to_id(String reporting_to_id) {
		this.reporting_to_id = reporting_to_id;
	}

	public String getAll_users() {
		return all_users;
	}

	public void setAll_users(String all_users) {
		this.all_users = all_users;
	}

	public String getActive_users() {
		return active_users;
	}

	public void setActive_users(String active_users) {
		this.active_users = active_users;
	}

	public String getInActive_users() {
		return inActive_users;
	}

	public void setInActive_users(String inActive_users) {
		this.inActive_users = inActive_users;
	}

	public String getModule_name() {
		return module_name;
	}

	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}

	public String getModule_url() {
		return module_url;
	}

	public void setModule_url(String module_url) {
		this.module_url = module_url;
	}

	public int getSession_count() {
		return session_count;
	}

	public void setSession_count(int session_count) {
		this.session_count = session_count;
	}

	public String getDevice_type_no() {
		return device_type_no;
	}

	public void setDevice_type_no(String device_type_no) {
		this.device_type_no = device_type_no;
	}

	public String getDevice_type() {
		return device_type;
	}

	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}

	public String getUser_session_id() {
		return user_session_id;
	}

	public void setUser_session_id(String user_session_id) {
		this.user_session_id = user_session_id;
	}

	public String getgToken() {
		return gToken;
	}

	public void setgToken(String gToken) {
		this.gToken = gToken;
	}

	public String getModule_id() {
		return module_id;
	}

	public void setModule_id(String module_id) {
		this.module_id = module_id;
	}

	public String getModule_type() {
		return module_type;
	}

	public void setModule_type(String module_type) {
		this.module_type = module_type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUser_login_time() {
		return user_login_time;
	}

	public void setUser_login_time(String user_login_time) {
		this.user_login_time = user_login_time;
	}

	public String getUser_logout_time() {
		return user_logout_time;
	}

	public void setUser_logout_time(String user_logout_time) {
		this.user_logout_time = user_logout_time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLast_login_date_time() {
		return last_login_date_time;
	}

	public void setLast_login_date_time(String last_login_date_time) {
		this.last_login_date_time = last_login_date_time;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}

	public String getReporting_to() {
		return reporting_to;
	}

	public void setReporting_to(String reporting_to) {
		this.reporting_to = reporting_to;
	}

	public String getCurrent_project() {
		return current_project;
	}

	public void setCurrent_project(String current_project) {
		this.current_project = current_project;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public String getCompany_code() {
		return company_code;
	}

	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}

	public String getProject_code() {
		return project_code;
	}

	public void setProject_code(String project_code) {
		this.project_code = project_code;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getModified_date() {
		return modified_date;
	}

	public void setModified_date(String modified_date) {
		this.modified_date = modified_date;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	public String getLocation_code() {
		return location_code;
	}

	public void setLocation_code(String location_code) {
		this.location_code = location_code;
	}

	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	public String getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getTotalUers() {
		return totalUers;
	}

	public void setTotalUers(String totalUers) {
		this.totalUers = totalUers;
	}

	public String getUser_name_new() {
		return user_name_new;
	}

	public void setUser_name_new(String user_name_new) {
		this.user_name_new = user_name_new;
	}

	public String getDesignation_new() {
		return designation_new;
	}

	public void setDesignation_new(String designation_new) {
		this.designation_new = designation_new;
	}

	public String getEmail_new() {
		return email_new;
	}

	public void setEmail_new(String email_new) {
		this.email_new = email_new;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	
}

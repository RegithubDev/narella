package com.resustainability.reisp.model;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class IRM {
	
	private String id,	project,document_code,maxRole,i_no_reviewer,maxRole2,mainStatus	,sb_notes,incident_type,email_id,role_code,all_irm,active_irm,inActive_irm,project_name,department_name,location_name,	email,description	,department_code,incident_name,user_id,	project_code	,location,	ptw_code	,
	risk_type,	photo	,status,created_date,action,sub_code,sub_name,	created_by	,modified_by,	mdified_date,attachment,
	approver_type,	approver_code	,	assigned_on,employee_code,	action_taken,incident_code,	corrective_action,location_code,from_date,to_date,	preventive_action,user_name,
	approver_name,	remarks,approver_type_before,employee_code_before,not_assigned, statusChanged,next_level_user,approver_type_name,from_and_to,sbu_code,sbu_name,role,user,
	admin_incidents , i_pending ,i_completed,sb_rei_notes,person_location,reinitiate_date,sb_date,ca_before,pa_before,remarks_before,doc_before,type_prevs,approver_prvs,
			person_responsible	,doc,capa_id,rca_id,tentative_date,investigation_team,base_role,base_department	,counts,ca,pa,level_status,	attachments,incident_types,	incident_seviourity,incident_category,	ua_type,	uc_type,	management_type	;

	List<IRM> irmFilesList;
	List<IRM> irmIncidentsList;
	List<IRM> irmRolesList,capaList;
	private String [] cas,pas,remarkss,tentative_dates,atachments,docs;

	private MultipartFile[] mediaList;
	
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getPerson_location() {
		return person_location;
	}

	public void setPerson_location(String person_location) {
		this.person_location = person_location;
	}

	public String getBase_role() {
		return base_role;
	}

	public void setBase_role(String base_role) {
		this.base_role = base_role;
	}

	public String getBase_department() {
		return base_department;
	}

	public void setBase_department(String base_department) {
		this.base_department = base_department;
	}

	public String getInvestigation_team() {
		return investigation_team;
	}

	public void setInvestigation_team(String investigation_team) {
		this.investigation_team = investigation_team;
	}

	public String getLevel_status() {
		return level_status;
	}

	public void setLevel_status(String level_status) {
		this.level_status = level_status;
	}

	public String getCounts() {
		return counts;
	}

	public void setCounts(String counts) {
		this.counts = counts;
	}

	public String[] getDocs() {
		return docs;
	}

	public void setDocs(String[] docs) {
		this.docs = docs;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public String getCapa_id() {
		return capa_id;
	}

	public void setCapa_id(String capa_id) {
		this.capa_id = capa_id;
	}

	public String getRca_id() {
		return rca_id;
	}

	public void setRca_id(String rca_id) {
		this.rca_id = rca_id;
	}

	public List<IRM> getCapaList() {
		return capaList;
	}

	public void setCapaList(List<IRM> capaList) {
		this.capaList = capaList;
	}

	public String getIncident_types() {
		return incident_types;
	}

	public void setIncident_types(String incident_types) {
		this.incident_types = incident_types;
	}

	public String[] getCas() {
		return cas;
	}

	public void setCas(String[] cas) {
		this.cas = cas;
	}

	public String[] getPas() {
		return pas;
	}

	public void setPas(String[] pas) {
		this.pas = pas;
	}

	public String[] getRemarkss() {
		return remarkss;
	}

	public void setRemarkss(String[] remarkss) {
		this.remarkss = remarkss;
	}

	public String[] getTentative_dates() {
		return tentative_dates;
	}

	public void setTentative_dates(String[] tentative_dates) {
		this.tentative_dates = tentative_dates;
	}

	public String[] getAtachments() {
		return atachments;
	}

	public void setAtachments(String[] atachments) {
		this.atachments = atachments;
	}

	public String getCa() {
		return ca;
	}

	public void setCa(String ca) {
		this.ca = ca;
	}

	public String getPa() {
		return pa;
	}

	public void setPa(String pa) {
		this.pa = pa;
	}

	
	public String getIncident_category() {
		return incident_category;
	}

	public void setIncident_category(String incident_category) {
		this.incident_category = incident_category;
	}

	public String getPerson_responsible() {
		return person_responsible;
	}

	public void setPerson_responsible(String person_responsible) {
		this.person_responsible = person_responsible;
	}

	public String getTentative_date() {
		return tentative_date;
	}

	public void setTentative_date(String tentative_date) {
		this.tentative_date = tentative_date;
	}

	public String getAttachments() {
		return attachments;
	}

	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}

	public String getIncident_seviourity() {
		return incident_seviourity;
	}

	public void setIncident_seviourity(String incident_seviourity) {
		this.incident_seviourity = incident_seviourity;
	}

	public String getUa_type() {
		return ua_type;
	}

	public void setUa_type(String ua_type) {
		this.ua_type = ua_type;
	}

	public String getUc_type() {
		return uc_type;
	}

	public void setUc_type(String uc_type) {
		this.uc_type = uc_type;
	}

	public String getManagement_type() {
		return management_type;
	}

	public void setManagement_type(String management_type) {
		this.management_type = management_type;
	}

	public String getMainStatus() {
		return mainStatus;
	}

	public void setMainStatus(String mainStatus) {
		this.mainStatus = mainStatus;
	}

	public String getMaxRole2() {
		return maxRole2;
	}

	public void setMaxRole2(String maxRole2) {
		this.maxRole2 = maxRole2;
	}

	public String getType_prevs() {
		return type_prevs;
	}

	public void setType_prevs(String type_prevs) {
		this.type_prevs = type_prevs;
	}

	public String getApprover_prvs() {
		return approver_prvs;
	}

	public void setApprover_prvs(String approver_prvs) {
		this.approver_prvs = approver_prvs;
	}

	public String getCa_before() {
		return ca_before;
	}

	public void setCa_before(String ca_before) {
		this.ca_before = ca_before;
	}

	public String getPa_before() {
		return pa_before;
	}

	public void setPa_before(String pa_before) {
		this.pa_before = pa_before;
	}

	public String getRemarks_before() {
		return remarks_before;
	}

	public void setRemarks_before(String remarks_before) {
		this.remarks_before = remarks_before;
	}

	public String getDoc_before() {
		return doc_before;
	}

	public void setDoc_before(String doc_before) {
		this.doc_before = doc_before;
	}

	public String getSb_notes() {
		return sb_notes;
	}

	public void setSb_notes(String sb_notes) {
		this.sb_notes = sb_notes;
	}

	public String getSb_rei_notes() {
		return sb_rei_notes;
	}

	public void setSb_rei_notes(String sb_rei_notes) {
		this.sb_rei_notes = sb_rei_notes;
	}

	public String getReinitiate_date() {
		return reinitiate_date;
	}

	public void setReinitiate_date(String reinitiate_date) {
		this.reinitiate_date = reinitiate_date;
	}

	public String getSb_date() {
		return sb_date;
	}

	public void setSb_date(String sb_date) {
		this.sb_date = sb_date;
	}

	public String getI_no_reviewer() {
		return i_no_reviewer;
	}

	public void setI_no_reviewer(String i_no_reviewer) {
		this.i_no_reviewer = i_no_reviewer;
	}

	public String getApprover_type_name() {
		return approver_type_name;
	}

	public void setApprover_type_name(String approver_type_name) {
		this.approver_type_name = approver_type_name;
	}

	public String getMaxRole() {
		return maxRole;
	}

	public void setMaxRole(String maxRole) {
		this.maxRole = maxRole;
	}

	public String getAdmin_incidents() {
		return admin_incidents;
	}

	public void setAdmin_incidents(String admin_incidents) {
		this.admin_incidents = admin_incidents;
	}

	public String getI_pending() {
		return i_pending;
	}

	public void setI_pending(String i_pending) {
		this.i_pending = i_pending;
	}

	public String getI_completed() {
		return i_completed;
	}

	public void setI_completed(String i_completed) {
		this.i_completed = i_completed;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public String getNot_assigned() {
		return not_assigned;
	}

	public void setNot_assigned(String not_assigned) {
		this.not_assigned = not_assigned;
	}

	public String getSub_code() {
		return sub_code;
	}

	public void setSub_code(String sub_code) {
		this.sub_code = sub_code;
	}

	public String getSbu_code() {
		return sbu_code;
	}

	public void setSbu_code(String sbu_code) {
		this.sbu_code = sbu_code;
	}

	public String getSbu_name() {
		return sbu_name;
	}

	public void setSbu_name(String sbu_name) {
		this.sbu_name = sbu_name;
	}

	public String getFrom_and_to() {
		return from_and_to;
	}

	public void setFrom_and_to(String from_and_to) {
		this.from_and_to = from_and_to;
	}

	public String getNext_level_user() {
		return next_level_user;
	}

	public void setNext_level_user(String next_level_user) {
		this.next_level_user = next_level_user;
	}

	public String getStatusChanged() {
		return statusChanged;
	}

	public void setStatusChanged(String statusChanged) {
		this.statusChanged = statusChanged;
	}

	public String getApprover_type_before() {
		return approver_type_before;
	}

	public void setApprover_type_before(String approver_type_before) {
		this.approver_type_before = approver_type_before;
	}

	public String getEmployee_code_before() {
		return employee_code_before;
	}

	public void setEmployee_code_before(String employee_code_before) {
		this.employee_code_before = employee_code_before;
	}

	public String getEmployee_code() {
		return employee_code;
	}

	public void setEmployee_code(String employee_code) {
		this.employee_code = employee_code;
	}

	public String getRole_code() {
		return role_code;
	}

	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}

	public List<IRM> getIrmRolesList() {
		return irmRolesList;
	}

	public void setIrmRolesList(List<IRM> irmRolesList) {
		this.irmRolesList = irmRolesList;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public List<IRM> getIrmIncidentsList() {
		return irmIncidentsList;
	}

	public void setIrmIncidentsList(List<IRM> irmIncidentsList) {
		this.irmIncidentsList = irmIncidentsList;
	}

	public List<IRM> getIrmFilesList() {
		return irmFilesList;
	}

	public void setIrmFilesList(List<IRM> irmFilesList) {
		this.irmFilesList = irmFilesList;
	}

	public String getFrom_date() {
		return from_date;
	}

	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}

	public String getTo_date() {
		return to_date;
	}

	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

	public String getLocation_code() {
		return location_code;
	}

	public void setLocation_code(String location_code) {
		this.location_code = location_code;
	}

	public String getIncident_code() {
		return incident_code;
	}

	public void setIncident_code(String incident_code) {
		this.incident_code = incident_code;
	}

	public String getAll_irm() {
		return all_irm;
	}

	public void setAll_irm(String all_irm) {
		this.all_irm = all_irm;
	}

	public String getActive_irm() {
		return active_irm;
	}

	public void setActive_irm(String active_irm) {
		this.active_irm = active_irm;
	}

	public String getInActive_irm() {
		return inActive_irm;
	}

	public void setInActive_irm(String inActive_irm) {
		this.inActive_irm = inActive_irm;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getIncident_name() {
		return incident_name;
	}

	public void setIncident_name(String incident_name) {
		this.incident_name = incident_name;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getApprover_name() {
		return approver_name;
	}

	public void setApprover_name(String approver_name) {
		this.approver_name = approver_name;
	}

	
	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public MultipartFile[] getMediaList() {
		return mediaList;
	}

	public void setMediaList(MultipartFile[] mediaList) {
		this.mediaList = mediaList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDocument_code() {
		return document_code;
	}

	public void setDocument_code(String document_code) {
		this.document_code = document_code;
	}

	public String getIncident_type() {
		return incident_type;
	}

	public void setIncident_type(String incident_type) {
		this.incident_type = incident_type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDepartment_code() {
		return department_code;
	}

	public void setDepartment_code(String department_code) {
		this.department_code = department_code;
	}

	public String getProject_code() {
		return project_code;
	}

	public void setProject_code(String project_code) {
		this.project_code = project_code;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPtw_code() {
		return ptw_code;
	}

	public void setPtw_code(String ptw_code) {
		this.ptw_code = ptw_code;
	}

	public String getRisk_type() {
		return risk_type;
	}

	public void setRisk_type(String risk_type) {
		this.risk_type = risk_type;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
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

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	public String getMdified_date() {
		return mdified_date;
	}

	public void setMdified_date(String mdified_date) {
		this.mdified_date = mdified_date;
	}

	public String getApprover_type() {
		return approver_type;
	}

	public void setApprover_type(String approver_type) {
		this.approver_type = approver_type;
	}

	public String getApprover_code() {
		return approver_code;
	}

	public void setApprover_code(String approver_code) {
		this.approver_code = approver_code;
	}

	public String getAssigned_on() {
		return assigned_on;
	}

	public void setAssigned_on(String assigned_on) {
		this.assigned_on = assigned_on;
	}

	public String getAction_taken() {
		return action_taken;
	}

	public void setAction_taken(String action_taken) {
		this.action_taken = action_taken;
	}

	public String getCorrective_action() {
		return corrective_action;
	}

	public void setCorrective_action(String corrective_action) {
		this.corrective_action = corrective_action;
	}

	public String getPreventive_action() {
		return preventive_action;
	}

	public void setPreventive_action(String preventive_action) {
		this.preventive_action = preventive_action;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}

package com.bezkoder.springjwt.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.OffsetDateTime;
import java.time.LocalDate;

@Entity
@Table(name = "s1_main")
@Data
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prikey")
    private Long priKey;

    @Column(name = "parkey")
    private Integer parKey;

    @Column(name = "_bad")
    private Boolean bad;

    @Column(name = "_bad_reason")
    private String badReason;

    @Column(name = "_audit")
    private String audit;

    @Column(name = "_audit_raw")
    private String auditRaw;

    @Column(name = "_user")
    private String user;

    @Column(name = "_version")
    private String version;

    @Column(name = "_survey_notes")
    private String surveyNotes;

    @Column(name = "_location_trigger")
    private String locationTrigger;

    @Column(name = "_assigned")
    private String assigned;

    @Column(name = "_complete")
    private Boolean complete;

    @Column(name = "_modified")
    private Boolean modified;

    @Column(name = "_upload_time")
    private OffsetDateTime uploadTime;

    @Column(name = "_s_id")
    private Integer sId;

    @Column(name = "instanceid")
    private String instanceId2;

    @Column(name = "instancename")
    private String instanceName;

    @Column(name = "_thread")
    private String thread;

    @Column(name = "_thread_created")
    private OffsetDateTime threadCreated;

    @Column(name = "_case_closed")
    private OffsetDateTime caseClosed;

    @Column(name = "_case_survey")
    private String caseSurvey;

    @Column(name = "_alert")
    private String alert;

    @Column(name = "_scheduled_start")
    private OffsetDateTime scheduledStart;

    @Column(name = "_hrk")
    private String hrk;

    @Column(name = "startdatetime")
    private OffsetDateTime startDateTime;

    @Column(name = "endtime")
    private OffsetDateTime endTime;

    @Column(name = "deviceid")
    private String deviceId;

    @Column(name = "today")
    private LocalDate today;

    @Column(name = "subscriberid")
    private String subscriberId;

    @Column(name = "simid")
    private String simId;

    @Column(name = "devicephonenum")
    private String devicePhoneNum;

    @Column(name = "note_title")
    private String noteTitle;

    @Column(name = "note_introduction1")
    private String noteIntroduction1;

    @Column(name = "registrationdate")
    private LocalDate registrationDate;

    @Column(name = "sphere")
    private String sphere;

    @Column(name = "financialyear")
    private String financialYear;

    @Column(name = "typeofinfo")
    private String typeOfInfo;

    @Column(name = "fundtype")
    private String fundType;

    @Column(name = "vote_code")
    private String voteCode;

    @Column(name = "vote_name")
    private String voteName;

    @Column(name = "sub_subprogramme_code")
    private String subSubProgrammeCode;

    @Column(name = "sub_subprogramme_name")
    private String subSubProgrammeName;

    @Column(name = "service_area_code")
    private String serviceAreaCode;

    @Column(name = "service_area_name")
    private String serviceAreaName;

    @Column(name = "programme_code")
    private String programmeCode;

    @Column(name = "programme_name")
    private String programmeName;

    @Column(name = "subprogramme_code")
    private String subProgrammeCode;

    @Column(name = "subprogramme_name")
    private String subProgrammeName;

    @Column(name = "budget_output_code")
    private String budgetOutputCode;

    @Column(name = "budget_output_description")
    private String budgetOutputDescription;

    @Column(name = "project_code")
    private String projectCode;

    @Column(name = "item_code")
    private String itemCode;

    @Column(name = "item_description")
    private String itemDescription;

    @Column(name = "fundingsourcecode")
    private String fundingSourceCode;

    @Column(name = "fundingsource")
    private String fundingSource;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "today_date")
    private String todayDate;

    @Column(name = "random_num")
    private String randomNum;

    @Column(name = "instance_id")
    private String instanceId;

    @Column(name = "note_end")
    private String noteEnd; 



    public Integer getParKey() {
        return this.parKey;
    }

    public void setParKey(Integer parKey) {
        this.parKey = parKey;
    }

    public Boolean isBad() {
        return this.bad;
    }

    public Boolean getBad() {
        return this.bad;
    }

    public void setBad(Boolean bad) {
        this.bad = bad;
    }

    public String getBadReason() {
        return this.badReason;
    }

    public void setBadReason(String badReason) {
        this.badReason = badReason;
    }

    public String getAudit() {
        return this.audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    public String getAuditRaw() {
        return this.auditRaw;
    }

    public void setAuditRaw(String auditRaw) {
        this.auditRaw = auditRaw;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSurveyNotes() {
        return this.surveyNotes;
    }

    public void setSurveyNotes(String surveyNotes) {
        this.surveyNotes = surveyNotes;
    }

    public String getLocationTrigger() {
        return this.locationTrigger;
    }

    public void setLocationTrigger(String locationTrigger) {
        this.locationTrigger = locationTrigger;
    }

    public String getAssigned() {
        return this.assigned;
    }

    public void setAssigned(String assigned) {
        this.assigned = assigned;
    }

    public Boolean isComplete() {
        return this.complete;
    }

    public Boolean getComplete() {
        return this.complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public Boolean isModified() {
        return this.modified;
    }

    public Boolean getModified() {
        return this.modified;
    }

    public void setModified(Boolean modified) {
        this.modified = modified;
    }

    public OffsetDateTime getUploadTime() {
        return this.uploadTime;
    }

    public void setUploadTime(OffsetDateTime uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Integer getSId() {
        return this.sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public String getInstanceId2() {
        return this.instanceId2;
    }

    public void setInstanceId2(String instanceId2) {
        this.instanceId2 = instanceId2;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getThread() {
        return this.thread;
    }

    public void setThread(String thread) {
        this.thread = thread;
    }

    public OffsetDateTime getThreadCreated() {
        return this.threadCreated;
    }

    public void setThreadCreated(OffsetDateTime threadCreated) {
        this.threadCreated = threadCreated;
    }

    public OffsetDateTime getCaseClosed() {
        return this.caseClosed;
    }

    public void setCaseClosed(OffsetDateTime caseClosed) {
        this.caseClosed = caseClosed;
    }

    public String getCaseSurvey() {
        return this.caseSurvey;
    }

    public void setCaseSurvey(String caseSurvey) {
        this.caseSurvey = caseSurvey;
    }

    public String getAlert() {
        return this.alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public OffsetDateTime getScheduledStart() {
        return this.scheduledStart;
    }

    public void setScheduledStart(OffsetDateTime scheduledStart) {
        this.scheduledStart = scheduledStart;
    }

    public String getHrk() {
        return this.hrk;
    }

    public void setHrk(String hrk) {
        this.hrk = hrk;
    }

    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }

    public void setStartDateTime(OffsetDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public LocalDate getToday() {
        return this.today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public String getSubscriberId() {
        return this.subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getSimId() {
        return this.simId;
    }

    public void setSimId(String simId) {
        this.simId = simId;
    }

    public String getDevicePhoneNum() {
        return this.devicePhoneNum;
    }

    public void setDevicePhoneNum(String devicePhoneNum) {
        this.devicePhoneNum = devicePhoneNum;
    }

    public String getNoteTitle() {
        return this.noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteIntroduction1() {
        return this.noteIntroduction1;
    }

    public void setNoteIntroduction1(String noteIntroduction1) {
        this.noteIntroduction1 = noteIntroduction1;
    }

    public LocalDate getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getSphere() {
        return this.sphere;
    }

    public void setSphere(String sphere) {
        this.sphere = sphere;
    }

    public String getFinancialYear() {
        return this.financialYear;
    }

    public void setFinancialYear(String financialYear) {
        this.financialYear = financialYear;
    }

    public String getTypeOfInfo() {
        return this.typeOfInfo;
    }

    public void setTypeOfInfo(String typeOfInfo) {
        this.typeOfInfo = typeOfInfo;
    }

    public String getFundType() {
        return this.fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getVoteCode() {
        return this.voteCode;
    }

    public void setVoteCode(String voteCode) {
        this.voteCode = voteCode;
    }

    public String getVoteName() {
        return this.voteName;
    }

    public void setVoteName(String voteName) {
        this.voteName = voteName;
    }

    public String getSubSubProgrammeCode() {
        return this.subSubProgrammeCode;
    }

    public void setSubSubProgrammeCode(String subSubProgrammeCode) {
        this.subSubProgrammeCode = subSubProgrammeCode;
    }

    public String getSubSubProgrammeName() {
        return this.subSubProgrammeName;
    }

    public void setSubSubProgrammeName(String subSubProgrammeName) {
        this.subSubProgrammeName = subSubProgrammeName;
    }

    public String getServiceAreaCode() {
        return this.serviceAreaCode;
    }

    public void setServiceAreaCode(String serviceAreaCode) {
        this.serviceAreaCode = serviceAreaCode;
    }

    public String getServiceAreaName() {
        return this.serviceAreaName;
    }

    public void setServiceAreaName(String serviceAreaName) {
        this.serviceAreaName = serviceAreaName;
    }

    public String getProgrammeCode() {
        return this.programmeCode;
    }

    public void setProgrammeCode(String programmeCode) {
        this.programmeCode = programmeCode;
    }

    public String getProgrammeName() {
        return this.programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    public String getSubProgrammeCode() {
        return this.subProgrammeCode;
    }

    public void setSubProgrammeCode(String subProgrammeCode) {
        this.subProgrammeCode = subProgrammeCode;
    }

    public String getSubProgrammeName() {
        return this.subProgrammeName;
    }

    public void setSubProgrammeName(String subProgrammeName) {
        this.subProgrammeName = subProgrammeName;
    }

    public String getBudgetOutputCode() {
        return this.budgetOutputCode;
    }

    public void setBudgetOutputCode(String budgetOutputCode) {
        this.budgetOutputCode = budgetOutputCode;
    }

    public String getBudgetOutputDescription() {
        return this.budgetOutputDescription;
    }

    public void setBudgetOutputDescription(String budgetOutputDescription) {
        this.budgetOutputDescription = budgetOutputDescription;
    }

    public String getProjectCode() {
        return this.projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemDescription() {
        return this.itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getFundingSourceCode() {
        return this.fundingSourceCode;
    }

    public void setFundingSourceCode(String fundingSourceCode) {
        this.fundingSourceCode = fundingSourceCode;
    }

    public String getFundingSource() {
        return this.fundingSource;
    }

    public void setFundingSource(String fundingSource) {
        this.fundingSource = fundingSource;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getTodayDate() {
        return this.todayDate;
    }

    public void setTodayDate(String todayDate) {
        this.todayDate = todayDate;
    }

    public String getRandomNum() {
        return this.randomNum;
    }

    public void setRandomNum(String randomNum) {
        this.randomNum = randomNum;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getNoteEnd() {
        return this.noteEnd;
    }

    public void setNoteEnd(String noteEnd) {
        this.noteEnd = noteEnd;
    }

}

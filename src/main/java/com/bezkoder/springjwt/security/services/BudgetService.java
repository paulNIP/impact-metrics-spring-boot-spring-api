package com.bezkoder.springjwt.security.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.Budget;
import com.bezkoder.springjwt.repository.BudgetRepository;

@Service
public class BudgetService {

    private final BudgetRepository budgetRepository;

    public BudgetService(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    public List<Budget> getAll() {
        return budgetRepository.findAll();
    }

    public Budget getById(Long id) {
        return budgetRepository.findById(id).orElse(null);
    }

    public Budget create(Budget budget) {
        return budgetRepository.save(budget);
    }

    public Budget update(Long id, Budget updated) {
        return budgetRepository.findById(id)
                .map(existing -> {

    existing.setParKey(updated.getParKey());

    existing.setBad(updated.getBad()); 


    existing.setBadReason(updated.getBadReason()); 

    existing.setAudit(updated.getAudit());


    existing.setAuditRaw(updated.getAuditRaw());
    existing.setUser(updated.getUser());
    existing.setVersion(updated.getVersion()) ;
    existing.setSurveyNotes(updated.getSurveyNotes());
    existing.setLocationTrigger(updated.getLocationTrigger()) ;
    existing.setAssigned(updated.getAssigned()) ;
    existing.setComplete(updated.getComplete());
    existing.setModified(updated.getModified());
    existing.setUploadTime(updated.getUploadTime()); 
    existing.setSId(updated.getSId());
    existing.setInstanceId2(updated.getInstanceId2());
    existing.setInstanceName(updated.getInstanceName()) ;

    existing.setThread(updated.getThread()) ;
    existing.setThreadCreated(updated.getThreadCreated()) ;
    existing.setCaseSurvey(updated.getCaseSurvey()) ;
    existing.setAlert(updated.getAlert()) ;
    existing.setScheduledStart(updated.getScheduledStart()) ;
    existing.setHrk(updated.getHrk()) ;
    existing.setStartDateTime(updated.getStartDateTime()) ; 
    existing.setEndTime(updated.getEndTime()) ;
    existing.setDeviceId(updated.getDeviceId());
            existing.setToday(updated.getToday());
            existing.setSubscriberId(updated.getSubscriberId());
            existing.setSimId(updated.getSimId());
            existing.setDevicePhoneNum(updated.getDevicePhoneNum());
            existing.setNoteTitle(updated.getNoteTitle());
            existing.setNoteIntroduction1(updated.getNoteIntroduction1());
            existing.setRegistrationDate(updated.getRegistrationDate()); 
            existing.setSphere(updated.getSphere());
            existing.setFinancialYear(updated.getFinancialYear());
            existing.setTypeOfInfo(updated.getTypeOfInfo());
            existing.setFundType(updated.getFundType()  ); 
            existing.setVoteCode(updated.getVoteCode()  );
            existing.setVoteName(updated.getVoteName()  );
            existing.setSubSubProgrammeCode(updated.getSubSubProgrammeCode()  );
            existing.setSubSubProgrammeName(updated.getSubSubProgrammeName()  );
            existing.setServiceAreaCode(updated.getServiceAreaCode()  );
            existing.setServiceAreaName(updated.getServiceAreaName()  );
            existing.setProgrammeCode(updated.getProgrammeCode()  );
            existing.setProgrammeName(updated.getProgrammeName()  );
            existing.setSubProgrammeCode(updated.getSubProgrammeCode()  );
            existing.setSubProgrammeName(updated.getSubProgrammeName()  );
            existing.setBudgetOutputCode(updated.getBudgetOutputCode()  );
            existing.setBudgetOutputDescription(updated.getBudgetOutputDescription()  );
            existing.setProjectCode(updated.getProjectCode()  );
            existing.setItemCode(updated.getItemCode()  ); 
            existing.setItemDescription(updated.getItemDescription() );
            existing.setFundingSourceCode(updated.getFundingSourceCode() );
            existing.setFundingSource(updated.getFundingSource() );
            existing.setAmount(updated.getAmount()) ;
            existing.setTodayDate(updated.getTodayDate()) ;
            existing.setRandomNum(updated.getRandomNum()) ;
            existing.setInstanceId(updated.getInstanceId()  ); 
            existing.setNoteEnd(updated.getNoteEnd()  );
                    return budgetRepository.save(existing);
                })
                .orElse(null);
    }

    public void delete(Long id) {
        budgetRepository.deleteById(id);
    }
    
}

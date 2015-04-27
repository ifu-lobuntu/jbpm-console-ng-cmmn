package org.jbpm.console.ng.cmmn.backend.server;

import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jboss.errai.bus.server.annotations.Service;
import org.jbpm.console.ng.cmmn.model.PlanItemSummary;
import org.jbpm.console.ng.cmmn.model.PlanSummary;
import org.jbpm.console.ng.cmmn.service.CmmnServiceEntryPoint;

@Service
@ApplicationScoped
public class CmmnServiceEntryPointImpl implements CmmnServiceEntryPoint {

    @Override
    public void reactivateTask(long taskId, String userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void suspendTask(long taskId, String userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void resumeTask(long taskId, String userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void terminateTask(long taskId, String userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void reactivatePlanItem(long processInstanceId, long[] nodeInstanceIdPath, String userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void startPlanItemManually(long processInstanceId, long[] nodeInstanceIdPath, String userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void terminatePlanItem(long processInstanceId, long[] nodeInstanceIdPath, String userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void completeStageInstanceManually(long processInstanceId, long[] nodeInstanceIdPath, String userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void suspendElement(long processInstanceId, long[] nodeInstanceIdPath, String userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void resumeElement(long processInstanceId, long[] nodeInstanceIdPath, String userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void reactivateCaseInstance(long processInstanceId, String userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void suspendCaseInstance(long processInstanceId, String userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void terminateCaseInstance(long processInstanceId, String userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void completeCaseInstanceManually(long processInstanceId, String userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void completeCaseInstanceManually(long processInstanceId, String userId, Map<String, Object> outputOverrides) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void closeCaseInstance(long processInstanceId, String userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public PlanSummary getPlan(long caseInstanceId, long[] planningTableContainerInstanceIdPath, String user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PlanSummary getPlan(long caseInstanceId, String user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PlanItemSummary[] getPlanningContexts(long caseInstanceId, String user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void includeRepeatableDiscretionaryItem(long caseInstanceId, int count, String discretionaryItemId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void includeRepeatableDiscretionaryItem(long caseInstanceId, long[] planningTableContainerInstanceIdPath, int count, String discretionaryItemId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void includeDiscretionaryItem(long caseInstanceId, String discretionaryItemId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void includeDiscretionaryItem(long caseInstanceId, long[] planningTableContainerInstanceIdPath, String discretionaryItemId) {
        // TODO Auto-generated method stub
        
    }
}

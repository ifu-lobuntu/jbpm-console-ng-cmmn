package org.jbpm.console.ng.cmmn.service;

import java.util.Map;

import org.jboss.errai.bus.server.annotations.Remote;
import org.jbpm.console.ng.cmmn.model.PlanItemSummary;
import org.jbpm.console.ng.cmmn.model.PlanSummary;

@Remote
public interface CmmnServiceEntryPoint {
	// HumanTaskLifecycle
	void reactivateTask(long taskId, String userId);

	void suspendTask(long taskId, String userId);

	void resumeTask(long taskId, String userId);

	void terminateTask(long taskId, String userId);

	// ControllableElementLifecycle without tasks (Stage, CaseTask, ProcessTask)
	void reactivatePlanItem(long processInstanceId, long[] nodeInstanceIdPath, String userId);

	void startPlanItemManually(long processInstanceId, long[] nodeInstanceIdPath, String userId);

	void terminatePlanItem(long processInstanceId, long[] nodeInstanceIdPath, String userId);

	// StageInstanceLifecycle
	void completeStageInstanceManually(long processInstanceId, long[] nodeInstanceIdPath, String userId);
	
	// Occurable and ControllableLifecycles (stage CaseTask, ProcessTask,
	// Milestone, TimerEvent, UserEvent)

	void suspendElement(long processInstanceId, long[] nodeInstanceIdPath, String userId);

	void resumeElement(long processInstanceId, long[] nodeInstanceIdPath, String userId);

	// CaseInstanceLifeCycle
	void reactivateCaseInstance(long processInstanceId, String userId);

	void suspendCaseInstance(long processInstanceId, String userId);

	void terminateCaseInstance(long processInstanceId, String userId);

	void completeCaseInstanceManually(long processInstanceId, String userId);

	void completeCaseInstanceManually(long processInstanceId, String userId, Map<String, Object> outputOverrides);

	void closeCaseInstance(long processInstanceId, String userId);

	// Planning
	PlanSummary getPlan(long caseInstanceId, long[] planningTableContainerInstanceIdPath, String user);

	PlanSummary getPlan(long caseInstanceId, String user);

	PlanItemSummary[] getPlanningContexts(long caseInstanceId, String user);

	void includeRepeatableDiscretionaryItem(long caseInstanceId, int count, String discretionaryItemId);

	void includeRepeatableDiscretionaryItem(long caseInstanceId, long[] planningTableContainerInstanceIdPath, int count, String discretionaryItemId);

	void includeDiscretionaryItem(long caseInstanceId, String discretionaryItemId);

	void includeDiscretionaryItem(long caseInstanceId, long[] planningTableContainerInstanceIdPath, String discretionaryItemId);

}
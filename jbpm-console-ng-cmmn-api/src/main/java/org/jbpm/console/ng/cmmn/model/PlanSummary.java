package org.jbpm.console.ng.cmmn.model;

import java.io.Serializable;
import java.util.List;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class PlanSummary implements Serializable{

	private static final long serialVersionUID = -8476766047710793346L;
	private long caseInstanceId;
	private long[] planningTableContainerInstanceId;
	private List<PlanItemSummary> planItems;
    public long getCaseInstanceId() {
        return caseInstanceId;
    }
    public void setCaseInstanceId(long caseInstanceId) {
        this.caseInstanceId = caseInstanceId;
    }
    public long[] getPlanningTableContainerInstanceId() {
        return planningTableContainerInstanceId;
    }
    public void setPlanningTableContainerInstanceId(long[] planningTableContainerInstanceId) {
        this.planningTableContainerInstanceId = planningTableContainerInstanceId;
    }
    public List<PlanItemSummary> getPlanItems() {
        return planItems;
    }
    public void setPlanItems(List<PlanItemSummary> planItems) {
        this.planItems = planItems;
    }
}

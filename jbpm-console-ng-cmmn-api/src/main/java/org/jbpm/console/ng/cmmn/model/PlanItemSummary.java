package org.jbpm.console.ng.cmmn.model;

import java.io.Serializable;
import java.util.List;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class PlanItemSummary implements Serializable {

	private static final long serialVersionUID = -8002535377850582793L;
	private long[] pathToParent;
	private long planItemInstanceId=-1;
	private String discretionaryItemId;
	private String name;
	private PlanItemType type;
	private List<PlanningOperation> allowableOperations;
	private boolean canCreateMany;//true if there is repetitionRule=true and entryCriteria.isEmpty() 
	public boolean canCreateAnother(){
		return discretionaryItemId==null && planItemInstanceId>-1;
	}
    public long[] getPathToParent() {
        return pathToParent;
    }
    public void setPathToParent(long[] pathToParent) {
        this.pathToParent = pathToParent;
    }
    public long getPlanItemInstanceId() {
        return planItemInstanceId;
    }
    public void setPlanItemInstanceId(long planItemInstanceId) {
        this.planItemInstanceId = planItemInstanceId;
    }
    public String getDiscretionaryItemId() {
        return discretionaryItemId;
    }
    public void setDiscretionaryItemId(String discretionaryItemId) {
        this.discretionaryItemId = discretionaryItemId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public PlanItemType getType() {
        return type;
    }
    public void setType(PlanItemType type) {
        this.type = type;
    }
    public List<PlanningOperation> getAllowableOperations() {
        return allowableOperations;
    }
    public void setAllowableOperations(List<PlanningOperation> allowableOperations) {
        this.allowableOperations = allowableOperations;
    }
    public boolean isCanCreateMany() {
        return canCreateMany;
    }
    public void setCanCreateMany(boolean canCreateMany) {
        this.canCreateMany = canCreateMany;
    }
	
}

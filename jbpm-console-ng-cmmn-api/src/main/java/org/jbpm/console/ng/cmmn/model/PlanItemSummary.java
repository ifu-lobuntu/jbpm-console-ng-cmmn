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
}

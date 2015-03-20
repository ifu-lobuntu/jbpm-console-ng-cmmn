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

}

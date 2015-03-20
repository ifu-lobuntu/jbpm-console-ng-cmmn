package org.jbpm.console.ng.cmmn.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class CaseFileItemInstanceSummary implements Serializable {

	private static final long serialVersionUID = -8990784732354737009L;

	private Serializable id;
	private Map<String, Object> properties;
	private Map<String, Collection<CaseFileItemInstanceSummary>> multipleChildren;
	private Map<String, Collection<CaseFileItemInstanceReference>> multipleReferences;
	private Map<String, CaseFileItemInstanceSummary> singleChildren;
	private Map<String, CaseFileItemInstanceReference> singleReferences;
}

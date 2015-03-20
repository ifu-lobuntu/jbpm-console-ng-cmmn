package org.jbpm.console.ng.cmmn.model;

import java.io.Serializable;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class CaseFileItemInstanceReference implements Serializable{

    private static final long serialVersionUID = 7487650254831624915L;
    private Serializable id;
    private String name;
    private String type;
}

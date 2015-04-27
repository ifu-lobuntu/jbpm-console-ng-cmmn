package org.jbpm.console.ng.cmmn.client.client.planning;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import com.google.gwt.user.client.ui.IsWidget;

/**
 * A GUI component that will allow the user to perform the CMMN planning
 * operations against a specific case instance
 * 
 * @author ampie
 *
 */
@Dependent
public class PlanningPresenter {
    public interface PlanningView extends IsWidget {
    }

    @Inject
    PlanningView view;

    public PlanningView getTaskFormView() {
        return view;
    }

    public IsWidget getView() {
        return view;
    }
}

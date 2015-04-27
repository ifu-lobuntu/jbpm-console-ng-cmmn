package org.jbpm.console.ng.cmmn.client.casefile;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import com.google.gwt.user.client.ui.IsWidget;
import org.jbpm.console.ng.ht.forms.display.view.FormDisplayerView;
/**
 * A UI Component that will allow the user to edit the entire casefile 
 * @author ampie
 *
 */
@Dependent
public class CaseFileFormPresenter {
    public interface CaseFileFormView extends IsWidget {
        FormDisplayerView getDisplayerView();
    }

    @Inject
    CaseFileFormView view;

    public CaseFileFormView getTaskFormView() {
        return view;
    }

    public IsWidget getView() {
        return view;
    }
}

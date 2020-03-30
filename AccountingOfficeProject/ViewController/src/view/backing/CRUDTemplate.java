package view.backing;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class CRUDTemplate {
    public CRUDTemplate() {
    }
    
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    private String exOperation(String op) {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding(op);
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public void CommitDialog(DialogEvent dialogEvent) {
        // Add event code here...
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok)
            {
             // write your custom code for ok event
             exOperation("Commit");
            } else
            {
              // write your custom code for cancel event
              exOperation("Rollback");
           } 
    }


}

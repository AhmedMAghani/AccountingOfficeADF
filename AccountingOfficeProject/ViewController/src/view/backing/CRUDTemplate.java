package view.backing;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.adf.view.rich.render.ClientEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.context.RequestContext;

public class CRUDTemplate {
        private RichPopup createPopup;
        private RichPopup editPopup;
        private RichButton dialogOk;


    public void setDialogOk(RichButton dialogOk) {
        this.dialogOk = dialogOk;
    }

    public RichButton getDialogOk() {
        return dialogOk;
    }

    public void setCreatePopup(RichPopup createPopup) {
            this.createPopup = createPopup;
        }
    
        public RichPopup getCreatePopup() {
            return createPopup;
        }
    
        public void setEditPopup(RichPopup editPopup) {
            this.editPopup = editPopup;
        }
    
        public RichPopup getEditPopup() {
            return editPopup;
        }
    
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

    public void CommitDialog(ActionEvent actionEvent) {
        // Add event code here...
        if (actionEvent.getSource().equals(getDialogOk())) {
            // write your custom code for ok event
            exOperation("Commit");
        } else {
            exOperation("Rollback");
        }
        getEditPopup().hide();
        getCreatePopup().hide();
    }


    //    public void dialogActionHandler(ClientEvent clientEvent) {
    //        // Add event code here...
    //        RichPopup popup = this.getCreatePopup();
    //        popup.hide();
    //        exOperation("Rollback");
    //    }
}

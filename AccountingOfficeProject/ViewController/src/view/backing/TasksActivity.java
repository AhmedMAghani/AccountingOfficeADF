package view.backing;

import javax.faces.component.UISelectItems;

import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichListItem;
import oracle.adf.view.rich.component.rich.data.RichListView;
import oracle.adf.view.rich.component.rich.fragment.RichPageTemplate;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichOutputFormatted;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class TasksActivity {
    private RichPageTemplate pt1;
    private RichInputText it1;
    private RichPanelFormLayout pfl2;
    private RichInputText it2;
    private RichInputListOfValues ilov1;
    private RichInputListOfValues ilov2;
    private RichInputListOfValues ilov3;
    private RichSelectOneChoice soc5;
    private UISelectItems si5;
    private RichSelectOneChoice soc6;
    private UISelectItems si6;
    private RichInputDate id3;
    private RichInputDate id4;
    private RichSelectOneChoice soc7;
    private UISelectItems si7;
    private RichSelectOneChoice soc8;
    private UISelectItems si8;
    private RichPanelFormLayout pfl3;
    private RichInputText it3;
    private RichInputListOfValues ilov4;
    private RichInputListOfValues ilov5;
    private RichInputListOfValues ilov6;
    private RichSelectOneChoice soc9;
    private UISelectItems si9;
    private RichSelectOneChoice soc10;
    private UISelectItems si10;
    private RichInputDate id5;
    private RichInputDate id6;
    private RichSelectOneChoice soc11;
    private UISelectItems si11;
    private RichSelectOneChoice soc12;
    private UISelectItems si12;
    private RichButton b1;
    private RichButton b2;
    private RichButton b3;
    private RichPanelGroupLayout pgl5;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichGridRow gr4;
    private RichGridCell gc4;
    private RichGridCell gc5;
    private RichGridCell gc6;
    private RichGridCell gc7;
    private RichGridCell gc8;
    private RichGridCell gc11;
    private RichButton b6;
    private RichListView lv1;
    private RichListItem li1;
    private RichPanelGridLayout pgl4;
    private RichGridRow gr6;
    private RichGridCell gc15;
    private RichOutputFormatted of1;
    private RichGridCell gc16;
    private RichSelectOneChoice soc13;
    private UISelectItems si13;
    private RichGridCell gc17;
    private RichSelectOneChoice soc14;
    private UISelectItems si14;
    private RichGridCell gc18;
    private RichSelectOneChoice soc15;
    private UISelectItems si15;
    private RichGridCell gc19;
    private RichSelectOneChoice soc16;
    private UISelectItems si16;
    private RichSelectOneChoice soc17;
    private UISelectItems si17;
    private RichGridCell gc21;
    private RichOutputFormatted of2;
    private RichOutputFormatted of3;
    private RichGridCell gc25;
    private RichGridCell gc26;
    private RichButton b4;
    private RichButton b5;
    private RichOutputFormatted of6;
    private RichOutputFormatted of7;
    private RichOutputFormatted of8;
    private RichOutputFormatted of9;
    private RichOutputFormatted of10;
    private RichOutputFormatted of11;
    private RichGridCell gc27;
    private RichGridCell gc28;
    private RichOutputFormatted of12;
    private RichOutputFormatted of13;
    private RichPanelGridLayout pgl11;
    private RichGridRow gr7;
    private RichGridCell gc10;
    private RichGridRow gr8;
    private RichGridCell gc12;
    private RichPanelGridLayout pgl8;
    private RichGridRow gr9;
    private RichGridCell gc13;
    private RichGridRow gr10;
    private RichGridCell gc14;
    private RichPanelGridLayout pgl7;
    private RichGridRow gr11;
    private RichGridCell gc20;
    private RichGridRow gr12;
    private RichGridCell gc22;
    private RichPanelGridLayout pgl12;
    private RichGridRow gr13;
    private RichGridCell gc23;
    private RichGridRow gr14;
    private RichGridCell gc24;
    private RichPanelFormLayout pfl1;
    private RichPanelLabelAndMessage plam1;
    private RichOutputText ot1;
    private RichSelectOneChoice soc1;
    private UISelectItems si1;
    private RichSelectOneChoice soc2;
    private UISelectItems si2;
    private RichSelectOneChoice soc3;
    private UISelectItems si3;
    private RichSelectOneChoice soc4;
    private UISelectItems si4;
    private RichSelectOneChoice soc18;
    private UISelectItems si18;
    private RichPanelLabelAndMessage plam2;
    private RichOutputText ot2;
    private RichPanelLabelAndMessage plam3;
    private RichOutputText ot3;
    private RichSelectOneChoice soc19;
    private UISelectItems si19;
    private RichSelectOneChoice soc20;
    private UISelectItems si20;

    public void setPt1(RichPageTemplate pt1) {
        this.pt1 = pt1;
    }

    public RichPageTemplate getPt1() {
        return pt1;
    }


    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }


    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setIlov1(RichInputListOfValues ilov1) {
        this.ilov1 = ilov1;
    }

    public RichInputListOfValues getIlov1() {
        return ilov1;
    }

    public void setIlov2(RichInputListOfValues ilov2) {
        this.ilov2 = ilov2;
    }

    public RichInputListOfValues getIlov2() {
        return ilov2;
    }

    public void setIlov3(RichInputListOfValues ilov3) {
        this.ilov3 = ilov3;
    }

    public RichInputListOfValues getIlov3() {
        return ilov3;
    }

    public void setSoc5(RichSelectOneChoice soc5) {
        this.soc5 = soc5;
    }

    public RichSelectOneChoice getSoc5() {
        return soc5;
    }

    public void setSi5(UISelectItems si5) {
        this.si5 = si5;
    }

    public UISelectItems getSi5() {
        return si5;
    }

    public void setSoc6(RichSelectOneChoice soc6) {
        this.soc6 = soc6;
    }

    public RichSelectOneChoice getSoc6() {
        return soc6;
    }

    public void setSi6(UISelectItems si6) {
        this.si6 = si6;
    }

    public UISelectItems getSi6() {
        return si6;
    }

    public void setId3(RichInputDate id3) {
        this.id3 = id3;
    }

    public RichInputDate getId3() {
        return id3;
    }

    public void setId4(RichInputDate id4) {
        this.id4 = id4;
    }

    public RichInputDate getId4() {
        return id4;
    }

    public void setSoc7(RichSelectOneChoice soc7) {
        this.soc7 = soc7;
    }

    public RichSelectOneChoice getSoc7() {
        return soc7;
    }

    public void setSi7(UISelectItems si7) {
        this.si7 = si7;
    }

    public UISelectItems getSi7() {
        return si7;
    }

    public void setSoc8(RichSelectOneChoice soc8) {
        this.soc8 = soc8;
    }

    public RichSelectOneChoice getSoc8() {
        return soc8;
    }

    public void setSi8(UISelectItems si8) {
        this.si8 = si8;
    }

    public UISelectItems getSi8() {
        return si8;
    }

    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setIlov4(RichInputListOfValues ilov4) {
        this.ilov4 = ilov4;
    }

    public RichInputListOfValues getIlov4() {
        return ilov4;
    }

    public void setIlov5(RichInputListOfValues ilov5) {
        this.ilov5 = ilov5;
    }

    public RichInputListOfValues getIlov5() {
        return ilov5;
    }

    public void setIlov6(RichInputListOfValues ilov6) {
        this.ilov6 = ilov6;
    }

    public RichInputListOfValues getIlov6() {
        return ilov6;
    }

    public void setSoc9(RichSelectOneChoice soc9) {
        this.soc9 = soc9;
    }

    public RichSelectOneChoice getSoc9() {
        return soc9;
    }

    public void setSi9(UISelectItems si9) {
        this.si9 = si9;
    }

    public UISelectItems getSi9() {
        return si9;
    }

    public void setSoc10(RichSelectOneChoice soc10) {
        this.soc10 = soc10;
    }

    public RichSelectOneChoice getSoc10() {
        return soc10;
    }

    public void setSi10(UISelectItems si10) {
        this.si10 = si10;
    }

    public UISelectItems getSi10() {
        return si10;
    }

    public void setId5(RichInputDate id5) {
        this.id5 = id5;
    }

    public RichInputDate getId5() {
        return id5;
    }

    public void setId6(RichInputDate id6) {
        this.id6 = id6;
    }

    public RichInputDate getId6() {
        return id6;
    }

    public void setSoc11(RichSelectOneChoice soc11) {
        this.soc11 = soc11;
    }

    public RichSelectOneChoice getSoc11() {
        return soc11;
    }

    public void setSi11(UISelectItems si11) {
        this.si11 = si11;
    }

    public UISelectItems getSi11() {
        return si11;
    }

    public void setSoc12(RichSelectOneChoice soc12) {
        this.soc12 = soc12;
    }

    public RichSelectOneChoice getSoc12() {
        return soc12;
    }

    public void setSi12(UISelectItems si12) {
        this.si12 = si12;
    }

    public UISelectItems getSi12() {
        return si12;
    }


    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
    }

    public void setQryId1(RichQuery qryId1) {
        this.qryId1 = qryId1;
    }

    public RichQuery getQryId1() {
        return qryId1;
    }


    public void setGr4(RichGridRow gr4) {
        this.gr4 = gr4;
    }

    public RichGridRow getGr4() {
        return gr4;
    }

    public void setGc4(RichGridCell gc4) {
        this.gc4 = gc4;
    }

    public RichGridCell getGc4() {
        return gc4;
    }

    public void setGc5(RichGridCell gc5) {
        this.gc5 = gc5;
    }

    public RichGridCell getGc5() {
        return gc5;
    }

    public void setGc6(RichGridCell gc6) {
        this.gc6 = gc6;
    }

    public RichGridCell getGc6() {
        return gc6;
    }

    public void setGc7(RichGridCell gc7) {
        this.gc7 = gc7;
    }

    public RichGridCell getGc7() {
        return gc7;
    }

    public void setGc8(RichGridCell gc8) {
        this.gc8 = gc8;
    }

    public RichGridCell getGc8() {
        return gc8;
    }


    public void setGc11(RichGridCell gc11) {
        this.gc11 = gc11;
    }

    public RichGridCell getGc11() {
        return gc11;
    }


    public void setB6(RichButton b6) {
        this.b6 = b6;
    }

    public RichButton getB6() {
        return b6;
    }

    public void setLv1(RichListView lv1) {
        this.lv1 = lv1;
    }

    public RichListView getLv1() {
        return lv1;
    }

    public void setLi1(RichListItem li1) {
        this.li1 = li1;
    }

    public RichListItem getLi1() {
        return li1;
    }

    public void setPgl4(RichPanelGridLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGridLayout getPgl4() {
        return pgl4;
    }

    public void setGr6(RichGridRow gr6) {
        this.gr6 = gr6;
    }

    public RichGridRow getGr6() {
        return gr6;
    }

    public void setGc15(RichGridCell gc15) {
        this.gc15 = gc15;
    }

    public RichGridCell getGc15() {
        return gc15;
    }

    public void setOf1(RichOutputFormatted of1) {
        this.of1 = of1;
    }

    public RichOutputFormatted getOf1() {
        return of1;
    }

    public void setGc16(RichGridCell gc16) {
        this.gc16 = gc16;
    }

    public RichGridCell getGc16() {
        return gc16;
    }

    public void setSoc13(RichSelectOneChoice soc13) {
        this.soc13 = soc13;
    }

    public RichSelectOneChoice getSoc13() {
        return soc13;
    }

    public void setSi13(UISelectItems si13) {
        this.si13 = si13;
    }

    public UISelectItems getSi13() {
        return si13;
    }

    public void setGc17(RichGridCell gc17) {
        this.gc17 = gc17;
    }

    public RichGridCell getGc17() {
        return gc17;
    }

    public void setSoc14(RichSelectOneChoice soc14) {
        this.soc14 = soc14;
    }

    public RichSelectOneChoice getSoc14() {
        return soc14;
    }

    public void setSi14(UISelectItems si14) {
        this.si14 = si14;
    }

    public UISelectItems getSi14() {
        return si14;
    }

    public void setGc18(RichGridCell gc18) {
        this.gc18 = gc18;
    }

    public RichGridCell getGc18() {
        return gc18;
    }

    public void setSoc15(RichSelectOneChoice soc15) {
        this.soc15 = soc15;
    }

    public RichSelectOneChoice getSoc15() {
        return soc15;
    }

    public void setSi15(UISelectItems si15) {
        this.si15 = si15;
    }

    public UISelectItems getSi15() {
        return si15;
    }

    public void setGc19(RichGridCell gc19) {
        this.gc19 = gc19;
    }

    public RichGridCell getGc19() {
        return gc19;
    }

    public void setSoc16(RichSelectOneChoice soc16) {
        this.soc16 = soc16;
    }

    public RichSelectOneChoice getSoc16() {
        return soc16;
    }

    public void setSi16(UISelectItems si16) {
        this.si16 = si16;
    }

    public UISelectItems getSi16() {
        return si16;
    }


    public void setSoc17(RichSelectOneChoice soc17) {
        this.soc17 = soc17;
    }

    public RichSelectOneChoice getSoc17() {
        return soc17;
    }

    public void setSi17(UISelectItems si17) {
        this.si17 = si17;
    }

    public UISelectItems getSi17() {
        return si17;
    }

    public void setGc21(RichGridCell gc21) {
        this.gc21 = gc21;
    }

    public RichGridCell getGc21() {
        return gc21;
    }

    public void setOf2(RichOutputFormatted of2) {
        this.of2 = of2;
    }

    public RichOutputFormatted getOf2() {
        return of2;
    }


    public void setOf3(RichOutputFormatted of3) {
        this.of3 = of3;
    }

    public RichOutputFormatted getOf3() {
        return of3;
    }


    public void setGc25(RichGridCell gc25) {
        this.gc25 = gc25;
    }

    public RichGridCell getGc25() {
        return gc25;
    }

    public void setGc26(RichGridCell gc26) {
        this.gc26 = gc26;
    }

    public RichGridCell getGc26() {
        return gc26;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

    public void setB5(RichButton b5) {
        this.b5 = b5;
    }

    public RichButton getB5() {
        return b5;
    }


    public void setOf6(RichOutputFormatted of6) {
        this.of6 = of6;
    }

    public RichOutputFormatted getOf6() {
        return of6;
    }

    public void setOf7(RichOutputFormatted of7) {
        this.of7 = of7;
    }

    public RichOutputFormatted getOf7() {
        return of7;
    }

    public void setOf8(RichOutputFormatted of8) {
        this.of8 = of8;
    }

    public RichOutputFormatted getOf8() {
        return of8;
    }

    public void setOf9(RichOutputFormatted of9) {
        this.of9 = of9;
    }

    public RichOutputFormatted getOf9() {
        return of9;
    }

    public void setOf10(RichOutputFormatted of10) {
        this.of10 = of10;
    }

    public RichOutputFormatted getOf10() {
        return of10;
    }

    public void setOf11(RichOutputFormatted of11) {
        this.of11 = of11;
    }

    public RichOutputFormatted getOf11() {
        return of11;
    }

    public void setGc27(RichGridCell gc27) {
        this.gc27 = gc27;
    }

    public RichGridCell getGc27() {
        return gc27;
    }

    public void setGc28(RichGridCell gc28) {
        this.gc28 = gc28;
    }

    public RichGridCell getGc28() {
        return gc28;
    }

    public void setOf12(RichOutputFormatted of12) {
        this.of12 = of12;
    }

    public RichOutputFormatted getOf12() {
        return of12;
    }

    public void setOf13(RichOutputFormatted of13) {
        this.of13 = of13;
    }

    public RichOutputFormatted getOf13() {
        return of13;
    }


    public void setPgl11(RichPanelGridLayout pgl11) {
        this.pgl11 = pgl11;
    }

    public RichPanelGridLayout getPgl11() {
        return pgl11;
    }

    public void setGr7(RichGridRow gr7) {
        this.gr7 = gr7;
    }

    public RichGridRow getGr7() {
        return gr7;
    }

    public void setGc10(RichGridCell gc10) {
        this.gc10 = gc10;
    }

    public RichGridCell getGc10() {
        return gc10;
    }

    public void setGr8(RichGridRow gr8) {
        this.gr8 = gr8;
    }

    public RichGridRow getGr8() {
        return gr8;
    }

    public void setGc12(RichGridCell gc12) {
        this.gc12 = gc12;
    }

    public RichGridCell getGc12() {
        return gc12;
    }

    public void setPgl8(RichPanelGridLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGridLayout getPgl8() {
        return pgl8;
    }

    public void setGr9(RichGridRow gr9) {
        this.gr9 = gr9;
    }

    public RichGridRow getGr9() {
        return gr9;
    }

    public void setGc13(RichGridCell gc13) {
        this.gc13 = gc13;
    }

    public RichGridCell getGc13() {
        return gc13;
    }

    public void setGr10(RichGridRow gr10) {
        this.gr10 = gr10;
    }

    public RichGridRow getGr10() {
        return gr10;
    }

    public void setGc14(RichGridCell gc14) {
        this.gc14 = gc14;
    }

    public RichGridCell getGc14() {
        return gc14;
    }

    public void setPgl7(RichPanelGridLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGridLayout getPgl7() {
        return pgl7;
    }

    public void setGr11(RichGridRow gr11) {
        this.gr11 = gr11;
    }

    public RichGridRow getGr11() {
        return gr11;
    }

    public void setGc20(RichGridCell gc20) {
        this.gc20 = gc20;
    }

    public RichGridCell getGc20() {
        return gc20;
    }

    public void setGr12(RichGridRow gr12) {
        this.gr12 = gr12;
    }

    public RichGridRow getGr12() {
        return gr12;
    }

    public void setGc22(RichGridCell gc22) {
        this.gc22 = gc22;
    }

    public RichGridCell getGc22() {
        return gc22;
    }

    public void setPgl12(RichPanelGridLayout pgl12) {
        this.pgl12 = pgl12;
    }

    public RichPanelGridLayout getPgl12() {
        return pgl12;
    }

    public void setGr13(RichGridRow gr13) {
        this.gr13 = gr13;
    }

    public RichGridRow getGr13() {
        return gr13;
    }

    public void setGc23(RichGridCell gc23) {
        this.gc23 = gc23;
    }

    public RichGridCell getGc23() {
        return gc23;
    }

    public void setGr14(RichGridRow gr14) {
        this.gr14 = gr14;
    }

    public RichGridRow getGr14() {
        return gr14;
    }

    public void setGc24(RichGridCell gc24) {
        this.gc24 = gc24;
    }

    public RichGridCell getGc24() {
        return gc24;
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

    public void createInsertTask(ActionEvent event) {
        // Add event code here...
        exOperation("CreateInsert");
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setPlam1(RichPanelLabelAndMessage plam1) {
        this.plam1 = plam1;
    }

    public RichPanelLabelAndMessage getPlam1() {
        return plam1;
    }

    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    public RichOutputText getOt1() {
        return ot1;
    }

    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setSi1(UISelectItems si1) {
        this.si1 = si1;
    }

    public UISelectItems getSi1() {
        return si1;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }

    public void setSi2(UISelectItems si2) {
        this.si2 = si2;
    }

    public UISelectItems getSi2() {
        return si2;
    }

    public void setSoc3(RichSelectOneChoice soc3) {
        this.soc3 = soc3;
    }

    public RichSelectOneChoice getSoc3() {
        return soc3;
    }

    public void setSi3(UISelectItems si3) {
        this.si3 = si3;
    }

    public UISelectItems getSi3() {
        return si3;
    }

    public void setSoc4(RichSelectOneChoice soc4) {
        this.soc4 = soc4;
    }

    public RichSelectOneChoice getSoc4() {
        return soc4;
    }

    public void setSi4(UISelectItems si4) {
        this.si4 = si4;
    }

    public UISelectItems getSi4() {
        return si4;
    }

    public void setSoc18(RichSelectOneChoice soc18) {
        this.soc18 = soc18;
    }

    public RichSelectOneChoice getSoc18() {
        return soc18;
    }

    public void setSi18(UISelectItems si18) {
        this.si18 = si18;
    }

    public UISelectItems getSi18() {
        return si18;
    }

    public void setPlam2(RichPanelLabelAndMessage plam2) {
        this.plam2 = plam2;
    }

    public RichPanelLabelAndMessage getPlam2() {
        return plam2;
    }

    public void setOt2(RichOutputText ot2) {
        this.ot2 = ot2;
    }

    public RichOutputText getOt2() {
        return ot2;
    }

    public void setPlam3(RichPanelLabelAndMessage plam3) {
        this.plam3 = plam3;
    }

    public RichPanelLabelAndMessage getPlam3() {
        return plam3;
    }

    public void setOt3(RichOutputText ot3) {
        this.ot3 = ot3;
    }

    public RichOutputText getOt3() {
        return ot3;
    }

    public void setSoc19(RichSelectOneChoice soc19) {
        this.soc19 = soc19;
    }

    public RichSelectOneChoice getSoc19() {
        return soc19;
    }

    public void setSi19(UISelectItems si19) {
        this.si19 = si19;
    }

    public UISelectItems getSi19() {
        return si19;
    }

    public void setSoc20(RichSelectOneChoice soc20) {
        this.soc20 = soc20;
    }

    public RichSelectOneChoice getSoc20() {
        return soc20;
    }

    public void setSi20(UISelectItems si20) {
        this.si20 = si20;
    }

    public UISelectItems getSi20() {
        return si20;
    }
}

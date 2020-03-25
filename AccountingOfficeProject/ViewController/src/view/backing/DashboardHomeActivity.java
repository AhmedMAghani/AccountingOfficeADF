package view.backing;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import javax.faces.context.FacesContext;

import model.BCs.VOs.Contracts_VOImpl;

import model.BCs.VOs.Contracts_VORowImpl;

import model.BCs.VOs.Tasks_VOImpl;

import oracle.adf.model.AttributeBinding;
import oracle.adf.model.BindingContainer;
import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.generic.DCRowSetIteratorImpl;
import oracle.adf.view.faces.bi.component.chart.UIBarChart;
import oracle.adf.view.faces.bi.component.chart.UIDataItem;
import oracle.adf.view.faces.bi.component.chart.UILegend;
import oracle.adf.view.faces.bi.component.gauge.UIMetricLabel;
import oracle.adf.view.faces.bi.component.gauge.UIStatusMeterGauge;
import oracle.adf.view.faces.bi.component.gauge.UIThreshold;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichListItem;
import oracle.adf.view.rich.component.rich.data.RichListView;
import oracle.adf.view.rich.component.rich.fragment.RichPageTemplate;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichOutputFormatted;


public class DashboardHomeActivity {
    private RichPageTemplate pt1;
    private RichForm f1;
    private RichDocument d1;
    private RichButton b1;
    private RichButton b2;
    private RichButton b3;
    private RichButton b4;
    private RichMessages m1;
    private RichPanelGridLayout pgl1;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichGridRow gr2;
    private RichGridCell gc2;
    private RichGridCell gc3;
    private RichGridCell gc4;
    private RichGridRow gr3;
    private RichGridCell gc5;
    private RichGridRow gr4;
    private RichGridCell gc6;
    private RichGridCell gc7;
    private RichGridCell gc8;
    private RichGridRow gr5;
    private RichGridCell gc9;
    private RichPanelBox pb1;
    private RichPanelBox pb2;
    private RichPanelBox pb3;
    private RichPanelBox pb4;
    private RichPanelBox pb5;
    private RichPanelBox pb6;
    private RichPanelBox pb7;
    private RichPanelBox pb8;
    private RichPanelBox pb9;
    private RichListView lv1;
    private RichListItem li1;
    private RichPanelGridLayout pgl2;
    private RichGridRow gr6;
    private RichGridCell gc10;
    private RichOutputFormatted of1;
    private RichGridCell gc11;
    private RichGridCell gc12;
    private RichOutputFormatted of3;
    private RichGridCell gc13;
    private RichGridCell gc14;
    private RichGridCell gc15;
    private UIStatusMeterGauge statusMeterGauge1;
    private UIMetricLabel gml1;
    private UIThreshold thr1;
    private UIThreshold thr2;
    private UIThreshold thr3;
    private UIStatusMeterGauge statusMeterGauge2;
    private UIMetricLabel gml2;
    private UIThreshold thr4;
    private UIThreshold thr5;
    private UIThreshold thr6;
    private UIStatusMeterGauge statusMeterGauge3;
    private UIMetricLabel gml3;
    private UIThreshold thr7;
    private UIThreshold thr8;
    private UIStatusMeterGauge statusMeterGauge4;
    private UIMetricLabel gml4;
    private UIThreshold thr9;
    private UIThreshold thr10;
    private RichGridRow gr7;
    private RichGridCell gc16;
    private RichGridCell gc17;
    private RichGridCell gc18;
    private RichGridCell gc19;
    private RichGridCell gc20;
    private RichGridCell gc21;
    private Integer totalContractNo;
    private Integer completedContractNo;
    private Integer issuedContractNo;
    private Integer totalTasksNo;
    private Integer completedTasksNo;
    private Integer issuedTasksNo;
    private RichOutputFormatted of2;
    private UIStatusMeterGauge statusMeterGauge5;
    private UIThreshold thr11;
    private UIMetricLabel gml5;
    private UIStatusMeterGauge statusMeterGauge6;
    private UIThreshold thr12;
    private UIMetricLabel gml6;
    private RichOutputFormatted of4;
    private UIStatusMeterGauge statusMeterGauge7;
    private UIThreshold thr13;
    private UIMetricLabel gml7;
    private UIStatusMeterGauge statusMeterGauge8;
    private UIThreshold thr14;
    private UIMetricLabel gml8;
    private UIBarChart barChart1;
    private UILegend cl1;
    private UIDataItem di1;
    private UIBarChart barChart2;
    private UILegend cl2;
    private UIDataItem di2;


    public DashboardHomeActivity() {
        setContractInfo();
        setTasksInfo();
    }

    public void setTotalContractNo(Integer totalContractNo) {
        this.totalContractNo = totalContractNo;
    }

    public Integer getTotalContractNo() {
        return totalContractNo;
    }

    public void setCompletedContractNo(Integer completedContractNo) {
        this.completedContractNo = completedContractNo;
    }

    public Integer getCompletedContractNo() {
        return completedContractNo;
    }

    public void setIssuedContractNo(Integer issuedContractNo) {
        this.issuedContractNo = issuedContractNo;
    }

    public Integer getIssuedContractNo() {
        return issuedContractNo;
    }

    public void setTotalTasksNo(Integer totalTasksNo) {
        this.totalTasksNo = totalTasksNo;
    }

    public Integer getTotalTasksNo() {
        return totalTasksNo;
    }

    public void setCompletedTasksNo(Integer completedTasksNo) {
        this.completedTasksNo = completedTasksNo;
    }

    public Integer getCompletedTasksNo() {
        return completedTasksNo;
    }

    public void setIssuedTasksNo(Integer issuedTasksNo) {
        this.issuedTasksNo = issuedTasksNo;
    }

    public Integer getIssuedTasksNo() {
        return issuedTasksNo;
    }

    public void setPt1(RichPageTemplate pt1) {
        this.pt1 = pt1;
    }

    public RichPageTemplate getPt1() {
        return pt1;
    }

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
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

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }


    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }


    public void setPgl1(RichPanelGridLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGridLayout getPgl1() {
        return pgl1;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }

    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
    }

    public void setGr2(RichGridRow gr2) {
        this.gr2 = gr2;
    }

    public RichGridRow getGr2() {
        return gr2;
    }

    public void setGc2(RichGridCell gc2) {
        this.gc2 = gc2;
    }

    public RichGridCell getGc2() {
        return gc2;
    }

    public void setGc3(RichGridCell gc3) {
        this.gc3 = gc3;
    }

    public RichGridCell getGc3() {
        return gc3;
    }

    public void setGc4(RichGridCell gc4) {
        this.gc4 = gc4;
    }

    public RichGridCell getGc4() {
        return gc4;
    }

    public void setGr3(RichGridRow gr3) {
        this.gr3 = gr3;
    }

    public RichGridRow getGr3() {
        return gr3;
    }

    public void setGc5(RichGridCell gc5) {
        this.gc5 = gc5;
    }

    public RichGridCell getGc5() {
        return gc5;
    }

    public void setGr4(RichGridRow gr4) {
        this.gr4 = gr4;
    }

    public RichGridRow getGr4() {
        return gr4;
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

    public void setGr5(RichGridRow gr5) {
        this.gr5 = gr5;
    }

    public RichGridRow getGr5() {
        return gr5;
    }

    public void setGc9(RichGridCell gc9) {
        this.gc9 = gc9;
    }

    public RichGridCell getGc9() {
        return gc9;
    }

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }

    public void setPb2(RichPanelBox pb2) {
        this.pb2 = pb2;
    }

    public RichPanelBox getPb2() {
        return pb2;
    }

    public void setPb3(RichPanelBox pb3) {
        this.pb3 = pb3;
    }

    public RichPanelBox getPb3() {
        return pb3;
    }

    public void setPb4(RichPanelBox pb4) {
        this.pb4 = pb4;
    }

    public RichPanelBox getPb4() {
        return pb4;
    }

    public void setPb5(RichPanelBox pb5) {
        this.pb5 = pb5;
    }

    public RichPanelBox getPb5() {
        return pb5;
    }

    public void setPb6(RichPanelBox pb6) {
        this.pb6 = pb6;
    }

    public RichPanelBox getPb6() {
        return pb6;
    }

    public void setPb7(RichPanelBox pb7) {
        this.pb7 = pb7;
    }

    public RichPanelBox getPb7() {
        return pb7;
    }

    public void setPb8(RichPanelBox pb8) {
        this.pb8 = pb8;
    }

    public RichPanelBox getPb8() {
        return pb8;
    }

    public void setPb9(RichPanelBox pb9) {
        this.pb9 = pb9;
    }

    public RichPanelBox getPb9() {
        return pb9;
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

    public void setPgl2(RichPanelGridLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGridLayout getPgl2() {
        return pgl2;
    }

    public void setGr6(RichGridRow gr6) {
        this.gr6 = gr6;
    }

    public RichGridRow getGr6() {
        return gr6;
    }

    public void setGc10(RichGridCell gc10) {
        this.gc10 = gc10;
    }

    public RichGridCell getGc10() {
        return gc10;
    }

    public void setOf1(RichOutputFormatted of1) {
        this.of1 = of1;
    }

    public RichOutputFormatted getOf1() {
        return of1;
    }

    public void setGc11(RichGridCell gc11) {
        this.gc11 = gc11;
    }

    public RichGridCell getGc11() {
        return gc11;
    }


    public void setGc12(RichGridCell gc12) {
        this.gc12 = gc12;
    }

    public RichGridCell getGc12() {
        return gc12;
    }

    public void setOf3(RichOutputFormatted of3) {
        this.of3 = of3;
    }

    public RichOutputFormatted getOf3() {
        return of3;
    }

    public void setGc13(RichGridCell gc13) {
        this.gc13 = gc13;
    }

    public RichGridCell getGc13() {
        return gc13;
    }


    public void setGc14(RichGridCell gc14) {
        this.gc14 = gc14;
    }

    public RichGridCell getGc14() {
        return gc14;
    }


    public void setGc15(RichGridCell gc15) {
        this.gc15 = gc15;
    }

    public RichGridCell getGc15() {
        return gc15;
    }


    public void setStatusMeterGauge1(UIStatusMeterGauge statusMeterGauge1) {
        this.statusMeterGauge1 = statusMeterGauge1;
    }

    public UIStatusMeterGauge getStatusMeterGauge1() {
        return statusMeterGauge1;
    }

    public void setGml1(UIMetricLabel gml1) {
        this.gml1 = gml1;
    }

    public UIMetricLabel getGml1() {
        return gml1;
    }

    public void setThr1(UIThreshold thr1) {
        this.thr1 = thr1;
    }

    public UIThreshold getThr1() {
        return thr1;
    }

    public void setThr2(UIThreshold thr2) {
        this.thr2 = thr2;
    }

    public UIThreshold getThr2() {
        return thr2;
    }

    public void setThr3(UIThreshold thr3) {
        this.thr3 = thr3;
    }

    public UIThreshold getThr3() {
        return thr3;
    }

    public void setStatusMeterGauge2(UIStatusMeterGauge statusMeterGauge2) {
        this.statusMeterGauge2 = statusMeterGauge2;
    }

    public UIStatusMeterGauge getStatusMeterGauge2() {
        return statusMeterGauge2;
    }

    public void setGml2(UIMetricLabel gml2) {
        this.gml2 = gml2;
    }

    public UIMetricLabel getGml2() {
        return gml2;
    }

    public void setThr4(UIThreshold thr4) {
        this.thr4 = thr4;
    }

    public UIThreshold getThr4() {
        return thr4;
    }

    public void setThr5(UIThreshold thr5) {
        this.thr5 = thr5;
    }

    public UIThreshold getThr5() {
        return thr5;
    }

    public void setThr6(UIThreshold thr6) {
        this.thr6 = thr6;
    }

    public UIThreshold getThr6() {
        return thr6;
    }

    public void setStatusMeterGauge3(UIStatusMeterGauge statusMeterGauge3) {
        this.statusMeterGauge3 = statusMeterGauge3;
    }

    public UIStatusMeterGauge getStatusMeterGauge3() {
        return statusMeterGauge3;
    }

    public void setGml3(UIMetricLabel gml3) {
        this.gml3 = gml3;
    }

    public UIMetricLabel getGml3() {
        return gml3;
    }

    public void setThr7(UIThreshold thr7) {
        this.thr7 = thr7;
    }

    public UIThreshold getThr7() {
        return thr7;
    }

    public void setThr8(UIThreshold thr8) {
        this.thr8 = thr8;
    }

    public UIThreshold getThr8() {
        return thr8;
    }

    public void setStatusMeterGauge4(UIStatusMeterGauge statusMeterGauge4) {
        this.statusMeterGauge4 = statusMeterGauge4;
    }

    public UIStatusMeterGauge getStatusMeterGauge4() {
        return statusMeterGauge4;
    }

    public void setGml4(UIMetricLabel gml4) {
        this.gml4 = gml4;
    }

    public UIMetricLabel getGml4() {
        return gml4;
    }

    public void setThr9(UIThreshold thr9) {
        this.thr9 = thr9;
    }

    public UIThreshold getThr9() {
        return thr9;
    }

    public void setThr10(UIThreshold thr10) {
        this.thr10 = thr10;
    }

    public UIThreshold getThr10() {
        return thr10;
    }

    public void setGr7(RichGridRow gr7) {
        this.gr7 = gr7;
    }

    public RichGridRow getGr7() {
        return gr7;
    }

    public void setGc16(RichGridCell gc16) {
        this.gc16 = gc16;
    }

    public RichGridCell getGc16() {
        return gc16;
    }

    public void setGc17(RichGridCell gc17) {
        this.gc17 = gc17;
    }

    public RichGridCell getGc17() {
        return gc17;
    }

    public void setGc18(RichGridCell gc18) {
        this.gc18 = gc18;
    }

    public RichGridCell getGc18() {
        return gc18;
    }

    public void setGc19(RichGridCell gc19) {
        this.gc19 = gc19;
    }

    public RichGridCell getGc19() {
        return gc19;
    }

    public void setGc20(RichGridCell gc20) {
        this.gc20 = gc20;
    }

    public RichGridCell getGc20() {
        return gc20;
    }

    public void setGc21(RichGridCell gc21) {
        this.gc21 = gc21;
    }

    public RichGridCell getGc21() {
        return gc21;
    }


    private void setContractInfo(){
        BindingContext bc = BindingContext.getCurrent();
        DCBindingContainer dcbc = (DCBindingContainer)bc.getCurrentBindingsEntry();
        Contracts_VOImpl contractVO =(Contracts_VOImpl) dcbc.findIteratorBinding("Contracts1Iterator").getViewObject();
        totalContractNo =contractVO.getTotalContractsNo();
        completedContractNo = contractVO.getCompletedContractsNo();
        issuedContractNo = contractVO.getIssuedContractsNo();
    }
    
    private void setTasksInfo(){
        BindingContext bc = BindingContext.getCurrent();
        DCBindingContainer dcbc = (DCBindingContainer)bc.getCurrentBindingsEntry();
        Tasks_VOImpl contractVO =(Tasks_VOImpl) dcbc.findIteratorBinding("Tasks1Iterator").getViewObject();
        totalTasksNo = contractVO.getTotalTasksNo();
        completedTasksNo = contractVO.getCompletedTasksNo();
        issuedTasksNo = contractVO.getIssuedTasksNo();
    }

    public void setOf2(RichOutputFormatted of2) {
        this.of2 = of2;
    }

    public RichOutputFormatted getOf2() {
        return of2;
    }

    public void setStatusMeterGauge5(UIStatusMeterGauge statusMeterGauge5) {
        this.statusMeterGauge5 = statusMeterGauge5;
    }

    public UIStatusMeterGauge getStatusMeterGauge5() {
        return statusMeterGauge5;
    }

    public void setThr11(UIThreshold thr11) {
        this.thr11 = thr11;
    }

    public UIThreshold getThr11() {
        return thr11;
    }

    public void setGml5(UIMetricLabel gml5) {
        this.gml5 = gml5;
    }

    public UIMetricLabel getGml5() {
        return gml5;
    }

    public void setStatusMeterGauge6(UIStatusMeterGauge statusMeterGauge6) {
        this.statusMeterGauge6 = statusMeterGauge6;
    }

    public UIStatusMeterGauge getStatusMeterGauge6() {
        return statusMeterGauge6;
    }

    public void setThr12(UIThreshold thr12) {
        this.thr12 = thr12;
    }

    public UIThreshold getThr12() {
        return thr12;
    }

    public void setGml6(UIMetricLabel gml6) {
        this.gml6 = gml6;
    }

    public UIMetricLabel getGml6() {
        return gml6;
    }

    public void setOf4(RichOutputFormatted of4) {
        this.of4 = of4;
    }

    public RichOutputFormatted getOf4() {
        return of4;
    }

    public void setStatusMeterGauge7(UIStatusMeterGauge statusMeterGauge7) {
        this.statusMeterGauge7 = statusMeterGauge7;
    }

    public UIStatusMeterGauge getStatusMeterGauge7() {
        return statusMeterGauge7;
    }

    public void setThr13(UIThreshold thr13) {
        this.thr13 = thr13;
    }

    public UIThreshold getThr13() {
        return thr13;
    }

    public void setGml7(UIMetricLabel gml7) {
        this.gml7 = gml7;
    }

    public UIMetricLabel getGml7() {
        return gml7;
    }

    public void setStatusMeterGauge8(UIStatusMeterGauge statusMeterGauge8) {
        this.statusMeterGauge8 = statusMeterGauge8;
    }

    public UIStatusMeterGauge getStatusMeterGauge8() {
        return statusMeterGauge8;
    }

    public void setThr14(UIThreshold thr14) {
        this.thr14 = thr14;
    }

    public UIThreshold getThr14() {
        return thr14;
    }

    public void setGml8(UIMetricLabel gml8) {
        this.gml8 = gml8;
    }

    public UIMetricLabel getGml8() {
        return gml8;
    }

    public void setBarChart1(UIBarChart barChart1) {
        this.barChart1 = barChart1;
    }

    public UIBarChart getBarChart1() {
        return barChart1;
    }

    public void setCl1(UILegend cl1) {
        this.cl1 = cl1;
    }

    public UILegend getCl1() {
        return cl1;
    }

    public void setDi1(UIDataItem di1) {
        this.di1 = di1;
    }

    public UIDataItem getDi1() {
        return di1;
    }

    public void setBarChart2(UIBarChart barChart2) {
        this.barChart2 = barChart2;
    }

    public UIBarChart getBarChart2() {
        return barChart2;
    }

    public void setCl2(UILegend cl2) {
        this.cl2 = cl2;
    }

    public UILegend getCl2() {
        return cl2;
    }

    public void setDi2(UIDataItem di2) {
        this.di2 = di2;
    }

    public UIDataItem getDi2() {
        return di2;
    }
}

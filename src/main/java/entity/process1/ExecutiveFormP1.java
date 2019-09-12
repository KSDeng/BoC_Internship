package entity.process1;

import entity.Form_EIMS;

//TODO: 总经理提交的表格不应有"申请时间", 而应改为"处理时间"?
public class ExecutiveFormP1 extends Form_EIMS {

    public ExecutiveFormP1(){
        super();
    }

    @Override
    public String toString() {
        return "ExecutiveFormP1{} " +
                super.toString();
    }
}

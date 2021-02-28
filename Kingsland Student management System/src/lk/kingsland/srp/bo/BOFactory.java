package lk.kingsland.srp.bo;

import lk.kingsland.srp.bo.custom.impl.AddNewCourseBOimpl;
import lk.kingsland.srp.bo.custom.impl.AddNewStudentBOImpl;

public class BOFactory {
    static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getInstance() {
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public SuperBO getBO(BOType boType) {
        switch (boType) {
            case AddNewStudentBOImpl:
                return new AddNewStudentBOImpl();
            case AddNewCourseBOimpl:
                return new AddNewCourseBOimpl();
            default:
                return null;
        }
    }

    public enum BOType {
        AddNewStudentBOImpl, AddNewCourseBOimpl, REGISTRATION
    }
}

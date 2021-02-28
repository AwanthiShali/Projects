package bo;

import bo.custom.impl.CourtDetailsBOImpl;
import bo.custom.impl.PrisonerBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getInstance() {
        if (boFactory == null) {
            boFactory = new BOFactory();
        }
        return boFactory;

    }

    public enum BOTypes {
        PRISONER,COURTDETAILS,CRIME,SECTION
    }

    public SuperBO getBO(BOTypes types) {
        switch (types) {
            case PRISONER:
                return new PrisonerBOImpl();
            case COURTDETAILS:
                return new CourtDetailsBOImpl();
            default:
                return null;

        }

    }

}

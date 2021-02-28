package dao;

import dao.custom.impl.*;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public enum DAOTypes {
        PRISONER,COURTDETAILS,SECTION,CRIME,CUSTOM
    }

    public SuperDAO getDAO(DAOTypes types) {
        switch (types) {
            case PRISONER:
                return new PrisonerDAOImpl();
            case COURTDETAILS:
                return new CourtDetailsDAOImpl();
            case SECTION:
                return new SectionDAOImpl();
            case CRIME:
                return new CrimeDAOImpl();
            case CUSTOM:
                return new QueryDAOImpl();
            default:
                return null;

        }
    }
}

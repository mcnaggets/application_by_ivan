package com.epam.ear.companies;

import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * User: Ivan_Spresov
 * Date: 4/6/14
 */
@Stateless
//@DeclareRoles("bean")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class CompanyManagerBean implements CompanyManager, CompanyManagerLocal {
    @PersistenceContext
    private EntityManager em;

    @Override
//    @RolesAllowed("bean")
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void createCompany(String name) {
        Company company = new Company(name);
        em.persist(company);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public List<Company> list() {
        Query query = em.createQuery("from Company");
        return query.getResultList();
    }
}

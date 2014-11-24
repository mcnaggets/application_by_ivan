package com.epam.ear.companies;

import javax.ejb.Remote;
import java.util.List;

/**
 * User: Ivan_Spresov
 * Date: 4/6/14
 */
@Remote
public interface CompanyManager {
    void createCompany(String name);

    List<Company> list();
}


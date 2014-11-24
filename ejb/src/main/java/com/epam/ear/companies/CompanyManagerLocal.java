package com.epam.ear.companies;

import javax.ejb.Local;
import java.util.List;

/**
 * User: Ivan_Spresov
 * Date: 4/6/14
 */
@Local
public interface CompanyManagerLocal {
    void createCompany(String name);

    List<Company> list();
}

package org.ccfebras.ckp.service;

import org.ccfebras.ckp.model.*;

public interface DictionaryService {
    Organization findOrganizationById(Long id);
    Organization saveOrganization(Organization organization);

    Position findPositionById(Long id);

    Degree findDegreeById(Long id);

    Rank findRankById(Long id);

    Department findDepartmentById(Long id);
}

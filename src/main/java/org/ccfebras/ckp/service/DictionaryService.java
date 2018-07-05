package org.ccfebras.ckp.service;

import org.ccfebras.ckp.model.Degree;
import org.ccfebras.ckp.model.Organization;
import org.ccfebras.ckp.model.Position;
import org.ccfebras.ckp.model.Rank;

public interface DictionaryService {
    boolean organizationExistsById(Long id);
    boolean positionExistsById(Long id);
    boolean degreeExistsById(Long id);
    boolean rankExistsById(Long id);

    Organization findOrganizationById(Long id);
    Position findPositionById(Long id);
    Rank findRankById(Long id);
    Degree findDegreeById(Long id);
}

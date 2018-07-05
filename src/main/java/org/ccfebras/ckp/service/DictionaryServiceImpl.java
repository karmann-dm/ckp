package org.ccfebras.ckp.service;

import org.ccfebras.ckp.model.Degree;
import org.ccfebras.ckp.model.Organization;
import org.ccfebras.ckp.model.Position;
import org.ccfebras.ckp.model.Rank;
import org.ccfebras.ckp.repository.DegreeRepository;
import org.ccfebras.ckp.repository.OrganizationRepository;
import org.ccfebras.ckp.repository.PositionRepository;
import org.ccfebras.ckp.repository.RankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    private OrganizationRepository organizationRepository;

    @Autowired
    private PositionRepository positionRepository;

    @Autowired
    private RankRepository rankRepository;

    @Autowired
    private DegreeRepository degreeRepository;

    @Override
    public boolean organizationExistsById(Long id) {
        return organizationRepository.existsById(id);
    }

    @Override
    public boolean positionExistsById(Long id) {
        return positionRepository.existsById(id);
    }

    @Override
    public boolean degreeExistsById(Long id) {
        return degreeRepository.existsById(id);
    }

    @Override
    public boolean rankExistsById(Long id) {
        return rankRepository.existsById(id);
    }

    @Override
    public Organization findOrganizationById(Long id) {
        return organizationRepository.findById(id).orElse(null);
    }

    @Override
    public Position findPositionById(Long id) {
        return positionRepository.findById(id).orElse(null);
    }

    @Override
    public Rank findRankById(Long id) {
        return rankRepository.findById(id).orElse(null);
    }

    @Override
    public Degree findDegreeById(Long id) {
        return degreeRepository.findById(id).orElse(null);
    }
}

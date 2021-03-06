package org.ccfebras.ckp.service;

import org.ccfebras.ckp.exception.NotFoundException;
import org.ccfebras.ckp.exception.ResourceNotFoundException;
import org.ccfebras.ckp.model.*;
import org.ccfebras.ckp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    private final OrganizationRepository organizationRepository;
    private final PositionRepository positionRepository;
    private final RankRepository rankRepository;
    private final DegreeRepository degreeRepository;
    private final DepartmentRepository departmentRepository;

    public DictionaryServiceImpl(
            OrganizationRepository organizationRepository,
            PositionRepository positionRepository,
            RankRepository rankRepository,
            DegreeRepository degreeRepository,
            DepartmentRepository departmentRepository
    ) {
        this.organizationRepository = organizationRepository;
        this.positionRepository = positionRepository;
        this.rankRepository = rankRepository;
        this.degreeRepository = degreeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Organization saveOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }

    @Override
    public Organization findOrganizationById(Long id) {
        return organizationRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Organization", "id", id));
    }

    @Override
    public Position findPositionById(Long id) {
        return positionRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Position", "id", id));
    }

    @Override
    public Rank findRankById(Long id) {
        return rankRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Rank", "id", id));
    }

    @Override
    public Degree findDegreeById(Long id) {
        return degreeRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Degree", "id", id));
    }

    @Override
    public Department findDepartmentById(Long id) {
        return departmentRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Department", "id", id));
    }
}
